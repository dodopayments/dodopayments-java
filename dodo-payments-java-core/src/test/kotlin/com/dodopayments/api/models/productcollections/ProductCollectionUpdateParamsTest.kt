// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionUpdateParamsTest {

    @Test
    fun create() {
        ProductCollectionUpdateParams.builder()
            .id("id")
            .brandId("brand_id")
            .description("description")
            .effectiveAtOnDowngrade(
                ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY
            )
            .effectiveAtOnUpgrade(ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
            .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .onPaymentFailure(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
            .prorationBillingModeOnDowngrade(
                ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
            .prorationBillingModeOnUpgrade(
                ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductCollectionUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductCollectionUpdateParams.builder()
                .id("id")
                .brandId("brand_id")
                .description("description")
                .effectiveAtOnDowngrade(
                    ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY
                )
                .effectiveAtOnUpgrade(
                    ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY
                )
                .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .onPaymentFailure(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade
                        .PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()

        val body = params._body()

        assertThat(body.brandId()).contains("brand_id")
        assertThat(body.description()).contains("description")
        assertThat(body.effectiveAtOnDowngrade())
            .contains(ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY)
        assertThat(body.effectiveAtOnUpgrade())
            .contains(ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
        assertThat(body.groupOrder().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.imageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).contains("name")
        assertThat(body.onPaymentFailure())
            .contains(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
        assertThat(body.prorationBillingModeOnDowngrade())
            .contains(
                ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
        assertThat(body.prorationBillingModeOnUpgrade())
            .contains(
                ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductCollectionUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
