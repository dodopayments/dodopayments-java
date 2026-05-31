// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.entitlements.GitHubPermission
import com.dodopayments.api.models.entitlements.IntegrationConfigResponse
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IntegrationConfigResponseTest {

    @Test
    fun ofGitHubConfig() {
      val githubConfig = IntegrationConfigResponse.GitHubConfig.builder()
          .permission(GitHubPermission.PULL)
          .targetId("target_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofGitHubConfig(githubConfig)

      assertThat(integrationConfigResponse.githubConfig()).contains(githubConfig)
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofGitHubConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofGitHubConfig(IntegrationConfigResponse.GitHubConfig.builder()
          .permission(GitHubPermission.PULL)
          .targetId("target_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofDiscordConfig() {
      val discordConfig = IntegrationConfigResponse.DiscordConfig.builder()
          .guildId("guild_id")
          .roleId("role_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofDiscordConfig(discordConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).contains(discordConfig)
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofDiscordConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofDiscordConfig(IntegrationConfigResponse.DiscordConfig.builder()
          .guildId("guild_id")
          .roleId("role_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofTelegramConfig() {
      val telegramConfig = IntegrationConfigResponse.TelegramConfig.builder()
          .chatId("chat_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofTelegramConfig(telegramConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).contains(telegramConfig)
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofTelegramConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofTelegramConfig(IntegrationConfigResponse.TelegramConfig.builder()
          .chatId("chat_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofFigmaConfig() {
      val figmaConfig = IntegrationConfigResponse.FigmaConfig.builder()
          .figmaFileId("figma_file_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofFigmaConfig(figmaConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).contains(figmaConfig)
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofFigmaConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofFigmaConfig(IntegrationConfigResponse.FigmaConfig.builder()
          .figmaFileId("figma_file_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofFramerConfig() {
      val framerConfig = IntegrationConfigResponse.FramerConfig.builder()
          .framerTemplateId("framer_template_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofFramerConfig(framerConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).contains(framerConfig)
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofFramerConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofFramerConfig(IntegrationConfigResponse.FramerConfig.builder()
          .framerTemplateId("framer_template_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofNotionConfig() {
      val notionConfig = IntegrationConfigResponse.NotionConfig.builder()
          .notionTemplateId("notion_template_id")
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofNotionConfig(notionConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).contains(notionConfig)
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofNotionConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofNotionConfig(IntegrationConfigResponse.NotionConfig.builder()
          .notionTemplateId("notion_template_id")
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofDigitalFilesConfig() {
      val digitalFilesConfig = IntegrationConfigResponse.DigitalFilesConfig.builder()
          .digitalFiles(IntegrationConfigResponse.DigitalFilesConfig.DigitalFiles.builder()
              .addFile(IntegrationConfigResponse.DigitalFilesConfig.DigitalFiles.File.builder()
                  .downloadUrl("download_url")
                  .expiresIn(0L)
                  .fileId("file_id")
                  .filename("filename")
                  .contentType("content_type")
                  .fileSize(0L)
                  .build())
              .externalUrl("external_url")
              .instructions("instructions")
              .build())
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofDigitalFilesConfig(digitalFilesConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).contains(digitalFilesConfig)
      assertThat(integrationConfigResponse.licenseKeyConfig()).isEmpty
    }

    @Test
    fun ofDigitalFilesConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofDigitalFilesConfig(IntegrationConfigResponse.DigitalFilesConfig.builder()
          .digitalFiles(IntegrationConfigResponse.DigitalFilesConfig.DigitalFiles.builder()
              .addFile(IntegrationConfigResponse.DigitalFilesConfig.DigitalFiles.File.builder()
                  .downloadUrl("download_url")
                  .expiresIn(0L)
                  .fileId("file_id")
                  .filename("filename")
                  .contentType("content_type")
                  .fileSize(0L)
                  .build())
              .externalUrl("external_url")
              .instructions("instructions")
              .build())
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    @Test
    fun ofLicenseKeyConfig() {
      val licenseKeyConfig = IntegrationConfigResponse.LicenseKeyConfig.builder()
          .activationMessage("activation_message")
          .activationsLimit(0)
          .durationCount(0)
          .durationInterval(TimeInterval.DAY)
          .build()

      val integrationConfigResponse = IntegrationConfigResponse.ofLicenseKeyConfig(licenseKeyConfig)

      assertThat(integrationConfigResponse.githubConfig()).isEmpty
      assertThat(integrationConfigResponse.discordConfig()).isEmpty
      assertThat(integrationConfigResponse.telegramConfig()).isEmpty
      assertThat(integrationConfigResponse.figmaConfig()).isEmpty
      assertThat(integrationConfigResponse.framerConfig()).isEmpty
      assertThat(integrationConfigResponse.notionConfig()).isEmpty
      assertThat(integrationConfigResponse.digitalFilesConfig()).isEmpty
      assertThat(integrationConfigResponse.licenseKeyConfig()).contains(licenseKeyConfig)
    }

    @Test
    fun ofLicenseKeyConfigRoundtrip() {
      val jsonMapper = jsonMapper()
      val integrationConfigResponse = IntegrationConfigResponse.ofLicenseKeyConfig(IntegrationConfigResponse.LicenseKeyConfig.builder()
          .activationMessage("activation_message")
          .activationsLimit(0)
          .durationCount(0)
          .durationInterval(TimeInterval.DAY)
          .build())

      val roundtrippedIntegrationConfigResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(integrationConfigResponse), jacksonTypeRef<IntegrationConfigResponse>())

      assertThat(roundtrippedIntegrationConfigResponse).isEqualTo(integrationConfigResponse)
    }

    enum class IncompatibleJsonShapeTestCase(
        val value: JsonValue
    ) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf(
          "invalid", "array"
        ))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
      val integrationConfigResponse = jsonMapper().convertValue(testCase.value, jacksonTypeRef<IntegrationConfigResponse>())

      val e = assertThrows<DodoPaymentsInvalidDataException> {
        integrationConfigResponse.validate()
      }
      assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
