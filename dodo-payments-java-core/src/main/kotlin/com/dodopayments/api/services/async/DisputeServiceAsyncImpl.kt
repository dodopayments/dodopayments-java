// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.disputes.DisputeListPageAsync
import com.dodopayments.api.models.disputes.DisputeListPageResponse
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import com.dodopayments.api.models.disputes.GetDispute
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DisputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputeServiceAsync {

    private val withRawResponse: DisputeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DisputeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputeServiceAsync =
        DisputeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GetDispute> =
        // get /disputes/{dispute_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DisputeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeListPageAsync> =
        // get /disputes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputeServiceAsync.WithRawResponse =
            DisputeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GetDispute> =
            jsonHandler<GetDispute>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GetDispute>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeId", params.disputeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DisputeListPageResponse> =
            jsonHandler<DisputeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DisputeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DisputeListPageAsync.builder()
                                    .service(DisputeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
