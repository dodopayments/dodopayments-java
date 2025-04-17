package com.dodo_payments.api.errors

class DodoPaymentsInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
