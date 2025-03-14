// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.subscriptions.Subscription
import com.dodo_payments.api.models.subscriptions.SubscriptionCreateParams
import com.dodo_payments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodo_payments.api.models.subscriptions.SubscriptionListPage
import com.dodo_payments.api.models.subscriptions.SubscriptionListParams
import com.dodo_payments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodo_payments.api.models.subscriptions.SubscriptionUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: SubscriptionCreateParams): SubscriptionCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    fun retrieve(params: SubscriptionRetrieveParams): Subscription =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    fun update(params: SubscriptionUpdateParams): Subscription =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    fun list(): SubscriptionListPage = list(SubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see [list] */
    fun list(params: SubscriptionListParams = SubscriptionListParams.none()): SubscriptionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscriptions`, but is otherwise the same as
         * [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<SubscriptionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}`, but is otherwise
         * the same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: SubscriptionRetrieveParams): HttpResponseFor<Subscription> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `patch /subscriptions/{subscription_id}`, but is
         * otherwise the same as [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponseFor<Subscription> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `get /subscriptions`, but is otherwise the same as
         * [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubscriptionListPage> = list(SubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)
    }
}
