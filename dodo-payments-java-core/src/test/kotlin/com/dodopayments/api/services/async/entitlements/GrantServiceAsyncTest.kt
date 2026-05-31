// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.entitlements.grants.GrantListParams
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GrantServiceAsyncTest {

    @Test
    fun list() {
      val client = DodoPaymentsOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val grantServiceAsync = client.entitlements().grants()

      val pageFuture = grantServiceAsync.list("id")

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun revoke() {
      val client = DodoPaymentsOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val grantServiceAsync = client.entitlements().grants()

      val entitlementGrantFuture = grantServiceAsync.revoke(GrantRevokeParams.builder()
          .id("id")
          .grantId("grant_id")
          .build())

      val entitlementGrant = entitlementGrantFuture.get()
      entitlementGrant.validate()
    }
}
