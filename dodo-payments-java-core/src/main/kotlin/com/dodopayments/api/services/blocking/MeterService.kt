// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.meters.Meter
import com.dodopayments.api.models.meters.MeterArchiveParams
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterListPage
import com.dodopayments.api.models.meters.MeterListParams
import com.dodopayments.api.models.meters.MeterRetrieveParams
import com.dodopayments.api.models.meters.MeterUnarchiveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MeterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeterService

    fun create(params: MeterCreateParams): Meter = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter

    fun retrieve(id: String): Meter = retrieve(id, MeterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: MeterRetrieveParams = MeterRetrieveParams.none()): Meter =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter

    /** @see retrieve */
    fun retrieve(params: MeterRetrieveParams): Meter = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Meter =
        retrieve(id, MeterRetrieveParams.none(), requestOptions)

    fun list(): MeterListPage = list(MeterListParams.none())

    /** @see list */
    fun list(
        params: MeterListParams = MeterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterListPage

    /** @see list */
    fun list(params: MeterListParams = MeterListParams.none()): MeterListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MeterListPage =
        list(MeterListParams.none(), requestOptions)

    fun archive(id: String) = archive(id, MeterArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: MeterArchiveParams = MeterArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: String, params: MeterArchiveParams = MeterArchiveParams.none()) =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(params: MeterArchiveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see archive */
    fun archive(params: MeterArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions) =
        archive(id, MeterArchiveParams.none(), requestOptions)

    fun unarchive(id: String) = unarchive(id, MeterUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(id: String, params: MeterUnarchiveParams = MeterUnarchiveParams.none()) =
        unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: MeterUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unarchive */
    fun unarchive(params: MeterUnarchiveParams) = unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions) =
        unarchive(id, MeterUnarchiveParams.none(), requestOptions)

    /** A view of [MeterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meters`, but is otherwise the same as
         * [MeterService.create].
         */
        @MustBeClosed
        fun create(params: MeterCreateParams): HttpResponseFor<Meter> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter>

        /**
         * Returns a raw HTTP response for `get /meters/{id}`, but is otherwise the same as
         * [MeterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Meter> = retrieve(id, MeterRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
        ): HttpResponseFor<Meter> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MeterRetrieveParams): HttpResponseFor<Meter> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Meter> =
            retrieve(id, MeterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meters`, but is otherwise the same as
         * [MeterService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MeterListPage> = list(MeterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeterListParams = MeterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: MeterListParams = MeterListParams.none()): HttpResponseFor<MeterListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeterListPage> =
            list(MeterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meters/{id}`, but is otherwise the same as
         * [MeterService.archive].
         */
        @MustBeClosed fun archive(id: String): HttpResponse = archive(id, MeterArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: MeterArchiveParams = MeterArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: MeterArchiveParams = MeterArchiveParams.none(),
        ): HttpResponse = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: MeterArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: MeterArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponse =
            archive(id, MeterArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /meters/{id}/unarchive`, but is otherwise the same
         * as [MeterService.unarchive].
         */
        @MustBeClosed
        fun unarchive(id: String): HttpResponse = unarchive(id, MeterUnarchiveParams.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
        ): HttpResponse = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: MeterUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(params: MeterUnarchiveParams): HttpResponse =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(id: String, requestOptions: RequestOptions): HttpResponse =
            unarchive(id, MeterUnarchiveParams.none(), requestOptions)
    }
}
