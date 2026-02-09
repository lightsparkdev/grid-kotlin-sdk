// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.client

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.async.ConfigServiceAsync
import com.lightspark.grid.services.async.CustomerServiceAsync
import com.lightspark.grid.services.async.ExchangeRateServiceAsync
import com.lightspark.grid.services.async.InvitationServiceAsync
import com.lightspark.grid.services.async.PlaidServiceAsync
import com.lightspark.grid.services.async.PlatformServiceAsync
import com.lightspark.grid.services.async.QuoteServiceAsync
import com.lightspark.grid.services.async.ReceiverServiceAsync
import com.lightspark.grid.services.async.SandboxServiceAsync
import com.lightspark.grid.services.async.TokenServiceAsync
import com.lightspark.grid.services.async.TransactionServiceAsync
import com.lightspark.grid.services.async.TransferInServiceAsync
import com.lightspark.grid.services.async.TransferOutServiceAsync
import com.lightspark.grid.services.async.UmaProviderServiceAsync
import com.lightspark.grid.services.async.WebhookServiceAsync

/**
 * A client for interacting with the Lightspark Grid REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LightsparkGridClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): LightsparkGridClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LightsparkGridClientAsync

    fun config(): ConfigServiceAsync

    fun customers(): CustomerServiceAsync

    fun platform(): PlatformServiceAsync

    fun plaid(): PlaidServiceAsync

    fun transferIn(): TransferInServiceAsync

    fun transferOut(): TransferOutServiceAsync

    fun receiver(): ReceiverServiceAsync

    fun quotes(): QuoteServiceAsync

    fun transactions(): TransactionServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun invitations(): InvitationServiceAsync

    fun sandbox(): SandboxServiceAsync

    fun umaProviders(): UmaProviderServiceAsync

    fun tokens(): TokenServiceAsync

    fun exchangeRates(): ExchangeRateServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [LightsparkGridClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LightsparkGridClientAsync.WithRawResponse

        fun config(): ConfigServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        fun platform(): PlatformServiceAsync.WithRawResponse

        fun plaid(): PlaidServiceAsync.WithRawResponse

        fun transferIn(): TransferInServiceAsync.WithRawResponse

        fun transferOut(): TransferOutServiceAsync.WithRawResponse

        fun receiver(): ReceiverServiceAsync.WithRawResponse

        fun quotes(): QuoteServiceAsync.WithRawResponse

        fun transactions(): TransactionServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse

        fun invitations(): InvitationServiceAsync.WithRawResponse

        fun sandbox(): SandboxServiceAsync.WithRawResponse

        fun umaProviders(): UmaProviderServiceAsync.WithRawResponse

        fun tokens(): TokenServiceAsync.WithRawResponse

        fun exchangeRates(): ExchangeRateServiceAsync.WithRawResponse
    }
}
