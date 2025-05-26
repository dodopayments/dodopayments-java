// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.refunds.RefundCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RefundServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val refundFuture =
            refundServiceAsync.create(
                RefundCreateParams.builder()
                    .paymentId("payment_id")
                    .addItem(
                        RefundCreateParams.Item.builder()
                            .itemId("item_id")
                            .amount(0)
                            .taxInclusive(true)
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val refund = refundFuture.get()
        refund.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val refundFuture = refundServiceAsync.retrieve("refund_id")

        val refund = refundFuture.get()
        refund.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val pageFuture = refundServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
