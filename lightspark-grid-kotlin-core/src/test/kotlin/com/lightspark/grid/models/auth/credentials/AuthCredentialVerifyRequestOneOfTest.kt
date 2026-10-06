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
    fun ofEmailOtp() {
        val emailOtp =
            EmailOtpCredentialVerifyRequest.builder()
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .type(EmailOtpCredentialVerifyRequest.Type.EMAIL_OTP)
                .build()

        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.ofEmailOtp(emailOtp)

        assertThat(authCredentialVerifyRequestOneOf.emailOtp()).isEqualTo(emailOtp)
        assertThat(authCredentialVerifyRequestOneOf.smsOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.oauth()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.passkey()).isNull()
    }

    @Test
    fun ofEmailOtpRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofEmailOtp(
                EmailOtpCredentialVerifyRequest.builder()
                    .encryptedOtpBundle(
                        "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                    )
                    .type(EmailOtpCredentialVerifyRequest.Type.EMAIL_OTP)
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
    fun ofSmsOtp() {
        val smsOtp =
            AuthCredentialVerifyRequestOneOf.SmsOtp.builder()
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .build()

        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.ofSmsOtp(smsOtp)

        assertThat(authCredentialVerifyRequestOneOf.emailOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.smsOtp()).isEqualTo(smsOtp)
        assertThat(authCredentialVerifyRequestOneOf.oauth()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.passkey()).isNull()
    }

    @Test
    fun ofSmsOtpRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofSmsOtp(
                AuthCredentialVerifyRequestOneOf.SmsOtp.builder()
                    .encryptedOtpBundle(
                        "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                    )
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
    fun ofOAuth() {
        val oauth =
            OAuthCredentialVerifyRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                )
                .type(OAuthCredentialVerifyRequest.Type.OAUTH)
                .build()

        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.ofOAuth(oauth)

        assertThat(authCredentialVerifyRequestOneOf.emailOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.smsOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.oauth()).isEqualTo(oauth)
        assertThat(authCredentialVerifyRequestOneOf.passkey()).isNull()
    }

    @Test
    fun ofOAuthRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofOAuth(
                OAuthCredentialVerifyRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .oidcToken(
                        "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                    )
                    .type(OAuthCredentialVerifyRequest.Type.OAUTH)
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
    fun ofPasskey() {
        val passkey =
            PasskeyCredentialVerifyRequest.builder()
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
                .type(PasskeyCredentialVerifyRequest.Type.PASSKEY)
                .build()

        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.ofPasskey(passkey)

        assertThat(authCredentialVerifyRequestOneOf.emailOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.smsOtp()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.oauth()).isNull()
        assertThat(authCredentialVerifyRequestOneOf.passkey()).isEqualTo(passkey)
    }

    @Test
    fun ofPasskeyRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.ofPasskey(
                PasskeyCredentialVerifyRequest.builder()
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
                    .type(PasskeyCredentialVerifyRequest.Type.PASSKEY)
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
