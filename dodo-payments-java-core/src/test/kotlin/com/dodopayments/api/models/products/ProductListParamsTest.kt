// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListParamsTest {

    @Test
    fun create() {
        ProductListParams.builder()
            .archived(true)
            .pageNumber(0L)
            .pageSize(0L)
            .recurring(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProductListParams.builder()
                .archived(true)
                .pageNumber(0L)
                .pageSize(0L)
                .recurring(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("recurring", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
