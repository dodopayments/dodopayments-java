// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.client

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.getPackageVersion
import com.dodo_payments.api.services.async.CustomerServiceAsync
import com.dodo_payments.api.services.async.CustomerServiceAsyncImpl
import com.dodo_payments.api.services.async.DiscountServiceAsync
import com.dodo_payments.api.services.async.DiscountServiceAsyncImpl
import com.dodo_payments.api.services.async.DisputeServiceAsync
import com.dodo_payments.api.services.async.DisputeServiceAsyncImpl
import com.dodo_payments.api.services.async.InvoiceServiceAsync
import com.dodo_payments.api.services.async.InvoiceServiceAsyncImpl
import com.dodo_payments.api.services.async.LicenseKeyInstanceServiceAsync
import com.dodo_payments.api.services.async.LicenseKeyInstanceServiceAsyncImpl
import com.dodo_payments.api.services.async.LicenseKeyServiceAsync
import com.dodo_payments.api.services.async.LicenseKeyServiceAsyncImpl
import com.dodo_payments.api.services.async.LicenseServiceAsync
import com.dodo_payments.api.services.async.LicenseServiceAsyncImpl
import com.dodo_payments.api.services.async.MiscServiceAsync
import com.dodo_payments.api.services.async.MiscServiceAsyncImpl
import com.dodo_payments.api.services.async.PaymentServiceAsync
import com.dodo_payments.api.services.async.PaymentServiceAsyncImpl
import com.dodo_payments.api.services.async.PayoutServiceAsync
import com.dodo_payments.api.services.async.PayoutServiceAsyncImpl
import com.dodo_payments.api.services.async.ProductServiceAsync
import com.dodo_payments.api.services.async.ProductServiceAsyncImpl
import com.dodo_payments.api.services.async.RefundServiceAsync
import com.dodo_payments.api.services.async.RefundServiceAsyncImpl
import com.dodo_payments.api.services.async.SubscriptionServiceAsync
import com.dodo_payments.api.services.async.SubscriptionServiceAsyncImpl
import com.dodo_payments.api.services.async.WebhookEventServiceAsync
import com.dodo_payments.api.services.async.WebhookEventServiceAsyncImpl

class DodoPaymentsClientAsyncImpl(private val clientOptions: ClientOptions) :
    DodoPaymentsClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: DodoPaymentsClient by lazy { DodoPaymentsClientImpl(clientOptions) }

    private val withRawResponse: DodoPaymentsClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payments: PaymentServiceAsync by lazy {
        PaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val licenses: LicenseServiceAsync by lazy {
        LicenseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val licenseKeys: LicenseKeyServiceAsync by lazy {
        LicenseKeyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val licenseKeyInstances: LicenseKeyInstanceServiceAsync by lazy {
        LicenseKeyInstanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerServiceAsync by lazy {
        CustomerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val refunds: RefundServiceAsync by lazy {
        RefundServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val disputes: DisputeServiceAsync by lazy {
        DisputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val payouts: PayoutServiceAsync by lazy {
        PayoutServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhookEvents: WebhookEventServiceAsync by lazy {
        WebhookEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val products: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val misc: MiscServiceAsync by lazy { MiscServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val discounts: DiscountServiceAsync by lazy {
        DiscountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): DodoPaymentsClient = sync

    override fun withRawResponse(): DodoPaymentsClientAsync.WithRawResponse = withRawResponse

    override fun payments(): PaymentServiceAsync = payments

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun licenses(): LicenseServiceAsync = licenses

    override fun licenseKeys(): LicenseKeyServiceAsync = licenseKeys

    override fun licenseKeyInstances(): LicenseKeyInstanceServiceAsync = licenseKeyInstances

    override fun customers(): CustomerServiceAsync = customers

    override fun refunds(): RefundServiceAsync = refunds

    override fun disputes(): DisputeServiceAsync = disputes

    override fun payouts(): PayoutServiceAsync = payouts

    override fun webhookEvents(): WebhookEventServiceAsync = webhookEvents

    override fun products(): ProductServiceAsync = products

    override fun misc(): MiscServiceAsync = misc

    override fun discounts(): DiscountServiceAsync = discounts

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DodoPaymentsClientAsync.WithRawResponse {

        private val payments: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenses: LicenseServiceAsync.WithRawResponse by lazy {
            LicenseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseKeys: LicenseKeyServiceAsync.WithRawResponse by lazy {
            LicenseKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseKeyInstances: LicenseKeyInstanceServiceAsync.WithRawResponse by lazy {
            LicenseKeyInstanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val refunds: RefundServiceAsync.WithRawResponse by lazy {
            RefundServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val disputes: DisputeServiceAsync.WithRawResponse by lazy {
            DisputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payouts: PayoutServiceAsync.WithRawResponse by lazy {
            PayoutServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhookEvents: WebhookEventServiceAsync.WithRawResponse by lazy {
            WebhookEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val misc: MiscServiceAsync.WithRawResponse by lazy {
            MiscServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val discounts: DiscountServiceAsync.WithRawResponse by lazy {
            DiscountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun licenses(): LicenseServiceAsync.WithRawResponse = licenses

        override fun licenseKeys(): LicenseKeyServiceAsync.WithRawResponse = licenseKeys

        override fun licenseKeyInstances(): LicenseKeyInstanceServiceAsync.WithRawResponse =
            licenseKeyInstances

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun refunds(): RefundServiceAsync.WithRawResponse = refunds

        override fun disputes(): DisputeServiceAsync.WithRawResponse = disputes

        override fun payouts(): PayoutServiceAsync.WithRawResponse = payouts

        override fun webhookEvents(): WebhookEventServiceAsync.WithRawResponse = webhookEvents

        override fun products(): ProductServiceAsync.WithRawResponse = products

        override fun misc(): MiscServiceAsync.WithRawResponse = misc

        override fun discounts(): DiscountServiceAsync.WithRawResponse = discounts
    }
}
