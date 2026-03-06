// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.sandbox.OutgoingTransaction
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import com.lightspark.grid.services.blocking.sandbox.InternalAccountService
import com.lightspark.grid.services.blocking.sandbox.UmaService
import com.lightspark.grid.services.blocking.sandbox.WebhookService

/** Endpoints to trigger test cases in sandbox */
interface SandboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxService

    /** Endpoints to trigger test cases in sandbox */
    fun uma(): UmaService

    /** Endpoints to trigger test cases in sandbox */
    fun internalAccounts(): InternalAccountService

    /** Endpoints to trigger test cases in sandbox */
    fun webhooks(): WebhookService

    /**
     * Simulate sending funds to the bank account as instructed in the quote. This endpoint is only
     * for the sandbox environment and will fail for production platforms/keys.
     */
    fun sendFunds(
        params: SandboxSendFundsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutgoingTransaction

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SandboxService.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun uma(): UmaService.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun internalAccounts(): InternalAccountService.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun webhooks(): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/send`, but is otherwise the same as
         * [SandboxService.sendFunds].
         */
        @MustBeClosed
        fun sendFunds(
            params: SandboxSendFundsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutgoingTransaction>
    }
}
