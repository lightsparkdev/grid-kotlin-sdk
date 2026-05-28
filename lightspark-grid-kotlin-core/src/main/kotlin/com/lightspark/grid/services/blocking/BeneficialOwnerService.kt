// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.BeneficialOwner
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateRequest
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListPage
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateParams

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
    ): BeneficialOwner

    /** @see create */
    fun create(
        beneficialOwnerCreateRequest: BeneficialOwnerCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwner =
        create(
            BeneficialOwnerCreateParams.builder()
                .beneficialOwnerCreateRequest(beneficialOwnerCreateRequest)
                .build(),
            requestOptions,
        )

    /** Retrieve details of a specific beneficial owner by ID. */
    fun retrieve(
        beneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwner =
        retrieve(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwner

    /** @see retrieve */
    fun retrieve(beneficialOwnerId: String, requestOptions: RequestOptions): BeneficialOwner =
        retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update details of a specific beneficial owner. Only provided fields are updated. */
    fun update(
        beneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwner =
        update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see update */
    fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwner

    /** Retrieve a list of beneficial owners for a business customer. */
    fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPage

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
        ): HttpResponseFor<BeneficialOwner>

        /** @see create */
        @MustBeClosed
        fun create(
            beneficialOwnerCreateRequest: BeneficialOwnerCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwner> =
            create(
                BeneficialOwnerCreateParams.builder()
                    .beneficialOwnerCreateRequest(beneficialOwnerCreateRequest)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            beneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwner> =
            retrieve(
                params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwner>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            beneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwner> =
            retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerService.update].
         */
        @MustBeClosed
        fun update(
            beneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwner> =
            update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwner>

        /**
         * Returns a raw HTTP response for `get /beneficial-owners`, but is otherwise the same as
         * [BeneficialOwnerService.list].
         */
        @MustBeClosed
        fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPage>
    }
}
