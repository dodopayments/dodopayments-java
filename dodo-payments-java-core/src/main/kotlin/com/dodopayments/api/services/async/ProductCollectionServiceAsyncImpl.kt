// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.emptyHandler
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
import com.dodopayments.api.models.productcollections.ProductCollection
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionDeleteParams
import com.dodopayments.api.models.productcollections.ProductCollectionListPage
import com.dodopayments.api.models.productcollections.ProductCollectionListPageAsync
import com.dodopayments.api.models.productcollections.ProductCollectionListPageResponse
import com.dodopayments.api.models.productcollections.ProductCollectionListParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.services.async.ProductCollectionServiceAsync
import com.dodopayments.api.services.async.ProductCollectionServiceAsyncImpl
import com.dodopayments.api.services.async.productcollections.GroupServiceAsync
import com.dodopayments.api.services.async.productcollections.GroupServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProductCollectionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProductCollectionServiceAsync {

    private val withRawResponse: ProductCollectionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProductCollectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductCollectionServiceAsync = ProductCollectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun groups(): GroupServiceAsync = groups

    override fun create(params: ProductCollectionCreateParams, requestOptions: RequestOptions): CompletableFuture<ProductCollection> =
        // post /product-collections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(params: ProductCollectionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<ProductCollection> =
        // get /product-collections/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: ProductCollectionUpdateParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // patch /product-collections/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(params: ProductCollectionListParams, requestOptions: RequestOptions): CompletableFuture<ProductCollectionListPageAsync> =
        // get /product-collections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: ProductCollectionDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // delete /product-collections/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun unarchive(params: ProductCollectionUnarchiveParams, requestOptions: RequestOptions): CompletableFuture<ProductCollectionUnarchiveResponse> =
        // post /product-collections/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions).thenApply { it.parse() }

    override fun updateImages(params: ProductCollectionUpdateImagesParams, requestOptions: RequestOptions): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        // put /product-collections/{id}/images
        withRawResponse().updateImages(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProductCollectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val groups: GroupServiceAsync.WithRawResponse by lazy { GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductCollectionServiceAsync.WithRawResponse = ProductCollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        private val createHandler: Handler<ProductCollection> = jsonHandler<ProductCollection>(clientOptions.jsonMapper)

        override fun create(params: ProductCollectionCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProductCollection>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val retrieveHandler: Handler<ProductCollection> = jsonHandler<ProductCollection>(clientOptions.jsonMapper)

        override fun retrieve(params: ProductCollectionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProductCollection>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections", params._pathParam(0))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: ProductCollectionUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections", params._pathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  updateHandler.handle(it)
              }
          } }
        }

        private val listHandler: Handler<ProductCollectionListPageResponse> = jsonHandler<ProductCollectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(params: ProductCollectionListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProductCollectionListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections")
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  ProductCollectionListPageAsync.builder()
                      .service(ProductCollectionServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .response(it)
                      .build()
              }
          } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: ProductCollectionDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponse> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections", params._pathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          } }
        }

        private val unarchiveHandler: Handler<ProductCollectionUnarchiveResponse> = jsonHandler<ProductCollectionUnarchiveResponse>(clientOptions.jsonMapper)

        override fun unarchive(params: ProductCollectionUnarchiveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections", params._pathParam(0), "unarchive")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  unarchiveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateImagesHandler: Handler<ProductCollectionUpdateImagesResponse> = jsonHandler<ProductCollectionUpdateImagesResponse>(clientOptions.jsonMapper)

        override fun updateImages(params: ProductCollectionUpdateImagesParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("product-collections", params._pathParam(0), "images")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(
              clientOptions, params
            )
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> errorHandler.handle(response).parseable {
              response.use {
                  updateImagesHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
