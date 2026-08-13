// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountVerifyParamsTest {

    @Test
    fun create() {
        ExternalAccountVerifyParams.builder()
            .externalAccountId("externalAccountId")
            .ownershipVerifyRequest(
                OwnershipVerifyRequest.builder()
                    .signature(
                        "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                    )
                    .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountVerifyParams.builder()
                .externalAccountId("externalAccountId")
                .ownershipVerifyRequest(
                    OwnershipVerifyRequest.builder()
                        .signature(
                            "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountVerifyParams.builder()
                .externalAccountId("externalAccountId")
                .ownershipVerifyRequest(
                    OwnershipVerifyRequest.builder()
                        .signature(
                            "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                        )
                        .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OwnershipVerifyRequest.builder()
                    .signature(
                        "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                    )
                    .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountVerifyParams.builder()
                .externalAccountId("externalAccountId")
                .ownershipVerifyRequest(
                    OwnershipVerifyRequest.builder()
                        .signature(
                            "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OwnershipVerifyRequest.builder()
                    .signature(
                        "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                    )
                    .build()
            )
    }
}
