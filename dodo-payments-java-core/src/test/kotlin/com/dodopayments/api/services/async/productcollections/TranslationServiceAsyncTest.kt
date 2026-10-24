// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.productcollections

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.misc.Locale
import com.dodopayments.api.models.productcollections.translations.TranslationDeleteParams
import com.dodopayments.api.models.productcollections.translations.TranslationListParams
import com.dodopayments.api.models.productcollections.translations.TranslationUpdateParams
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
        val translationServiceAsync = client.productCollections().translations()

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
        val translationServiceAsync = client.productCollections().translations()

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
        val translationServiceAsync = client.productCollections().translations()

        val future =
            translationServiceAsync.delete(
                TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
            )

        val response = future.get()
    }
}
