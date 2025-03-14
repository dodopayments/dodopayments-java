// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
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
