// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookEventServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEventServiceAsync = client.webhookEvents()

        val webhookEventFuture =
            webhookEventServiceAsync.retrieve(
                WebhookEventRetrieveParams.builder().webhookEventId("webhook_event_id").build()
            )

        val webhookEvent = webhookEventFuture.get()
        webhookEvent.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEventServiceAsync = client.webhookEvents()

        val pageFuture = webhookEventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
