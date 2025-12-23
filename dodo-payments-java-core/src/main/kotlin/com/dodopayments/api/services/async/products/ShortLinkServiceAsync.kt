// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPageAsync
import com.dodopayments.api.models.products.shortlinks.ShortLinkListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShortLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortLinkServiceAsync

    /**
     * Gives a Short Checkout URL with custom slug for a product. Uses a Static Checkout URL under
     * the hood.
     */
    fun create(
        id: String,
        params: ShortLinkCreateParams,
    ): CompletableFuture<ShortLinkCreateResponse> = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortLinkCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ShortLinkCreateParams): CompletableFuture<ShortLinkCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortLinkCreateResponse>

    /** Lists all short links created by the business. */
    fun list(): CompletableFuture<ShortLinkListPageAsync> = list(ShortLinkListParams.none())

    /** @see list */
    fun list(
        params: ShortLinkListParams = ShortLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortLinkListPageAsync>

    /** @see list */
    fun list(
        params: ShortLinkListParams = ShortLinkListParams.none()
    ): CompletableFuture<ShortLinkListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ShortLinkListPageAsync> =
        list(ShortLinkListParams.none(), requestOptions)

    /**
     * A view of [ShortLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShortLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/short_links`, but is otherwise the
         * same as [ShortLinkServiceAsync.create].
         */
        fun create(
            id: String,
            params: ShortLinkCreateParams,
        ): CompletableFuture<HttpResponseFor<ShortLinkCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortLinkCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: ShortLinkCreateParams
        ): CompletableFuture<HttpResponseFor<ShortLinkCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortLinkCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /products/short_links`, but is otherwise the same as
         * [ShortLinkServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ShortLinkListPageAsync>> =
            list(ShortLinkListParams.none())

        /** @see list */
        fun list(
            params: ShortLinkListParams = ShortLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortLinkListPageAsync>>

        /** @see list */
        fun list(
            params: ShortLinkListParams = ShortLinkListParams.none()
        ): CompletableFuture<HttpResponseFor<ShortLinkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ShortLinkListPageAsync>> =
            list(ShortLinkListParams.none(), requestOptions)
    }
}
