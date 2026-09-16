// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialVerifyRequestOneOfTest {

    @Test
    fun create() {
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.builder()
                .type(JsonValue.from("SMS_OTP"))
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .build()

        assertThat(authCredentialVerifyRequestOneOf._type()).isEqualTo(JsonValue.from("SMS_OTP"))
        assertThat(authCredentialVerifyRequestOneOf.encryptedOtpBundle())
            .isEqualTo(
                "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf.builder()
                .type(JsonValue.from("SMS_OTP"))
                .encryptedOtpBundle(
                    "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                )
                .build()

        val roundtrippedAuthCredentialVerifyRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequestOneOf),
                jacksonTypeRef<AuthCredentialVerifyRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequestOneOf)
            .isEqualTo(authCredentialVerifyRequestOneOf)
    }
}
