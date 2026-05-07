// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailOtpCredentialCreateRequestFieldsTest {

    @Test
    fun create() {
        val emailOtpCredentialCreateRequestFields =
            EmailOtpCredentialCreateRequestFields.builder()
                .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
                .build()

        assertThat(emailOtpCredentialCreateRequestFields.type())
            .isEqualTo(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailOtpCredentialCreateRequestFields =
            EmailOtpCredentialCreateRequestFields.builder()
                .type(EmailOtpCredentialCreateRequestFields.Type.EMAIL_OTP)
                .build()

        val roundtrippedEmailOtpCredentialCreateRequestFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailOtpCredentialCreateRequestFields),
                jacksonTypeRef<EmailOtpCredentialCreateRequestFields>(),
            )

        assertThat(roundtrippedEmailOtpCredentialCreateRequestFields)
            .isEqualTo(emailOtpCredentialCreateRequestFields)
    }
}
