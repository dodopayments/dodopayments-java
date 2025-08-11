// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountCreateParamsTest {

    @Test
    fun create() {
        DiscountCreateParams.builder()
            .amount(0)
            .type(DiscountType.PERCENTAGE)
            .code("code")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .addRestrictedTo("string")
            .subscriptionCycles(0)
            .usageLimit(0)
            .build()
    }

    @Test
    fun body() {
        val params =
            DiscountCreateParams.builder()
                .amount(0)
                .type(DiscountType.PERCENTAGE)
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .addRestrictedTo("string")
                .subscriptionCycles(0)
                .usageLimit(0)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
        assertThat(body.type()).isEqualTo(DiscountType.PERCENTAGE)
        assertThat(body.code()).contains("code")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).contains("name")
        assertThat(body.restrictedTo().getOrNull()).containsExactly("string")
        assertThat(body.subscriptionCycles()).contains(0)
        assertThat(body.usageLimit()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DiscountCreateParams.builder().amount(0).type(DiscountType.PERCENTAGE).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
        assertThat(body.type()).isEqualTo(DiscountType.PERCENTAGE)
    }
}
