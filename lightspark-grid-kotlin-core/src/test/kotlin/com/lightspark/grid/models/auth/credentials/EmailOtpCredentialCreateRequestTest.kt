// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailOtpCredentialCreateRequestTest {

    @Test
    fun create() {
        val emailOtpCredentialCreateRequest =
            EmailOtpCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(EmailOtpCredentialCreateRequest.Type.EMAIL_OTP)
                .email("jane.new@example.com")
                .build()

        assertThat(emailOtpCredentialCreateRequest.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(emailOtpCredentialCreateRequest.type())
            .isEqualTo(EmailOtpCredentialCreateRequest.Type.EMAIL_OTP)
        assertThat(emailOtpCredentialCreateRequest.email()).isEqualTo("jane.new@example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailOtpCredentialCreateRequest =
            EmailOtpCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(EmailOtpCredentialCreateRequest.Type.EMAIL_OTP)
                .email("jane.new@example.com")
                .build()

        val roundtrippedEmailOtpCredentialCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailOtpCredentialCreateRequest),
                jacksonTypeRef<EmailOtpCredentialCreateRequest>(),
            )

        assertThat(roundtrippedEmailOtpCredentialCreateRequest)
            .isEqualTo(emailOtpCredentialCreateRequest)
    }
}
