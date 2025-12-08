// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingAddressTest {

    @Test
    fun create() {
        val billingAddress =
            BillingAddress.builder()
                .country(CountryCode.AF)
                .city("city")
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        assertThat(billingAddress.country()).isEqualTo(CountryCode.AF)
        assertThat(billingAddress.city()).contains("city")
        assertThat(billingAddress.state()).contains("state")
        assertThat(billingAddress.street()).contains("street")
        assertThat(billingAddress.zipcode()).contains("zipcode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingAddress =
            BillingAddress.builder()
                .country(CountryCode.AF)
                .city("city")
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        val roundtrippedBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingAddress),
                jacksonTypeRef<BillingAddress>(),
            )

        assertThat(roundtrippedBillingAddress).isEqualTo(billingAddress)
    }
}
