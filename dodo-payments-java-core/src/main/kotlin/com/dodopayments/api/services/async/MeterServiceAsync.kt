// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.meters.Meter
import com.dodopayments.api.models.meters.MeterArchiveParams
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterListPageAsync
import com.dodopayments.api.models.meters.MeterListParams
import com.dodopayments.api.models.meters.MeterRetrieveParams
import com.dodopayments.api.models.meters.MeterUnarchiveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeterServiceAsync

    fun create(params: MeterCreateParams): CompletableFuture<Meter> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Meter>

    fun retrieve(id: String): CompletableFuture<Meter> = retrieve(id, MeterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Meter> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
    ): CompletableFuture<Meter> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Meter>

    /** @see retrieve */
    fun retrieve(params: MeterRetrieveParams): CompletableFuture<Meter> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Meter> =
        retrieve(id, MeterRetrieveParams.none(), requestOptions)

    fun list(): CompletableFuture<MeterListPageAsync> = list(MeterListParams.none())

    /** @see list */
    fun list(
        params: MeterListParams = MeterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterListPageAsync>

    /** @see list */
    fun list(
        params: MeterListParams = MeterListParams.none()
    ): CompletableFuture<MeterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MeterListPageAsync> =
        list(MeterListParams.none(), requestOptions)

    fun archive(id: String): CompletableFuture<Void?> = archive(id, MeterArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: MeterArchiveParams = MeterArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: MeterArchiveParams = MeterArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: MeterArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: MeterArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(id, MeterArchiveParams.none(), requestOptions)

    fun unarchive(id: String): CompletableFuture<Void?> = unarchive(id, MeterUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
    ): CompletableFuture<Void?> = unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: MeterUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unarchive */
    fun unarchive(params: MeterUnarchiveParams): CompletableFuture<Void?> =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        unarchive(id, MeterUnarchiveParams.none(), requestOptions)

    /** A view of [MeterServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meters`, but is otherwise the same as
         * [MeterServiceAsync.create].
         */
        fun create(params: MeterCreateParams): CompletableFuture<HttpResponseFor<Meter>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Meter>>

        /**
         * Returns a raw HTTP response for `get /meters/{id}`, but is otherwise the same as
         * [MeterServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Meter>> =
            retrieve(id, MeterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Meter>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Meter>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Meter>>

        /** @see retrieve */
        fun retrieve(params: MeterRetrieveParams): CompletableFuture<HttpResponseFor<Meter>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Meter>> =
            retrieve(id, MeterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meters`, but is otherwise the same as
         * [MeterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(MeterListParams.none())

        /** @see list */
        fun list(
            params: MeterListParams = MeterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>>

        /** @see list */
        fun list(
            params: MeterListParams = MeterListParams.none()
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(MeterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meters/{id}`, but is otherwise the same as
         * [MeterServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponse> =
            archive(id, MeterArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: MeterArchiveParams = MeterArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: MeterArchiveParams = MeterArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: MeterArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: MeterArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            archive(id, MeterArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /meters/{id}/unarchive`, but is otherwise the same
         * as [MeterServiceAsync.unarchive].
         */
        fun unarchive(id: String): CompletableFuture<HttpResponse> =
            unarchive(id, MeterUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
        ): CompletableFuture<HttpResponse> = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: MeterUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unarchive */
        fun unarchive(params: MeterUnarchiveParams): CompletableFuture<HttpResponse> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            unarchive(id, MeterUnarchiveParams.none(), requestOptions)
    }
}
