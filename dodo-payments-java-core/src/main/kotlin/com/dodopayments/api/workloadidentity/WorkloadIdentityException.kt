// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.errors.DodoPaymentsException

/**
 * A workload identity configuration error, or an error from a subject token provider.
 *
 * An error response from the token exchange is a
 * [com.dodopayments.api.errors.DodoPaymentsServiceException] instead.
 */
class WorkloadIdentityException
@JvmOverloads
constructor(message: String, cause: Throwable? = null) : DodoPaymentsException(message, cause)
