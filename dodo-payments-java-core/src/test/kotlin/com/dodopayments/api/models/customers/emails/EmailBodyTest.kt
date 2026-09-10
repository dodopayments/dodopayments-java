// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBodyTest {

    @Test
    fun create() {
        val emailBody =
            EmailBody.builder()
                .merchantAuthored(true)
                .failureCode(EmailFailureCode.MAILBOX_NOT_FOUND)
                .failureReason("failure_reason")
                .html("html")
                .text("text")
                .build()

        assertThat(emailBody.merchantAuthored()).isEqualTo(true)
        assertThat(emailBody.failureCode()).contains(EmailFailureCode.MAILBOX_NOT_FOUND)
        assertThat(emailBody.failureReason()).contains("failure_reason")
        assertThat(emailBody.html()).contains("html")
        assertThat(emailBody.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBody =
            EmailBody.builder()
                .merchantAuthored(true)
                .failureCode(EmailFailureCode.MAILBOX_NOT_FOUND)
                .failureReason("failure_reason")
                .html("html")
                .text("text")
                .build()

        val roundtrippedEmailBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBody),
                jacksonTypeRef<EmailBody>(),
            )

        assertThat(roundtrippedEmailBody).isEqualTo(emailBody)
    }
}
