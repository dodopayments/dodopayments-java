// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.invoices.Invoice
import com.dodopayments.api.models.invoices.InvoiceAddNoteParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkResponse
import com.dodopayments.api.models.invoices.InvoiceCreateParams
import com.dodopayments.api.models.invoices.InvoiceDeleteParams
import com.dodopayments.api.models.invoices.InvoiceDuplicateParams
import com.dodopayments.api.models.invoices.InvoiceFinalizeParams
import com.dodopayments.api.models.invoices.InvoiceListEventsParams
import com.dodopayments.api.models.invoices.InvoiceListEventsResponse
import com.dodopayments.api.models.invoices.InvoiceListPageAsync
import com.dodopayments.api.models.invoices.InvoiceListParams
import com.dodopayments.api.models.invoices.InvoiceMarkUncollectableParams
import com.dodopayments.api.models.invoices.InvoicePreviewExistingParams
import com.dodopayments.api.models.invoices.InvoicePreviewParams
import com.dodopayments.api.models.invoices.InvoiceRetrieveParams
import com.dodopayments.api.models.invoices.InvoiceRetryParams
import com.dodopayments.api.models.invoices.InvoiceSendParams
import com.dodopayments.api.models.invoices.InvoiceUpdateDunningParams
import com.dodopayments.api.models.invoices.InvoiceUpdateParams
import com.dodopayments.api.models.invoices.InvoiceVoidParams
import com.dodopayments.api.services.async.invoices.PaymentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync

    fun payments(): PaymentServiceAsync

    /** Creates a draft. A repeat with the same `Idempotency-Key` returns the first draft. */
    fun create(params: InvoiceCreateParams): CompletableFuture<Invoice> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Get an invoice */
    fun retrieve(invoiceId: String): CompletableFuture<Invoice> =
        retrieve(invoiceId, InvoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invoiceId: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invoiceId: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
    ): CompletableFuture<Invoice> = retrieve(invoiceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see retrieve */
    fun retrieve(params: InvoiceRetrieveParams): CompletableFuture<Invoice> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

    /** Changes only the sent fields. `null` clears a field that can be empty. */
    fun update(invoiceId: String, params: InvoiceUpdateParams): CompletableFuture<Invoice> =
        update(invoiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    fun update(params: InvoiceUpdateParams): CompletableFuture<Invoice> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Lists invoice-led invoices, newest first. The items have no `lines` and no `payments`. */
    fun list(): CompletableFuture<InvoiceListPageAsync> = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListPageAsync>

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none()
    ): CompletableFuture<InvoiceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvoiceListPageAsync> =
        list(InvoiceListParams.none(), requestOptions)

    /** Delete a draft invoice */
    fun delete(invoiceId: String, params: InvoiceDeleteParams): CompletableFuture<Void?> =
        delete(invoiceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        invoiceId: String,
        params: InvoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: InvoiceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InvoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A note changes no field, so it needs no `If-Match`. The note shows in `/events`. */
    fun addNote(invoiceId: String, params: InvoiceAddNoteParams): CompletableFuture<Invoice> =
        addNote(invoiceId, params, RequestOptions.none())

    /** @see addNote */
    fun addNote(
        invoiceId: String,
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see addNote */
    fun addNote(params: InvoiceAddNoteParams): CompletableFuture<Invoice> =
        addNote(params, RequestOptions.none())

    /** @see addNote */
    fun addNote(
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * Returns the page where the customer pays. A copied link counts as a send, so the first call
     * sets `sent_at`.
     */
    fun createHostedLink(invoiceId: String): CompletableFuture<InvoiceCreateHostedLinkResponse> =
        createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none())

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceCreateHostedLinkResponse> =
        createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
    ): CompletableFuture<InvoiceCreateHostedLinkResponse> =
        createHostedLink(invoiceId, params, RequestOptions.none())

    /** @see createHostedLink */
    fun createHostedLink(
        params: InvoiceCreateHostedLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceCreateHostedLinkResponse>

    /** @see createHostedLink */
    fun createHostedLink(
        params: InvoiceCreateHostedLinkParams
    ): CompletableFuture<InvoiceCreateHostedLinkResponse> =
        createHostedLink(params, RequestOptions.none())

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceCreateHostedLinkResponse> =
        createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

    /**
     * Copies the customer, the product lines, the terms and the recipients into a new draft. Usage
     * lines are not copied.
     */
    fun duplicate(invoiceId: String): CompletableFuture<Invoice> =
        duplicate(invoiceId, InvoiceDuplicateParams.none())

    /** @see duplicate */
    fun duplicate(
        invoiceId: String,
        params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(
        invoiceId: String,
        params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
    ): CompletableFuture<Invoice> = duplicate(invoiceId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: InvoiceDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see duplicate */
    fun duplicate(params: InvoiceDuplicateParams): CompletableFuture<Invoice> =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

    /**
     * Issues the draft. With `send: true`, the invoice email goes out after the issue. A failed
     * send keeps the invoice issued. Call `/send` again with the new `ETag`.
     */
    fun finalize(invoiceId: String, params: InvoiceFinalizeParams): CompletableFuture<Invoice> =
        finalize(invoiceId, params, RequestOptions.none())

    /** @see finalize */
    fun finalize(
        invoiceId: String,
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see finalize */
    fun finalize(params: InvoiceFinalizeParams): CompletableFuture<Invoice> =
        finalize(params, RequestOptions.none())

    /** @see finalize */
    fun finalize(
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Returns the change history of the invoice, oldest first. */
    fun listEvents(invoiceId: String): CompletableFuture<InvoiceListEventsResponse> =
        listEvents(invoiceId, InvoiceListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        invoiceId: String,
        params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListEventsResponse> =
        listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see listEvents */
    fun listEvents(
        invoiceId: String,
        params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
    ): CompletableFuture<InvoiceListEventsResponse> =
        listEvents(invoiceId, params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(
        params: InvoiceListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListEventsResponse>

    /** @see listEvents */
    fun listEvents(params: InvoiceListEventsParams): CompletableFuture<InvoiceListEventsResponse> =
        listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceListEventsResponse> =
        listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

    /** Mark an invoice uncollectable */
    fun markUncollectable(
        invoiceId: String,
        params: InvoiceMarkUncollectableParams,
    ): CompletableFuture<Invoice> = markUncollectable(invoiceId, params, RequestOptions.none())

    /** @see markUncollectable */
    fun markUncollectable(
        invoiceId: String,
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see markUncollectable */
    fun markUncollectable(params: InvoiceMarkUncollectableParams): CompletableFuture<Invoice> =
        markUncollectable(params, RequestOptions.none())

    /** @see markUncollectable */
    fun markUncollectable(
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Prices the body as a draft and returns it. No row is saved. */
    fun preview(params: InvoicePreviewParams): CompletableFuture<HttpResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: InvoicePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Preview a draft invoice */
    fun previewExisting(invoiceId: String): CompletableFuture<HttpResponse> =
        previewExisting(invoiceId, InvoicePreviewExistingParams.none())

    /** @see previewExisting */
    fun previewExisting(
        invoiceId: String,
        params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see previewExisting */
    fun previewExisting(
        invoiceId: String,
        params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
    ): CompletableFuture<HttpResponse> = previewExisting(invoiceId, params, RequestOptions.none())

    /** @see previewExisting */
    fun previewExisting(
        params: InvoicePreviewExistingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see previewExisting */
    fun previewExisting(params: InvoicePreviewExistingParams): CompletableFuture<HttpResponse> =
        previewExisting(params, RequestOptions.none())

    /** @see previewExisting */
    fun previewExisting(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

    /** Charges the saved payment method of the invoice subscription now. */
    fun retry(invoiceId: String, params: InvoiceRetryParams): CompletableFuture<Invoice> =
        retry(invoiceId, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        invoiceId: String,
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retry */
    fun retry(params: InvoiceRetryParams): CompletableFuture<Invoice> =
        retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Emails the invoice to the customer email and the CC emails. */
    fun send(invoiceId: String, params: InvoiceSendParams): CompletableFuture<Invoice> =
        send(invoiceId, params, RequestOptions.none())

    /** @see send */
    fun send(
        invoiceId: String,
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see send */
    fun send(params: InvoiceSendParams): CompletableFuture<Invoice> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Pauses, resumes or moves the reminders of an open or past-due invoice. */
    fun updateDunning(
        invoiceId: String,
        params: InvoiceUpdateDunningParams,
    ): CompletableFuture<Invoice> = updateDunning(invoiceId, params, RequestOptions.none())

    /** @see updateDunning */
    fun updateDunning(
        invoiceId: String,
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see updateDunning */
    fun updateDunning(params: InvoiceUpdateDunningParams): CompletableFuture<Invoice> =
        updateDunning(params, RequestOptions.none())

    /** @see updateDunning */
    fun updateDunning(
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** Closes an open or past-due invoice. Applied credits go back to the customer wallet. */
    fun void_(invoiceId: String, params: InvoiceVoidParams): CompletableFuture<Invoice> =
        void_(invoiceId, params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        invoiceId: String,
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        void_(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see void_ */
    fun void_(params: InvoiceVoidParams): CompletableFuture<Invoice> =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /billing/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        fun create(params: InvoiceCreateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.retrieve].
         */
        fun retrieve(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            retrieve(invoiceId, InvoiceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            invoiceId: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            invoiceId: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            retrieve(invoiceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see retrieve */
        fun retrieve(params: InvoiceRetrieveParams): CompletableFuture<HttpResponseFor<Invoice>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.update].
         */
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            update(invoiceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        fun update(params: InvoiceUpdateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /billing/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none())

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>>

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.delete].
         */
        fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(invoiceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see delete */
        fun delete(params: InvoiceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/notes`, but is
         * otherwise the same as [InvoiceServiceAsync.addNote].
         */
        fun addNote(
            invoiceId: String,
            params: InvoiceAddNoteParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            addNote(invoiceId, params, RequestOptions.none())

        /** @see addNote */
        fun addNote(
            invoiceId: String,
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see addNote */
        fun addNote(params: InvoiceAddNoteParams): CompletableFuture<HttpResponseFor<Invoice>> =
            addNote(params, RequestOptions.none())

        /** @see addNote */
        fun addNote(
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/hosted-link`, but is
         * otherwise the same as [InvoiceServiceAsync.createHostedLink].
         */
        fun createHostedLink(
            invoiceId: String
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>> =
            createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none())

        /** @see createHostedLink */
        fun createHostedLink(
            invoiceId: String,
            params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>> =
            createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see createHostedLink */
        fun createHostedLink(
            invoiceId: String,
            params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>> =
            createHostedLink(invoiceId, params, RequestOptions.none())

        /** @see createHostedLink */
        fun createHostedLink(
            params: InvoiceCreateHostedLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>>

        /** @see createHostedLink */
        fun createHostedLink(
            params: InvoiceCreateHostedLinkParams
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>> =
            createHostedLink(params, RequestOptions.none())

        /** @see createHostedLink */
        fun createHostedLink(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceCreateHostedLinkResponse>> =
            createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/duplicate`, but is
         * otherwise the same as [InvoiceServiceAsync.duplicate].
         */
        fun duplicate(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            duplicate(invoiceId, InvoiceDuplicateParams.none())

        /** @see duplicate */
        fun duplicate(
            invoiceId: String,
            params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see duplicate */
        fun duplicate(
            invoiceId: String,
            params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            duplicate(invoiceId, params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            params: InvoiceDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see duplicate */
        fun duplicate(params: InvoiceDuplicateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            duplicate(params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/finalize`, but is
         * otherwise the same as [InvoiceServiceAsync.finalize].
         */
        fun finalize(
            invoiceId: String,
            params: InvoiceFinalizeParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            finalize(invoiceId, params, RequestOptions.none())

        /** @see finalize */
        fun finalize(
            invoiceId: String,
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see finalize */
        fun finalize(params: InvoiceFinalizeParams): CompletableFuture<HttpResponseFor<Invoice>> =
            finalize(params, RequestOptions.none())

        /** @see finalize */
        fun finalize(
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/events`, but is
         * otherwise the same as [InvoiceServiceAsync.listEvents].
         */
        fun listEvents(
            invoiceId: String
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>> =
            listEvents(invoiceId, InvoiceListEventsParams.none())

        /** @see listEvents */
        fun listEvents(
            invoiceId: String,
            params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>> =
            listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see listEvents */
        fun listEvents(
            invoiceId: String,
            params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>> =
            listEvents(invoiceId, params, RequestOptions.none())

        /** @see listEvents */
        fun listEvents(
            params: InvoiceListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>>

        /** @see listEvents */
        fun listEvents(
            params: InvoiceListEventsParams
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>> =
            listEvents(params, RequestOptions.none())

        /** @see listEvents */
        fun listEvents(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceListEventsResponse>> =
            listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/mark-uncollectable`,
         * but is otherwise the same as [InvoiceServiceAsync.markUncollectable].
         */
        fun markUncollectable(
            invoiceId: String,
            params: InvoiceMarkUncollectableParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            markUncollectable(invoiceId, params, RequestOptions.none())

        /** @see markUncollectable */
        fun markUncollectable(
            invoiceId: String,
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see markUncollectable */
        fun markUncollectable(
            params: InvoiceMarkUncollectableParams
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            markUncollectable(params, RequestOptions.none())

        /** @see markUncollectable */
        fun markUncollectable(
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/preview`, but is otherwise the
         * same as [InvoiceServiceAsync.preview].
         */
        fun preview(params: InvoicePreviewParams): CompletableFuture<HttpResponse> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: InvoicePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/preview`, but is
         * otherwise the same as [InvoiceServiceAsync.previewExisting].
         */
        fun previewExisting(invoiceId: String): CompletableFuture<HttpResponse> =
            previewExisting(invoiceId, InvoicePreviewExistingParams.none())

        /** @see previewExisting */
        fun previewExisting(
            invoiceId: String,
            params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see previewExisting */
        fun previewExisting(
            invoiceId: String,
            params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
        ): CompletableFuture<HttpResponse> =
            previewExisting(invoiceId, params, RequestOptions.none())

        /** @see previewExisting */
        fun previewExisting(
            params: InvoicePreviewExistingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see previewExisting */
        fun previewExisting(params: InvoicePreviewExistingParams): CompletableFuture<HttpResponse> =
            previewExisting(params, RequestOptions.none())

        /** @see previewExisting */
        fun previewExisting(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/retry`, but is
         * otherwise the same as [InvoiceServiceAsync.retry].
         */
        fun retry(
            invoiceId: String,
            params: InvoiceRetryParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            retry(invoiceId, params, RequestOptions.none())

        /** @see retry */
        fun retry(
            invoiceId: String,
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retry */
        fun retry(params: InvoiceRetryParams): CompletableFuture<HttpResponseFor<Invoice>> =
            retry(params, RequestOptions.none())

        /** @see retry */
        fun retry(
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/send`, but is
         * otherwise the same as [InvoiceServiceAsync.send].
         */
        fun send(
            invoiceId: String,
            params: InvoiceSendParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            send(invoiceId, params, RequestOptions.none())

        /** @see send */
        fun send(
            invoiceId: String,
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see send */
        fun send(params: InvoiceSendParams): CompletableFuture<HttpResponseFor<Invoice>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/dunning`, but is
         * otherwise the same as [InvoiceServiceAsync.updateDunning].
         */
        fun updateDunning(
            invoiceId: String,
            params: InvoiceUpdateDunningParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            updateDunning(invoiceId, params, RequestOptions.none())

        /** @see updateDunning */
        fun updateDunning(
            invoiceId: String,
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see updateDunning */
        fun updateDunning(
            params: InvoiceUpdateDunningParams
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            updateDunning(params, RequestOptions.none())

        /** @see updateDunning */
        fun updateDunning(
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/void`, but is
         * otherwise the same as [InvoiceServiceAsync.void_].
         */
        fun void_(
            invoiceId: String,
            params: InvoiceVoidParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            void_(invoiceId, params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            invoiceId: String,
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            void_(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see void_ */
        fun void_(params: InvoiceVoidParams): CompletableFuture<HttpResponseFor<Invoice>> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>
    }
}
