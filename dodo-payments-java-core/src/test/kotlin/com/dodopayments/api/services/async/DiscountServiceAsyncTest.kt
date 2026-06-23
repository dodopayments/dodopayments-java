// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.discounts.DiscountUpdateParams
import com.dodopayments.api.models.misc.Metadata
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DiscountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discountFuture =
            discountServiceAsync.create(
                DiscountCreateParams.builder()
                    .amount(0)
                    .type(DiscountType.PERCENTAGE)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .preserveOnPlanChange(true)
                    .addRestrictedTo("string")
                    .subscriptionCycles(0)
                    .usageLimit(0)
                    .build()
            )

        val discount = discountFuture.get()
        discount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discountFuture = discountServiceAsync.retrieve("dsc_qxxEmg5PuM1uNTE0LgkP9")

        val discount = discountFuture.get()
        discount.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discountFuture =
            discountServiceAsync.update(
                DiscountUpdateParams.builder()
                    .discountId("dsc_qxxEmg5PuM1uNTE0LgkP9")
                    .amount(0)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .preserveOnPlanChange(true)
                    .addRestrictedTo("string")
                    .subscriptionCycles(0)
                    .type(DiscountType.PERCENTAGE)
                    .usageLimit(0)
                    .build()
            )

        val discount = discountFuture.get()
        discount.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val pageFuture = discountServiceAsync.list()

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
        val discountServiceAsync = client.discounts()

        val future = discountServiceAsync.delete("dsc_qxxEmg5PuM1uNTE0LgkP9")

        val response = future.get()
    }

    @Test
    fun retrieveByCode() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discountFuture = discountServiceAsync.retrieveByCode("code")

        val discount = discountFuture.get()
        discount.validate()
    }
}
