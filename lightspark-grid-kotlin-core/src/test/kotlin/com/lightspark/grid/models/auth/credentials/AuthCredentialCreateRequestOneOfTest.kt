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

internal class AuthCredentialCreateRequestOneOfTest {

    @Test
    fun ofEmailOtp() {
        val emailOtp =
            EmailOtpCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
                .build()

        val authCredentialCreateRequestOneOf = AuthCredentialCreateRequestOneOf.ofEmailOtp(emailOtp)

        assertThat(authCredentialCreateRequestOneOf.emailOtp()).isEqualTo(emailOtp)
        assertThat(authCredentialCreateRequestOneOf.oauth()).isNull()
        assertThat(authCredentialCreateRequestOneOf.passkey()).isNull()
    }

    @Test
    fun ofEmailOtpRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialCreateRequestOneOf =
            AuthCredentialCreateRequestOneOf.ofEmailOtp(
                EmailOtpCredentialCreateRequest.builder()
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
                    .build()
            )

        val roundtrippedAuthCredentialCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialCreateRequestOneOf),
                jacksonTypeRef<AuthCredentialCreateRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialCreateRequestOneOf)
            .isEqualTo(authCredentialCreateRequestOneOf)
    }

    @Test
    fun ofOAuth() {
        val oauth =
            OAuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                .build()

        val authCredentialCreateRequestOneOf = AuthCredentialCreateRequestOneOf.ofOAuth(oauth)

        assertThat(authCredentialCreateRequestOneOf.emailOtp()).isNull()
        assertThat(authCredentialCreateRequestOneOf.oauth()).isEqualTo(oauth)
        assertThat(authCredentialCreateRequestOneOf.passkey()).isNull()
    }

    @Test
    fun ofOAuthRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialCreateRequestOneOf =
            AuthCredentialCreateRequestOneOf.ofOAuth(
                OAuthCredentialCreateRequest.builder()
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .oidcToken(
                        "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                    )
                    .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                    .build()
            )

        val roundtrippedAuthCredentialCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialCreateRequestOneOf),
                jacksonTypeRef<AuthCredentialCreateRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialCreateRequestOneOf)
            .isEqualTo(authCredentialCreateRequestOneOf)
    }

    @Test
    fun ofPasskey() {
        val passkey =
            PasskeyCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .attestation(
                    PasskeyAttestation.builder()
                        .attestationObject(
                            "o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVjFPdxHEOnAiLIp26idVjIguzn3Ipr_RlsKZWsa-5qK-KBFAAAAAAAAAAAAAAAAAAAAAAAAAAAAQQHSlyRHIdWleVqO24-6ix7JFWODqDWo_arvEz3Se5EgIFHkcVjZ4F5XDSBreIHsWRilRnKmaaqlqK3V2_4XtYs2pQECAyYgASFYID5PQTZQQg6haZFQWFzqfAOyQ_ENsMH8xxQ4GRiNPsqrIlggU8IVUOV8qpgk_Jh-OTaLuZL52KdX1fTht07X4DiQPow"
                        )
                        .clientDataJson(
                            "eyJjaGFsbGVuZ2UiOiJBcktRaTJ5QVlIUGxnbkpORkJsbmVJd2NoUWRXWEJPVHJkQi1BbU1VQjIxTHgiLCJjbGllbnRFeHRlbnNpb25zIjp7fSwiaGFzaEFsZ29yaXRobSI6IlNIQS0yNTYiLCJvcmlnaW4iOiJodHRwczovL2Rldi5kb250bmVlZGEucHciLCJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIn0"
                        )
                        .credentialId(
                            "AdKXJEch1aV5Wo7bj7qLHskVY4OoNaj9qu8TPdJ7kSAgUeRxWNngXlcNIGt4gexZGKVGcqZpqqWordXb_he1izY"
                        )
                        .addTransport(PasskeyAttestation.Transport.INTERNAL)
                        .addTransport(PasskeyAttestation.Transport.HYBRID)
                        .build()
                )
                .challenge("ArkQi2yAYHPlgnJNFBlneIwchQdWXBOTrdB-AmMUB21Lx")
                .nickname("iPhone Face-ID")
                .type(PasskeyCredentialCreateRequestFields.Type.PASSKEY)
                .build()

        val authCredentialCreateRequestOneOf = AuthCredentialCreateRequestOneOf.ofPasskey(passkey)

        assertThat(authCredentialCreateRequestOneOf.emailOtp()).isNull()
        assertThat(authCredentialCreateRequestOneOf.oauth()).isNull()
        assertThat(authCredentialCreateRequestOneOf.passkey()).isEqualTo(passkey)
    }

    @Test
    fun ofPasskeyRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialCreateRequestOneOf =
            AuthCredentialCreateRequestOneOf.ofPasskey(
                PasskeyCredentialCreateRequest.builder()
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .attestation(
                        PasskeyAttestation.builder()
                            .attestationObject(
                                "o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVjFPdxHEOnAiLIp26idVjIguzn3Ipr_RlsKZWsa-5qK-KBFAAAAAAAAAAAAAAAAAAAAAAAAAAAAQQHSlyRHIdWleVqO24-6ix7JFWODqDWo_arvEz3Se5EgIFHkcVjZ4F5XDSBreIHsWRilRnKmaaqlqK3V2_4XtYs2pQECAyYgASFYID5PQTZQQg6haZFQWFzqfAOyQ_ENsMH8xxQ4GRiNPsqrIlggU8IVUOV8qpgk_Jh-OTaLuZL52KdX1fTht07X4DiQPow"
                            )
                            .clientDataJson(
                                "eyJjaGFsbGVuZ2UiOiJBcktRaTJ5QVlIUGxnbkpORkJsbmVJd2NoUWRXWEJPVHJkQi1BbU1VQjIxTHgiLCJjbGllbnRFeHRlbnNpb25zIjp7fSwiaGFzaEFsZ29yaXRobSI6IlNIQS0yNTYiLCJvcmlnaW4iOiJodHRwczovL2Rldi5kb250bmVlZGEucHciLCJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIn0"
                            )
                            .credentialId(
                                "AdKXJEch1aV5Wo7bj7qLHskVY4OoNaj9qu8TPdJ7kSAgUeRxWNngXlcNIGt4gexZGKVGcqZpqqWordXb_he1izY"
                            )
                            .addTransport(PasskeyAttestation.Transport.INTERNAL)
                            .addTransport(PasskeyAttestation.Transport.HYBRID)
                            .build()
                    )
                    .challenge("ArkQi2yAYHPlgnJNFBlneIwchQdWXBOTrdB-AmMUB21Lx")
                    .nickname("iPhone Face-ID")
                    .type(PasskeyCredentialCreateRequestFields.Type.PASSKEY)
                    .build()
            )

        val roundtrippedAuthCredentialCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialCreateRequestOneOf),
                jacksonTypeRef<AuthCredentialCreateRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialCreateRequestOneOf)
            .isEqualTo(authCredentialCreateRequestOneOf)
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
        val authCredentialCreateRequestOneOf =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<AuthCredentialCreateRequestOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                authCredentialCreateRequestOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
