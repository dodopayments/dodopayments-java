// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import com.dodopayments.api.models.entitlements.files.FileUploadParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    fun delete() {
      val client = DodoPaymentsOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val fileServiceAsync = client.entitlements().files()

      val future = fileServiceAsync.delete(FileDeleteParams.builder()
          .id("id")
          .fileId("file_id")
          .build())

      val response = future.get()
    }

    @Test
    fun upload() {
      val client = DodoPaymentsOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val fileServiceAsync = client.entitlements().files()

      val responseFuture = fileServiceAsync.upload("id")

      val response = responseFuture.get()
      response.validate()
    }
}
