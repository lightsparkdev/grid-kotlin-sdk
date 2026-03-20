// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListPage
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
interface BeneficialOwnerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BeneficialOwnerService

    /**
     * Add a beneficial owner, director, or company officer to a business customer. The beneficial
     * owner will go through KYC verification automatically.
     */
    fun create(
        params: BeneficialOwnerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerCreateResponse

    /** Retrieve details of a specific beneficial owner by ID. */
    fun retrieve(
        beneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerRetrieveResponse =
        retrieve(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        beneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): BeneficialOwnerRetrieveResponse =
        retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update details of a specific beneficial owner. Only provided fields are updated. */
    fun update(
        beneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerUpdateResponse =
        update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see update */
    fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerUpdateResponse

    /** @see update */
    fun update(
        beneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): BeneficialOwnerUpdateResponse =
        update(beneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

    /** Retrieve a list of beneficial owners with optional filtering by customer ID and role. */
    fun list(
        params: BeneficialOwnerListParams = BeneficialOwnerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): BeneficialOwnerListPage =
        list(BeneficialOwnerListParams.none(), requestOptions)

    /**
     * A view of [BeneficialOwnerService] that provides access to raw HTTP responses for each
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
        ): BeneficialOwnerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /beneficial-owners`, but is otherwise the same as
         * [BeneficialOwnerService.create].
         */
        @MustBeClosed
        fun create(
            params: BeneficialOwnerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerCreateResponse>

        /**
         * Returns a raw HTTP response for `get /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            beneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse> =
            retrieve(
                params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            beneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse> =
            retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerService.update].
         */
        @MustBeClosed
        fun update(
            beneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerUpdateResponse> =
            update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            beneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerUpdateResponse> =
            update(beneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /beneficial-owners`, but is otherwise the same as
         * [BeneficialOwnerService.list].
         */
        @MustBeClosed
        fun list(
            params: BeneficialOwnerListParams = BeneficialOwnerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BeneficialOwnerListPage> =
            list(BeneficialOwnerListParams.none(), requestOptions)
    }
}
