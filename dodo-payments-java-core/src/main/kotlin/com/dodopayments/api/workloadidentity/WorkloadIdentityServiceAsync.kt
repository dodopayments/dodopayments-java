// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.ClientOptions
import java.util.concurrent.CompletableFuture

/** Manages the workload identity access token of an asynchronous client. */
class WorkloadIdentityServiceAsync internal constructor(private val clientOptions: ClientOptions) {

    /**
     * Revokes the cached access token and clears the cache.
     *
     * Does nothing if the cache has no access token.
     */
    fun revoke(): CompletableFuture<Void?> =
        clientOptions.workloadIdentityTokenManager?.revokeAsync()
            ?: CompletableFuture.completedFuture(null)

    /** Alias for [revoke]. */
    fun revokeAsync(): CompletableFuture<Void?> = revoke()
}
