// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateParamsTest {

    @Test
    fun create() {
        ProductCreateParams.builder()
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
            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
            .addAddon("string")
            .brandId("brand_id")
            .description("description")
            .digitalProductDelivery(
                ProductCreateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .instructions("instructions")
                    .build()
            )
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0)
            .licenseKeyDuration(
                LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
            )
            .licenseKeyEnabled(true)
            .metadata(
                ProductCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCreateParams.builder()
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
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .addAddon("string")
                .brandId("brand_id")
                .description("description")
                .digitalProductDelivery(
                    ProductCreateParams.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .instructions("instructions")
                        .build()
                )
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .licenseKeyEnabled(true)
                .metadata(
                    ProductCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.price())
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
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(body.addons().getOrNull()).containsExactly("string")
        assertThat(body.brandId()).contains("brand_id")
        assertThat(body.description()).contains("description")
        assertThat(body.digitalProductDelivery())
            .contains(
                ProductCreateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .instructions("instructions")
                    .build()
            )
        assertThat(body.licenseKeyActivationMessage()).contains("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).contains(0)
        assertThat(body.licenseKeyDuration())
            .contains(LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build())
        assertThat(body.licenseKeyEnabled()).contains(true)
        assertThat(body.metadata())
            .contains(
                ProductCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCreateParams.builder()
                .price(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertThat(body.price())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
    }
}
