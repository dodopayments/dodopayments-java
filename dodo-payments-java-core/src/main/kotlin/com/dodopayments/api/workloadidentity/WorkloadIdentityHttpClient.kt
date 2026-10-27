// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpClient
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import java.util.concurrent.CompletableFuture

/**
 * Sends each request with the workload identity access token.
 *
 * After a 401 response, it gets a new access token and sends the request again one time.
 */
internal class WorkloadIdentityHttpClient(
    private val httpClient: HttpClient,
    private val tokenManager: WorkloadIdentityTokenManager,
) : HttpClient {

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse {
        val accessToken = tokenManager.accessToken()
        val response = httpClient.execute(withAccessToken(request, accessToken), requestOptions)
        if (!shouldRetryWithNewToken(request, response)) {
            return response
        }
        response.close()
        tokenManager.invalidate(accessToken)
        return httpClient.execute(
            withAccessToken(request, tokenManager.accessToken()),
            requestOptions,
        )
    }

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        tokenManager.accessTokenAsync().thenCompose { accessToken ->
            httpClient
                .executeAsync(withAccessToken(request, accessToken), requestOptions)
                .thenCompose { response ->
                    if (!shouldRetryWithNewToken(request, response)) {
                        CompletableFuture.completedFuture(response)
                    } else {
                        response.close()
                        tokenManager.invalidate(accessToken)
                        tokenManager.accessTokenAsync().thenCompose { newAccessToken ->
                            httpClient.executeAsync(
                                withAccessToken(request, newAccessToken),
                                requestOptions,
                            )
                        }
                    }
                }
        }

    override fun close() = httpClient.close()

    private fun shouldRetryWithNewToken(request: HttpRequest, response: HttpResponse): Boolean =
        response.statusCode() == 401 && (request.body?.repeatable() ?: true)

    private fun withAccessToken(request: HttpRequest, accessToken: String): HttpRequest =
        request.toBuilder().replaceHeaders("Authorization", "Bearer $accessToken").build()
}
