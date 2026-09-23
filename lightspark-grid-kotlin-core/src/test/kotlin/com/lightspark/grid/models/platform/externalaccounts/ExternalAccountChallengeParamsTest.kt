// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.models.customers.externalaccounts.OwnershipChallengeRequest
import com.lightspark.grid.models.customers.externalaccounts.OwnershipVerificationMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountChallengeParamsTest {

    @Test
    fun create() {
        ExternalAccountChallengeParams.builder()
            .externalAccountId("externalAccountId")
            .ownershipChallengeRequest(
                OwnershipChallengeRequest.builder()
                    .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountChallengeParams.builder()
                .externalAccountId("externalAccountId")
                .ownershipChallengeRequest(
                    OwnershipChallengeRequest.builder()
                        .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountChallengeParams.builder()
                .externalAccountId("externalAccountId")
                .ownershipChallengeRequest(
                    OwnershipChallengeRequest.builder()
                        .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OwnershipChallengeRequest.builder()
                    .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                    .build()
            )
    }
}
