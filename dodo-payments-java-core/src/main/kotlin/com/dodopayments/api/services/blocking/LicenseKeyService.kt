// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyListPage
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface LicenseKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseKeyService

    fun retrieve(id: String): LicenseKey = retrieve(id, LicenseKeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
    ): LicenseKey = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    /** @see retrieve */
    fun retrieve(params: LicenseKeyRetrieveParams): LicenseKey =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LicenseKey =
        retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

    fun update(id: String): LicenseKey = update(id, LicenseKeyUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
    ): LicenseKey = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    /** @see update */
    fun update(params: LicenseKeyUpdateParams): LicenseKey = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): LicenseKey =
        update(id, LicenseKeyUpdateParams.none(), requestOptions)

    fun list(): LicenseKeyListPage = list(LicenseKeyListParams.none())

    /** @see list */
    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyListPage

    /** @see list */
    fun list(params: LicenseKeyListParams = LicenseKeyListParams.none()): LicenseKeyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LicenseKeyListPage =
        list(LicenseKeyListParams.none(), requestOptions)

    /** A view of [LicenseKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LicenseKey> =
            retrieve(id, LicenseKeyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
        ): HttpResponseFor<LicenseKey> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: LicenseKeyRetrieveParams): HttpResponseFor<LicenseKey> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<LicenseKey> =
            retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<LicenseKey> =
            update(id, LicenseKeyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
        ): HttpResponseFor<LicenseKey> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /** @see update */
        @MustBeClosed
        fun update(params: LicenseKeyUpdateParams): HttpResponseFor<LicenseKey> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LicenseKey> =
            update(id, LicenseKeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LicenseKeyListPage> = list(LicenseKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none()
        ): HttpResponseFor<LicenseKeyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LicenseKeyListPage> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
