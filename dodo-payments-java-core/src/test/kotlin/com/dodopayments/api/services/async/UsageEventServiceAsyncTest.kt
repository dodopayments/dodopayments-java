// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.usageevents.EventInput
import com.dodopayments.api.models.usageevents.UsageEventIngestParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageEventServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageEventServiceAsync = client.usageEvents()

        val eventFuture = usageEventServiceAsync.retrieve("event_id")

        val event = eventFuture.get()
        event.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageEventServiceAsync = client.usageEvents()

        val pageFuture = usageEventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun ingest() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val usageEventServiceAsync = client.usageEvents()

        val responseFuture =
            usageEventServiceAsync.ingest(
                UsageEventIngestParams.builder()
                    .addEvent(
                        EventInput.builder()
                            .customerId("customer_id")
                            .eventId("event_id")
                            .eventName("event_name")
                            .metadata(
                                EventInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
