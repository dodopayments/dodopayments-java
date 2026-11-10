// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.dodopayments.api.models.invoices.InvoiceListPage
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
import com.dodopayments.api.services.blocking.invoices.PaymentService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService

    fun payments(): PaymentService

    /** Creates a draft. A repeat with the same `Idempotency-Key` returns the first draft. */
    fun create(params: InvoiceCreateParams): Invoice = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Get an invoice */
    fun retrieve(invoiceId: String): Invoice = retrieve(invoiceId, InvoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invoiceId: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invoiceId: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
    ): Invoice = retrieve(invoiceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see retrieve */
    fun retrieve(params: InvoiceRetrieveParams): Invoice = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(invoiceId: String, requestOptions: RequestOptions): Invoice =
        retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

    /** Changes only the sent fields. `null` clears a field that can be empty. */
    fun update(invoiceId: String, params: InvoiceUpdateParams): Invoice =
        update(invoiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    fun update(params: InvoiceUpdateParams): Invoice = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Lists invoice-led invoices, newest first. The items have no `lines` and no `payments`. */
    fun list(): InvoiceListPage = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** @see list */
    fun list(params: InvoiceListParams = InvoiceListParams.none()): InvoiceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /** Delete a draft invoice */
    fun delete(invoiceId: String, params: InvoiceDeleteParams) =
        delete(invoiceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        invoiceId: String,
        params: InvoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: InvoiceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: InvoiceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A note changes no field, so it needs no `If-Match`. The note shows in `/events`. */
    fun addNote(invoiceId: String, params: InvoiceAddNoteParams): Invoice =
        addNote(invoiceId, params, RequestOptions.none())

    /** @see addNote */
    fun addNote(
        invoiceId: String,
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see addNote */
    fun addNote(params: InvoiceAddNoteParams): Invoice = addNote(params, RequestOptions.none())

    /** @see addNote */
    fun addNote(
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * Returns the page where the customer pays. A copied link counts as a send, so the first call
     * sets `sent_at`.
     */
    fun createHostedLink(invoiceId: String): InvoiceCreateHostedLinkResponse =
        createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none())

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceCreateHostedLinkResponse =
        createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
    ): InvoiceCreateHostedLinkResponse = createHostedLink(invoiceId, params, RequestOptions.none())

    /** @see createHostedLink */
    fun createHostedLink(
        params: InvoiceCreateHostedLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceCreateHostedLinkResponse

    /** @see createHostedLink */
    fun createHostedLink(params: InvoiceCreateHostedLinkParams): InvoiceCreateHostedLinkResponse =
        createHostedLink(params, RequestOptions.none())

    /** @see createHostedLink */
    fun createHostedLink(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): InvoiceCreateHostedLinkResponse =
        createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

    /**
     * Copies the customer, the product lines, the terms and the recipients into a new draft. Usage
     * lines are not copied.
     */
    fun duplicate(invoiceId: String): Invoice = duplicate(invoiceId, InvoiceDuplicateParams.none())

    /** @see duplicate */
    fun duplicate(
        invoiceId: String,
        params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(
        invoiceId: String,
        params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
    ): Invoice = duplicate(invoiceId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: InvoiceDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see duplicate */
    fun duplicate(params: InvoiceDuplicateParams): Invoice =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(invoiceId: String, requestOptions: RequestOptions): Invoice =
        duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

    /**
     * Issues the draft. With `send: true`, the invoice email goes out after the issue. A failed
     * send keeps the invoice issued. Call `/send` again with the new `ETag`.
     */
    fun finalize(invoiceId: String, params: InvoiceFinalizeParams): Invoice =
        finalize(invoiceId, params, RequestOptions.none())

    /** @see finalize */
    fun finalize(
        invoiceId: String,
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see finalize */
    fun finalize(params: InvoiceFinalizeParams): Invoice = finalize(params, RequestOptions.none())

    /** @see finalize */
    fun finalize(
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Returns the change history of the invoice, oldest first. */
    fun listEvents(invoiceId: String): InvoiceListEventsResponse =
        listEvents(invoiceId, InvoiceListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        invoiceId: String,
        params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListEventsResponse =
        listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see listEvents */
    fun listEvents(
        invoiceId: String,
        params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
    ): InvoiceListEventsResponse = listEvents(invoiceId, params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(
        params: InvoiceListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListEventsResponse

    /** @see listEvents */
    fun listEvents(params: InvoiceListEventsParams): InvoiceListEventsResponse =
        listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(invoiceId: String, requestOptions: RequestOptions): InvoiceListEventsResponse =
        listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

    /** Mark an invoice uncollectable */
    fun markUncollectable(invoiceId: String, params: InvoiceMarkUncollectableParams): Invoice =
        markUncollectable(invoiceId, params, RequestOptions.none())

    /** @see markUncollectable */
    fun markUncollectable(
        invoiceId: String,
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see markUncollectable */
    fun markUncollectable(params: InvoiceMarkUncollectableParams): Invoice =
        markUncollectable(params, RequestOptions.none())

    /** @see markUncollectable */
    fun markUncollectable(
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Prices the body as a draft and returns it. No row is saved. */
    fun preview(params: InvoicePreviewParams) = preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: InvoicePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Preview a draft invoice */
    fun previewExisting(invoiceId: String) =
        previewExisting(invoiceId, InvoicePreviewExistingParams.none())

    /** @see previewExisting */
    fun previewExisting(
        invoiceId: String,
        params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see previewExisting */
    fun previewExisting(
        invoiceId: String,
        params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
    ) = previewExisting(invoiceId, params, RequestOptions.none())

    /** @see previewExisting */
    fun previewExisting(
        params: InvoicePreviewExistingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see previewExisting */
    fun previewExisting(params: InvoicePreviewExistingParams) =
        previewExisting(params, RequestOptions.none())

    /** @see previewExisting */
    fun previewExisting(invoiceId: String, requestOptions: RequestOptions) =
        previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

    /** Charges the saved payment method of the invoice subscription now. */
    fun retry(invoiceId: String, params: InvoiceRetryParams): Invoice =
        retry(invoiceId, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        invoiceId: String,
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retry */
    fun retry(params: InvoiceRetryParams): Invoice = retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Emails the invoice to the customer email and the CC emails. */
    fun send(invoiceId: String, params: InvoiceSendParams): Invoice =
        send(invoiceId, params, RequestOptions.none())

    /** @see send */
    fun send(
        invoiceId: String,
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see send */
    fun send(params: InvoiceSendParams): Invoice = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Pauses, resumes or moves the reminders of an open or past-due invoice. */
    fun updateDunning(invoiceId: String, params: InvoiceUpdateDunningParams): Invoice =
        updateDunning(invoiceId, params, RequestOptions.none())

    /** @see updateDunning */
    fun updateDunning(
        invoiceId: String,
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see updateDunning */
    fun updateDunning(params: InvoiceUpdateDunningParams): Invoice =
        updateDunning(params, RequestOptions.none())

    /** @see updateDunning */
    fun updateDunning(
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Closes an open or past-due invoice. Applied credits go back to the customer wallet. */
    fun void_(invoiceId: String, params: InvoiceVoidParams): Invoice =
        void_(invoiceId, params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        invoiceId: String,
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = void_(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see void_ */
    fun void_(params: InvoiceVoidParams): Invoice = void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /billing/invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @MustBeClosed
        fun create(params: InvoiceCreateParams): HttpResponseFor<Invoice> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(invoiceId: String): HttpResponseFor<Invoice> =
            retrieve(invoiceId, InvoiceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invoiceId: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invoiceId: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        ): HttpResponseFor<Invoice> = retrieve(invoiceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InvoiceRetrieveParams): HttpResponseFor<Invoice> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceService.update].
         */
        @MustBeClosed
        fun update(invoiceId: String, params: InvoiceUpdateParams): HttpResponseFor<Invoice> =
            update(invoiceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: InvoiceUpdateParams): HttpResponseFor<Invoice> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InvoiceListPage> = list(InvoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): HttpResponseFor<InvoiceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceService.delete].
         */
        @MustBeClosed
        fun delete(invoiceId: String, params: InvoiceDeleteParams): HttpResponse =
            delete(invoiceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: InvoiceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/notes`, but is
         * otherwise the same as [InvoiceService.addNote].
         */
        @MustBeClosed
        fun addNote(invoiceId: String, params: InvoiceAddNoteParams): HttpResponseFor<Invoice> =
            addNote(invoiceId, params, RequestOptions.none())

        /** @see addNote */
        @MustBeClosed
        fun addNote(
            invoiceId: String,
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see addNote */
        @MustBeClosed
        fun addNote(params: InvoiceAddNoteParams): HttpResponseFor<Invoice> =
            addNote(params, RequestOptions.none())

        /** @see addNote */
        @MustBeClosed
        fun addNote(
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/hosted-link`, but is
         * otherwise the same as [InvoiceService.createHostedLink].
         */
        @MustBeClosed
        fun createHostedLink(invoiceId: String): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none())

        /** @see createHostedLink */
        @MustBeClosed
        fun createHostedLink(
            invoiceId: String,
            params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see createHostedLink */
        @MustBeClosed
        fun createHostedLink(
            invoiceId: String,
            params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(invoiceId, params, RequestOptions.none())

        /** @see createHostedLink */
        @MustBeClosed
        fun createHostedLink(
            params: InvoiceCreateHostedLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse>

        /** @see createHostedLink */
        @MustBeClosed
        fun createHostedLink(
            params: InvoiceCreateHostedLinkParams
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(params, RequestOptions.none())

        /** @see createHostedLink */
        @MustBeClosed
        fun createHostedLink(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/duplicate`, but is
         * otherwise the same as [InvoiceService.duplicate].
         */
        @MustBeClosed
        fun duplicate(invoiceId: String): HttpResponseFor<Invoice> =
            duplicate(invoiceId, InvoiceDuplicateParams.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            invoiceId: String,
            params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            invoiceId: String,
            params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
        ): HttpResponseFor<Invoice> = duplicate(invoiceId, params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            params: InvoiceDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(params: InvoiceDuplicateParams): HttpResponseFor<Invoice> =
            duplicate(params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/finalize`, but is
         * otherwise the same as [InvoiceService.finalize].
         */
        @MustBeClosed
        fun finalize(invoiceId: String, params: InvoiceFinalizeParams): HttpResponseFor<Invoice> =
            finalize(invoiceId, params, RequestOptions.none())

        /** @see finalize */
        @MustBeClosed
        fun finalize(
            invoiceId: String,
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see finalize */
        @MustBeClosed
        fun finalize(params: InvoiceFinalizeParams): HttpResponseFor<Invoice> =
            finalize(params, RequestOptions.none())

        /** @see finalize */
        @MustBeClosed
        fun finalize(
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/events`, but is
         * otherwise the same as [InvoiceService.listEvents].
         */
        @MustBeClosed
        fun listEvents(invoiceId: String): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(invoiceId, InvoiceListEventsParams.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            invoiceId: String,
            params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            invoiceId: String,
            params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
        ): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(invoiceId, params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: InvoiceListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListEventsResponse>

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: InvoiceListEventsParams
        ): HttpResponseFor<InvoiceListEventsResponse> = listEvents(params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/mark-uncollectable`,
         * but is otherwise the same as [InvoiceService.markUncollectable].
         */
        @MustBeClosed
        fun markUncollectable(
            invoiceId: String,
            params: InvoiceMarkUncollectableParams,
        ): HttpResponseFor<Invoice> = markUncollectable(invoiceId, params, RequestOptions.none())

        /** @see markUncollectable */
        @MustBeClosed
        fun markUncollectable(
            invoiceId: String,
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see markUncollectable */
        @MustBeClosed
        fun markUncollectable(params: InvoiceMarkUncollectableParams): HttpResponseFor<Invoice> =
            markUncollectable(params, RequestOptions.none())

        /** @see markUncollectable */
        @MustBeClosed
        fun markUncollectable(
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/preview`, but is otherwise the
         * same as [InvoiceService.preview].
         */
        @MustBeClosed
        fun preview(params: InvoicePreviewParams): HttpResponse =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: InvoicePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/preview`, but is
         * otherwise the same as [InvoiceService.previewExisting].
         */
        @MustBeClosed
        fun previewExisting(invoiceId: String): HttpResponse =
            previewExisting(invoiceId, InvoicePreviewExistingParams.none())

        /** @see previewExisting */
        @MustBeClosed
        fun previewExisting(
            invoiceId: String,
            params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see previewExisting */
        @MustBeClosed
        fun previewExisting(
            invoiceId: String,
            params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
        ): HttpResponse = previewExisting(invoiceId, params, RequestOptions.none())

        /** @see previewExisting */
        @MustBeClosed
        fun previewExisting(
            params: InvoicePreviewExistingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see previewExisting */
        @MustBeClosed
        fun previewExisting(params: InvoicePreviewExistingParams): HttpResponse =
            previewExisting(params, RequestOptions.none())

        /** @see previewExisting */
        @MustBeClosed
        fun previewExisting(invoiceId: String, requestOptions: RequestOptions): HttpResponse =
            previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/retry`, but is
         * otherwise the same as [InvoiceService.retry].
         */
        @MustBeClosed
        fun retry(invoiceId: String, params: InvoiceRetryParams): HttpResponseFor<Invoice> =
            retry(invoiceId, params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            invoiceId: String,
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        fun retry(params: InvoiceRetryParams): HttpResponseFor<Invoice> =
            retry(params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/send`, but is
         * otherwise the same as [InvoiceService.send].
         */
        @MustBeClosed
        fun send(invoiceId: String, params: InvoiceSendParams): HttpResponseFor<Invoice> =
            send(invoiceId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            invoiceId: String,
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(params: InvoiceSendParams): HttpResponseFor<Invoice> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/dunning`, but is
         * otherwise the same as [InvoiceService.updateDunning].
         */
        @MustBeClosed
        fun updateDunning(
            invoiceId: String,
            params: InvoiceUpdateDunningParams,
        ): HttpResponseFor<Invoice> = updateDunning(invoiceId, params, RequestOptions.none())

        /** @see updateDunning */
        @MustBeClosed
        fun updateDunning(
            invoiceId: String,
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see updateDunning */
        @MustBeClosed
        fun updateDunning(params: InvoiceUpdateDunningParams): HttpResponseFor<Invoice> =
            updateDunning(params, RequestOptions.none())

        /** @see updateDunning */
        @MustBeClosed
        fun updateDunning(
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/void`, but is
         * otherwise the same as [InvoiceService.void_].
         */
        @MustBeClosed
        fun void_(invoiceId: String, params: InvoiceVoidParams): HttpResponseFor<Invoice> =
            void_(invoiceId, params, RequestOptions.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            invoiceId: String,
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            void_(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see void_ */
        @MustBeClosed
        fun void_(params: InvoiceVoidParams): HttpResponseFor<Invoice> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        @MustBeClosed
        fun void_(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>
    }
}
