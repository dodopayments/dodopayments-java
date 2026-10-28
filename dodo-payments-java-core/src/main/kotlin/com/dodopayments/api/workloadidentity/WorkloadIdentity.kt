// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.checkRequired
import java.util.concurrent.ConcurrentHashMap

/**
 * The workload identity configuration of a client.
 *
 * The client exchanges a subject token (a JWT from your identity provider) for a short-lived access
 * token. Clients that use the same instance of this class share one access token cache.
 */
class WorkloadIdentity
private constructor(
    /** The ID of the identity provider in Dodo Payments, for example `wip_...`. */
    @get:JvmName("identityProviderId") val identityProviderId: String,
    /** The source of the subject token. See [SubjectTokenProviders]. */
    @get:JvmName("provider") val provider: SubjectTokenProvider,
) {

    @JvmSynthetic
    internal val tokenCaches: ConcurrentHashMap<String, WorkloadIdentityTokenCache> =
        ConcurrentHashMap()

    override fun toString(): String = "WorkloadIdentity{identityProviderId=$identityProviderId}"

    companion object {

        /** The environment variable that gives the default [identityProviderId]. */
        const val IDENTITY_PROVIDER_ID_ENV: String = "DODO_PAYMENTS_IDENTITY_PROVIDER_ID"

        /**
         * Returns a mutable builder for constructing an instance of [WorkloadIdentity].
         *
         * The following fields are required:
         * ```java
         * .provider()
         * ```
         *
         * If you do not set [Builder.identityProviderId], the builder reads it from the
         * `DODO_PAYMENTS_IDENTITY_PROVIDER_ID` environment variable.
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkloadIdentity]. */
    class Builder internal constructor() {

        private var identityProviderId: String? = null
        private var provider: SubjectTokenProvider? = null

        /** The ID of the identity provider in Dodo Payments, for example `wip_...`. */
        fun identityProviderId(identityProviderId: String) = apply {
            this.identityProviderId = identityProviderId
        }

        /** The source of the subject token. See [SubjectTokenProviders]. */
        fun provider(provider: SubjectTokenProvider) = apply { this.provider = provider }

        /**
         * Returns an immutable instance of [WorkloadIdentity].
         *
         * @throws WorkloadIdentityException if the identity provider ID is not set and the
         *   `DODO_PAYMENTS_IDENTITY_PROVIDER_ID` environment variable is empty.
         * @throws IllegalStateException if [provider] is not set.
         */
        fun build(): WorkloadIdentity {
            val identityProviderId =
                identityProviderId?.takeIf { it.isNotEmpty() }
                    ?: System.getenv(IDENTITY_PROVIDER_ID_ENV)?.takeIf { it.isNotEmpty() }
                    ?: throw WorkloadIdentityException(
                        "Set identityProviderId or the $IDENTITY_PROVIDER_ID_ENV environment variable."
                    )
            return WorkloadIdentity(identityProviderId, checkRequired("provider", provider))
        }
    }
}
