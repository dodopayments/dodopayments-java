// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.emails.EmailBody
import com.dodopayments.api.models.customers.emails.EmailListPageAsync
import com.dodopayments.api.models.customers.emails.EmailListParams
import com.dodopayments.api.models.customers.emails.EmailRetrieveBodyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync

    /**
     * Returns every transactional email sent to this customer in the last 180 days, newest first,
     * with its delivery outcome. Delivery status comes from the email provider and is as fresh as
     * replication, typically seconds.
     */
    fun list(customerId: String): CompletableFuture<EmailListPageAsync> =
        list(customerId, EmailListParams.none())

    /** @see list */
    fun list(
        customerId: String,
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListPageAsync> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        customerId: String,
        params: EmailListParams = EmailListParams.none(),
    ): CompletableFuture<EmailListPageAsync> = list(customerId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EmailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListPageAsync>

    /** @see list */
    fun list(params: EmailListParams): CompletableFuture<EmailListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListPageAsync> =
        list(customerId, EmailListParams.none(), requestOptions)

    /**
     * Returns the email exactly as it was sent, plus the reason it failed when it did. Some emails
     * have no body to show: an authentication email carries a live login token, a blocked email
     * never reached the provider, and the provider clears bodies at 180 days.
     */
    fun retrieveBody(
        emailLogId: String,
        params: EmailRetrieveBodyParams,
    ): CompletableFuture<EmailBody> = retrieveBody(emailLogId, params, RequestOptions.none())

    /** @see retrieveBody */
    fun retrieveBody(
        emailLogId: String,
        params: EmailRetrieveBodyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBody> =
        retrieveBody(params.toBuilder().emailLogId(emailLogId).build(), requestOptions)

    /** @see retrieveBody */
    fun retrieveBody(params: EmailRetrieveBodyParams): CompletableFuture<EmailBody> =
        retrieveBody(params, RequestOptions.none())

    /** @see retrieveBody */
    fun retrieveBody(
        params: EmailRetrieveBodyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBody>

    /** A view of [EmailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/emails`, but is otherwise
         * the same as [EmailServiceAsync.list].
         */
        fun list(customerId: String): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(customerId, EmailListParams.none())

        /** @see list */
        fun list(
            customerId: String,
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        fun list(
            customerId: String,
            params: EmailListParams = EmailListParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(customerId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EmailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>>

        /** @see list */
        fun list(params: EmailListParams): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(customerId, EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/{customer_id}/emails/{email_log_id}/body`, but is otherwise the same as
         * [EmailServiceAsync.retrieveBody].
         */
        fun retrieveBody(
            emailLogId: String,
            params: EmailRetrieveBodyParams,
        ): CompletableFuture<HttpResponseFor<EmailBody>> =
            retrieveBody(emailLogId, params, RequestOptions.none())

        /** @see retrieveBody */
        fun retrieveBody(
            emailLogId: String,
            params: EmailRetrieveBodyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBody>> =
            retrieveBody(params.toBuilder().emailLogId(emailLogId).build(), requestOptions)

        /** @see retrieveBody */
        fun retrieveBody(
            params: EmailRetrieveBodyParams
        ): CompletableFuture<HttpResponseFor<EmailBody>> =
            retrieveBody(params, RequestOptions.none())

        /** @see retrieveBody */
        fun retrieveBody(
            params: EmailRetrieveBodyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBody>>
    }
}
