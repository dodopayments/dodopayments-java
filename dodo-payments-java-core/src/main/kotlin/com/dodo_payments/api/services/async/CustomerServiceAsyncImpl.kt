// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.customers.Customer
import com.dodo_payments.api.models.customers.CustomerCreateParams
import com.dodo_payments.api.models.customers.CustomerListPageAsync
import com.dodo_payments.api.models.customers.CustomerListParams
import com.dodo_payments.api.models.customers.CustomerRetrieveParams
import com.dodo_payments.api.models.customers.CustomerUpdateParams
import com.dodo_payments.api.services.async.customers.CustomerPortalServiceAsync
import com.dodo_payments.api.services.async.customers.CustomerPortalServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customerPortal: CustomerPortalServiceAsync by lazy {
        CustomerPortalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun customerPortal(): CustomerPortalServiceAsync = customerPortal

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // post /customers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // get /customers/{customer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // patch /customers/{customer_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListPageAsync> =
        // get /customers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val customerPortal: CustomerPortalServiceAsync.WithRawResponse by lazy {
            CustomerPortalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun customerPortal(): CustomerPortalServiceAsync.WithRawResponse = customerPortal

        private val createHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val updateHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("customers", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<CustomerListPageAsync.Response> =
            jsonHandler<CustomerListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListPageAsync.of(
                                    CustomerServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
