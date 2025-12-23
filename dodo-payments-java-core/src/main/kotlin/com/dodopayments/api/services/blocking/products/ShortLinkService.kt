// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPage
import com.dodopayments.api.models.products.shortlinks.ShortLinkListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ShortLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortLinkService

    /**
     * Gives a Short Checkout URL with custom slug for a product. Uses a Static Checkout URL under
     * the hood.
     */
    fun create(id: String, params: ShortLinkCreateParams): ShortLinkCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ShortLinkCreateParams): ShortLinkCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkCreateResponse

    /** Lists all short links created by the business. */
    fun list(): ShortLinkListPage = list(ShortLinkListParams.none())

    /** @see list */
    fun list(
        params: ShortLinkListParams = ShortLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkListPage

    /** @see list */
    fun list(params: ShortLinkListParams = ShortLinkListParams.none()): ShortLinkListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ShortLinkListPage =
        list(ShortLinkListParams.none(), requestOptions)

    /** A view of [ShortLinkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortLinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/short_links`, but is otherwise the
         * same as [ShortLinkService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: ShortLinkCreateParams,
        ): HttpResponseFor<ShortLinkCreateResponse> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ShortLinkCreateParams): HttpResponseFor<ShortLinkCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkCreateResponse>

        /**
         * Returns a raw HTTP response for `get /products/short_links`, but is otherwise the same as
         * [ShortLinkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ShortLinkListPage> = list(ShortLinkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShortLinkListParams = ShortLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShortLinkListParams = ShortLinkListParams.none()
        ): HttpResponseFor<ShortLinkListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ShortLinkListPage> =
            list(ShortLinkListParams.none(), requestOptions)
    }
}
