// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionDeleteResponseTest {

    @Test
    fun create() {
        val sessionDeleteResponse =
            SessionDeleteResponse.builder()
                .status(SessionDeleteResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        assertThat(sessionDeleteResponse.status())
            .isEqualTo(SessionDeleteResponse.Status.PROCESSING)
        assertThat(sessionDeleteResponse.message())
            .isEqualTo("This login is still being processed. Retry the same request in a moment.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionDeleteResponse =
            SessionDeleteResponse.builder()
                .status(SessionDeleteResponse.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val roundtrippedSessionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionDeleteResponse),
                jacksonTypeRef<SessionDeleteResponse>(),
            )

        assertThat(roundtrippedSessionDeleteResponse).isEqualTo(sessionDeleteResponse)
    }
}
