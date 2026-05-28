// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationErrorTest {

    @Test
    fun create() {
        val verificationError =
            VerificationError.builder()
                .reason("Business address line 1 is required")
                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .type(VerificationError.Type.MISSING_FIELD)
                .addAcceptedDocumentType(VerificationError.AcceptedDocumentType.PASSPORT)
                .field("customer.address.line1")
                .build()

        assertThat(verificationError.reason()).isEqualTo("Business address line 1 is required")
        assertThat(verificationError.resourceId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(verificationError.type()).isEqualTo(VerificationError.Type.MISSING_FIELD)
        assertThat(verificationError.acceptedDocumentTypes())
            .containsExactly(VerificationError.AcceptedDocumentType.PASSPORT)
        assertThat(verificationError.field()).isEqualTo("customer.address.line1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationError =
            VerificationError.builder()
                .reason("Business address line 1 is required")
                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .type(VerificationError.Type.MISSING_FIELD)
                .addAcceptedDocumentType(VerificationError.AcceptedDocumentType.PASSPORT)
                .field("customer.address.line1")
                .build()

        val roundtrippedVerificationError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationError),
                jacksonTypeRef<VerificationError>(),
            )

        assertThat(roundtrippedVerificationError).isEqualTo(verificationError)
    }
}
