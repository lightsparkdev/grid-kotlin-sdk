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

internal class CredentialVerifyResponseTest {

    @Test
    fun ofAuthSession() {
        val authSession =
            AuthSession.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                .encryptedSessionSigningKey(
                    "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                )
                .build()

        val credentialVerifyResponse = CredentialVerifyResponse.ofAuthSession(authSession)

        assertThat(credentialVerifyResponse.authSession()).isEqualTo(authSession)
        assertThat(credentialVerifyResponse.walletOperationProcessing()).isNull()
    }

    @Test
    fun ofAuthSessionRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialVerifyResponse =
            CredentialVerifyResponse.ofAuthSession(
                AuthSession.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .credentialId(
                        "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                    )
                    .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                    .encryptedSessionSigningKey(
                        "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                    )
                    .build()
            )

        val roundtrippedCredentialVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialVerifyResponse),
                jacksonTypeRef<CredentialVerifyResponse>(),
            )

        assertThat(roundtrippedCredentialVerifyResponse).isEqualTo(credentialVerifyResponse)
    }

    @Test
    fun ofWalletOperationProcessing() {
        val walletOperationProcessing =
            CredentialVerifyResponse.WalletOperationProcessing.builder()
                .status(CredentialVerifyResponse.WalletOperationProcessing.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val credentialVerifyResponse =
            CredentialVerifyResponse.ofWalletOperationProcessing(walletOperationProcessing)

        assertThat(credentialVerifyResponse.authSession()).isNull()
        assertThat(credentialVerifyResponse.walletOperationProcessing())
            .isEqualTo(walletOperationProcessing)
    }

    @Test
    fun ofWalletOperationProcessingRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialVerifyResponse =
            CredentialVerifyResponse.ofWalletOperationProcessing(
                CredentialVerifyResponse.WalletOperationProcessing.builder()
                    .status(CredentialVerifyResponse.WalletOperationProcessing.Status.PROCESSING)
                    .message(
                        "This login is still being processed. Retry the same request in a moment."
                    )
                    .build()
            )

        val roundtrippedCredentialVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialVerifyResponse),
                jacksonTypeRef<CredentialVerifyResponse>(),
            )

        assertThat(roundtrippedCredentialVerifyResponse).isEqualTo(credentialVerifyResponse)
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
        val credentialVerifyResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CredentialVerifyResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { credentialVerifyResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
