// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.client.DodoPaymentsClient
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.errors.PermissionDeniedException
import com.dodopayments.api.errors.UnauthorizedException
import com.github.tomakehurst.wiremock.client.WireMock.absent
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.equalToJson
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WorkloadIdentityTest {

    companion object {

        private const val TOKEN_PATH: String = "/workload-identity/token"

        private const val REVOKE_PATH: String = "/workload-identity/token/revoke"

        private const val API_PATH: String = "/checkout/supported_countries"

        private const val IDENTITY_PROVIDER_ID: String = "wip_test"

        private const val SUBJECT_TOKEN: String = "test-subject-token"

        private const val ACCESS_TOKEN: String = "test-access-token"
    }

    private lateinit var baseUrl: String

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        baseUrl = wmRuntimeInfo.httpBaseUrl
        stubFor(get(urlPathEqualTo(API_PATH)).willReturn(okJson("[\"US\"]")))
    }

    private fun workloadIdentity(): WorkloadIdentity =
        WorkloadIdentity.builder()
            .identityProviderId(IDENTITY_PROVIDER_ID)
            .provider(SubjectTokenProviders.staticToken(SUBJECT_TOKEN))
            .build()

    private fun client(): DodoPaymentsClient =
        DodoPaymentsOkHttpClient.builder()
            .baseUrl(baseUrl)
            .workloadIdentity(workloadIdentity())
            .build()

    private fun stubExchange(expiresIn: Int = 3600, delayMillis: Int = 0) {
        stubFor(
            post(urlPathEqualTo(TOKEN_PATH))
                .willReturn(
                    okJson(
                            """{"access_token":"$ACCESS_TOKEN","issued_token_type":"urn:ietf:params:oauth:token-type:access_token","token_type":"Bearer","expires_in":$expiresIn,"scope":"payments:read"}"""
                        )
                        .withFixedDelay(delayMillis)
                )
        )
    }

    @Test
    fun exchangeThenApiCallSendsAccessToken() {
        stubExchange()

        client().misc().listSupportedCountries()

        verify(
            1,
            postRequestedFor(urlPathEqualTo(TOKEN_PATH))
                .withHeader("Authorization", absent())
                .withRequestBody(
                    equalToJson(
                        """{"grant_type":"urn:ietf:params:oauth:grant-type:token-exchange","subject_token_type":"urn:ietf:params:oauth:token-type:jwt","subject_token":"$SUBJECT_TOKEN","identity_provider_id":"$IDENTITY_PROVIDER_ID"}"""
                    )
                ),
        )
        verify(
            1,
            getRequestedFor(urlPathEqualTo(API_PATH))
                .withHeader("Authorization", equalTo("Bearer $ACCESS_TOKEN")),
        )
    }

    @Test
    fun concurrentCallsShareOneExchange() {
        stubExchange(delayMillis = 500)
        val client = client()
        val executor = Executors.newFixedThreadPool(2)
        val start = CountDownLatch(1)

        try {
            val calls =
                List(2) {
                    CompletableFuture.runAsync(
                        {
                            start.await()
                            client.misc().listSupportedCountries()
                        },
                        executor,
                    )
                }
            start.countDown()
            CompletableFuture.allOf(*calls.toTypedArray()).get(30, TimeUnit.SECONDS)
        } finally {
            executor.shutdown()
        }

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun concurrentAsyncCallsShareOneExchange() {
        stubExchange(delayMillis = 500)
        val client = client().async()

        CompletableFuture.allOf(
                client.misc().listSupportedCountries(),
                client.misc().listSupportedCountries(),
            )
            .get(30, TimeUnit.SECONDS)

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun tokenThatExpiresSoonIsExchangedAgain() {
        stubExchange(expiresIn = 200)
        val client = client()

        client.misc().listSupportedCountries()
        client.misc().listSupportedCountries()

        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }

    @Test
    fun validTokenIsReused() {
        stubExchange(expiresIn = 3600)
        val client = client()

        client.misc().listSupportedCountries()
        client.misc().listSupportedCountries()

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }

    @Test
    fun withOptionsClientSharesTheCache() {
        stubExchange()
        val client = client()

        client.misc().listSupportedCountries()
        client.withOptions { it.maxRetries(1) }.misc().listSupportedCountries()

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }

    @Test
    fun apiUnauthorizedExchangesAgainAndRetriesOnce() {
        stubExchange()
        stubFor(get(urlPathEqualTo(API_PATH)).willReturn(status(401).withBody("{}")))

        assertThrows<UnauthorizedException> { client().misc().listSupportedCountries() }

        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun bearerTokenWithWorkloadIdentityIsAnError() {
        assertThrows<IllegalStateException> {
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(baseUrl)
                .bearerToken("My Bearer Token")
                .workloadIdentity(workloadIdentity())
                .build()
        }
    }

    @Test
    fun exchangeInvalidGrantIsPermissionDenied() {
        stubFor(
            post(urlPathEqualTo(TOKEN_PATH))
                .willReturn(
                    status(403)
                        .withHeader("Content-Type", "application/json")
                        .withBody(
                            """{"error":"invalid_grant","error_description":"No trust mapping matches the subject token."}"""
                        )
                )
        )

        val e = assertThrows<PermissionDeniedException> { client().misc().listSupportedCountries() }

        assertThat(e).hasMessageContaining("invalid_grant")
        assertThat(e).hasMessageContaining("No trust mapping matches the subject token.")
        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(0, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun revokeSendsAccessTokenAndClearsCache() {
        stubExchange()
        stubFor(post(urlPathEqualTo(REVOKE_PATH)).willReturn(status(204)))
        val client = client()
        client.misc().listSupportedCountries()

        client.workloadIdentity().revoke()

        verify(
            1,
            postRequestedFor(urlPathEqualTo(REVOKE_PATH))
                .withHeader("Authorization", equalTo("Bearer $ACCESS_TOKEN")),
        )
        client.misc().listSupportedCountries()
        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }
}
