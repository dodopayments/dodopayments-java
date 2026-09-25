// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationScreenParamsTest {

    @Test
    fun create() {
        ModerationScreenParams.builder().image("image").requestId("request_id").text("text").build()
    }

    @Test
    fun body() {
        val params =
            ModerationScreenParams.builder()
                .image("image")
                .requestId("request_id")
                .text("text")
                .build()

        val body = params._body()

        assertThat(body.image()).contains("image")
        assertThat(body.requestId()).contains("request_id")
        assertThat(body.text()).contains("text")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ModerationScreenParams.builder().build()

        val body = params._body()
    }
}
