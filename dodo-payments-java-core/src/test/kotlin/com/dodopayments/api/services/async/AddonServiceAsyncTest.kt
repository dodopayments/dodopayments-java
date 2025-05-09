// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddonServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponseFuture =
            addonServiceAsync.create(
                AddonCreateParams.builder()
                    .currency(Currency.AED)
                    .name("name")
                    .price(0)
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .description("description")
                    .build()
            )

        val addonResponse = addonResponseFuture.get()
        addonResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponseFuture = addonServiceAsync.retrieve("id")

        val addonResponse = addonResponseFuture.get()
        addonResponse.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponseFuture =
            addonServiceAsync.update(
                AddonUpdateParams.builder()
                    .id("id")
                    .currency(Currency.AED)
                    .description("description")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .price(0)
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .build()
            )

        val addonResponse = addonResponseFuture.get()
        addonResponse.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val pageFuture = addonServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val responseFuture = addonServiceAsync.updateImages("id")

        val response = responseFuture.get()
        response.validate()
    }
}
