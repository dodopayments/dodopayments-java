// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandCreateParamsTest {

    @Test
    fun create() {
        BrandCreateParams.builder()
            .description("description")
            .name("name")
            .statementDescriptor("statement_descriptor")
            .supportEmail("support_email")
            .url("url")
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandCreateParams.builder()
                .description("description")
                .name("name")
                .statementDescriptor("statement_descriptor")
                .supportEmail("support_email")
                .url("url")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.statementDescriptor()).contains("statement_descriptor")
        assertThat(body.supportEmail()).contains("support_email")
        assertThat(body.url()).contains("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandCreateParams.builder().build()

        val body = params._body()
    }
}
