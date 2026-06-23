// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocalizedPriceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceServiceAsync = client.products().localizedPrices()

        val localizedPriceFuture =
            localizedPriceServiceAsync.create(
                LocalizedPriceCreateParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .amount(0)
                    .currency(Currency.AED)
                    .countryCode(CountryCode.AF)
                    .build()
            )

        val localizedPrice = localizedPriceFuture.get()
        localizedPrice.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceServiceAsync = client.products().localizedPrices()

        val localizedPriceFuture =
            localizedPriceServiceAsync.retrieve(
                LocalizedPriceRetrieveParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                    .build()
            )

        val localizedPrice = localizedPriceFuture.get()
        localizedPrice.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceServiceAsync = client.products().localizedPrices()

        val localizedPriceFuture =
            localizedPriceServiceAsync.update(
                LocalizedPriceUpdateParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                    .amount(0)
                    .build()
            )

        val localizedPrice = localizedPriceFuture.get()
        localizedPrice.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceServiceAsync = client.products().localizedPrices()

        val listLocalizedPricesResponseFuture =
            localizedPriceServiceAsync.list("pdt_R8AWMPiV8RyJElcCKvAID")

        val listLocalizedPricesResponse = listLocalizedPricesResponseFuture.get()
        listLocalizedPricesResponse.validate()
    }

    @Test
    fun archive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceServiceAsync = client.products().localizedPrices()

        val future =
            localizedPriceServiceAsync.archive(
                LocalizedPriceArchiveParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                    .build()
            )

        val response = future.get()
    }
}
