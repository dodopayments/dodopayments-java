// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.webhookevents.WebhookEventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookEventServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
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
                .bearerToken("My Bearer Token")
                .build()
        val webhookEventServiceAsync = client.webhookEvents()

        val pageFuture = webhookEventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
