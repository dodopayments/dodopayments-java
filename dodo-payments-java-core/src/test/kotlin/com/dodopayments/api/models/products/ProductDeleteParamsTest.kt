// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductDeleteParamsTest {

    @Test
    fun create() {
        ProductDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ProductDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
