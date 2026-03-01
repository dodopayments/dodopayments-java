// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditEntitlementServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val creditEntitlementFuture =
            creditEntitlementServiceAsync.create(
                CreditEntitlementCreateParams.builder()
                    .name("name")
                    .overageEnabled(true)
                    .precision(0)
                    .rolloverEnabled(true)
                    .unit("unit")
                    .currency(Currency.AED)
                    .description("description")
                    .expiresAfterDays(0)
                    .maxRolloverCount(0)
                    .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                    .overageLimit(0L)
                    .pricePerUnit("price_per_unit")
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .build()
            )

        val creditEntitlement = creditEntitlementFuture.get()
        creditEntitlement.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val creditEntitlementFuture = creditEntitlementServiceAsync.retrieve("id")

        val creditEntitlement = creditEntitlementFuture.get()
        creditEntitlement.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val future =
            creditEntitlementServiceAsync.update(
                CreditEntitlementUpdateParams.builder()
                    .id("id")
                    .currency(Currency.AED)
                    .description("description")
                    .expiresAfterDays(0)
                    .maxRolloverCount(0)
                    .name("name")
                    .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                    .overageEnabled(true)
                    .overageLimit(0L)
                    .pricePerUnit("price_per_unit")
                    .rolloverEnabled(true)
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .unit("unit")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val pageFuture = creditEntitlementServiceAsync.list()

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
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val future = creditEntitlementServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun undelete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val future = creditEntitlementServiceAsync.undelete("id")

        val response = future.get()
    }
}
