package com.dodo_payments.api.core.http

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.closeWhenPhantomReachable
import java.util.concurrent.CompletableFuture

/**
 * A delegating wrapper around an `HttpClient` that closes it once it's only phantom reachable.
 *
 * This class ensures the `HttpClient` is closed even if the user forgets to close it.
 */
internal class PhantomReachableClosingHttpClient(private val httpClient: HttpClient) : HttpClient {
    init {
        closeWhenPhantomReachable(this, httpClient)
    }

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        httpClient.execute(request, requestOptions)

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> = httpClient.executeAsync(request, requestOptions)

    override fun close() = httpClient.close()
}
