// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialCreateRequestTest {

    @Test
    fun create() {
        val authCredentialCreateRequest =
            AuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(authCredentialCreateRequest.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(authCredentialCreateRequest._type())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialCreateRequest =
            AuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedAuthCredentialCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialCreateRequest),
                jacksonTypeRef<AuthCredentialCreateRequest>(),
            )

        assertThat(roundtrippedAuthCredentialCreateRequest).isEqualTo(authCredentialCreateRequest)
    }
}
