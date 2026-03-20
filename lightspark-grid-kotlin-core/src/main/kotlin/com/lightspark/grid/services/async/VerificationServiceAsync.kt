// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.verifications.VerificationListPageAsync
import com.lightspark.grid.models.verifications.VerificationListParams
import com.lightspark.grid.models.verifications.VerificationRetrieveParams
import com.lightspark.grid.models.verifications.VerificationRetrieveResponse
import com.lightspark.grid.models.verifications.VerificationSubmitParams
import com.lightspark.grid.models.verifications.VerificationSubmitResponse

/**
 * Endpoints for Know Your Customer (KYC) and Know Your Business (KYB) verification, including
 * managing beneficial owners and triggering verification for customers.
 */
interface VerificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VerificationServiceAsync

    /** Retrieve details of a specific verification by ID. */
    suspend fun retrieve(
        verificationId: String,
        params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse =
        retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        verificationId: String,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

    /** Retrieve a list of verifications with optional filtering by customer ID and status. */
    suspend fun list(
        params: VerificationListParams = VerificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): VerificationListPageAsync =
        list(VerificationListParams.none(), requestOptions)

    /**
     * Trigger KYC (individual) or KYB (business) verification for a customer. The response
     * indicates whether all required information has been provided. If data is missing, the
     * `errors` array describes exactly what needs to be supplied before verification can proceed.
     *
     * Call this endpoint again after resolving errors to re-submit.
     */
    suspend fun submit(
        params: VerificationSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationSubmitResponse

    /**
     * A view of [VerificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/{verificationId}`, but is otherwise
         * the same as [VerificationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            verificationId: String,
            params: VerificationRetrieveParams = VerificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(params.toBuilder().verificationId(verificationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            verificationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRetrieveResponse> =
            retrieve(verificationId, VerificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verifications`, but is otherwise the same as
         * [VerificationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: VerificationListParams = VerificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerificationListPageAsync> =
            list(VerificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verifications`, but is otherwise the same as
         * [VerificationServiceAsync.submit].
         */
        @MustBeClosed
        suspend fun submit(
            params: VerificationSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationSubmitResponse>
    }
}
