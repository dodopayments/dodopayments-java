// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.creditentitlements.translations.CreditEntitlementTranslation
import com.dodopayments.api.models.creditentitlements.translations.CreditEntitlementTranslationsListResponse
import com.dodopayments.api.models.creditentitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationListParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationUpdateParams
import com.dodopayments.api.models.misc.Locale
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TranslationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranslationServiceAsync

    /**
     * Creates or replaces the translation of one locale. The response is 201 for a new locale and
     * 200 for a replaced locale.
     */
    fun update(
        locale: Locale,
        params: TranslationUpdateParams,
    ): CompletableFuture<CreditEntitlementTranslation> =
        update(locale, params, RequestOptions.none())

    /** @see update */
    fun update(
        locale: Locale,
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditEntitlementTranslation> =
        update(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see update */
    fun update(params: TranslationUpdateParams): CompletableFuture<CreditEntitlementTranslation> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditEntitlementTranslation>

    /** Lists the translations, for all the locales or for the locales of the filter. */
    fun list(id: String): CompletableFuture<CreditEntitlementTranslationsListResponse> =
        list(id, TranslationListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: TranslationListParams = TranslationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditEntitlementTranslationsListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: TranslationListParams = TranslationListParams.none(),
    ): CompletableFuture<CreditEntitlementTranslationsListResponse> =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TranslationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditEntitlementTranslationsListResponse>

    /** @see list */
    fun list(
        params: TranslationListParams
    ): CompletableFuture<CreditEntitlementTranslationsListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditEntitlementTranslationsListResponse> =
        list(id, TranslationListParams.none(), requestOptions)

    /** Deletes the translation of one locale. */
    fun delete(locale: Locale, params: TranslationDeleteParams): CompletableFuture<Void?> =
        delete(locale, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        locale: Locale,
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see delete */
    fun delete(params: TranslationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TranslationServiceAsync] that provides access to raw HTTP responses for each
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
        ): TranslationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationServiceAsync.update].
         */
        fun update(
            locale: Locale,
            params: TranslationUpdateParams,
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslation>> =
            update(locale, params, RequestOptions.none())

        /** @see update */
        fun update(
            locale: Locale,
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslation>> =
            update(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see update */
        fun update(
            params: TranslationUpdateParams
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslation>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslation>>

        /**
         * Returns a raw HTTP response for `get /credit-entitlements/{id}/translations`, but is
         * otherwise the same as [TranslationServiceAsync.list].
         */
        fun list(
            id: String
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>> =
            list(id, TranslationListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: TranslationListParams = TranslationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: TranslationListParams = TranslationListParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TranslationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>>

        /** @see list */
        fun list(
            params: TranslationListParams
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditEntitlementTranslationsListResponse>> =
            list(id, TranslationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationServiceAsync.delete].
         */
        fun delete(
            locale: Locale,
            params: TranslationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(locale, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            locale: Locale,
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see delete */
        fun delete(params: TranslationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
