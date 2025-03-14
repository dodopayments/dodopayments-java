// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductCreateParamsTest {

    @Test
    fun create() {
        ProductCreateParams.builder()
            .price(
                ProductCreateParams.Price.OneTimePrice.builder()
                    .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                    .discount(0.0)
                    .price(0L)
                    .purchasingPowerParity(true)
                    .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                    .payWhatYouWant(true)
                    .suggestedPrice(0L)
                    .taxInclusive(true)
                    .build()
            )
            .taxCategory(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
            .description("description")
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0L)
            .licenseKeyDuration(
                ProductCreateParams.LicenseKeyDuration.builder()
                    .count(0L)
                    .interval(ProductCreateParams.LicenseKeyDuration.Interval.DAY)
                    .build()
            )
            .licenseKeyEnabled(true)
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCreateParams.builder()
                .price(
                    ProductCreateParams.Price.OneTimePrice.builder()
                        .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
                .description("description")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0L)
                .licenseKeyDuration(
                    ProductCreateParams.LicenseKeyDuration.builder()
                        .count(0L)
                        .interval(ProductCreateParams.LicenseKeyDuration.Interval.DAY)
                        .build()
                )
                .licenseKeyEnabled(true)
                .name("name")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.price())
            .isEqualTo(
                ProductCreateParams.Price.ofOneTime(
                    ProductCreateParams.Price.OneTimePrice.builder()
                        .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
        assertThat(body.description()).contains("description")
        assertThat(body.licenseKeyActivationMessage()).contains("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).contains(0L)
        assertThat(body.licenseKeyDuration())
            .contains(
                ProductCreateParams.LicenseKeyDuration.builder()
                    .count(0L)
                    .interval(ProductCreateParams.LicenseKeyDuration.Interval.DAY)
                    .build()
            )
        assertThat(body.licenseKeyEnabled()).contains(true)
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCreateParams.builder()
                .price(
                    ProductCreateParams.Price.OneTimePrice.builder()
                        .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .build()
                )
                .taxCategory(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.price())
            .isEqualTo(
                ProductCreateParams.Price.ofOneTime(
                    ProductCreateParams.Price.OneTimePrice.builder()
                        .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
    }
}
