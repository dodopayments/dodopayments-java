// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonListPage
import com.dodopayments.api.models.addons.AddonListParams
import com.dodopayments.api.models.addons.AddonResponse
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateImagesResponse
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AddonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService

    fun create(params: AddonCreateParams): AddonResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    fun retrieve(id: String): AddonResponse = retrieve(id, AddonRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
    ): AddonResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    /** @see retrieve */
    fun retrieve(params: AddonRetrieveParams): AddonResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AddonResponse =
        retrieve(id, AddonRetrieveParams.none(), requestOptions)

    fun update(id: String): AddonResponse = update(id, AddonUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AddonUpdateParams = AddonUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: AddonUpdateParams = AddonUpdateParams.none()): AddonResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    /** @see update */
    fun update(params: AddonUpdateParams): AddonResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AddonResponse =
        update(id, AddonUpdateParams.none(), requestOptions)

    fun list(): AddonListPage = list(AddonListParams.none())

    /** @see list */
    fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonListPage

    /** @see list */
    fun list(params: AddonListParams = AddonListParams.none()): AddonListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AddonListPage =
        list(AddonListParams.none(), requestOptions)

    fun updateImages(id: String): AddonUpdateImagesResponse =
        updateImages(id, AddonUpdateImagesParams.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonUpdateImagesResponse = updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
    ): AddonUpdateImagesResponse = updateImages(id, params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonUpdateImagesResponse

    /** @see updateImages */
    fun updateImages(params: AddonUpdateImagesParams): AddonUpdateImagesResponse =
        updateImages(params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(id: String, requestOptions: RequestOptions): AddonUpdateImagesResponse =
        updateImages(id, AddonUpdateImagesParams.none(), requestOptions)

    /** A view of [AddonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /addons`, but is otherwise the same as
         * [AddonService.create].
         */
        @MustBeClosed
        fun create(params: AddonCreateParams): HttpResponseFor<AddonResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /**
         * Returns a raw HTTP response for `get /addons/{id}`, but is otherwise the same as
         * [AddonService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AddonResponse> =
            retrieve(id, AddonRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
        ): HttpResponseFor<AddonResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AddonRetrieveParams): HttpResponseFor<AddonResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AddonResponse> =
            retrieve(id, AddonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /addons/{id}`, but is otherwise the same as
         * [AddonService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AddonResponse> =
            update(id, AddonUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
        ): HttpResponseFor<AddonResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AddonUpdateParams): HttpResponseFor<AddonResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<AddonResponse> =
            update(id, AddonUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /addons`, but is otherwise the same as
         * [AddonService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AddonListPage> = list(AddonListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AddonListParams = AddonListParams.none()): HttpResponseFor<AddonListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AddonListPage> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /addons/{id}/images`, but is otherwise the same as
         * [AddonService.updateImages].
         */
        @MustBeClosed
        fun updateImages(id: String): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(id, AddonUpdateImagesParams.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(id, params, RequestOptions.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse>

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            params: AddonUpdateImagesParams
        ): HttpResponseFor<AddonUpdateImagesResponse> = updateImages(params, RequestOptions.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(id, AddonUpdateImagesParams.none(), requestOptions)
    }
}
