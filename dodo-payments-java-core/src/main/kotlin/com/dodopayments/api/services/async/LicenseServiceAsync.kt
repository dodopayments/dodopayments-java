// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseActivateResponse
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import com.dodopayments.api.models.licenses.LicenseValidateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseServiceAsync

    fun activate(params: LicenseActivateParams): CompletableFuture<LicenseActivateResponse> =
        activate(params, RequestOptions.none())

    /** @see activate */
    fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseActivateResponse>

    fun deactivate(params: LicenseDeactivateParams): CompletableFuture<Void?> =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun validate(params: LicenseValidateParams): CompletableFuture<LicenseValidateResponse> =
        validate(params, RequestOptions.none())

    /** @see validate */
    fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseValidateResponse>

    /**
     * A view of [LicenseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /licenses/activate`, but is otherwise the same as
         * [LicenseServiceAsync.activate].
         */
        fun activate(
            params: LicenseActivateParams
        ): CompletableFuture<HttpResponseFor<LicenseActivateResponse>> =
            activate(params, RequestOptions.none())

        /** @see activate */
        fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseActivateResponse>>

        /**
         * Returns a raw HTTP response for `post /licenses/deactivate`, but is otherwise the same as
         * [LicenseServiceAsync.deactivate].
         */
        fun deactivate(params: LicenseDeactivateParams): CompletableFuture<HttpResponse> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /licenses/validate`, but is otherwise the same as
         * [LicenseServiceAsync.validate].
         */
        fun validate(
            params: LicenseValidateParams
        ): CompletableFuture<HttpResponseFor<LicenseValidateResponse>> =
            validate(params, RequestOptions.none())

        /** @see validate */
        fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseValidateResponse>>
    }
}
