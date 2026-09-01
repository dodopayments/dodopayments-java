// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.blocklist.customers.BlockedCustomerSource
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        val blockedCustomerFuture =
            customerServiceAsync.create(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                    .customerId("customer_id")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )

        val blockedCustomer = blockedCustomerFuture.get()
        blockedCustomer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        val blockedCustomerFuture = customerServiceAsync.retrieve("entry_id")

        val blockedCustomer = blockedCustomerFuture.get()
        blockedCustomer.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        val pageFuture = customerServiceAsync.list()

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
        val customerServiceAsync = client.blocklist().customers()

        val future = customerServiceAsync.delete("entry_id")

        val response = future.get()
    }
}
