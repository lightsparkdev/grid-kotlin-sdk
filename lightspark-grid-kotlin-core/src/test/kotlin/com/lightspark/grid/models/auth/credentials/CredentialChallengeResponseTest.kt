// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

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

internal class CredentialChallengeResponseTest {

    @Test
    fun ofAuthCredentialResponseOneOf() {
        val authCredentialResponseOneOf =
            AuthCredentialResponseOneOf.ofMethodResponse(
                AuthMethodResponse.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .credentialId(
                        "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                    )
                    .otpEncryptionTargetBundle(
                        "{\"version\":\"v1.0.0\",\"data\":\"7b227461726765745075626c6963...\",\"dataSignature\":\"30450221...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                    )
                    .build()
            )

        val credentialChallengeResponse =
            CredentialChallengeResponse.ofAuthCredentialResponseOneOf(authCredentialResponseOneOf)

        assertThat(credentialChallengeResponse.authCredentialResponseOneOf())
            .isEqualTo(authCredentialResponseOneOf)
        assertThat(credentialChallengeResponse.walletOperationProcessing()).isNull()
    }

    @Test
    fun ofAuthCredentialResponseOneOfRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialChallengeResponse =
            CredentialChallengeResponse.ofAuthCredentialResponseOneOf(
                AuthCredentialResponseOneOf.ofMethodResponse(
                    AuthMethodResponse.builder()
                        .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(AuthMethodType.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .credentialId(
                            "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                        )
                        .otpEncryptionTargetBundle(
                            "{\"version\":\"v1.0.0\",\"data\":\"7b227461726765745075626c6963...\",\"dataSignature\":\"30450221...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                        )
                        .build()
                )
            )

        val roundtrippedCredentialChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialChallengeResponse),
                jacksonTypeRef<CredentialChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialChallengeResponse).isEqualTo(credentialChallengeResponse)
    }

    @Test
    fun ofWalletOperationProcessing() {
        val walletOperationProcessing =
            CredentialChallengeResponse.WalletOperationProcessing.builder()
                .status(CredentialChallengeResponse.WalletOperationProcessing.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val credentialChallengeResponse =
            CredentialChallengeResponse.ofWalletOperationProcessing(walletOperationProcessing)

        assertThat(credentialChallengeResponse.authCredentialResponseOneOf()).isNull()
        assertThat(credentialChallengeResponse.walletOperationProcessing())
            .isEqualTo(walletOperationProcessing)
    }

    @Test
    fun ofWalletOperationProcessingRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialChallengeResponse =
            CredentialChallengeResponse.ofWalletOperationProcessing(
                CredentialChallengeResponse.WalletOperationProcessing.builder()
                    .status(CredentialChallengeResponse.WalletOperationProcessing.Status.PROCESSING)
                    .message(
                        "This login is still being processed. Retry the same request in a moment."
                    )
                    .build()
            )

        val roundtrippedCredentialChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialChallengeResponse),
                jacksonTypeRef<CredentialChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialChallengeResponse).isEqualTo(credentialChallengeResponse)
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
        val credentialChallengeResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CredentialChallengeResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                credentialChallengeResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
