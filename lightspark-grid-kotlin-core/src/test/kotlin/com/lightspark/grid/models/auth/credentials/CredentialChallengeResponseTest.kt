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
    fun ofAuthMethod() {
        val authMethod =
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

        val credentialChallengeResponse = CredentialChallengeResponse.ofAuthMethod(authMethod)

        assertThat(credentialChallengeResponse.authMethod()).isEqualTo(authMethod)
        assertThat(credentialChallengeResponse.passkeyAuthChallenge()).isNull()
        assertThat(credentialChallengeResponse.walletOperationProcessing()).isNull()
    }

    @Test
    fun ofAuthMethodRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialChallengeResponse =
            CredentialChallengeResponse.ofAuthMethod(
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

        val roundtrippedCredentialChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialChallengeResponse),
                jacksonTypeRef<CredentialChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialChallengeResponse).isEqualTo(credentialChallengeResponse)
    }

    @Test
    fun ofPasskeyAuthChallenge() {
        val passkeyAuthChallenge =
            PasskeyAuthChallenge.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .challenge("6b35a4c41d9aa7a2a0e742f9f9e7a1c2d65a2db33a3fb748f6d4f1ce78d9a729")
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        val credentialChallengeResponse =
            CredentialChallengeResponse.ofPasskeyAuthChallenge(passkeyAuthChallenge)

        assertThat(credentialChallengeResponse.authMethod()).isNull()
        assertThat(credentialChallengeResponse.passkeyAuthChallenge())
            .isEqualTo(passkeyAuthChallenge)
        assertThat(credentialChallengeResponse.walletOperationProcessing()).isNull()
    }

    @Test
    fun ofPasskeyAuthChallengeRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialChallengeResponse =
            CredentialChallengeResponse.ofPasskeyAuthChallenge(
                PasskeyAuthChallenge.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .credentialId(
                        "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                    )
                    .challenge("6b35a4c41d9aa7a2a0e742f9f9e7a1c2d65a2db33a3fb748f6d4f1ce78d9a729")
                    .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
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

        assertThat(credentialChallengeResponse.authMethod()).isNull()
        assertThat(credentialChallengeResponse.passkeyAuthChallenge()).isNull()
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
