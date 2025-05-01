// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerPortalServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerPortalServiceAsync = client.customers().customerPortal()

        val customerPortalSessionFuture =
            customerPortalServiceAsync.create(
                CustomerPortalCreateParams.builder()
                    .customerId("customer_id")
                    .sendEmail(true)
                    .build()
            )

        val customerPortalSession = customerPortalSessionFuture.get()
        customerPortalSession.validate()
    }
}
