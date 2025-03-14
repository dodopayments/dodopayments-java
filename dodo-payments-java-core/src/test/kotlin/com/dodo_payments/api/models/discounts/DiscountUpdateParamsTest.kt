// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.discounts

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DiscountUpdateParamsTest {

    @Test
    fun create() {
        DiscountUpdateParams.builder()
            .discountId("discount_id")
            .amount(0L)
            .code("code")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .addRestrictedTo("string")
            .type(DiscountUpdateParams.Type.PERCENTAGE)
            .usageLimit(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            DiscountUpdateParams.builder()
                .discountId("discount_id")
                .amount(0L)
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .addRestrictedTo("string")
                .type(DiscountUpdateParams.Type.PERCENTAGE)
                .usageLimit(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).contains(0L)
        assertThat(body.code()).contains("code")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).contains("name")
        assertThat(body.restrictedTo()).contains(listOf("string"))
        assertThat(body.type()).contains(DiscountUpdateParams.Type.PERCENTAGE)
        assertThat(body.usageLimit()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DiscountUpdateParams.builder().discountId("discount_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = DiscountUpdateParams.builder().discountId("discount_id").build()
        assertThat(params).isNotNull
        // path param "discountId"
        assertThat(params.getPathParam(0)).isEqualTo("discount_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
