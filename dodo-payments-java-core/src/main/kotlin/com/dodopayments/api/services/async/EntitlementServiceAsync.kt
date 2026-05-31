// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.Entitlement
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementDeleteParams
import com.dodopayments.api.models.entitlements.EntitlementListPageAsync
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveParams
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.services.async.EntitlementServiceAsync
import com.dodopayments.api.services.async.entitlements.FileServiceAsync
import com.dodopayments.api.services.async.entitlements.GrantServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntitlementServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync

    fun files(): FileServiceAsync

    fun grants(): GrantServiceAsync

    /** POST /entitlements */
    fun create(params: EntitlementCreateParams): CompletableFuture<Entitlement> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: EntitlementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Entitlement>

    /** GET /entitlements/{id} */
    fun retrieve(id: String): CompletableFuture<Entitlement> =
        retrieve(
          id, EntitlementRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Entitlement> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: EntitlementRetrieveParams = EntitlementRetrieveParams.none()): CompletableFuture<Entitlement> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: EntitlementRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Entitlement>

    /** @see retrieve */
    fun retrieve(params: EntitlementRetrieveParams): CompletableFuture<Entitlement> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Entitlement> =
        retrieve(
          id,
          EntitlementRetrieveParams.none(),
          requestOptions,
        )

    /** PATCH /entitlements/{id} */
    fun update(id: String): CompletableFuture<Entitlement> =
        update(
          id, EntitlementUpdateParams.none()
        )

    /** @see update */
    fun update(id: String, params: EntitlementUpdateParams = EntitlementUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Entitlement> =
        update(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see update */
    fun update(id: String, params: EntitlementUpdateParams = EntitlementUpdateParams.none()): CompletableFuture<Entitlement> =
        update(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(params: EntitlementUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Entitlement>

    /** @see update */
    fun update(params: EntitlementUpdateParams): CompletableFuture<Entitlement> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Entitlement> =
        update(
          id,
          EntitlementUpdateParams.none(),
          requestOptions,
        )

    /** GET /entitlements */
    fun list(): CompletableFuture<EntitlementListPageAsync> = list(EntitlementListParams.none())

    /** @see list */
    fun list(params: EntitlementListParams = EntitlementListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EntitlementListPageAsync>

    /** @see list */
    fun list(params: EntitlementListParams = EntitlementListParams.none()): CompletableFuture<EntitlementListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EntitlementListPageAsync> =
        list(
          EntitlementListParams.none(), requestOptions
        )

    /** DELETE /entitlements/{id} (soft-delete) */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, EntitlementDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: EntitlementDeleteParams = EntitlementDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: EntitlementDeleteParams = EntitlementDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: EntitlementDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EntitlementDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          EntitlementDeleteParams.none(),
          requestOptions,
        )

    /** A view of [EntitlementServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun grants(): GrantServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /entitlements`, but is otherwise the             same as [EntitlementServiceAsync.create]. */
        fun create(params: EntitlementCreateParams): CompletableFuture<HttpResponseFor<Entitlement>> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: EntitlementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Entitlement>>

        /** Returns a raw HTTP response for `get /entitlements/{id}`, but is otherwise the             same as [EntitlementServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Entitlement>> =
            retrieve(
              id, EntitlementRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Entitlement>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: EntitlementRetrieveParams = EntitlementRetrieveParams.none()): CompletableFuture<HttpResponseFor<Entitlement>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: EntitlementRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Entitlement>>

        /** @see retrieve */
        fun retrieve(params: EntitlementRetrieveParams): CompletableFuture<HttpResponseFor<Entitlement>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Entitlement>> =
            retrieve(
              id,
              EntitlementRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `patch /entitlements/{id}`, but is otherwise the             same as [EntitlementServiceAsync.update]. */
        fun update(id: String): CompletableFuture<HttpResponseFor<Entitlement>> =
            update(
              id, EntitlementUpdateParams.none()
            )

        /** @see update */
        fun update(id: String, params: EntitlementUpdateParams = EntitlementUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Entitlement>> =
            update(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(id: String, params: EntitlementUpdateParams = EntitlementUpdateParams.none()): CompletableFuture<HttpResponseFor<Entitlement>> =
            update(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(params: EntitlementUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Entitlement>>

        /** @see update */
        fun update(params: EntitlementUpdateParams): CompletableFuture<HttpResponseFor<Entitlement>> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Entitlement>> =
            update(
              id,
              EntitlementUpdateParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /entitlements`, but is otherwise the             same as [EntitlementServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> = list(EntitlementListParams.none())

        /** @see list */
        fun list(params: EntitlementListParams = EntitlementListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>>

        /** @see list */
        fun list(params: EntitlementListParams = EntitlementListParams.none()): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EntitlementListPageAsync>> =
            list(
              EntitlementListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /entitlements/{id}`, but is otherwise the             same as [EntitlementServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, EntitlementDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: EntitlementDeleteParams = EntitlementDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: EntitlementDeleteParams = EntitlementDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: EntitlementDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EntitlementDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              EntitlementDeleteParams.none(),
              requestOptions,
            )
    }
}
