// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddMeterToPriceTest {

    @Test
    fun create() {
        val addMeterToPrice =
            AddMeterToPrice.builder()
                .meterId("meter_id")
                .creditEntitlementId("credit_entitlement_id")
                .description("description")
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterUnitsPerCredit("meter_units_per_credit")
                .name("name")
                .pricePerUnit("10.50")
                .build()

        assertThat(addMeterToPrice.meterId()).isEqualTo("meter_id")
        assertThat(addMeterToPrice.creditEntitlementId()).contains("credit_entitlement_id")
        assertThat(addMeterToPrice.description()).contains("description")
        assertThat(addMeterToPrice.freeThreshold()).contains(0L)
        assertThat(addMeterToPrice.measurementUnit()).contains("measurement_unit")
        assertThat(addMeterToPrice.meterUnitsPerCredit()).contains("meter_units_per_credit")
        assertThat(addMeterToPrice.name()).contains("name")
        assertThat(addMeterToPrice.pricePerUnit()).contains("10.50")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addMeterToPrice =
            AddMeterToPrice.builder()
                .meterId("meter_id")
                .creditEntitlementId("credit_entitlement_id")
                .description("description")
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterUnitsPerCredit("meter_units_per_credit")
                .name("name")
                .pricePerUnit("10.50")
                .build()

        val roundtrippedAddMeterToPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addMeterToPrice),
                jacksonTypeRef<AddMeterToPrice>(),
            )

        assertThat(roundtrippedAddMeterToPrice).isEqualTo(addMeterToPrice)
    }
}
