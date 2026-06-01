// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenCreateParamsTest {

    @Test
    fun create() {
        TokenCreateParams.builder()
            .apiTokenCreateRequest(
                ApiTokenCreateRequest.builder()
                    .name("Sandbox read-only")
                    .addPermission(Permission.VIEW)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TokenCreateParams.builder()
                .apiTokenCreateRequest(
                    ApiTokenCreateRequest.builder()
                        .name("Sandbox read-only")
                        .addPermission(Permission.VIEW)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ApiTokenCreateRequest.builder()
                    .name("Sandbox read-only")
                    .addPermission(Permission.VIEW)
                    .build()
            )
    }
}
