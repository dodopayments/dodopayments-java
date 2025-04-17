package com.dodo_payments.api.errors

class DodoPaymentsIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
