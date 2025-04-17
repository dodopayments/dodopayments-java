// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseKeyInstanceServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val licenseKeyInstanceFuture =
            licenseKeyInstanceServiceAsync.retrieve(
                LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
            )

        val licenseKeyInstance = licenseKeyInstanceFuture.get()
        licenseKeyInstance.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val licenseKeyInstanceFuture =
            licenseKeyInstanceServiceAsync.update(
                LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
            )

        val licenseKeyInstance = licenseKeyInstanceFuture.get()
        licenseKeyInstance.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val pageFuture = licenseKeyInstanceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
