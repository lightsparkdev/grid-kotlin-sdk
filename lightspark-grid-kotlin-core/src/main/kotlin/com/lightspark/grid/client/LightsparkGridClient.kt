// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.client

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.BeneficialOwnerService
import com.lightspark.grid.services.blocking.ConfigService
import com.lightspark.grid.services.blocking.CryptoService
import com.lightspark.grid.services.blocking.CustomerService
import com.lightspark.grid.services.blocking.DiscoveryService
import com.lightspark.grid.services.blocking.DocumentService
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
import com.lightspark.grid.services.blocking.VerificationService
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

    /**
     * Platform configuration endpoints for managing global settings. You can also configure these
     * settings in the Grid dashboard.
     */
    fun config(): ConfigService

    fun customers(): CustomerService

    /** Internal account management endpoints for creating and managing internal accounts */
    fun platform(): PlatformService

    fun plaid(): PlaidService

    /**
     * Endpoints for transferring funds between internal and external accounts with the same
     * currency
     */
    fun transferIn(): TransferInService

    /**
     * Endpoints for transferring funds between internal and external accounts with the same
     * currency
     */
    fun transferOut(): TransferOutService

    /** Endpoints for creating and confirming quotes for cross-currency transfers */
    fun receiver(): ReceiverService

    /** Endpoints for creating and confirming quotes for cross-currency transfers */
    fun quotes(): QuoteService

    /** Endpoints for retrieving transaction information */
    fun transactions(): TransactionService

    /** Endpoints for creating, claiming and managing UMA invitations */
    fun invitations(): InvitationService

    /** Endpoints to trigger test cases in sandbox */
    fun sandbox(): SandboxService

    fun umaProviders(): UmaProviderService

    /** Endpoints to programmatically manage API tokens */
    fun tokens(): TokenService

    /**
     * Endpoints for retrieving cached foreign exchange rates. Rates are cached for approximately 5
     * minutes and include platform-specific fees.
     */
    fun exchangeRates(): ExchangeRateService

    fun webhooks(): WebhookService

    /** Endpoints for creating and confirming quotes for cross-currency transfers */
    fun crypto(): CryptoService

    /**
     * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
     * managing beneficial owners and triggering verification for customers.
     */
    fun beneficialOwners(): BeneficialOwnerService

    /**
     * Endpoints for uploading and managing verification documents for customers and beneficial
     * owners. Supports KYC and KYB document requirements.
     */
    fun documents(): DocumentService

    /**
     * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
     * managing beneficial owners and triggering verification for customers.
     */
    fun verifications(): VerificationService

    /**
     * Endpoints for discovering available payment rails, banks, and providers for a given country
     * and currency corridor.
     */
    fun discoveries(): DiscoveryService

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

        /**
         * Platform configuration endpoints for managing global settings. You can also configure
         * these settings in the Grid dashboard.
         */
        fun config(): ConfigService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        /** Internal account management endpoints for creating and managing internal accounts */
        fun platform(): PlatformService.WithRawResponse

        fun plaid(): PlaidService.WithRawResponse

        /**
         * Endpoints for transferring funds between internal and external accounts with the same
         * currency
         */
        fun transferIn(): TransferInService.WithRawResponse

        /**
         * Endpoints for transferring funds between internal and external accounts with the same
         * currency
         */
        fun transferOut(): TransferOutService.WithRawResponse

        /** Endpoints for creating and confirming quotes for cross-currency transfers */
        fun receiver(): ReceiverService.WithRawResponse

        /** Endpoints for creating and confirming quotes for cross-currency transfers */
        fun quotes(): QuoteService.WithRawResponse

        /** Endpoints for retrieving transaction information */
        fun transactions(): TransactionService.WithRawResponse

        /** Endpoints for creating, claiming and managing UMA invitations */
        fun invitations(): InvitationService.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun sandbox(): SandboxService.WithRawResponse

        fun umaProviders(): UmaProviderService.WithRawResponse

        /** Endpoints to programmatically manage API tokens */
        fun tokens(): TokenService.WithRawResponse

        /**
         * Endpoints for retrieving cached foreign exchange rates. Rates are cached for
         * approximately 5 minutes and include platform-specific fees.
         */
        fun exchangeRates(): ExchangeRateService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        /** Endpoints for creating and confirming quotes for cross-currency transfers */
        fun crypto(): CryptoService.WithRawResponse

        /**
         * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification,
         * including managing beneficial owners and triggering verification for customers.
         */
        fun beneficialOwners(): BeneficialOwnerService.WithRawResponse

        /**
         * Endpoints for uploading and managing verification documents for customers and beneficial
         * owners. Supports KYC and KYB document requirements.
         */
        fun documents(): DocumentService.WithRawResponse

        /**
         * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification,
         * including managing beneficial owners and triggering verification for customers.
         */
        fun verifications(): VerificationService.WithRawResponse

        /**
         * Endpoints for discovering available payment rails, banks, and providers for a given
         * country and currency corridor.
         */
        fun discoveries(): DiscoveryService.WithRawResponse
    }
}
