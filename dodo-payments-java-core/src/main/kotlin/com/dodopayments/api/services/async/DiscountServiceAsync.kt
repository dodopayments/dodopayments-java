// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.discounts.Discount
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountListPageAsync
import com.dodopayments.api.models.discounts.DiscountListParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
import com.dodopayments.api.models.discounts.DiscountUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiscountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscountServiceAsync

    /** If `code` is omitted or empty, a random 16-char uppercase code is generated. */
    fun create(params: DiscountCreateParams): CompletableFuture<Discount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

    /** GET /discounts/{discount_id} */
    fun retrieve(discountId: String): CompletableFuture<Discount> =
        retrieve(discountId, DiscountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        discountId: String,
        params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount> =
        retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        discountId: String,
        params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
    ): CompletableFuture<Discount> = retrieve(discountId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

    /** @see [retrieve] */
    fun retrieve(params: DiscountRetrieveParams): CompletableFuture<Discount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(discountId: String, requestOptions: RequestOptions): CompletableFuture<Discount> =
        retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

    /** PATCH /discounts/{discount_id} */
    fun update(discountId: String): CompletableFuture<Discount> =
        update(discountId, DiscountUpdateParams.none())

    /** @see [update] */
    fun update(
        discountId: String,
        params: DiscountUpdateParams = DiscountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount> =
        update(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [update] */
    fun update(
        discountId: String,
        params: DiscountUpdateParams = DiscountUpdateParams.none(),
    ): CompletableFuture<Discount> = update(discountId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

    /** @see [update] */
    fun update(params: DiscountUpdateParams): CompletableFuture<Discount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(discountId: String, requestOptions: RequestOptions): CompletableFuture<Discount> =
        update(discountId, DiscountUpdateParams.none(), requestOptions)

    /** GET /discounts */
    fun list(): CompletableFuture<DiscountListPageAsync> = list(DiscountListParams.none())

    /** @see [list] */
    fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiscountListPageAsync>

    /** @see [list] */
    fun list(
        params: DiscountListParams = DiscountListParams.none()
    ): CompletableFuture<DiscountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DiscountListPageAsync> =
        list(DiscountListParams.none(), requestOptions)

    /** DELETE /discounts/{discount_id} */
    fun delete(discountId: String): CompletableFuture<Void?> =
        delete(discountId, DiscountDeleteParams.none())

    /** @see [delete] */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(discountId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DiscountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: DiscountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(discountId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(discountId, DiscountDeleteParams.none(), requestOptions)

    /**
     * A view of [DiscountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DiscountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.create].
         */
        fun create(params: DiscountCreateParams): CompletableFuture<HttpResponseFor<Discount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /**
         * Returns a raw HTTP response for `get /discounts/{discount_id}`, but is otherwise the same
         * as [DiscountServiceAsync.retrieve].
         */
        fun retrieve(discountId: String): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(discountId, DiscountRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            discountId: String,
            params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            discountId: String,
            params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(discountId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /** @see [retrieve] */
        fun retrieve(params: DiscountRetrieveParams): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            discountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.update].
         */
        fun update(discountId: String): CompletableFuture<HttpResponseFor<Discount>> =
            update(discountId, DiscountUpdateParams.none())

        /** @see [update] */
        fun update(
            discountId: String,
            params: DiscountUpdateParams = DiscountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>> =
            update(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [update] */
        fun update(
            discountId: String,
            params: DiscountUpdateParams = DiscountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Discount>> =
            update(discountId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /** @see [update] */
        fun update(params: DiscountUpdateParams): CompletableFuture<HttpResponseFor<Discount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            discountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Discount>> =
            update(discountId, DiscountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none())

        /** @see [list] */
        fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>>

        /** @see [list] */
        fun list(
            params: DiscountListParams = DiscountListParams.none()
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.delete].
         */
        fun delete(discountId: String): CompletableFuture<HttpResponse> =
            delete(discountId, DiscountDeleteParams.none())

        /** @see [delete] */
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(discountId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: DiscountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            discountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(discountId, DiscountDeleteParams.none(), requestOptions)
    }
}
