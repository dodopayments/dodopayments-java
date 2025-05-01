// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RefundServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val refundServiceAsync = client.refunds()

        val refundFuture =
            refundServiceAsync.create(
                RefundCreateParams.builder().paymentId("payment_id").reason("reason").build()
            )

        val refund = refundFuture.get()
        refund.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val refundServiceAsync = client.refunds()

        val refundFuture =
            refundServiceAsync.retrieve(
                RefundRetrieveParams.builder().refundId("refund_id").build()
            )

        val refund = refundFuture.get()
        refund.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val refundServiceAsync = client.refunds()

        val pageFuture = refundServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
