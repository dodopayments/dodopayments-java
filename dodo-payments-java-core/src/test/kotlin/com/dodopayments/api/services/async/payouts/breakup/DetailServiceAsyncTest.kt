// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts.breakup

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailServiceAsyncTest {

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailServiceAsync = client.payouts().breakup().details()

        val pageFuture = detailServiceAsync.list("pyt_zFTrrn4sk3x3y2vjDBW3T")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun downloadCsv() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailServiceAsync = client.payouts().breakup().details()

        val future = detailServiceAsync.downloadCsv("pyt_zFTrrn4sk3x3y2vjDBW3T")

        val response = future.get()
    }
}
