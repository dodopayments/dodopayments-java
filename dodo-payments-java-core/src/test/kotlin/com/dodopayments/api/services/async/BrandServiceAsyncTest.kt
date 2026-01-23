// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brandFuture =
            brandServiceAsync.create(
                BrandCreateParams.builder()
                    .description("description")
                    .name("name")
                    .statementDescriptor("statement_descriptor")
                    .supportEmail("support_email")
                    .url("url")
                    .build()
            )

        val brand = brandFuture.get()
        brand.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brandFuture = brandServiceAsync.retrieve("id")

        val brand = brandFuture.get()
        brand.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brandFuture =
            brandServiceAsync.update(
                BrandUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .statementDescriptor("statement_descriptor")
                    .supportEmail("support_email")
                    .url("url")
                    .build()
            )

        val brand = brandFuture.get()
        brand.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brandsFuture = brandServiceAsync.list()

        val brands = brandsFuture.get()
        brands.validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val responseFuture = brandServiceAsync.updateImages("id")

        val response = responseFuture.get()
        response.validate()
    }
}
