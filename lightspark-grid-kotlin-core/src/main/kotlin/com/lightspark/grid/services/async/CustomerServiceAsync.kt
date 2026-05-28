// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerDeleteParams
import com.lightspark.grid.models.customers.CustomerExportParams
import com.lightspark.grid.models.customers.CustomerGenerateKycLinkParams
import com.lightspark.grid.models.customers.CustomerGenerateKycLinkResponse
import com.lightspark.grid.models.customers.CustomerListInternalAccountsPageAsync
import com.lightspark.grid.models.customers.CustomerListInternalAccountsParams
import com.lightspark.grid.models.customers.CustomerListPageAsync
import com.lightspark.grid.models.customers.CustomerListParams
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.CustomerRetrieveParams
import com.lightspark.grid.models.customers.CustomerUpdateInternalAccountParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
import com.lightspark.grid.models.customers.InternalAccountExportResponse
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.services.async.customers.BulkServiceAsync
import com.lightspark.grid.services.async.customers.ExternalAccountServiceAsync

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerServiceAsync

    /** External account management endpoints for creating and managing external bank accounts */
    fun externalAccounts(): ExternalAccountServiceAsync

    /** Customer management endpoints for creating and updating customer information */
    fun bulk(): BulkServiceAsync

    /**
     * Register a new customer in the system with an account identifier and bank account information
     */
    suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see create */
    suspend fun create(
        createCustomerRequest: CustomerCreateParams.CreateCustomerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(
            CustomerCreateParams.builder().createCustomerRequest(createCustomerRequest).build(),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        individual: CustomerCreateParams.CreateCustomerRequest.Individual,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(CustomerCreateParams.CreateCustomerRequest.ofIndividual(individual), requestOptions)

    /** @see create */
    suspend fun create(
        business: CustomerCreateParams.CreateCustomerRequest.Business,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(CustomerCreateParams.CreateCustomerRequest.ofBusiness(business), requestOptions)

    /** Retrieve a customer by their system-generated ID */
    suspend fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see retrieve */
    suspend fun retrieve(customerId: String, requestOptions: RequestOptions): CustomerOneOf =
        retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

    /**
     * Update a customer's metadata by their system-generated ID.
     *
     * Most customer updates complete synchronously and return `200` with the updated customer. If
     * the request changes `email` for a customer that has one or more tied Embedded Wallet internal
     * accounts with `EMAIL_OTP` credentials, the email change uses the two-step signed-retry flow
     * so the customer's wallet session authorizes the authentication credential update. On the
     * signed retry, Grid updates the customer email and every tied `EMAIL_OTP` credential across
     * all tied Embedded Wallets as one logical operation. If any tied credential cannot be updated,
     * the customer email is not changed.
     *
     * For an Embedded Wallet email update:
     * 1. Call `PATCH /customers/{customerId}` with the full update body and no signature headers.
     *    Grid returns `202` with `payloadToSign`, `requestId`, and `expiresAt`. The pending
     *    challenge binds the submitted update fields and the set of tied Embedded Wallet email OTP
     *    credentials that must be updated.
     * 2. Use the session API keypair of a verified authentication credential on one of the
     *    customer's tied Embedded Wallets to build an API-key stamp over `payloadToSign`, then
     *    retry the same request with that full stamp as the `Grid-Wallet-Signature` header and the
     *    `requestId` echoed back as the `Request-Id` header. The retry body must carry the same
     *    update fields submitted in step 1. The signed retry returns `200` with the updated
     *    customer.
     */
    suspend fun update(
        customerId: String,
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /**
     * Retrieve a list of customers with optional filtering parameters. Returns all customers that
     * match the specified filters. If no filters are provided, returns all customers (paginated).
     */
    suspend fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CustomerListPageAsync =
        list(CustomerListParams.none(), requestOptions)

    /** Delete a customer by their system-generated ID */
    suspend fun delete(
        customerId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = delete(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see delete */
    suspend fun delete(customerId: String, requestOptions: RequestOptions): CustomerOneOf =
        delete(customerId, CustomerDeleteParams.none(), requestOptions)

    /**
     * Export the wallet credentials of an Embedded Wallet internal account. The returned wallet
     * credentials are HPKE-encrypted to the `clientPublicKey` supplied in the request body.
     *
     * Export is a two-step signed-retry flow (same pattern as add-additional credential, revoke
     * credential, and revoke session):
     * 1. Call `POST /internal-accounts/{id}/export` with the request body `{ "clientPublicKey":
     *    "..." }` and no signature headers. Grid binds the `clientPublicKey` into the
     *    `payloadToSign` it returns, so the subsequent stamp in `Grid-Wallet-Signature` commits to
     *    the target encryption key. The response is `202` with `payloadToSign`, `requestId`, and
     *    `expiresAt`.
     * 2. Use the session API keypair of a verified authentication credential on the same internal
     *    account to build an API-key stamp over `payloadToSign`, then retry with that full stamp as
     *    the `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id`
     *    header. The retry body must carry the **same** `clientPublicKey` submitted in step 1 —
     *    Grid rejects the retry with `401` if it disagrees with what was bound into
     *    `payloadToSign`. The signed retry returns `200` with `encryptedWalletCredentials`, which
     *    the client decrypts with the matching private key.
     *
     * The `clientPublicKey` is ephemeral: generate a fresh P-256 keypair for this export and
     * discard the private key after decrypting. Do not reuse the keypair from any prior verify call
     * — that private key was already discarded after decrypting the session signing key it was
     * issued against.
     */
    suspend fun export(
        id: String,
        params: CustomerExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse = export(params.toBuilder().id(id).build(), requestOptions)

    /** @see export */
    suspend fun export(
        params: CustomerExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse

    /**
     * Generate a single-use hosted URL the customer can complete to verify their identity, and
     * (where supported) a provider-specific `token` for embedding the verification flow directly
     * via the provider's SDK.
     *
     * The customer must already exist — create them with `POST /customers` first. Calling this
     * endpoint does not change the customer's `kycStatus`; the customer remains `PENDING` until
     * they complete (or fail) the hosted flow.
     *
     * Each call returns a fresh link. Previously-issued links are not invalidated, but they remain
     * single-use and will expire on their own. For request-level retry safety, include an
     * `Idempotency-Key` header.
     */
    suspend fun generateKycLink(
        customerId: String,
        params: CustomerGenerateKycLinkParams = CustomerGenerateKycLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerGenerateKycLinkResponse =
        generateKycLink(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see generateKycLink */
    suspend fun generateKycLink(
        params: CustomerGenerateKycLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerGenerateKycLinkResponse

    /** @see generateKycLink */
    suspend fun generateKycLink(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerGenerateKycLinkResponse =
        generateKycLink(customerId, CustomerGenerateKycLinkParams.none(), requestOptions)

    /**
     * Retrieve a list of internal accounts with optional filtering parameters. Returns all internal
     * accounts that match the specified filters. If no filters are provided, returns all internal
     * accounts (paginated).
     *
     * Internal accounts are created automatically when a customer is created based on the platform
     * configuration.
     */
    suspend fun listInternalAccounts(
        params: CustomerListInternalAccountsParams = CustomerListInternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListInternalAccountsPageAsync

    /** @see listInternalAccounts */
    suspend fun listInternalAccounts(
        requestOptions: RequestOptions
    ): CustomerListInternalAccountsPageAsync =
        listInternalAccounts(CustomerListInternalAccountsParams.none(), requestOptions)

    /**
     * Update mutable fields on an internal account. Today this supports updating the wallet privacy
     * setting for an Embedded Wallet internal account.
     *
     * Updating wallet privacy is a two-step signed-retry flow:
     * 1. Call `PATCH /internal-accounts/{id}` with the request body `{ "privateEnabled": true }`
     *    and no signature headers. Grid returns `202` with `payloadToSign`, `requestId`, and
     *    `expiresAt`.
     * 2. Use the session API keypair of a verified authentication credential on the same internal
     *    account to build an API-key stamp over `payloadToSign`, then retry with that full stamp as
     *    the `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id`
     *    header. The retry body must carry the same update fields submitted in step 1. The signed
     *    retry returns `200` with the updated internal account.
     */
    suspend fun updateInternalAccount(
        id: String,
        params: CustomerUpdateInternalAccountParams = CustomerUpdateInternalAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = updateInternalAccount(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateInternalAccount */
    suspend fun updateInternalAccount(
        params: CustomerUpdateInternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** @see updateInternalAccount */
    suspend fun updateInternalAccount(id: String, requestOptions: RequestOptions): InternalAccount =
        updateInternalAccount(id, CustomerUpdateInternalAccountParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerServiceAsync.WithRawResponse

        /**
         * External account management endpoints for creating and managing external bank accounts
         */
        fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse

        /** Customer management endpoints for creating and updating customer information */
        fun bulk(): BulkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            createCustomerRequest: CustomerCreateParams.CreateCustomerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(
                CustomerCreateParams.builder().createCustomerRequest(createCustomerRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            individual: CustomerCreateParams.CreateCustomerRequest.Individual,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(
                CustomerCreateParams.CreateCustomerRequest.ofIndividual(individual),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            business: CustomerCreateParams.CreateCustomerRequest.Business,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(CustomerCreateParams.CreateCustomerRequest.ofBusiness(business), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customerId}`, but is otherwise the same
         * as [CustomerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerOneOf> =
            retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /customers/{customerId}`, but is otherwise the
         * same as [CustomerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            customerId: String,
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPageAsync> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /customers/{customerId}`, but is otherwise the
         * same as [CustomerServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            customerId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            delete(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerOneOf> =
            delete(customerId, CustomerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /internal-accounts/{id}/export`, but is otherwise
         * the same as [CustomerServiceAsync.export].
         */
        @MustBeClosed
        suspend fun export(
            id: String,
            params: CustomerExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse> =
            export(params.toBuilder().id(id).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        suspend fun export(
            params: CustomerExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse>

        /**
         * Returns a raw HTTP response for `post /customers/{customerId}/kyc-link`, but is otherwise
         * the same as [CustomerServiceAsync.generateKycLink].
         */
        @MustBeClosed
        suspend fun generateKycLink(
            customerId: String,
            params: CustomerGenerateKycLinkParams = CustomerGenerateKycLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerGenerateKycLinkResponse> =
            generateKycLink(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see generateKycLink */
        @MustBeClosed
        suspend fun generateKycLink(
            params: CustomerGenerateKycLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerGenerateKycLinkResponse>

        /** @see generateKycLink */
        @MustBeClosed
        suspend fun generateKycLink(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerGenerateKycLinkResponse> =
            generateKycLink(customerId, CustomerGenerateKycLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/internal-accounts`, but is otherwise the
         * same as [CustomerServiceAsync.listInternalAccounts].
         */
        @MustBeClosed
        suspend fun listInternalAccounts(
            params: CustomerListInternalAccountsParams = CustomerListInternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListInternalAccountsPageAsync>

        /** @see listInternalAccounts */
        @MustBeClosed
        suspend fun listInternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<CustomerListInternalAccountsPageAsync> =
            listInternalAccounts(CustomerListInternalAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /internal-accounts/{id}`, but is otherwise the
         * same as [CustomerServiceAsync.updateInternalAccount].
         */
        @MustBeClosed
        suspend fun updateInternalAccount(
            id: String,
            params: CustomerUpdateInternalAccountParams =
                CustomerUpdateInternalAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            updateInternalAccount(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateInternalAccount */
        @MustBeClosed
        suspend fun updateInternalAccount(
            params: CustomerUpdateInternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /** @see updateInternalAccount */
        @MustBeClosed
        suspend fun updateInternalAccount(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> =
            updateInternalAccount(id, CustomerUpdateInternalAccountParams.none(), requestOptions)
    }
}
