package com.dodopayments.api.errors

class DodoPaymentsWebhookException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
