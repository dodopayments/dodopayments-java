// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.creditentitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationListParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationUpdateParams
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
        val translationServiceAsync = client.creditEntitlements().translations()

        val creditEntitlementTranslationFuture =
            translationServiceAsync.update(
                TranslationUpdateParams.builder()
                    .id("id")
                    .locale(Locale.AR)
                    .name("name")
                    .unit("unit")
                    .build()
            )

        val creditEntitlementTranslation = creditEntitlementTranslationFuture.get()
        creditEntitlementTranslation.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.creditEntitlements().translations()

        val creditEntitlementTranslationsListResponseFuture =
            translationServiceAsync.list(
                TranslationListParams.builder().id("id").addLocale("string").build()
            )

        val creditEntitlementTranslationsListResponse =
            creditEntitlementTranslationsListResponseFuture.get()
        creditEntitlementTranslationsListResponse.validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.creditEntitlements().translations()

        val future =
            translationServiceAsync.delete(
                TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
            )

        val response = future.get()
    }
}
