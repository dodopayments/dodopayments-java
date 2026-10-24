// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.addons

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.addons.translations.TranslationDeleteParams
import com.dodopayments.api.models.addons.translations.TranslationListParams
import com.dodopayments.api.models.addons.translations.TranslationUpdateParams
import com.dodopayments.api.models.misc.Locale
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranslationServiceAsyncTest {

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.addons().translations()

        val translationFuture =
            translationServiceAsync.update(
                TranslationUpdateParams.builder()
                    .id("id")
                    .locale(Locale.AR)
                    .description("description")
                    .name("name")
                    .build()
            )

        val translation = translationFuture.get()
        translation.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.addons().translations()

        val translationsListResponseFuture =
            translationServiceAsync.list(
                TranslationListParams.builder().id("id").addLocale("string").build()
            )

        val translationsListResponse = translationsListResponseFuture.get()
        translationsListResponse.validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.addons().translations()

        val future =
            translationServiceAsync.delete(
                TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
            )

        val response = future.get()
    }
}
