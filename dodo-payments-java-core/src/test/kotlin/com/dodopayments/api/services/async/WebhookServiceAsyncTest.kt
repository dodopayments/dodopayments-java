// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.webhookevents.WebhookEventType
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Test
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
}
