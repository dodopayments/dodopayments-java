// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseServiceAsyncTest {

    @Test
    fun activate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseServiceAsync = client.licenses()

        val licenseKeyInstanceFuture =
            licenseServiceAsync.activate(
                LicenseActivateParams.builder().licenseKey("license_key").name("name").build()
            )

        val licenseKeyInstance = licenseKeyInstanceFuture.get()
        licenseKeyInstance.validate()
    }

    @Test
    fun deactivate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseServiceAsync = client.licenses()

        val future =
            licenseServiceAsync.deactivate(
                LicenseDeactivateParams.builder()
                    .licenseKey("license_key")
                    .licenseKeyInstanceId("license_key_instance_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun validate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseServiceAsync = client.licenses()

        val responseFuture =
            licenseServiceAsync.validate(
                LicenseValidateParams.builder()
                    .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
                    .licenseKeyInstanceId("lki_123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
