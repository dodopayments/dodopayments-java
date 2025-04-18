// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEventTest {

    @Test
    fun create() {
        val webhookEvent =
            WebhookEvent.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId("event_id")
                .eventType("event_type")
                .objectId("object_id")
                .latestAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .request("request")
                .response("response")
                .build()

        assertThat(webhookEvent.businessId()).isEqualTo("business_id")
        assertThat(webhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEvent.eventId()).isEqualTo("event_id")
        assertThat(webhookEvent.eventType()).isEqualTo("event_type")
        assertThat(webhookEvent.objectId()).isEqualTo("object_id")
        assertThat(webhookEvent.latestAttemptedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEvent.request()).contains("request")
        assertThat(webhookEvent.response()).contains("response")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId("event_id")
                .eventType("event_type")
                .objectId("object_id")
                .latestAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .request("request")
                .response("response")
                .build()

        val roundtrippedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEvent),
                jacksonTypeRef<WebhookEvent>(),
            )

        assertThat(roundtrippedWebhookEvent).isEqualTo(webhookEvent)
    }
}
