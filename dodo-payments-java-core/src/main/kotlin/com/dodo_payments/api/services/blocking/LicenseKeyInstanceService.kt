// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListPage
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(params: LicenseKeyInstanceRetrieveParams): LicenseKeyInstance =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun update(params: LicenseKeyInstanceUpdateParams): LicenseKeyInstance =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun list(): LicenseKeyInstanceListPage = list(LicenseKeyInstanceListParams.none())

    /** @see [list] */
    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstanceListPage

    /** @see [list] */
    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none()
    ): LicenseKeyInstanceListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LicenseKeyInstanceListPage =
        list(LicenseKeyInstanceListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyInstanceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams
        ): HttpResponseFor<LicenseKeyInstance> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceService.update].
         */
        @MustBeClosed
        fun update(params: LicenseKeyInstanceUpdateParams): HttpResponseFor<LicenseKeyInstance> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `get /license_key_instances`, but is otherwise the same
         * as [LicenseKeyInstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LicenseKeyInstanceListPage> =
            list(LicenseKeyInstanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstanceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none()
        ): HttpResponseFor<LicenseKeyInstanceListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LicenseKeyInstanceListPage> =
            list(LicenseKeyInstanceListParams.none(), requestOptions)
    }
}
