// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.invoices

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PaymentServiceAsyncTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.invoices().payments()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val paymentFuture = paymentServiceAsync.retrieve("payment_id")

        val payment = paymentFuture.get()
        assertThat(payment.body()).hasContent("abc")
    }
}
