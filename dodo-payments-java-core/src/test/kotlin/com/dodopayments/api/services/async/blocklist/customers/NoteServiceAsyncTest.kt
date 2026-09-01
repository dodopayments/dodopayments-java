// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.blocklist.customers.notes.NoteCreateParams
import com.dodopayments.api.models.blocklist.customers.notes.NoteRequest
import com.dodopayments.api.models.blocklist.customers.notes.NoteUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NoteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val noteServiceAsync = client.blocklist().customers().notes()

        val blockedCustomerNoteFuture =
            noteServiceAsync.create(
                NoteCreateParams.builder()
                    .entryId("entry_id")
                    .noteRequest(NoteRequest.builder().note("note").build())
                    .build()
            )

        val blockedCustomerNote = blockedCustomerNoteFuture.get()
        blockedCustomerNote.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val noteServiceAsync = client.blocklist().customers().notes()

        val blockedCustomerNoteFuture =
            noteServiceAsync.update(
                NoteUpdateParams.builder()
                    .entryId("entry_id")
                    .noteId("note_id")
                    .noteRequest(NoteRequest.builder().note("note").build())
                    .build()
            )

        val blockedCustomerNote = blockedCustomerNoteFuture.get()
        blockedCustomerNote.validate()
    }
}
