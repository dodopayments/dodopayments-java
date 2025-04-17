package com.dodopayments.api.errors

class DodoPaymentsIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
