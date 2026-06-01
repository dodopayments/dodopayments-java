// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupResponse
import com.dodopayments.api.models.productcollections.groups.items.ProductCollectionProduct
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionTest {

    @Test
    fun create() {
        val productCollection =
            ProductCollection.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionGroupResponse.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionProduct.builder()
                                .id("id")
                                .addonsCount(0L)
                                .filesCount(0L)
                                .hasCreditEntitlements(true)
                                .isRecurring(true)
                                .licenseKeyEnabled(true)
                                .metersCount(0L)
                                .productId("product_id")
                                .status(true)
                                .currency(Currency.AED)
                                .description("description")
                                .name("name")
                                .price(0)
                                .priceDetail(
                                    Price.OneTimePrice.builder()
                                        .currency(Currency.AED)
                                        .discount(0L)
                                        .price(0)
                                        .purchasingPowerParity(true)
                                        .payWhatYouWant(true)
                                        .suggestedPrice(0)
                                        .taxInclusive(true)
                                        .build()
                                )
                                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                                .taxInclusive(true)
                                .build()
                        )
                        .status(true)
                        .groupName("group_name")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAtOnDowngrade(ProductCollection.EffectiveAtOnDowngrade.IMMEDIATELY)
                .effectiveAtOnUpgrade(ProductCollection.EffectiveAtOnUpgrade.IMMEDIATELY)
                .image("image")
                .onPaymentFailure(ProductCollection.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollection.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollection.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()

        assertThat(productCollection.id()).isEqualTo("id")
        assertThat(productCollection.brandId()).isEqualTo("brand_id")
        assertThat(productCollection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollection.groups())
            .containsExactly(
                ProductCollectionGroupResponse.builder()
                    .groupId("group_id")
                    .addProduct(
                        ProductCollectionProduct.builder()
                            .id("id")
                            .addonsCount(0L)
                            .filesCount(0L)
                            .hasCreditEntitlements(true)
                            .isRecurring(true)
                            .licenseKeyEnabled(true)
                            .metersCount(0L)
                            .productId("product_id")
                            .status(true)
                            .currency(Currency.AED)
                            .description("description")
                            .name("name")
                            .price(0)
                            .priceDetail(
                                Price.OneTimePrice.builder()
                                    .currency(Currency.AED)
                                    .discount(0L)
                                    .price(0)
                                    .purchasingPowerParity(true)
                                    .payWhatYouWant(true)
                                    .suggestedPrice(0)
                                    .taxInclusive(true)
                                    .build()
                            )
                            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                            .taxInclusive(true)
                            .build()
                    )
                    .status(true)
                    .groupName("group_name")
                    .build()
            )
        assertThat(productCollection.name()).isEqualTo("name")
        assertThat(productCollection.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollection.description()).contains("description")
        assertThat(productCollection.effectiveAtOnDowngrade())
            .contains(ProductCollection.EffectiveAtOnDowngrade.IMMEDIATELY)
        assertThat(productCollection.effectiveAtOnUpgrade())
            .contains(ProductCollection.EffectiveAtOnUpgrade.IMMEDIATELY)
        assertThat(productCollection.image()).contains("image")
        assertThat(productCollection.onPaymentFailure())
            .contains(ProductCollection.OnPaymentFailure.PREVENT_CHANGE)
        assertThat(productCollection.prorationBillingModeOnDowngrade())
            .contains(ProductCollection.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY)
        assertThat(productCollection.prorationBillingModeOnUpgrade())
            .contains(ProductCollection.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollection =
            ProductCollection.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionGroupResponse.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionProduct.builder()
                                .id("id")
                                .addonsCount(0L)
                                .filesCount(0L)
                                .hasCreditEntitlements(true)
                                .isRecurring(true)
                                .licenseKeyEnabled(true)
                                .metersCount(0L)
                                .productId("product_id")
                                .status(true)
                                .currency(Currency.AED)
                                .description("description")
                                .name("name")
                                .price(0)
                                .priceDetail(
                                    Price.OneTimePrice.builder()
                                        .currency(Currency.AED)
                                        .discount(0L)
                                        .price(0)
                                        .purchasingPowerParity(true)
                                        .payWhatYouWant(true)
                                        .suggestedPrice(0)
                                        .taxInclusive(true)
                                        .build()
                                )
                                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                                .taxInclusive(true)
                                .build()
                        )
                        .status(true)
                        .groupName("group_name")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAtOnDowngrade(ProductCollection.EffectiveAtOnDowngrade.IMMEDIATELY)
                .effectiveAtOnUpgrade(ProductCollection.EffectiveAtOnUpgrade.IMMEDIATELY)
                .image("image")
                .onPaymentFailure(ProductCollection.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollection.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollection.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()

        val roundtrippedProductCollection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollection),
                jacksonTypeRef<ProductCollection>(),
            )

        assertThat(roundtrippedProductCollection).isEqualTo(productCollection)
    }
}
