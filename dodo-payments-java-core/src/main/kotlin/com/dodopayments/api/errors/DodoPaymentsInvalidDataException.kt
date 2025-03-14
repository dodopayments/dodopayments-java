package com.dodopayments.api.errors

class DodoPaymentsInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
