// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.services.blocking.blocklist.CustomerService
import com.dodopayments.api.services.blocking.blocklist.CustomerServiceImpl
import java.util.function.Consumer

class BlocklistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BlocklistService {

    private val withRawResponse: BlocklistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    override fun withRawResponse(): BlocklistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlocklistService =
        BlocklistServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customers(): CustomerService = customers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlocklistService.WithRawResponse {

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlocklistService.WithRawResponse =
            BlocklistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun customers(): CustomerService.WithRawResponse = customers
    }
}
