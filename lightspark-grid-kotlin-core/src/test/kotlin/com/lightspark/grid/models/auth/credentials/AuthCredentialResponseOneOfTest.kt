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

internal class AuthCredentialResponseOneOfTest {

    @Test
    fun ofMethodResponse() {
        val methodResponse =
            AuthMethodResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val authCredentialResponseOneOf =
            AuthCredentialResponseOneOf.ofMethodResponse(methodResponse)

        assertThat(authCredentialResponseOneOf.methodResponse()).isEqualTo(methodResponse)
        assertThat(authCredentialResponseOneOf.passkeyAuthChallenge()).isNull()
    }

    @Test
    fun ofMethodResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialResponseOneOf =
            AuthCredentialResponseOneOf.ofMethodResponse(
                AuthMethodResponse.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .build()
            )

        val roundtrippedAuthCredentialResponseOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialResponseOneOf),
                jacksonTypeRef<AuthCredentialResponseOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialResponseOneOf).isEqualTo(authCredentialResponseOneOf)
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
                .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        val authCredentialResponseOneOf =
            AuthCredentialResponseOneOf.ofPasskeyAuthChallenge(passkeyAuthChallenge)

        assertThat(authCredentialResponseOneOf.methodResponse()).isNull()
        assertThat(authCredentialResponseOneOf.passkeyAuthChallenge())
            .isEqualTo(passkeyAuthChallenge)
    }

    @Test
    fun ofPasskeyAuthChallengeRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialResponseOneOf =
            AuthCredentialResponseOneOf.ofPasskeyAuthChallenge(
                PasskeyAuthChallenge.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                    .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        val roundtrippedAuthCredentialResponseOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialResponseOneOf),
                jacksonTypeRef<AuthCredentialResponseOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialResponseOneOf).isEqualTo(authCredentialResponseOneOf)
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
        val authCredentialResponseOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AuthCredentialResponseOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                authCredentialResponseOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
