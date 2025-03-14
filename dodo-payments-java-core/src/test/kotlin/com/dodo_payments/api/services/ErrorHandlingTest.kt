// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services

import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.jsonMapper
import com.dodo_payments.api.errors.BadRequestException
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.errors.DodoPaymentsException
import com.dodo_payments.api.errors.InternalServerException
import com.dodo_payments.api.errors.NotFoundException
import com.dodo_payments.api.errors.PermissionDeniedException
import com.dodo_payments.api.errors.RateLimitException
import com.dodo_payments.api.errors.UnauthorizedException
import com.dodo_payments.api.errors.UnexpectedStatusCodeException
import com.dodo_payments.api.errors.UnprocessableEntityException
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
class ErrorHandlingTest {

    companion object {

        private val ERROR: DodoPaymentsError =
            DodoPaymentsError.builder()
                .putAdditionalProperty("errorProperty", JsonValue.from("42"))
                .build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DodoPaymentsClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun paymentsCreate400() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<BadRequestException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate401() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnauthorizedException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate403() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<PermissionDeniedException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate404() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<NotFoundException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate422() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate429() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<RateLimitException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate500() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<InternalServerException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreate999() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun paymentsCreateInvalidJsonBody() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DodoPaymentsException> {
                paymentService.create(
                    PaymentCreateParams.builder()
                        .billing(
                            PaymentCreateParams.Billing.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .customer(
                            PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                                .customerId("customer_id")
                                .build()
                        )
                        .addProductCart(
                            PaymentCreateParams.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0L)
                                .amount(0L)
                                .build()
                        )
                        .discountCode("discount_code")
                        .metadata(
                            PaymentCreateParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentLink(true)
                        .returnUrl("return_url")
                        .taxId("tax_id")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
