package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

abstract class DodoPaymentsServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: DodoPaymentsError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : DodoPaymentsException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): DodoPaymentsError = error
}
