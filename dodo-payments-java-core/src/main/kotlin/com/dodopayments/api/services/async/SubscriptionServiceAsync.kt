// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPageAsync
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    fun create(params: SubscriptionCreateParams): CompletableFuture<SubscriptionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionCreateResponse>

    fun retrieve(subscriptionId: String): CompletableFuture<Subscription> =
        retrieve(subscriptionId, SubscriptionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        subscriptionId: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> =
        retrieve(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        subscriptionId: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
    ): CompletableFuture<Subscription> = retrieve(subscriptionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see [retrieve] */
    fun retrieve(params: SubscriptionRetrieveParams): CompletableFuture<Subscription> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        retrieve(subscriptionId, SubscriptionRetrieveParams.none(), requestOptions)

    fun update(subscriptionId: String): CompletableFuture<Subscription> =
        update(subscriptionId, SubscriptionUpdateParams.none())

    /** @see [update] */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription> =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see [update] */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ): CompletableFuture<Subscription> = update(subscriptionId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Subscription>

    /** @see [update] */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<Subscription> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<SubscriptionListPageAsync> = list(SubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListPageAsync>

    /** @see [list] */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionListPageAsync> =
        list(SubscriptionListParams.none(), requestOptions)

    fun changePlan(
        subscriptionId: String,
        params: SubscriptionChangePlanParams,
    ): CompletableFuture<Void?> = changePlan(subscriptionId, params, RequestOptions.none())

    /** @see [changePlan] */
    fun changePlan(
        subscriptionId: String,
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        changePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see [changePlan] */
    fun changePlan(params: SubscriptionChangePlanParams): CompletableFuture<Void?> =
        changePlan(params, RequestOptions.none())

    /** @see [changePlan] */
    fun changePlan(
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun charge(
        subscriptionId: String,
        params: SubscriptionChargeParams,
    ): CompletableFuture<SubscriptionChargeResponse> =
        charge(subscriptionId, params, RequestOptions.none())

    /** @see [charge] */
    fun charge(
        subscriptionId: String,
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChargeResponse> =
        charge(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see [charge] */
    fun charge(params: SubscriptionChargeParams): CompletableFuture<SubscriptionChargeResponse> =
        charge(params, RequestOptions.none())

    /** @see [charge] */
    fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChargeResponse>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.create].
         */
        fun create(
            params: SubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}`, but is otherwise
         * the same as [SubscriptionServiceAsync.retrieve].
         */
        fun retrieve(subscriptionId: String): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(subscriptionId, SubscriptionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            subscriptionId: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            subscriptionId: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(subscriptionId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see [retrieve] */
        fun retrieve(
            params: SubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            retrieve(subscriptionId, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /subscriptions/{subscription_id}`, but is
         * otherwise the same as [SubscriptionServiceAsync.update].
         */
        fun update(subscriptionId: String): CompletableFuture<HttpResponseFor<Subscription>> =
            update(subscriptionId, SubscriptionUpdateParams.none())

        /** @see [update] */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see [update] */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(subscriptionId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Subscription>>

        /** @see [update] */
        fun update(
            params: SubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<Subscription>> = update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> =
            update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none())

        /** @see [list] */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>>

        /** @see [list] */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/change-plan`, but
         * is otherwise the same as [SubscriptionServiceAsync.changePlan].
         */
        fun changePlan(
            subscriptionId: String,
            params: SubscriptionChangePlanParams,
        ): CompletableFuture<HttpResponse> =
            changePlan(subscriptionId, params, RequestOptions.none())

        /** @see [changePlan] */
        fun changePlan(
            subscriptionId: String,
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            changePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see [changePlan] */
        fun changePlan(params: SubscriptionChangePlanParams): CompletableFuture<HttpResponse> =
            changePlan(params, RequestOptions.none())

        /** @see [changePlan] */
        fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/charge`, but is
         * otherwise the same as [SubscriptionServiceAsync.charge].
         */
        fun charge(
            subscriptionId: String,
            params: SubscriptionChargeParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionChargeResponse>> =
            charge(subscriptionId, params, RequestOptions.none())

        /** @see [charge] */
        fun charge(
            subscriptionId: String,
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChargeResponse>> =
            charge(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see [charge] */
        fun charge(
            params: SubscriptionChargeParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChargeResponse>> =
            charge(params, RequestOptions.none())

        /** @see [charge] */
        fun charge(
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChargeResponse>>
    }
}
