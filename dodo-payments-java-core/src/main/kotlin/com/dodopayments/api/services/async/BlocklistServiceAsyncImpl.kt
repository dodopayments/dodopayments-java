// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.services.async.blocklist.CustomerServiceAsync
import com.dodopayments.api.services.async.blocklist.CustomerServiceAsyncImpl
import java.util.function.Consumer

class BlocklistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BlocklistServiceAsync {

    private val withRawResponse: BlocklistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BlocklistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlocklistServiceAsync =
        BlocklistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerServiceAsync = customers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlocklistServiceAsync.WithRawResponse {

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlocklistServiceAsync.WithRawResponse =
            BlocklistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers
    }
}
