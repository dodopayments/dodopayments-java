// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.jsonMapper
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.net.URLEncoder
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Optional
import java.util.function.Supplier

/** Helpers that create a [SubjectTokenProvider] for common identity providers. */
object SubjectTokenProviders {

    /** The default environment variable for [gitlab]. */
    const val GITLAB_TOKEN_ENV: String = "DODO_PAYMENTS_ID_TOKEN"

    /** The environment variable that gives the default path for [file]. */
    const val TOKEN_FILE_ENV: String = "DODO_PAYMENTS_IDENTITY_TOKEN_FILE"

    /** The default path for [kubernetes]. */
    const val KUBERNETES_TOKEN_PATH: String = "/var/run/secrets/tokens/dodo-token"

    private const val GCP_IDENTITY_URL: String =
        "http://metadata.google.internal/computeMetadata/v1/instance/service-accounts/default/identity"

    private const val TIMEOUT_MILLIS: Int = 10_000

    /**
     * Requests an OIDC token from GitHub Actions on each exchange.
     *
     * The job must have the `id-token: write` permission.
     *
     * @param audience the audience of the token. Defaults to the origin of the client base URL.
     */
    @JvmStatic
    @JvmOverloads
    fun githubActions(audience: String? = null): SubjectTokenProvider =
        SubjectTokenProvider { baseUrl ->
            val requestUrl = requiredEnv("ACTIONS_ID_TOKEN_REQUEST_URL")
            val requestToken = requiredEnv("ACTIONS_ID_TOKEN_REQUEST_TOKEN")
            val separator = if (requestUrl.contains('?')) "&" else "?"
            val url = "$requestUrl${separator}audience=${encode(audience ?: origin(baseUrl))}"
            val body = httpGet(url, "Authorization", "bearer $requestToken")
            jsonMapper().readTree(body).get("value")?.asText()?.takeIf { it.isNotEmpty() }
                ?: throw WorkloadIdentityException("The GitHub Actions response has no token.")
        }

    /**
     * Reads a GitLab CI/CD ID token from an environment variable.
     *
     * @param envVar the environment variable. Defaults to `DODO_PAYMENTS_ID_TOKEN`.
     */
    @JvmStatic
    @JvmOverloads
    fun gitlab(envVar: String = GITLAB_TOKEN_ENV): SubjectTokenProvider = SubjectTokenProvider {
        requiredEnv(envVar)
    }

    /**
     * Reads the HCP Terraform workload identity token from `TFC_WORKLOAD_IDENTITY_TOKEN` or
     * `TFC_WORKLOAD_IDENTITY_TOKEN_DODO`.
     */
    @JvmStatic
    fun terraformCloud(): SubjectTokenProvider = SubjectTokenProvider {
        env("TFC_WORKLOAD_IDENTITY_TOKEN")
            ?: env("TFC_WORKLOAD_IDENTITY_TOKEN_DODO")
            ?: throw WorkloadIdentityException(
                "Set TFC_WORKLOAD_IDENTITY_TOKEN or TFC_WORKLOAD_IDENTITY_TOKEN_DODO."
            )
    }

    /**
     * Requests an identity token from the Google Cloud metadata server on each exchange.
     *
     * @param audience the audience of the token. Defaults to the origin of the client base URL.
     */
    @JvmStatic
    @JvmOverloads
    fun gcp(audience: String? = null): SubjectTokenProvider = SubjectTokenProvider { baseUrl ->
        val url = "$GCP_IDENTITY_URL?audience=${encode(audience ?: origin(baseUrl))}&format=full"
        httpGet(url, "Metadata-Flavor", "Google").trim().takeIf { it.isNotEmpty() }
            ?: throw WorkloadIdentityException("The GCP metadata server returned no token.")
    }

    /** Reads the Vercel OIDC token from `VERCEL_OIDC_TOKEN`. */
    @JvmStatic
    fun vercel(): SubjectTokenProvider = SubjectTokenProvider { requiredEnv("VERCEL_OIDC_TOKEN") }

