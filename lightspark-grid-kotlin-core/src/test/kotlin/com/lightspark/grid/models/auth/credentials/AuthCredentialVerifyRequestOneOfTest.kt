// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AuthCredentialVerifyRequestOneOfTest {

    @Test
    fun ofEmailOtpCredentialVerifyRequestFields() {
        val emailOtpCredentialVerifyRequestFields =
            EmailOtpCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .otp("123456")
                .type(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
                .build()

        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofEmailOtpCredentialVerifyRequestFields(
                emailOtpCredentialVerifyRequestFields
            )

        assertThat(authCredentialVerifyRequestOneOf.emailOtpCredentialVerifyRequestFields())
            .isEqualTo(emailOtpCredentialVerifyRequestFields)
        assertThat(authCredentialVerifyRequestOneOf.oauthCredentialVerifyRequestFields()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.passkeyCredentialVerifyRequestFields()).isNull()
    }

    @Test
    fun ofEmailOtpCredentialVerifyRequestFieldsRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofEmailOtpCredentialVerifyRequestFields(
                EmailOtpCredentialVerifyRequestFields.builder()
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .otp("123456")
                    .type(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
                    .build()
            )

        val roundtrippedAuthCredentialVerifyRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequestOneOf),
                jacksonTypeRef<AuthCredentialVerifyRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequestOneOf)
            .isEqualTo(authCredentialVerifyRequestOneOf)
    }

    @Test
    fun ofOAuthCredentialVerifyRequestFields() {
        val oauthCredentialVerifyRequestFields =
            OAuthCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialVerifyRequestFields.Type.OAUTH)
                .build()

        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofOAuthCredentialVerifyRequestFields(
                oauthCredentialVerifyRequestFields
            )

        assertThat(authCredentialVerifyRequestOneOf.emailOtpCredentialVerifyRequestFields())
            .isNull()
        assertThat(authCredentialVerifyRequestOneOf.oauthCredentialVerifyRequestFields())
            .isEqualTo(oauthCredentialVerifyRequestFields)
        assertThat(authCredentialVerifyRequestOneOf.passkeyCredentialVerifyRequestFields()).isNull()
    }

    @Test
    fun ofOAuthCredentialVerifyRequestFieldsRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofOAuthCredentialVerifyRequestFields(
                OAuthCredentialVerifyRequestFields.builder()
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .oidcToken(
                        "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                    )
                    .type(OAuthCredentialVerifyRequestFields.Type.OAUTH)
                    .build()
            )

        val roundtrippedAuthCredentialVerifyRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequestOneOf),
                jacksonTypeRef<AuthCredentialVerifyRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequestOneOf)
            .isEqualTo(authCredentialVerifyRequestOneOf)
    }

    @Test
    fun ofPasskeyCredentialVerifyRequestFields() {
        val passkeyCredentialVerifyRequestFields =
            PasskeyCredentialVerifyRequestFields.builder()
                .assertion(
                    PasskeyAssertion.builder()
                        .authenticatorData("PdxHEOnAiLIp26idVjIguzn3Ipr_RlsKZWsa-5qK-KABAAAAkA")
                        .clientDataJson(
                            "eyJjaGFsbGVuZ2UiOiJkRzkwWVd4c2VWVnVhWEYxWlZaaGJIVmxSWFpsY25sVWFXMWwiLCJjbGllbnRFeHRlbnNpb25zIjp7fSwiaGFzaEFsZ29yaXRobSI6IlNIQS0yNTYiLCJvcmlnaW4iOiJodHRwczovL2Rldi5kb250bmVlZGEucHciLCJ0eXBlIjoid2ViYXV0aG4uZ2V0In0"
                        )
                        .credentialId(
                            "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                        )
                        .signature(
                            "MEUCIQDYXBOpCWSWq2Ll4558GJKD2RoWg958lvJSB_GdeokxogIgWuEVQ7ee6AswQY0OsuQ6y8Ks6jhd45bDx92wjXKs900"
                        )
                        .userHandle("dXNlci1oYW5kbGUtZXhhbXBsZQ")
                        .build()
                )
                .type(PasskeyCredentialVerifyRequestFields.Type.PASSKEY)
                .build()

        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofPasskeyCredentialVerifyRequestFields(
                passkeyCredentialVerifyRequestFields
            )

        assertThat(authCredentialVerifyRequestOneOf.emailOtpCredentialVerifyRequestFields())
            .isNull()
        assertThat(authCredentialVerifyRequestOneOf.oauthCredentialVerifyRequestFields()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.passkeyCredentialVerifyRequestFields())
            .isEqualTo(passkeyCredentialVerifyRequestFields)
    }

    @Test
    fun ofPasskeyCredentialVerifyRequestFieldsRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofPasskeyCredentialVerifyRequestFields(
                PasskeyCredentialVerifyRequestFields.builder()
                    .assertion(
                        PasskeyAssertion.builder()
                            .authenticatorData("PdxHEOnAiLIp26idVjIguzn3Ipr_RlsKZWsa-5qK-KABAAAAkA")
                            .clientDataJson(
                                "eyJjaGFsbGVuZ2UiOiJkRzkwWVd4c2VWVnVhWEYxWlZaaGJIVmxSWFpsY25sVWFXMWwiLCJjbGllbnRFeHRlbnNpb25zIjp7fSwiaGFzaEFsZ29yaXRobSI6IlNIQS0yNTYiLCJvcmlnaW4iOiJodHRwczovL2Rldi5kb250bmVlZGEucHciLCJ0eXBlIjoid2ViYXV0aG4uZ2V0In0"
                            )
                            .credentialId(
                                "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                            )
                            .signature(
                                "MEUCIQDYXBOpCWSWq2Ll4558GJKD2RoWg958lvJSB_GdeokxogIgWuEVQ7ee6AswQY0OsuQ6y8Ks6jhd45bDx92wjXKs900"
                            )
                            .userHandle("dXNlci1oYW5kbGUtZXhhbXBsZQ")
                            .build()
                    )
                    .type(PasskeyCredentialVerifyRequestFields.Type.PASSKEY)
                    .build()
            )

        val roundtrippedAuthCredentialVerifyRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequestOneOf),
                jacksonTypeRef<AuthCredentialVerifyRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequestOneOf)
            .isEqualTo(authCredentialVerifyRequestOneOf)
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
        val authCredentialVerifyRequestOneOf =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<AuthCredentialVerifyRequestOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                authCredentialVerifyRequestOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
