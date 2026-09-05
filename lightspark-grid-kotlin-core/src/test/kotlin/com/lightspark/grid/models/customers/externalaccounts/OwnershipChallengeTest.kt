// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class OwnershipChallengeTest {

    @Test
    fun ofWalletSignature() {
        val walletSignature =
            OwnershipChallenge.WalletSignature.builder()
                .expiresAt(OffsetDateTime.parse("2025-08-15T15:32:00Z"))
                .messageToSign("I verify that I control this wallet. Nonce: 019542f5-b3e7-1d02")
                .build()

        val ownershipChallenge = OwnershipChallenge.ofWalletSignature(walletSignature)

        assertThat(ownershipChallenge.walletSignature()).isEqualTo(walletSignature)
        assertThat(ownershipChallenge.liveness()).isNull()
    }

    @Test
    fun ofWalletSignatureRoundtrip() {
        val jsonMapper = jsonMapper()
        val ownershipChallenge =
            OwnershipChallenge.ofWalletSignature(
                OwnershipChallenge.WalletSignature.builder()
                    .expiresAt(OffsetDateTime.parse("2025-08-15T15:32:00Z"))
                    .messageToSign("I verify that I control this wallet. Nonce: 019542f5-b3e7-1d02")
                    .build()
            )

        val roundtrippedOwnershipChallenge =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownershipChallenge),
                jacksonTypeRef<OwnershipChallenge>(),
            )

        assertThat(roundtrippedOwnershipChallenge).isEqualTo(ownershipChallenge)
    }

    @Test
    fun ofLiveness() {
        val liveness =
            OwnershipChallenge.Liveness.builder()
                .expiresAt(OffsetDateTime.parse("2025-08-15T15:32:00Z"))
                .verificationLink("https://verify.example.com/session/019542f5-b3e7-1d02")
                .token("eyJhbGciOiJIUzI1NiJ9.example")
                .build()

        val ownershipChallenge = OwnershipChallenge.ofLiveness(liveness)

        assertThat(ownershipChallenge.walletSignature()).isNull()
        assertThat(ownershipChallenge.liveness()).isEqualTo(liveness)
    }

    @Test
    fun ofLivenessRoundtrip() {
        val jsonMapper = jsonMapper()
        val ownershipChallenge =
            OwnershipChallenge.ofLiveness(
                OwnershipChallenge.Liveness.builder()
                    .expiresAt(OffsetDateTime.parse("2025-08-15T15:32:00Z"))
                    .verificationLink("https://verify.example.com/session/019542f5-b3e7-1d02")
                    .token("eyJhbGciOiJIUzI1NiJ9.example")
                    .build()
            )

        val roundtrippedOwnershipChallenge =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownershipChallenge),
                jacksonTypeRef<OwnershipChallenge>(),
            )

        assertThat(roundtrippedOwnershipChallenge).isEqualTo(ownershipChallenge)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val ownershipChallenge =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<OwnershipChallenge>())

        val e = assertThrows<LightsparkGridInvalidDataException> { ownershipChallenge.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
