// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerRequestTest {

    @Test
    fun ofAttachExistingCustomer() {
        val attachExistingCustomer =
            AttachExistingCustomer.builder().customerId("customer_id").build()

        val customerRequest = CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer)

        assertThat(customerRequest.attachExistingCustomer()).contains(attachExistingCustomer)
        assertThat(customerRequest.createNewCustomer()).isEmpty
    }

    @Test
    fun ofAttachExistingCustomerRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerRequest =
            CustomerRequest.ofAttachExistingCustomer(
                AttachExistingCustomer.builder().customerId("customer_id").build()
            )

        val roundtrippedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRequest),
                jacksonTypeRef<CustomerRequest>(),
            )

        assertThat(roundtrippedCustomerRequest).isEqualTo(customerRequest)
    }

    @Test
    fun ofCreateNewCustomer() {
        val createNewCustomer =
            CreateNewCustomer.builder()
                .email("email")
                .name("name")
                .createNewCustomer(true)
                .phoneNumber("phone_number")
                .build()

        val customerRequest = CustomerRequest.ofCreateNewCustomer(createNewCustomer)

        assertThat(customerRequest.attachExistingCustomer()).isEmpty
        assertThat(customerRequest.createNewCustomer()).contains(createNewCustomer)
    }

    @Test
    fun ofCreateNewCustomerRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerRequest =
            CustomerRequest.ofCreateNewCustomer(
                CreateNewCustomer.builder()
                    .email("email")
                    .name("name")
                    .createNewCustomer(true)
                    .phoneNumber("phone_number")
                    .build()
            )

        val roundtrippedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRequest),
                jacksonTypeRef<CustomerRequest>(),
            )

        assertThat(roundtrippedCustomerRequest).isEqualTo(customerRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerRequest>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { customerRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
