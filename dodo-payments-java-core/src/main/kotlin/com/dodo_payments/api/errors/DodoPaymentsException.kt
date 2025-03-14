package com.dodo_payments.api.errors

open class DodoPaymentsException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
