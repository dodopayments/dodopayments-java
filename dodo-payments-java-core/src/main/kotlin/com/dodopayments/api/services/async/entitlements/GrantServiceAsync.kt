// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.GrantListPageAsync
import com.dodopayments.api.models.entitlements.grants.GrantListParams
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GrantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantServiceAsync

    /** GET /entitlements/{id}/grants (public API) */
    fun list(id: String): CompletableFuture<GrantListPageAsync> = list(id, GrantListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: GrantListParams = GrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GrantListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: GrantListParams = GrantListParams.none(),
    ): CompletableFuture<GrantListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GrantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GrantListPageAsync>

    /** @see list */
    fun list(params: GrantListParams): CompletableFuture<GrantListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<GrantListPageAsync> =
        list(id, GrantListParams.none(), requestOptions)

    /**
     * Revokes a single entitlement grant for the caller's business. For LicenseKey integrations,
     * also disables the backing license key. Idempotent: re-revoking an already-revoked grant
     * returns 200 with current state. The revocation reason is always set to "manual" for
     * API-initiated revocations.
     */
    fun revoke(grantId: String, params: GrantRevokeParams): CompletableFuture<EntitlementGrant> =
        revoke(grantId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        grantId: String,
        params: GrantRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementGrant> =
        revoke(params.toBuilder().grantId(grantId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: GrantRevokeParams): CompletableFuture<EntitlementGrant> =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: GrantRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitlementGrant>

    /** A view of [GrantServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /entitlements/{id}/grants`, but is otherwise the
         * same as [GrantServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(id, GrantListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: GrantListParams = GrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: GrantListParams = GrantListParams.none(),
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GrantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>>

        /** @see list */
        fun list(params: GrantListParams): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GrantListPageAsync>> =
            list(id, GrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}/grants/{grant_id}`, but is
         * otherwise the same as [GrantServiceAsync.revoke].
         */
        fun revoke(
            grantId: String,
            params: GrantRevokeParams,
        ): CompletableFuture<HttpResponseFor<EntitlementGrant>> =
            revoke(grantId, params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            grantId: String,
            params: GrantRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementGrant>> =
            revoke(params.toBuilder().grantId(grantId).build(), requestOptions)

        /** @see revoke */
        fun revoke(
            params: GrantRevokeParams
        ): CompletableFuture<HttpResponseFor<EntitlementGrant>> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            params: GrantRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitlementGrant>>
    }
}
