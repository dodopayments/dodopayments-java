// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerDeletePaymentMethodParams
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.models.misc.Metadata
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
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.create(
                CustomerCreateParams.builder()
                    .email("email")
                    .name("name")
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
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

        val customerFuture = customerServiceAsync.retrieve("cus_TV52uJWWXt2yIoBBxpjaa")

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
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .email("email")
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
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

    @Test
    fun deletePaymentMethod() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val future =
            customerServiceAsync.deletePaymentMethod(
                CustomerDeletePaymentMethodParams.builder()
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .paymentMethodId("payment_method_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun listCreditEntitlements() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val responseFuture =
            customerServiceAsync.listCreditEntitlements("cus_TV52uJWWXt2yIoBBxpjaa")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listEntitlements() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val responseFuture = customerServiceAsync.listEntitlements("cus_TV52uJWWXt2yIoBBxpjaa")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrievePaymentMethods() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val responseFuture =
            customerServiceAsync.retrievePaymentMethods("cus_TV52uJWWXt2yIoBBxpjaa")

        val response = responseFuture.get()
        response.validate()
    }
}
