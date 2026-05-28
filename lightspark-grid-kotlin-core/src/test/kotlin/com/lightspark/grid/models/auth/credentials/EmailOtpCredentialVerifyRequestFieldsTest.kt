// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailOtpCredentialVerifyRequestFieldsTest {

    @Test
    fun create() {
        val emailOtpCredentialVerifyRequestFields =
            EmailOtpCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .otp("123456")
                .type(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
                .build()

        assertThat(emailOtpCredentialVerifyRequestFields.clientPublicKey())
            .isEqualTo(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
        assertThat(emailOtpCredentialVerifyRequestFields.otp()).isEqualTo("123456")
        assertThat(emailOtpCredentialVerifyRequestFields.type())
            .isEqualTo(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailOtpCredentialVerifyRequestFields =
            EmailOtpCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .otp("123456")
                .type(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
                .build()

        val roundtrippedEmailOtpCredentialVerifyRequestFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailOtpCredentialVerifyRequestFields),
                jacksonTypeRef<EmailOtpCredentialVerifyRequestFields>(),
            )

        assertThat(roundtrippedEmailOtpCredentialVerifyRequestFields)
            .isEqualTo(emailOtpCredentialVerifyRequestFields)
    }
}
