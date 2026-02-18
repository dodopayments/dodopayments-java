// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.UnwrapWebhookParams
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.errors.DodoPaymentsWebhookException
import com.dodopayments.api.models.webhookevents.WebhookEventType
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetailsFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .url("url")
                    .description("description")
                    .disabled(true)
                    .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
                    .headers(
                        WebhookCreateParams.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .idempotencyKey("idempotency_key")
                    .metadata(
                        WebhookCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .rateLimit(0)
                    .build()
            )

        val webhookDetails = webhookDetailsFuture.get()
        webhookDetails.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetailsFuture = webhookServiceAsync.retrieve("webhook_id")

        val webhookDetails = webhookDetailsFuture.get()
        webhookDetails.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetailsFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .webhookId("webhook_id")
                    .description("description")
                    .disabled(true)
                    .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
                    .metadata(
                        WebhookUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .rateLimit(0)
                    .url("url")
                    .build()
            )

        val webhookDetails = webhookDetailsFuture.get()
        webhookDetails.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val pageFuture = webhookServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.delete("webhook_id")

        val response = future.get()
    }

    @Test
    fun retrieveSecret() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture = webhookServiceAsync.retrieveSecret("webhook_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun unsafeUnwrap() {
        val client = DodoPaymentsOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"amount\":\"amount\",\"business_id\":\"business_id\",\"created_at\":\"2019-12-27T18:11:19.117Z\",\"currency\":\"currency\",\"dispute_id\":\"dispute_id\",\"dispute_stage\":\"pre_dispute\",\"dispute_status\":\"dispute_opened\",\"payment_id\":\"payment_id\",\"remarks\":\"remarks\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"dispute.accepted\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookServiceAsync.unsafeUnwrap(payload).validate()
    }

    @Test
    fun unwrap() {
        val client = DodoPaymentsOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"amount\":\"amount\",\"business_id\":\"business_id\",\"created_at\":\"2019-12-27T18:11:19.117Z\",\"currency\":\"currency\",\"dispute_id\":\"dispute_id\",\"dispute_stage\":\"pre_dispute\",\"dispute_status\":\"dispute_opened\",\"payment_id\":\"payment_id\",\"remarks\":\"remarks\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"dispute.accepted\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        webhookServiceAsync.unwrap(payload).validate()

        // Wrong key should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }

        // Bad signature should throw
        assertThrows<DodoPaymentsWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Old timestamp should throw
        assertThrows<DodoPaymentsWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Wrong message ID should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
    }
}
