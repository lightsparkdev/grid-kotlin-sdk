// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.verifications.VerificationListPage
import com.lightspark.grid.models.verifications.VerificationListParams
import com.lightspark.grid.models.verifications.VerificationRetrieveParams
import com.lightspark.grid.models.verifications.VerificationRetrieveResponse
import com.lightspark.grid.models.verifications.VerificationSubmitParams
import com.lightspark.grid.models.verifications.VerificationSubmitResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
interface VerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VerificationService

    /** Retrieve details of a specific verification by ID. */
    fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse =
        retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        verificationId: String,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

    /** Retrieve a list of verifications with optional filtering by customer ID and status. */
    fun list(
        params: VerificationListParams = VerificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): VerificationListPage =
        list(VerificationListParams.none(), requestOptions)

    /**
     * Trigger KYC (individual) or KYB (business) verification for a customer. The response
     * indicates whether all required information has been provided. If data is missing, the
     * `errors` array describes exactly what needs to be supplied before verification can proceed.
     *
     * Call this endpoint again after resolving errors to re-submit.
     */
    fun submit(
        params: VerificationSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationSubmitResponse

    /**
     * A view of [VerificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VerificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/{verificationId}`, but is otherwise
         * the same as [VerificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verifications`, but is otherwise the same as
         * [VerificationService.list].
         */
        @MustBeClosed
        fun list(
            params: VerificationListParams = VerificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VerificationListPage> =
            list(VerificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verifications`, but is otherwise the same as
         * [VerificationService.submit].
         */
        @MustBeClosed
        fun submit(
            params: VerificationSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationSubmitResponse>
    }
}
