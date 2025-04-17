// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.discounts.Discount
import com.dodo_payments.api.models.discounts.DiscountCreateParams
import com.dodo_payments.api.models.discounts.DiscountDeleteParams
import com.dodo_payments.api.models.discounts.DiscountListPageAsync
import com.dodo_payments.api.models.discounts.DiscountListParams
import com.dodo_payments.api.models.discounts.DiscountRetrieveParams
import com.dodo_payments.api.models.discounts.DiscountUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface DiscountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** If `code` is omitted or empty, a random 16-char uppercase code is generated. */
    fun create(params: DiscountCreateParams): CompletableFuture<Discount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

    /** GET /discounts/{discount_id} */
    fun retrieve(params: DiscountRetrieveParams): CompletableFuture<Discount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

    /** PATCH /discounts/{discount_id} */
    fun update(params: DiscountUpdateParams): CompletableFuture<Discount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Discount>

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
    fun delete(params: DiscountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DiscountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DiscountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: DiscountCreateParams): CompletableFuture<HttpResponseFor<Discount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /**
         * Returns a raw HTTP response for `get /discounts/{discount_id}`, but is otherwise the same
         * as [DiscountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DiscountRetrieveParams): CompletableFuture<HttpResponseFor<Discount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: DiscountUpdateParams): CompletableFuture<HttpResponseFor<Discount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Discount>>

        /**
         * Returns a raw HTTP response for `get /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DiscountListParams = DiscountListParams.none()
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: DiscountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
