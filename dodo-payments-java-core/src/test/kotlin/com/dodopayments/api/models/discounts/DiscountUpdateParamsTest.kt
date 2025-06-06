// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountUpdateParamsTest {

    @Test
    fun create() {
        DiscountUpdateParams.builder()
            .discountId("discount_id")
            .amount(0)
            .code("code")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .addRestrictedTo("string")
            .type(DiscountType.PERCENTAGE)
            .usageLimit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DiscountUpdateParams.builder().discountId("discount_id").build()

        assertThat(params._pathParam(0)).isEqualTo("discount_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DiscountUpdateParams.builder()
                .discountId("discount_id")
                .amount(0)
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .addRestrictedTo("string")
                .type(DiscountType.PERCENTAGE)
                .usageLimit(0)
                .build()

        val body = params._body()

        assertThat(body.amount()).contains(0)
        assertThat(body.code()).contains("code")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).contains("name")
        assertThat(body.restrictedTo().getOrNull()).containsExactly("string")
        assertThat(body.type()).contains(DiscountType.PERCENTAGE)
        assertThat(body.usageLimit()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DiscountUpdateParams.builder().discountId("discount_id").build()

        val body = params._body()
    }
}
