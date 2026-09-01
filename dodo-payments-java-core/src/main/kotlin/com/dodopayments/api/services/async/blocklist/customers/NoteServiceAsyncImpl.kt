// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist.customers

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
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.dodopayments.api.models.blocklist.customers.notes.NoteCreateParams
import com.dodopayments.api.models.blocklist.customers.notes.NoteUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NoteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NoteServiceAsync {

    private val withRawResponse: NoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NoteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteServiceAsync =
        NoteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NoteCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlockedCustomerNote> =
        // post /blocklist/customers/{entry_id}/notes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NoteUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlockedCustomerNote> =
        // patch /blocklist/customers/{entry_id}/notes/{note_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NoteServiceAsync.WithRawResponse =
            NoteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BlockedCustomerNote> =
            jsonHandler<BlockedCustomerNote>(clientOptions.jsonMapper)

        override fun create(
            params: NoteCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entryId", params.entryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("blocklist", "customers", params._pathParam(0), "notes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<BlockedCustomerNote> =
            jsonHandler<BlockedCustomerNote>(clientOptions.jsonMapper)

        override fun update(
            params: NoteUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("noteId", params.noteId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "blocklist",
                        "customers",
                        params._pathParam(0),
                        "notes",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
