// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsParams
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AppInstallationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppInstallationService

    /**
     * The settings of the App Installation of the app token, with the secret values. The token
     * grant gives the installation. The token needs `app_settings:read`.
     */
    fun retrieveSettings(): AppInstallationRetrieveSettingsResponse =
        retrieveSettings(AppInstallationRetrieveSettingsParams.none())

    /** @see retrieveSettings */
    fun retrieveSettings(
        params: AppInstallationRetrieveSettingsParams =
            AppInstallationRetrieveSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppInstallationRetrieveSettingsResponse

    /** @see retrieveSettings */
    fun retrieveSettings(
        params: AppInstallationRetrieveSettingsParams = AppInstallationRetrieveSettingsParams.none()
    ): AppInstallationRetrieveSettingsResponse = retrieveSettings(params, RequestOptions.none())

    /** @see retrieveSettings */
    fun retrieveSettings(requestOptions: RequestOptions): AppInstallationRetrieveSettingsResponse =
        retrieveSettings(AppInstallationRetrieveSettingsParams.none(), requestOptions)

    /**
     * A view of [AppInstallationService] that provides access to raw HTTP responses for each
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
        ): AppInstallationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /app-installation/settings`, but is otherwise the
         * same as [AppInstallationService.retrieveSettings].
         */
        @MustBeClosed
        fun retrieveSettings(): HttpResponseFor<AppInstallationRetrieveSettingsResponse> =
            retrieveSettings(AppInstallationRetrieveSettingsParams.none())

        /** @see retrieveSettings */
        @MustBeClosed
        fun retrieveSettings(
            params: AppInstallationRetrieveSettingsParams =
                AppInstallationRetrieveSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse>

        /** @see retrieveSettings */
        @MustBeClosed
        fun retrieveSettings(
            params: AppInstallationRetrieveSettingsParams =
                AppInstallationRetrieveSettingsParams.none()
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse> =
            retrieveSettings(params, RequestOptions.none())

        /** @see retrieveSettings */
        @MustBeClosed
        fun retrieveSettings(
            requestOptions: RequestOptions
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse> =
            retrieveSettings(AppInstallationRetrieveSettingsParams.none(), requestOptions)
    }
}
