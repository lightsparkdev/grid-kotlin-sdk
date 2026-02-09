// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.client

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.ConfigService
import com.lightspark.grid.services.blocking.CustomerService
import com.lightspark.grid.services.blocking.ExchangeRateService
import com.lightspark.grid.services.blocking.InvitationService
import com.lightspark.grid.services.blocking.PlaidService
import com.lightspark.grid.services.blocking.PlatformService
import com.lightspark.grid.services.blocking.QuoteService
import com.lightspark.grid.services.blocking.ReceiverService
import com.lightspark.grid.services.blocking.SandboxService
import com.lightspark.grid.services.blocking.TokenService
import com.lightspark.grid.services.blocking.TransactionService
import com.lightspark.grid.services.blocking.TransferInService
import com.lightspark.grid.services.blocking.TransferOutService
import com.lightspark.grid.services.blocking.UmaProviderService
import com.lightspark.grid.services.blocking.WebhookService

/**
 * A client for interacting with the Lightspark Grid REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface LightsparkGridClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LightsparkGridClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LightsparkGridClient

    fun config(): ConfigService

    fun customers(): CustomerService

    fun platform(): PlatformService

    fun plaid(): PlaidService

    fun transferIn(): TransferInService

    fun transferOut(): TransferOutService

    fun receiver(): ReceiverService

    fun quotes(): QuoteService

    fun transactions(): TransactionService

    fun webhooks(): WebhookService

    fun invitations(): InvitationService

    fun sandbox(): SandboxService

    fun umaProviders(): UmaProviderService

    fun tokens(): TokenService

    fun exchangeRates(): ExchangeRateService

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
     * A view of [LightsparkGridClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LightsparkGridClient.WithRawResponse

        fun config(): ConfigService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun platform(): PlatformService.WithRawResponse

        fun plaid(): PlaidService.WithRawResponse

        fun transferIn(): TransferInService.WithRawResponse

        fun transferOut(): TransferOutService.WithRawResponse

        fun receiver(): ReceiverService.WithRawResponse

        fun quotes(): QuoteService.WithRawResponse

        fun transactions(): TransactionService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        fun invitations(): InvitationService.WithRawResponse

        fun sandbox(): SandboxService.WithRawResponse

        fun umaProviders(): UmaProviderService.WithRawResponse

        fun tokens(): TokenService.WithRawResponse

        fun exchangeRates(): ExchangeRateService.WithRawResponse
    }
}
