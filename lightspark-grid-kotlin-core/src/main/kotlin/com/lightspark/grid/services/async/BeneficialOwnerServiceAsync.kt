// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListPageAsync
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerRetrieveResponse
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
interface BeneficialOwnerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BeneficialOwnerServiceAsync

    /**
     * Add a beneficial owner, director, or company officer to a business customer. The beneficial
     * owner will go through KYC verification automatically.
     */
    suspend fun create(
        params: BeneficialOwnerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerCreateResponse

    /** Retrieve details of a specific beneficial owner by ID. */
    suspend fun retrieve(
        beneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerRetrieveResponse =
        retrieve(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        beneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): BeneficialOwnerRetrieveResponse =
        retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update details of a specific beneficial owner. Only provided fields are updated. */
    suspend fun update(
        beneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerUpdateResponse =
        update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerUpdateResponse

    /** @see update */
    suspend fun update(
        beneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): BeneficialOwnerUpdateResponse =
        update(beneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

    /** Retrieve a list of beneficial owners for a business customer. */
    suspend fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPageAsync

    /**
     * A view of [BeneficialOwnerServiceAsync] that provides access to raw HTTP responses for each
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
        ): BeneficialOwnerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /beneficial-owners`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BeneficialOwnerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerCreateResponse>

        /**
         * Returns a raw HTTP response for `get /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
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
        suspend fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            beneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerRetrieveResponse> =
            retrieve(beneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /beneficial-owners/{beneficialOwnerId}`, but is
         * otherwise the same as [BeneficialOwnerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            beneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerUpdateResponse> =
            update(params.toBuilder().beneficialOwnerId(beneficialOwnerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            beneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerUpdateResponse> =
            update(beneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /beneficial-owners`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPageAsync>
    }
}
