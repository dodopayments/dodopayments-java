// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.Sleeper
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.HttpClient
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.RetryingHttpClient
import com.dodopayments.api.core.http.json
import com.fasterxml.jackson.databind.json.JsonMapper
import java.io.InputStream
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.OffsetDateTime
import java.time.format.DateTimeParseException
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionException

internal class WorkloadIdentityAccessToken(val accessToken: String, val expiresAt: Instant)

/** The access token cache of one [WorkloadIdentity] for one base URL. */
internal class WorkloadIdentityTokenCache {

    val lock = Any()

    var token: WorkloadIdentityAccessToken? = null

    var inFlight: CompletableFuture<WorkloadIdentityAccessToken>? = null
}

/** Exchanges subject tokens for access tokens and keeps the access token in a cache. */
internal class WorkloadIdentityTokenManager(
    private val workloadIdentity: WorkloadIdentity,
    private val config: Config,
) {

    /** The HTTP settings of the client. The exchange does not send the client credentials. */
    class Config(
        val httpClient: HttpClient,
        val sleeper: Sleeper,
        val clock: Clock,
        val maxRetries: Int,
        val baseUrl: String,
        val headers: Headers,
        val jsonMapper: JsonMapper,
    )

    private val cache: WorkloadIdentityTokenCache =
        workloadIdentity.tokenCaches.computeIfAbsent(config.baseUrl) {
            WorkloadIdentityTokenCache()
        }

    // The exchange retries connection errors and 5xx responses, but never a 4xx response.
    private val httpClient: HttpClient =
        RetryingHttpClient.builder()
            .httpClient(ClientErrorNoRetryHttpClient(config.httpClient))
            .sleeper(config.sleeper)
            .clock(config.clock)
            .maxRetries(config.maxRetries)
            .build()

    private val errorHandler = errorHandler(errorBodyHandler(config.jsonMapper))

    fun accessToken(): String {
        validToken()?.let {
            return it.accessToken
        }
        val (future, owner) = joinExchange()
        if (owner) {
            val result = runCatching { parseToken(httpClient.execute(exchangeRequest())) }
            finishExchange(future, result.getOrNull(), result.exceptionOrNull())
        }
        return try {
            future.join().accessToken
        } catch (e: CompletionException) {
            throw e.cause ?: e
        }
    }

    fun accessTokenAsync(): CompletableFuture<String> {
        validToken()?.let {
            return CompletableFuture.completedFuture(it.accessToken)
        }
        val (future, owner) = joinExchange()
        if (owner) {
            CompletableFuture.supplyAsync { exchangeRequest() }
                .thenCompose { httpClient.executeAsync(it) }
                .thenApply { parseToken(it) }
                .whenComplete { token, error -> finishExchange(future, token, error) }
        }
        return future.thenApply { it.accessToken }
    }

    /** Clears the cache if it still holds [accessToken]. */
    fun invalidate(accessToken: String) {
        synchronized(cache.lock) {
            if (cache.token?.accessToken == accessToken) {
                cache.token = null
            }
        }
    }

    fun revoke() {
        val token = takeToken() ?: return
        httpClient.execute(revokeRequest(token)).use { errorHandler.handle(it) }
    }

    fun revokeAsync(): CompletableFuture<Void?> {
        val token = takeToken() ?: return CompletableFuture.completedFuture(null)
        return httpClient.executeAsync(revokeRequest(token)).thenApply { response ->
            response.use { errorHandler.handle(it) }
            null
        }
    }

    private fun validToken(): WorkloadIdentityAccessToken? =
        synchronized(cache.lock) { cache.token }
            ?.takeIf {
                Duration.between(config.clock.instant(), it.expiresAt) > REFRESH_BEFORE_EXPIRY
            }

    private fun takeToken(): WorkloadIdentityAccessToken? =
        synchronized(cache.lock) { cache.token.also { cache.token = null } }

    private fun joinExchange(): Pair<CompletableFuture<WorkloadIdentityAccessToken>, Boolean> =
        synchronized(cache.lock) {
            cache.inFlight?.let {
                return it to false
            }
            val future = CompletableFuture<WorkloadIdentityAccessToken>()
            cache.inFlight = future
            future to true
        }

    private fun finishExchange(
        future: CompletableFuture<WorkloadIdentityAccessToken>,
        token: WorkloadIdentityAccessToken?,
        error: Throwable?,
    ) {
        synchronized(cache.lock) {
            if (token != null) {
                cache.token = token
            }
            cache.inFlight = null
        }
        if (token != null) {
            future.complete(token)
        } else {
            future.completeExceptionally(
                (if (error is CompletionException) error.cause else error)
                    ?: IllegalStateException("The token exchange failed.")
            )
        }
    }

    private fun exchangeRequest(): HttpRequest {
        val body =
            linkedMapOf(
                "grant_type" to "urn:ietf:params:oauth:grant-type:token-exchange",
                "subject_token_type" to "urn:ietf:params:oauth:token-type:jwt",
                "subject_token" to workloadIdentity.provider.subjectToken(config.baseUrl),
                "identity_provider_id" to workloadIdentity.identityProviderId,
            )
        return request(TOKEN_PATH).body(json(config.jsonMapper, body)).build()
    }

    private fun revokeRequest(token: WorkloadIdentityAccessToken): HttpRequest =
        request(REVOKE_PATH).putHeader("Authorization", "Bearer ${token.accessToken}").build()

    private fun request(path: List<String>): HttpRequest.Builder =
        HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(config.baseUrl)
            .addPathSegments(*path.toTypedArray())
            .putAllHeaders(config.headers)
            .removeHeaders("Authorization")

    private fun parseToken(response: HttpResponse): WorkloadIdentityAccessToken =
        response.use {
            errorHandler.handle(it)
            val body = config.jsonMapper.readTree(it.body())
            val accessToken =
                body.get("access_token")?.asText()?.takeIf { token -> token.isNotEmpty() }
                    ?: throw WorkloadIdentityException("The token response has no access_token.")
            val now = config.clock.instant()
            val expiresAt =
                body.get("expires_at")?.asText()?.let { value ->
                    try {
                        OffsetDateTime.parse(value).toInstant()
                    } catch (e: DateTimeParseException) {
                        null
                    }
                } ?: now.plusSeconds(body.get("expires_in")?.asLong() ?: 0L)
            WorkloadIdentityAccessToken(accessToken, expiresAt)
        }

    companion object {

        private val REFRESH_BEFORE_EXPIRY: Duration = Duration.ofSeconds(300)

        private val TOKEN_PATH: List<String> = listOf("workload-identity", "token")

        private val REVOKE_PATH: List<String> = listOf("workload-identity", "token", "revoke")
    }
}

/** Tells [RetryingHttpClient] not to retry a 4xx response. */
private class ClientErrorNoRetryHttpClient(private val httpClient: HttpClient) : HttpClient {

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        noRetryOnClientError(httpClient.execute(request, requestOptions))

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        httpClient.executeAsync(request, requestOptions).thenApply { noRetryOnClientError(it) }

    override fun close() = httpClient.close()

    private fun noRetryOnClientError(response: HttpResponse): HttpResponse {
        if (response.statusCode() !in 400..499) {
            return response
        }
        val headers = response.headers().toBuilder().replace("X-Should-Retry", "false").build()
        return object : HttpResponse {

            override fun statusCode(): Int = response.statusCode()

            override fun headers(): Headers = headers

            override fun body(): InputStream = response.body()

            override fun close() = response.close()
        }
    }
}
