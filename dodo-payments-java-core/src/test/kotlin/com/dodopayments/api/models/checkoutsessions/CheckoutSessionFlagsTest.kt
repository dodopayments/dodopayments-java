// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionFlagsTest {

    @Test
    fun create() {
        val checkoutSessionFlags =
            CheckoutSessionFlags.builder()
                .allowCurrencySelection(true)
                .allowCustomerEditingCity(true)
                .allowCustomerEditingCountry(true)
                .allowCustomerEditingEmail(true)
                .allowCustomerEditingName(true)
                .allowCustomerEditingState(true)
                .allowCustomerEditingStreet(true)
                .allowCustomerEditingTaxId(true)
                .allowCustomerEditingZipcode(true)
                .allowDiscountCode(true)
                .allowPhoneNumberCollection(true)
                .allowTaxId(true)
                .alwaysCreateNewCustomer(true)
                .redirectImmediately(true)
                .build()

        assertThat(checkoutSessionFlags.allowCurrencySelection()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingCity()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingCountry()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingEmail()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingName()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingState()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingStreet()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingTaxId()).contains(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingZipcode()).contains(true)
        assertThat(checkoutSessionFlags.allowDiscountCode()).contains(true)
        assertThat(checkoutSessionFlags.allowPhoneNumberCollection()).contains(true)
        assertThat(checkoutSessionFlags.allowTaxId()).contains(true)
        assertThat(checkoutSessionFlags.alwaysCreateNewCustomer()).contains(true)
        assertThat(checkoutSessionFlags.redirectImmediately()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionFlags =
            CheckoutSessionFlags.builder()
                .allowCurrencySelection(true)
                .allowCustomerEditingCity(true)
                .allowCustomerEditingCountry(true)
                .allowCustomerEditingEmail(true)
                .allowCustomerEditingName(true)
                .allowCustomerEditingState(true)
                .allowCustomerEditingStreet(true)
                .allowCustomerEditingTaxId(true)
                .allowCustomerEditingZipcode(true)
                .allowDiscountCode(true)
                .allowPhoneNumberCollection(true)
                .allowTaxId(true)
                .alwaysCreateNewCustomer(true)
                .redirectImmediately(true)
                .build()

        val roundtrippedCheckoutSessionFlags =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionFlags),
                jacksonTypeRef<CheckoutSessionFlags>(),
            )

        assertThat(roundtrippedCheckoutSessionFlags).isEqualTo(checkoutSessionFlags)
    }
}
