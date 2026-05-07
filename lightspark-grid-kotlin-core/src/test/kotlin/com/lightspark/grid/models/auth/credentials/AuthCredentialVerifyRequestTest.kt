// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialVerifyRequestTest {

    @Test
    fun create() {
        val authCredentialVerifyRequest = AuthCredentialVerifyRequest.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequest = AuthCredentialVerifyRequest.builder().build()

        val roundtrippedAuthCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequest),
                jacksonTypeRef<AuthCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequest).isEqualTo(authCredentialVerifyRequest)
    }
}
