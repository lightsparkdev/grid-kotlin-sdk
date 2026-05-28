// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialVerifyRequestTest {

    @Test
    fun create() {
        val authCredentialVerifyRequest =
            AuthCredentialVerifyRequest.builder().type(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(authCredentialVerifyRequest._type())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequest =
            AuthCredentialVerifyRequest.builder().type(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedAuthCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequest),
                jacksonTypeRef<AuthCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequest).isEqualTo(authCredentialVerifyRequest)
    }
}
