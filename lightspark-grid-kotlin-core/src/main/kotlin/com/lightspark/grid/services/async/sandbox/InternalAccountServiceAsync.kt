// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccountFundParams

/** Endpoints to trigger test cases in sandbox */
interface InternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountServiceAsync

    /**
     * Simulate receiving funds into an internal account in the sandbox environment. This is useful
     * for testing scenarios where you need to add funds to a customer's or platform's internal
     * account without going through a real bank transfer or following payment instructions. This
     * endpoint is only for the sandbox environment and will fail for production platforms/keys.
     *
     * ### Funding a rule-based account
     * Funding a `RULE_BASED` account triggers its sweep, exactly as a settled deposit does in
     * production: the balance is swept to the rule's destination and the account is left at zero. A
     * balance outside the corridor band moves to the account holder's own account in the same
     * currency instead, and the transaction fails with `failureReason: SWEEP_AMOUNT_OUT_OF_RANGE` —
     * fund a rule-based account with a very small amount to rehearse that path. Either way the
     * rule-based account is left at zero; it never holds a balance. Sandbox simulates the API
     * contract and the routing decision, not the banking rails. The quote, the corridor bounds, the
     * destination checks and the webhook are all real; the settlement legs behind them are not, so
     * timings and failure modes that originate at a partner bank cannot be reproduced here.
     */
    suspend fun fund(
        accountId: String,
        params: InternalAccountFundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount = fund(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see fund */
    suspend fun fund(
        params: InternalAccountFundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /**
     * A view of [InternalAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): InternalAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/internal-accounts/{accountId}/fund`, but
         * is otherwise the same as [InternalAccountServiceAsync.fund].
         */
        @MustBeClosed
        suspend fun fund(
            accountId: String,
            params: InternalAccountFundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount> =
            fund(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see fund */
        @MustBeClosed
        suspend fun fund(
            params: InternalAccountFundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>
    }
}
