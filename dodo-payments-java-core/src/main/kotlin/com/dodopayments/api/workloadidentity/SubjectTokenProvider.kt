// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

/**
 * A source of subject tokens (JWTs from your identity provider).
 *
 * The client calls the provider before each token exchange. The client does not cache the subject
 * token. See [SubjectTokenProviders] for the available helpers.
 */
fun interface SubjectTokenProvider {

    /**
     * Returns the subject token.
     *
     * @param baseUrl the base URL of the client. Some helpers use its origin as the default
     *   audience.
     */
    fun subjectToken(baseUrl: String): String
}
