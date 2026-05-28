// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailOtpCredentialVerifyRequestTest {

    @Test
    fun create() {
        val emailOtpCredentialVerifyRequest = EmailOtpCredentialVerifyRequest.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailOtpCredentialVerifyRequest = EmailOtpCredentialVerifyRequest.builder().build()

        val roundtrippedEmailOtpCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailOtpCredentialVerifyRequest),
                jacksonTypeRef<EmailOtpCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedEmailOtpCredentialVerifyRequest)
            .isEqualTo(emailOtpCredentialVerifyRequest)
    }
}
