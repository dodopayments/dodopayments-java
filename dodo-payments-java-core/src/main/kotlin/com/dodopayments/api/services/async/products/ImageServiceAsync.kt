// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.images.ImageUpdateParams
import com.dodopayments.api.models.products.images.ImageUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ImageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageServiceAsync

    fun update(id: String): CompletableFuture<ImageUpdateResponse> =
        update(id, ImageUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ImageUpdateParams = ImageUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ImageUpdateParams = ImageUpdateParams.none(),
    ): CompletableFuture<ImageUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageUpdateResponse>

    /** @see [update] */
    fun update(params: ImageUpdateParams): CompletableFuture<ImageUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<ImageUpdateResponse> =
        update(id, ImageUpdateParams.none(), requestOptions)

    /** A view of [ImageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /products/{id}/images`, but is otherwise the same as
         * [ImageServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<ImageUpdateResponse>> =
            update(id, ImageUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: ImageUpdateParams = ImageUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: ImageUpdateParams = ImageUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ImageUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageUpdateResponse>>

        /** @see [update] */
        fun update(
            params: ImageUpdateParams
        ): CompletableFuture<HttpResponseFor<ImageUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImageUpdateResponse>> =
            update(id, ImageUpdateParams.none(), requestOptions)
    }
}
