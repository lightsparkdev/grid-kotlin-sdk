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

internal class CredentialResendChallengeResponseTest {

    @Test
    fun ofAuthMethod() {
        val authMethod =
            AuthMethod.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethod.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.ofAuthMethod(authMethod)

        assertThat(credentialResendChallengeResponse.authMethod()).isEqualTo(authMethod)
        assertThat(credentialResendChallengeResponse.passkeyAuthChallenge()).isNull()
    }

    @Test
    fun ofAuthMethodRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.ofAuthMethod(
                AuthMethod.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethod.Type.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .build()
            )

        val roundtrippedCredentialResendChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialResendChallengeResponse),
                jacksonTypeRef<CredentialResendChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialResendChallengeResponse)
            .isEqualTo(credentialResendChallengeResponse)
    }

    @Test
    fun ofPasskeyAuthChallenge() {
        val passkeyAuthChallenge =
            CredentialResendChallengeResponse.PasskeyAuthChallenge.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethod.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.ofPasskeyAuthChallenge(passkeyAuthChallenge)

        assertThat(credentialResendChallengeResponse.authMethod()).isNull()
        assertThat(credentialResendChallengeResponse.passkeyAuthChallenge())
            .isEqualTo(passkeyAuthChallenge)
    }

    @Test
    fun ofPasskeyAuthChallengeRoundtrip() {
        val jsonMapper = jsonMapper()
        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.ofPasskeyAuthChallenge(
                CredentialResendChallengeResponse.PasskeyAuthChallenge.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethod.Type.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                    .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        val roundtrippedCredentialResendChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialResendChallengeResponse),
                jacksonTypeRef<CredentialResendChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialResendChallengeResponse)
            .isEqualTo(credentialResendChallengeResponse)
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
        val credentialResendChallengeResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<CredentialResendChallengeResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                credentialResendChallengeResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
