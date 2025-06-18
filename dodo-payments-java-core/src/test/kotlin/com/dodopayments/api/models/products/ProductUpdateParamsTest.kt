// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .id("id")
            .addAddon("string")
            .brandId("brand_id")
            .description("description")
            .digitalProductDelivery(
                ProductUpdateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .addFile("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instructions("instructions")
                    .build()
            )
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0)
            .licenseKeyDuration(
                LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
            )
            .licenseKeyEnabled(true)
            .name("name")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductUpdateParams.builder()
                .id("id")
                .addAddon("string")
                .brandId("brand_id")
                .description("description")
                .digitalProductDelivery(
                    ProductUpdateParams.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .addFile("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .instructions("instructions")
                        .build()
                )
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .licenseKeyEnabled(true)
                .name("name")
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
                .build()

        val body = params._body()

        assertThat(body.addons().getOrNull()).containsExactly("string")
        assertThat(body.brandId()).contains("brand_id")
        assertThat(body.description()).contains("description")
        assertThat(body.digitalProductDelivery())
            .contains(
                ProductUpdateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .addFile("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instructions("instructions")
                    .build()
            )
        assertThat(body.imageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.licenseKeyActivationMessage()).contains("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).contains(0)
        assertThat(body.licenseKeyDuration())
            .contains(LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build())
        assertThat(body.licenseKeyEnabled()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.price())
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
        assertThat(body.taxCategory()).contains(TaxCategory.DIGITAL_PRODUCTS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
