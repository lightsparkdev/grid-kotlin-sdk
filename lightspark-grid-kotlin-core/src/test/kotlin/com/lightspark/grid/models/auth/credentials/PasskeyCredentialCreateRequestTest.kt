// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PasskeyCredentialCreateRequestTest {

    @Test
    fun create() {
        val passkeyCredentialCreateRequest =
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

        assertThat(passkeyCredentialCreateRequest.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(passkeyCredentialCreateRequest.attestation())
            .isEqualTo(
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
        assertThat(passkeyCredentialCreateRequest.challenge())
            .isEqualTo("ArkQi2yAYHPlgnJNFBlneIwchQdWXBOTrdB-AmMUB21Lx")
        assertThat(passkeyCredentialCreateRequest.nickname()).isEqualTo("iPhone Face-ID")
        assertThat(passkeyCredentialCreateRequest.type())
            .isEqualTo(PasskeyCredentialCreateRequestFields.Type.PASSKEY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passkeyCredentialCreateRequest =
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

        val roundtrippedPasskeyCredentialCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passkeyCredentialCreateRequest),
                jacksonTypeRef<PasskeyCredentialCreateRequest>(),
            )

        assertThat(roundtrippedPasskeyCredentialCreateRequest)
            .isEqualTo(passkeyCredentialCreateRequest)
    }
}
