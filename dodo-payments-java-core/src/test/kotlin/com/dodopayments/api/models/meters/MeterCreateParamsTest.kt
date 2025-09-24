// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterCreateParamsTest {

    @Test
    fun create() {
        MeterCreateParams.builder()
            .aggregation(
                MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
            )
            .eventName("event_name")
            .measurementUnit("measurement_unit")
            .name("name")
            .description("description")
            .filter(
                MeterFilter.builder()
                    .clausesOfDirectFilterConditions(
                        listOf(
                            MeterFilter.Clauses.MeterFilterCondition.builder()
                                .key("user_id")
                                .operator(MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS)
                                .value("user123")
                                .build(),
                            MeterFilter.Clauses.MeterFilterCondition.builder()
                                .key("amount")
                                .operator(
                                    MeterFilter.Clauses.MeterFilterCondition.Operator.GREATER_THAN
                                )
                                .value(100.0)
                                .build(),
                        )
                    )
                    .conjunction(MeterFilter.Conjunction.AND)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MeterCreateParams.builder()
                .aggregation(
                    MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
                )
                .eventName("event_name")
                .measurementUnit("measurement_unit")
                .name("name")
                .description("description")
                .filter(
                    MeterFilter.builder()
                        .clausesOfDirectFilterConditions(
                            listOf(
                                MeterFilter.Clauses.MeterFilterCondition.builder()
                                    .key("user_id")
                                    .operator(
                                        MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS
                                    )
                                    .value("user123")
                                    .build(),
                                MeterFilter.Clauses.MeterFilterCondition.builder()
                                    .key("amount")
                                    .operator(
                                        MeterFilter.Clauses.MeterFilterCondition.Operator
                                            .GREATER_THAN
                                    )
                                    .value(100.0)
                                    .build(),
                            )
                        )
                        .conjunction(MeterFilter.Conjunction.AND)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.aggregation())
            .isEqualTo(
                MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
            )
        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.filter())
            .contains(
                MeterFilter.builder()
                    .clausesOfDirectFilterConditions(
                        listOf(
                            MeterFilter.Clauses.MeterFilterCondition.builder()
                                .key("user_id")
                                .operator(MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS)
                                .value("user123")
                                .build(),
                            MeterFilter.Clauses.MeterFilterCondition.builder()
                                .key("amount")
                                .operator(
                                    MeterFilter.Clauses.MeterFilterCondition.Operator.GREATER_THAN
                                )
                                .value(100.0)
                                .build(),
                        )
                    )
                    .conjunction(MeterFilter.Conjunction.AND)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeterCreateParams.builder()
                .aggregation(MeterAggregation.builder().type(MeterAggregation.Type.COUNT).build())
                .eventName("event_name")
                .measurementUnit("measurement_unit")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.aggregation())
            .isEqualTo(MeterAggregation.builder().type(MeterAggregation.Type.COUNT).build())
        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(body.name()).isEqualTo("name")
    }
}
