// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.licensekeys.LicenseKeyListParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseKeyServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKeyFuture =
            licenseKeyServiceAsync.retrieve(
                LicenseKeyRetrieveParams.builder().id("lic_123").build()
            )

        val licenseKey = licenseKeyFuture.get()
        licenseKey.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKeyFuture =
            licenseKeyServiceAsync.update(
                LicenseKeyUpdateParams.builder()
                    .id("lic_123")
                    .activationsLimit(0L)
                    .disabled(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val licenseKey = licenseKeyFuture.get()
        licenseKey.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKeysFuture =
            licenseKeyServiceAsync.list(
                LicenseKeyListParams.builder()
                    .customerId("customer_id")
                    .pageNumber(0L)
                    .pageSize(0L)
                    .productId("product_id")
                    .status(LicenseKeyListParams.Status.ACTIVE)
                    .build()
            )

        val licenseKeys = licenseKeysFuture.get()
        licenseKeys.forEach { it.validate() }
    }
}
