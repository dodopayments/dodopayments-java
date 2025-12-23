// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShortLinkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkServiceAsync = client.products().shortLinks()

        val shortLinkFuture =
            shortLinkServiceAsync.create(
                ShortLinkCreateParams.builder()
                    .id("id")
                    .slug("slug")
                    .staticCheckoutParams(
                        ShortLinkCreateParams.StaticCheckoutParams.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val shortLink = shortLinkFuture.get()
        shortLink.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkServiceAsync = client.products().shortLinks()

        val pageFuture = shortLinkServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
