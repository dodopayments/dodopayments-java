// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.disputes.DisputeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DisputeServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeFuture =
            disputeServiceAsync.retrieve(
                DisputeRetrieveParams.builder().disputeId("dispute_id").build()
            )

        val dispute = disputeFuture.get()
        dispute.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeServiceAsync = client.disputes()

        val pageFuture = disputeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
