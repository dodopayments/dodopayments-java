// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.customers.CustomerCreateParams
import com.dodo_payments.api.models.customers.CustomerRetrieveParams
import com.dodo_payments.api.models.customers.CustomerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.create(
                CustomerCreateParams.builder()
                    .email("email")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.retrieve(
                CustomerRetrieveParams.builder().customerId("customer_id").build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customer_id")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val pageFuture = customerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
