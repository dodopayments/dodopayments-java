// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.errors

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.errors.DodoPaymentsException

abstract class DodoPaymentsServiceException protected constructor(
    message: String,
    cause: Throwable? = null,

) : DodoPaymentsException(
  message, cause
) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
