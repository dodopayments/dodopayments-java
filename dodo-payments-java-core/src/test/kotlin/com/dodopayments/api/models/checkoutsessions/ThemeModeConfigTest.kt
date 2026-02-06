// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThemeModeConfigTest {

    @Test
    fun create() {
        val themeModeConfig =
            ThemeModeConfig.builder()
                .bgPrimary("bg_primary")
                .bgSecondary("bg_secondary")
                .borderPrimary("border_primary")
                .borderSecondary("border_secondary")
                .buttonPrimary("button_primary")
                .buttonPrimaryHover("button_primary_hover")
                .buttonSecondary("button_secondary")
                .buttonSecondaryHover("button_secondary_hover")
                .buttonTextPrimary("button_text_primary")
                .buttonTextSecondary("button_text_secondary")
                .inputFocusBorder("input_focus_border")
                .textError("text_error")
                .textPlaceholder("text_placeholder")
                .textPrimary("text_primary")
                .textSecondary("text_secondary")
                .textSuccess("text_success")
                .build()

        assertThat(themeModeConfig.bgPrimary()).contains("bg_primary")
        assertThat(themeModeConfig.bgSecondary()).contains("bg_secondary")
        assertThat(themeModeConfig.borderPrimary()).contains("border_primary")
        assertThat(themeModeConfig.borderSecondary()).contains("border_secondary")
        assertThat(themeModeConfig.buttonPrimary()).contains("button_primary")
        assertThat(themeModeConfig.buttonPrimaryHover()).contains("button_primary_hover")
        assertThat(themeModeConfig.buttonSecondary()).contains("button_secondary")
        assertThat(themeModeConfig.buttonSecondaryHover()).contains("button_secondary_hover")
        assertThat(themeModeConfig.buttonTextPrimary()).contains("button_text_primary")
        assertThat(themeModeConfig.buttonTextSecondary()).contains("button_text_secondary")
        assertThat(themeModeConfig.inputFocusBorder()).contains("input_focus_border")
        assertThat(themeModeConfig.textError()).contains("text_error")
        assertThat(themeModeConfig.textPlaceholder()).contains("text_placeholder")
        assertThat(themeModeConfig.textPrimary()).contains("text_primary")
        assertThat(themeModeConfig.textSecondary()).contains("text_secondary")
        assertThat(themeModeConfig.textSuccess()).contains("text_success")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val themeModeConfig =
            ThemeModeConfig.builder()
                .bgPrimary("bg_primary")
                .bgSecondary("bg_secondary")
                .borderPrimary("border_primary")
                .borderSecondary("border_secondary")
                .buttonPrimary("button_primary")
                .buttonPrimaryHover("button_primary_hover")
                .buttonSecondary("button_secondary")
                .buttonSecondaryHover("button_secondary_hover")
                .buttonTextPrimary("button_text_primary")
                .buttonTextSecondary("button_text_secondary")
                .inputFocusBorder("input_focus_border")
                .textError("text_error")
                .textPlaceholder("text_placeholder")
                .textPrimary("text_primary")
                .textSecondary("text_secondary")
                .textSuccess("text_success")
                .build()

        val roundtrippedThemeModeConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(themeModeConfig),
                jacksonTypeRef<ThemeModeConfig>(),
            )

        assertThat(roundtrippedThemeModeConfig).isEqualTo(themeModeConfig)
    }
}
