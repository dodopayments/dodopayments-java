// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.services.blocking.WebhookEventService
import com.dodopayments.api.services.blocking.WebhookEventServiceImpl
import java.util.function.Consumer

class WebhookEventServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : WebhookEventService {

    private val withRawResponse: WebhookEventService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): WebhookEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookEventService = WebhookEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : WebhookEventService.WithRawResponse {

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookEventService.WithRawResponse = WebhookEventServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())
    }
}
