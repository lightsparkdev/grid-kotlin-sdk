// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnershipChallengeRequestTest {

    @Test
    fun create() {
        val ownershipChallengeRequest =
            OwnershipChallengeRequest.builder()
                .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                .build()

        assertThat(ownershipChallengeRequest.method())
            .isEqualTo(OwnershipVerificationMethod.WALLET_SIGNATURE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ownershipChallengeRequest =
            OwnershipChallengeRequest.builder()
                .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                .build()

        val roundtrippedOwnershipChallengeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownershipChallengeRequest),
                jacksonTypeRef<OwnershipChallengeRequest>(),
            )

        assertThat(roundtrippedOwnershipChallengeRequest).isEqualTo(ownershipChallengeRequest)
    }
}
