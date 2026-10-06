// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialCreateResponseTest {

    @Test
    fun create() {
        val credentialCreateResponse =
            CredentialCreateResponse.builder()
                .status(CredentialCreateResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        assertThat(credentialCreateResponse.status())
            .isEqualTo(CredentialCreateResponse.Status.PROCESSING)
        assertThat(credentialCreateResponse.message())
            .isEqualTo("This login is still being processed. Retry the same request in a moment.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialCreateResponse =
            CredentialCreateResponse.builder()
                .status(CredentialCreateResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val roundtrippedCredentialCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialCreateResponse),
                jacksonTypeRef<CredentialCreateResponse>(),
            )

        assertThat(roundtrippedCredentialCreateResponse).isEqualTo(credentialCreateResponse)
    }
}
