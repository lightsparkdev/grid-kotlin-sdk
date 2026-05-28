// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PasskeyCredentialVerifyRequestFieldsTest {

    @Test
    fun create() {
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

        assertThat(passkeyCredentialVerifyRequestFields.assertion())
            .isEqualTo(
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
        assertThat(passkeyCredentialVerifyRequestFields.type())
            .isEqualTo(PasskeyCredentialVerifyRequestFields.Type.PASSKEY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedPasskeyCredentialVerifyRequestFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passkeyCredentialVerifyRequestFields),
                jacksonTypeRef<PasskeyCredentialVerifyRequestFields>(),
            )

        assertThat(roundtrippedPasskeyCredentialVerifyRequestFields)
            .isEqualTo(passkeyCredentialVerifyRequestFields)
    }
}
