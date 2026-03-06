// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.CustomerCreateParams
import com.lightspark.grid.models.customers.CustomerDeleteParams
import com.lightspark.grid.models.customers.CustomerGetKycLinkParams
import com.lightspark.grid.models.customers.CustomerGetKycLinkResponse
import com.lightspark.grid.models.customers.CustomerListInternalAccountsPage
import com.lightspark.grid.models.customers.CustomerListInternalAccountsParams
import com.lightspark.grid.models.customers.CustomerListPage
import com.lightspark.grid.models.customers.CustomerListParams
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.CustomerRetrieveParams
import com.lightspark.grid.models.customers.CustomerUpdateParams
import com.lightspark.grid.services.blocking.customers.BulkService
import com.lightspark.grid.services.blocking.customers.ExternalAccountService

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService

    /** External account management endpoints for creating and managing external bank accounts */
    fun externalAccounts(): ExternalAccountService

    /** Customer management endpoints for creating and updating customer information */
    fun bulk(): BulkService

    /**
     * Register a new customer in the system with an account identifier and bank account information
     */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see create */
    fun create(
        createCustomerRequest: CustomerCreateParams.CreateCustomerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(
            CustomerCreateParams.builder().createCustomerRequest(createCustomerRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        individualCustomerCreate:
            CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(
            CustomerCreateParams.CreateCustomerRequest.ofIndividualCustomerCreate(
                individualCustomerCreate
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        businessCustomerCreate:
            CustomerCreateParams.CreateCustomerRequest.BusinessCustomerCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf =
        create(
            CustomerCreateParams.CreateCustomerRequest.ofBusinessCustomerCreate(
                businessCustomerCreate
            ),
            requestOptions,
        )

    /** Retrieve a customer by their system-generated ID */
    fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see retrieve */
    fun retrieve(customerId: String, requestOptions: RequestOptions): CustomerOneOf =
        retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

    /** Update a customer's metadata by their system-generated ID */
    fun update(
        customerId: String,
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /**
     * Retrieve a list of customers with optional filtering parameters. Returns all customers that
     * match the specified filters. If no filters are provided, returns all customers (paginated).
     */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    /** Delete a customer by their system-generated ID */
    fun delete(
        customerId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf = delete(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerOneOf

    /** @see delete */
    fun delete(customerId: String, requestOptions: RequestOptions): CustomerOneOf =
        delete(customerId, CustomerDeleteParams.none(), requestOptions)

    /** Generate a hosted KYC link to onboard a customer */
    fun getKycLink(
        params: CustomerGetKycLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerGetKycLinkResponse

    /**
     * Retrieve a list of internal accounts with optional filtering parameters. Returns all internal
     * accounts that match the specified filters. If no filters are provided, returns all internal
     * accounts (paginated).
     *
     * Internal accounts are created automatically when a customer is created based on the platform
     * configuration.
     */
    fun listInternalAccounts(
        params: CustomerListInternalAccountsParams = CustomerListInternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListInternalAccountsPage

    /** @see listInternalAccounts */
    fun listInternalAccounts(requestOptions: RequestOptions): CustomerListInternalAccountsPage =
        listInternalAccounts(CustomerListInternalAccountsParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService.WithRawResponse

        /**
         * External account management endpoints for creating and managing external bank accounts
         */
        fun externalAccounts(): ExternalAccountService.WithRawResponse

        /** Customer management endpoints for creating and updating customer information */
        fun bulk(): BulkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see create */
        @MustBeClosed
        fun create(
            createCustomerRequest: CustomerCreateParams.CreateCustomerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(
                CustomerCreateParams.builder().createCustomerRequest(createCustomerRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            individualCustomerCreate:
                CustomerCreateParams.CreateCustomerRequest.IndividualCustomerCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(
                CustomerCreateParams.CreateCustomerRequest.ofIndividualCustomerCreate(
                    individualCustomerCreate
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            businessCustomerCreate:
                CustomerCreateParams.CreateCustomerRequest.BusinessCustomerCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            create(
                CustomerCreateParams.CreateCustomerRequest.ofBusinessCustomerCreate(
                    businessCustomerCreate
                ),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customers/{customerId}`, but is otherwise the same
         * as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerOneOf> =
            retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /customers/{customerId}`, but is otherwise the
         * same as [CustomerService.update].
         */
        @MustBeClosed
        fun update(
            customerId: String,
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /customers/{customerId}`, but is otherwise the
         * same as [CustomerService.delete].
         */
        @MustBeClosed
        fun delete(
            customerId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf> =
            delete(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerOneOf>

        /** @see delete */
        @MustBeClosed
        fun delete(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerOneOf> =
            delete(customerId, CustomerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/kyc-link`, but is otherwise the same as
         * [CustomerService.getKycLink].
         */
        @MustBeClosed
        fun getKycLink(
            params: CustomerGetKycLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerGetKycLinkResponse>

        /**
         * Returns a raw HTTP response for `get /customers/internal-accounts`, but is otherwise the
         * same as [CustomerService.listInternalAccounts].
         */
        @MustBeClosed
        fun listInternalAccounts(
            params: CustomerListInternalAccountsParams = CustomerListInternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListInternalAccountsPage>

        /** @see listInternalAccounts */
        @MustBeClosed
        fun listInternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<CustomerListInternalAccountsPage> =
            listInternalAccounts(CustomerListInternalAccountsParams.none(), requestOptions)
    }
}
