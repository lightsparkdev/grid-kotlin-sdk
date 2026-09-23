// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnershipVerifyRequestTest {

    @Test
    fun create() {
        val ownershipVerifyRequest =
            OwnershipVerifyRequest.builder()
                .signature("0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c")
                .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                .build()

        assertThat(ownershipVerifyRequest.signature())
            .isEqualTo("0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c")
        assertThat(ownershipVerifyRequest.signatureScheme())
            .isEqualTo(OwnershipVerifyRequest.SignatureScheme.BIP137)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ownershipVerifyRequest =
            OwnershipVerifyRequest.builder()
                .signature("0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c")
                .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                .build()

        val roundtrippedOwnershipVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownershipVerifyRequest),
                jacksonTypeRef<OwnershipVerifyRequest>(),
            )

        assertThat(roundtrippedOwnershipVerifyRequest).isEqualTo(ownershipVerifyRequest)
    }
}
