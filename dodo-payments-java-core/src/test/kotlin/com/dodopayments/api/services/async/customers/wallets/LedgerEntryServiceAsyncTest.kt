// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers.wallets

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.misc.Currency
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerEntryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val ledgerEntryServiceAsync = client.customers().wallets().ledgerEntries()

        val customerWalletFuture =
            ledgerEntryServiceAsync.create(
                LedgerEntryCreateParams.builder()
                    .customerId("customer_id")
                    .amount(0L)
                    .currency(Currency.AED)
                    .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
                    .idempotencyKey("idempotency_key")
                    .reason("reason")
                    .build()
            )

        val customerWallet = customerWalletFuture.get()
        customerWallet.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val ledgerEntryServiceAsync = client.customers().wallets().ledgerEntries()

        val pageFuture = ledgerEntryServiceAsync.list("customer_id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
