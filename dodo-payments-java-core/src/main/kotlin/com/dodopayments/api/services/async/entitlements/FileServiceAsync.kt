// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import com.dodopayments.api.models.entitlements.files.FileUploadParams
import com.dodopayments.api.models.entitlements.files.FileUploadResponse
import com.dodopayments.api.services.async.entitlements.FileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /** Detach a previously-attached file from a `digital_files` entitlement. */
    fun delete(fileId: String, params: FileDeleteParams): CompletableFuture<Void?> =
        delete(
          fileId,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(fileId: String, params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .fileId(fileId)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Attach a file to a `digital_files` entitlement. Per-file size cap: 500 MiB. */
    fun upload(id: String): CompletableFuture<FileUploadResponse> =
        upload(
          id, FileUploadParams.none()
        )

    /** @see upload */
    fun upload(id: String, params: FileUploadParams = FileUploadParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FileUploadResponse> =
        upload(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see upload */
    fun upload(id: String, params: FileUploadParams = FileUploadParams.none()): CompletableFuture<FileUploadResponse> =
        upload(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see upload */
    fun upload(params: FileUploadParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FileUploadResponse>

    /** @see upload */
    fun upload(params: FileUploadParams): CompletableFuture<FileUploadResponse> =
        upload(
          params, RequestOptions.none()
        )

    /** @see upload */
    fun upload(id: String, requestOptions: RequestOptions): CompletableFuture<FileUploadResponse> =
        upload(
          id,
          FileUploadParams.none(),
          requestOptions,
        )

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `delete /entitlements/{id}/files/{file_id}`, but is otherwise the             same as [FileServiceAsync.delete]. */
        fun delete(fileId: String, params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              fileId,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(fileId: String, params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .fileId(fileId)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `post /entitlements/{id}/files`, but is otherwise the             same as [FileServiceAsync.upload]. */
        fun upload(id: String): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(
              id, FileUploadParams.none()
            )

        /** @see upload */
        fun upload(id: String, params: FileUploadParams = FileUploadParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see upload */
        fun upload(id: String, params: FileUploadParams = FileUploadParams.none()): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see upload */
        fun upload(params: FileUploadParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FileUploadResponse>>

        /** @see upload */
        fun upload(params: FileUploadParams): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(
              params, RequestOptions.none()
            )

        /** @see upload */
        fun upload(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<FileUploadResponse>> =
            upload(
              id,
              FileUploadParams.none(),
              requestOptions,
            )
    }
}
