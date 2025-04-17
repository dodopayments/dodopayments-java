// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licenses.LicenseActivateParams
import com.dodo_payments.api.models.licenses.LicenseDeactivateParams
import com.dodo_payments.api.models.licenses.LicenseValidateParams
import com.dodo_payments.api.models.licenses.LicenseValidateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun activate(params: LicenseActivateParams): CompletableFuture<LicenseKeyInstance> =
        activate(params, RequestOptions.none())

    /** @see [activate] */
    fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance>

    fun deactivate(params: LicenseDeactivateParams): CompletableFuture<Void?> =
        deactivate(params, RequestOptions.none())

    /** @see [deactivate] */
    fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun validate(params: LicenseValidateParams): CompletableFuture<LicenseValidateResponse> =
        validate(params, RequestOptions.none())

    /** @see [validate] */
    fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseValidateResponse>

    /**
     * A view of [LicenseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /licenses/activate`, but is otherwise the same as
         * [LicenseServiceAsync.activate].
         */
        @MustBeClosed
        fun activate(
            params: LicenseActivateParams
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            activate(params, RequestOptions.none())

        /** @see [activate] */
        @MustBeClosed
        fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>>

        /**
         * Returns a raw HTTP response for `post /licenses/deactivate`, but is otherwise the same as
         * [LicenseServiceAsync.deactivate].
         */
        @MustBeClosed
        fun deactivate(params: LicenseDeactivateParams): CompletableFuture<HttpResponse> =
            deactivate(params, RequestOptions.none())

        /** @see [deactivate] */
        @MustBeClosed
        fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /licenses/validate`, but is otherwise the same as
         * [LicenseServiceAsync.validate].
         */
        @MustBeClosed
        fun validate(
            params: LicenseValidateParams
        ): CompletableFuture<HttpResponseFor<LicenseValidateResponse>> =
            validate(params, RequestOptions.none())

        /** @see [validate] */
        @MustBeClosed
        fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseValidateResponse>>
    }
}
