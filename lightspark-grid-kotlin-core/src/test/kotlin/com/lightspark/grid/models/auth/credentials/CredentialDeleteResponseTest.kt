// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialDeleteResponseTest {

    @Test
    fun create() {
        val credentialDeleteResponse =
            CredentialDeleteResponse.builder()
                .status(CredentialDeleteResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        assertThat(credentialDeleteResponse.status())
            .isEqualTo(CredentialDeleteResponse.Status.PROCESSING)
        assertThat(credentialDeleteResponse.message())
            .isEqualTo("This login is still being processed. Retry the same request in a moment.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialDeleteResponse =
            CredentialDeleteResponse.builder()
                .status(CredentialDeleteResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val roundtrippedCredentialDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialDeleteResponse),
                jacksonTypeRef<CredentialDeleteResponse>(),
            )

        assertThat(roundtrippedCredentialDeleteResponse).isEqualTo(credentialDeleteResponse)
    }
}
