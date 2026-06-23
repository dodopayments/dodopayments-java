// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.localizedprices.ListLocalizedPricesResponse
import com.dodopayments.api.models.products.localizedprices.LocalizedPrice
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceListParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LocalizedPriceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocalizedPriceServiceAsync

    fun create(
        productId: String,
        params: LocalizedPriceCreateParams,
    ): CompletableFuture<LocalizedPrice> = create(productId, params, RequestOptions.none())

    /** @see create */
    fun create(
        productId: String,
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice> =
        create(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see create */
    fun create(params: LocalizedPriceCreateParams): CompletableFuture<LocalizedPrice> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice>

    fun retrieve(
        id: String,
        params: LocalizedPriceRetrieveParams,
    ): CompletableFuture<LocalizedPrice> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: LocalizedPriceRetrieveParams): CompletableFuture<LocalizedPrice> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice>

    fun update(id: String, params: LocalizedPriceUpdateParams): CompletableFuture<LocalizedPrice> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LocalizedPriceUpdateParams): CompletableFuture<LocalizedPrice> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocalizedPrice>

    fun list(productId: String): CompletableFuture<ListLocalizedPricesResponse> =
        list(productId, LocalizedPriceListParams.none())

    /** @see list */
    fun list(
        productId: String,
        params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListLocalizedPricesResponse> =
        list(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see list */
    fun list(
        productId: String,
        params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
    ): CompletableFuture<ListLocalizedPricesResponse> =
        list(productId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LocalizedPriceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListLocalizedPricesResponse>

    /** @see list */
    fun list(params: LocalizedPriceListParams): CompletableFuture<ListLocalizedPricesResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        productId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListLocalizedPricesResponse> =
        list(productId, LocalizedPriceListParams.none(), requestOptions)

    fun archive(id: String, params: LocalizedPriceArchiveParams): CompletableFuture<Void?> =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        id: String,
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(params: LocalizedPriceArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [LocalizedPriceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocalizedPriceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceServiceAsync.create].
         */
        fun create(
            productId: String,
            params: LocalizedPriceCreateParams,
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            create(productId, params, RequestOptions.none())

        /** @see create */
        fun create(
            productId: String,
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            create(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LocalizedPriceCreateParams
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: LocalizedPriceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: LocalizedPriceRetrieveParams
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>>

        /**
         * Returns a raw HTTP response for `patch /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceServiceAsync.update].
         */
        fun update(
            id: String,
            params: LocalizedPriceUpdateParams,
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: LocalizedPriceUpdateParams
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocalizedPrice>>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceServiceAsync.list].
         */
        fun list(
            productId: String
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>> =
            list(productId, LocalizedPriceListParams.none())

        /** @see list */
        fun list(
            productId: String,
            params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>> =
            list(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see list */
        fun list(
            productId: String,
            params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>> =
            list(productId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LocalizedPriceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>>

        /** @see list */
        fun list(
            params: LocalizedPriceListParams
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            productId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListLocalizedPricesResponse>> =
            list(productId, LocalizedPriceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{product_id}/localized-prices/{id}`,
         * but is otherwise the same as [LocalizedPriceServiceAsync.archive].
         */
        fun archive(
            id: String,
            params: LocalizedPriceArchiveParams,
        ): CompletableFuture<HttpResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            id: String,
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(params: LocalizedPriceArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
