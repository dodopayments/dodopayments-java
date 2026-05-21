// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductCollectionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val productCollectionFuture =
            productCollectionServiceAsync.create(
                ProductCollectionCreateParams.builder()
                    .addGroup(
                        ProductCollectionGroupDetails.builder()
                            .addProduct(
                                GroupProduct.builder().productId("product_id").status(true).build()
                            )
                            .groupName("group_name")
                            .status(true)
                            .build()
                    )
                    .name("name")
                    .brandId("brand_id")
                    .description("description")
                    .build()
            )

        val productCollection = productCollectionFuture.get()
        productCollection.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val productCollectionFuture = productCollectionServiceAsync.retrieve("id")

        val productCollection = productCollectionFuture.get()
        productCollection.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val future =
            productCollectionServiceAsync.update(
                ProductCollectionUpdateParams.builder()
                    .id("id")
                    .brandId("brand_id")
                    .description("description")
                    .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val pageFuture = productCollectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val future = productCollectionServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun unarchive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val responseFuture = productCollectionServiceAsync.unarchive("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val responseFuture =
            productCollectionServiceAsync.updateImages(
                ProductCollectionUpdateImagesParams.builder().id("id").forceUpdate(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
