// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListResponseTest {

    @Test
    fun create() {
        val productListResponse =
            ProductListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .productId("product_id")
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .description("description")
                .image("image")
                .name("name")
                .price(0)
                .priceDetail(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxInclusive(true)
                .build()

        assertThat(productListResponse.businessId()).isEqualTo("business_id")
        assertThat(productListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.isRecurring()).isEqualTo(true)
        assertThat(productListResponse.productId()).isEqualTo("product_id")
        assertThat(productListResponse.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(productListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.currency()).contains(Currency.AED)
        assertThat(productListResponse.description()).contains("description")
        assertThat(productListResponse.image()).contains("image")
        assertThat(productListResponse.name()).contains("name")
        assertThat(productListResponse.price()).contains(0)
        assertThat(productListResponse.priceDetail())
            .contains(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(productListResponse.taxInclusive()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListResponse =
            ProductListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .productId("product_id")
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .description("description")
                .image("image")
                .name("name")
                .price(0)
                .priceDetail(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxInclusive(true)
                .build()

        val roundtrippedProductListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListResponse),
                jacksonTypeRef<ProductListResponse>(),
            )

        assertThat(roundtrippedProductListResponse).isEqualTo(productListResponse)
    }
}