    /**
     * Reads a projected Kubernetes service account token from a file on each exchange.
     *
     * @param path the token file. Defaults to `/var/run/secrets/tokens/dodo-token`.
     */
    @JvmStatic
    @JvmOverloads
    fun kubernetes(path: String = KUBERNETES_TOKEN_PATH): SubjectTokenProvider = file(path)

    /**
     * Reads the token from a file on each exchange.
     *
     * @param path the token file. Defaults to the value of `DODO_PAYMENTS_IDENTITY_TOKEN_FILE`.
     */
    @JvmStatic
    @JvmOverloads
    fun file(path: String? = null): SubjectTokenProvider = SubjectTokenProvider {
        val tokenPath = path ?: requiredEnv(TOKEN_FILE_ENV)
        try {
            String(Files.readAllBytes(Paths.get(tokenPath)), Charsets.UTF_8).trim().takeIf {
                it.isNotEmpty()
            } ?: throw WorkloadIdentityException("The token file $tokenPath is empty.")
        } catch (e: IOException) {
            throw WorkloadIdentityException("Cannot read the token file $tokenPath.", e)
        }
    }

    /**
     * Calls your function on each exchange. Use it for AWS (for example, STS `GetWebIdentityToken`)
     * or for any other source.
     */
    @JvmStatic
    fun aws(function: Supplier<String>): SubjectTokenProvider = SubjectTokenProvider {
        function.get()
    }

    /** Always returns the same token. Use it for tests. */
    @JvmStatic fun staticToken(token: String): SubjectTokenProvider = SubjectTokenProvider { token }

    /**
     * Finds a provider from the environment, in this order: GitHub Actions, HCP Terraform,
     * `DODO_PAYMENTS_IDENTITY_TOKEN_FILE`, and the Kubernetes default token path.
     *
     * Returns an empty [Optional] if it finds no provider.
     */
    @JvmStatic
    fun auto(): Optional<SubjectTokenProvider> =
        Optional.ofNullable(
            when {
                env("ACTIONS_ID_TOKEN_REQUEST_URL") != null &&
                    env("ACTIONS_ID_TOKEN_REQUEST_TOKEN") != null -> githubActions()
                env("TFC_WORKLOAD_IDENTITY_TOKEN") != null ||
                    env("TFC_WORKLOAD_IDENTITY_TOKEN_DODO") != null -> terraformCloud()
                env(TOKEN_FILE_ENV) != null -> file()
                Files.isRegularFile(Paths.get(KUBERNETES_TOKEN_PATH)) -> kubernetes()
                else -> null
            }
        )

    private fun env(name: String): String? = System.getenv(name)?.takeIf { it.isNotEmpty() }

    private fun requiredEnv(name: String): String =
        env(name) ?: throw WorkloadIdentityException("The environment variable $name is not set.")

    private fun encode(value: String): String = URLEncoder.encode(value, "UTF-8")

    private fun origin(baseUrl: String): String {
        val uri = URI(baseUrl)
        val port = if (uri.port == -1) "" else ":${uri.port}"
        return "${uri.scheme}://${uri.host}$port"
    }

    private fun httpGet(url: String, headerName: String, headerValue: String): String {
        val connection = URL(url).openConnection() as HttpURLConnection
        try {
            connection.connectTimeout = TIMEOUT_MILLIS
            connection.readTimeout = TIMEOUT_MILLIS
            connection.setRequestProperty(headerName, headerValue)
            val status = connection.responseCode
            if (status !in 200..299) {
                throw WorkloadIdentityException("The subject token request returned HTTP $status.")
            }
            return connection.inputStream.use { String(it.readBytes(), Charsets.UTF_8) }
        } catch (e: IOException) {
            throw WorkloadIdentityException("The subject token request failed.", e)
        } finally {
            connection.disconnect()
        }
    }
}
