// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

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
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.GrantListPage
import com.dodopayments.api.models.entitlements.grants.GrantListPageAsync
import com.dodopayments.api.models.entitlements.grants.GrantListPageResponse
import com.dodopayments.api.models.entitlements.grants.GrantListParams
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import com.dodopayments.api.services.async.entitlements.GrantServiceAsync
import com.dodopayments.api.services.async.entitlements.GrantServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GrantServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GrantServiceAsync {

    private val withRawResponse: GrantServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): GrantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantServiceAsync = GrantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: GrantListParams, requestOptions: RequestOptions): CompletableFuture<GrantListPageAsync> =
        // get /entitlements/{id}/grants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun revoke(params: GrantRevokeParams, requestOptions: RequestOptions): CompletableFuture<EntitlementGrant> =
        // delete /entitlements/{id}/grants/{grant_id}
        withRawResponse().revoke(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GrantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantServiceAsync.WithRawResponse = GrantServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        private val listHandler: Handler<GrantListPageResponse> = jsonHandler<GrantListPageResponse>(clientOptions.jsonMapper)

        override fun list(params: GrantListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GrantListPageAsync>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("id", params.id().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("entitlements", params._pathParam(0), "grants")
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
                  GrantListPageAsync.builder()
                      .service(GrantServiceAsyncImpl(clientOptions))
                      .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                      .params(params)
                      .response(it)
                      .build()
              }
          } }
        }

        private val revokeHandler: Handler<EntitlementGrant> = jsonHandler<EntitlementGrant>(clientOptions.jsonMapper)

        override fun revoke(params: GrantRevokeParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EntitlementGrant>> {
          // We check here instead of in the params builder because this can be specified positionally or in the params class.
          checkRequired("grantId", params.grantId().getOrNull())
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("entitlements", params._pathParam(0), "grants", params._pathParam(1))
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
                  revokeHandler.handle(it)
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
