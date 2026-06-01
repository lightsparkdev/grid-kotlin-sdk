// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiTokenCreateRequestTest {

    @Test
    fun create() {
        val apiTokenCreateRequest =
            ApiTokenCreateRequest.builder()
                .name("Sandbox read-only")
                .addPermission(Permission.VIEW)
                .build()

        assertThat(apiTokenCreateRequest.name()).isEqualTo("Sandbox read-only")
        assertThat(apiTokenCreateRequest.permissions()).containsExactly(Permission.VIEW)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiTokenCreateRequest =
            ApiTokenCreateRequest.builder()
                .name("Sandbox read-only")
                .addPermission(Permission.VIEW)
                .build()

        val roundtrippedApiTokenCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiTokenCreateRequest),
                jacksonTypeRef<ApiTokenCreateRequest>(),
            )

        assertThat(roundtrippedApiTokenCreateRequest).isEqualTo(apiTokenCreateRequest)
    }
}
