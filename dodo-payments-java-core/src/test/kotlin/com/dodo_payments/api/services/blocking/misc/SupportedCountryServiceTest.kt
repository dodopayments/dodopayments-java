// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.misc

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SupportedCountryServiceTest {

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val supportedCountryService = client.misc().supportedCountries()

        supportedCountryService.list()
    }
}
