// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRefreshResponseTest {

    @Test
    fun create() {
        val sessionRefreshResponse =
            SessionRefreshResponse.builder()
                .status(SessionRefreshResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        assertThat(sessionRefreshResponse.status())
            .isEqualTo(SessionRefreshResponse.Status.PROCESSING)
        assertThat(sessionRefreshResponse.message())
            .isEqualTo("This login is still being processed. Retry the same request in a moment.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionRefreshResponse =
            SessionRefreshResponse.builder()
                .status(SessionRefreshResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val roundtrippedSessionRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionRefreshResponse),
                jacksonTypeRef<SessionRefreshResponse>(),
            )

        assertThat(roundtrippedSessionRefreshResponse).isEqualTo(sessionRefreshResponse)
    }
}
