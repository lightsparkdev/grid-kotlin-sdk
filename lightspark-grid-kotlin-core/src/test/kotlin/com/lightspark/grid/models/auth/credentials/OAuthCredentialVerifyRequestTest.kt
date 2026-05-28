// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialVerifyRequestTest {

    @Test
    fun create() {
        val oauthCredentialVerifyRequest = OAuthCredentialVerifyRequest.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialVerifyRequest = OAuthCredentialVerifyRequest.builder().build()

        val roundtrippedOAuthCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialVerifyRequest),
                jacksonTypeRef<OAuthCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedOAuthCredentialVerifyRequest).isEqualTo(oauthCredentialVerifyRequest)
    }
}
