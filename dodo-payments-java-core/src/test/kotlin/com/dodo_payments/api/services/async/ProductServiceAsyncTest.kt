// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.products.LicenseKeyDuration
import com.dodo_payments.api.models.products.Price
import com.dodo_payments.api.models.products.ProductCreateParams
import com.dodo_payments.api.models.products.ProductDeleteParams
import com.dodo_payments.api.models.products.ProductRetrieveParams
import com.dodo_payments.api.models.products.ProductUnarchiveParams
import com.dodo_payments.api.models.products.ProductUpdateParams
import com.dodo_payments.api.models.subscriptions.TimeInterval
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val productFuture =
            productServiceAsync.create(
                ProductCreateParams.builder()
                    .price(
                        Price.OneTimePrice.builder()
                            .currency(Price.OneTimePrice.Currency.AED)
                            .discount(0.0)
                            .price(0L)
                            .purchasingPowerParity(true)
                            .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                            .payWhatYouWant(true)
                            .suggestedPrice(0L)
                            .taxInclusive(true)
                            .build()
                    )
                    .taxCategory(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
                    .addAddon("string")
                    .description("description")
                    .licenseKeyActivationMessage("license_key_activation_message")
                    .licenseKeyActivationsLimit(0L)
                    .licenseKeyDuration(
                        LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
                    )
                    .licenseKeyEnabled(true)
                    .name("name")
                    .build()
            )

        val product = productFuture.get()
        product.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val productFuture =
            productServiceAsync.retrieve(ProductRetrieveParams.builder().id("id").build())

        val product = productFuture.get()
        product.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val future =
            productServiceAsync.update(
                ProductUpdateParams.builder()
                    .id("id")
                    .addAddon("string")
                    .description("description")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .licenseKeyActivationMessage("license_key_activation_message")
                    .licenseKeyActivationsLimit(0L)
                    .licenseKeyDuration(
                        LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
                    )
                    .licenseKeyEnabled(true)
                    .name("name")
                    .price(
                        Price.OneTimePrice.builder()
                            .currency(Price.OneTimePrice.Currency.AED)
                            .discount(0.0)
                            .price(0L)
                            .purchasingPowerParity(true)
                            .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                            .payWhatYouWant(true)
                            .suggestedPrice(0L)
                            .taxInclusive(true)
                            .build()
                    )
                    .taxCategory(ProductUpdateParams.TaxCategory.DIGITAL_PRODUCTS)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val pageFuture = productServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val future = productServiceAsync.delete(ProductDeleteParams.builder().id("id").build())

        val response = future.get()
    }

    @Test
    fun unarchive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val future =
            productServiceAsync.unarchive(ProductUnarchiveParams.builder().id("id").build())

        val response = future.get()
    }
}
