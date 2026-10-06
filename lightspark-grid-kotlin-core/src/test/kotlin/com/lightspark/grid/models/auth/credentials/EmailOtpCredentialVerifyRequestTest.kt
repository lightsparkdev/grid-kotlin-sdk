// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailOtpCredentialVerifyRequestTest {

    @Test
    fun create() {
        val emailOtpCredentialVerifyRequest =
            EmailOtpCredentialVerifyRequest.builder()
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .type(EmailOtpCredentialVerifyRequest.Type.EMAIL_OTP)
                .build()

        assertThat(emailOtpCredentialVerifyRequest.encryptedOtpBundle())
            .isEqualTo(
                "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
            )
        assertThat(emailOtpCredentialVerifyRequest.type())
            .isEqualTo(EmailOtpCredentialVerifyRequest.Type.EMAIL_OTP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailOtpCredentialVerifyRequest =
            EmailOtpCredentialVerifyRequest.builder()
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .type(EmailOtpCredentialVerifyRequest.Type.EMAIL_OTP)
                .build()

        val roundtrippedEmailOtpCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailOtpCredentialVerifyRequest),
                jacksonTypeRef<EmailOtpCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedEmailOtpCredentialVerifyRequest)
            .isEqualTo(emailOtpCredentialVerifyRequest)
    }
}
