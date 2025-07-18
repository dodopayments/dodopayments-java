// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductTest {

    @Test
    fun create() {
        val product =
            Product.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .licenseKeyEnabled(true)
                .price(
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
                .productId("product_id")
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addAddon("string")
                .description("description")
                .digitalProductDelivery(
                    Product.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .addFile(
                            Product.DigitalProductDelivery.File.builder()
                                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .fileName("file_name")
                                .url("url")
                                .build()
                        )
                        .instructions("instructions")
                        .build()
                )
                .image("image")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .name("name")
                .build()

        assertThat(product.brandId()).isEqualTo("brand_id")
        assertThat(product.businessId()).isEqualTo("business_id")
        assertThat(product.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.isRecurring()).isEqualTo(true)
        assertThat(product.licenseKeyEnabled()).isEqualTo(true)
        assertThat(product.price())
            .isEqualTo(
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
        assertThat(product.productId()).isEqualTo("product_id")
        assertThat(product.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(product.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.addons().getOrNull()).containsExactly("string")
        assertThat(product.description()).contains("description")
        assertThat(product.digitalProductDelivery())
            .contains(
                Product.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .addFile(
                        Product.DigitalProductDelivery.File.builder()
                            .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .fileName("file_name")
                            .url("url")
                            .build()
                    )
                    .instructions("instructions")
                    .build()
            )
        assertThat(product.image()).contains("image")
        assertThat(product.licenseKeyActivationMessage()).contains("license_key_activation_message")
        assertThat(product.licenseKeyActivationsLimit()).contains(0)
        assertThat(product.licenseKeyDuration())
            .contains(LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build())
        assertThat(product.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val product =
            Product.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .licenseKeyEnabled(true)
                .price(
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
                .productId("product_id")
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addAddon("string")
                .description("description")
                .digitalProductDelivery(
                    Product.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .addFile(
                            Product.DigitalProductDelivery.File.builder()
                                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .fileName("file_name")
                                .url("url")
                                .build()
                        )
                        .instructions("instructions")
                        .build()
                )
                .image("image")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .name("name")
                .build()

        val roundtrippedProduct =
            jsonMapper.readValue(jsonMapper.writeValueAsString(product), jacksonTypeRef<Product>())

        assertThat(roundtrippedProduct).isEqualTo(product)
    }
}
