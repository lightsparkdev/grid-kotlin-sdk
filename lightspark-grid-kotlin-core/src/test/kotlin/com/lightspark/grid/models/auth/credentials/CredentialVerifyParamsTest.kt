// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialVerifyParamsTest {

    @Test
    fun create() {
        CredentialVerifyParams.builder()
            .id("id")
            .gridWalletSignature(
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
            )
            .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .authCredentialVerifyRequest(
                AuthCredentialVerifyRequestOneOf.builder()
                    .type(JsonValue.from("SMS_OTP"))
                    .encryptedOtpBundle(
                        "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(
                    AuthCredentialVerifyRequestOneOf.builder()
                        .type(JsonValue.from("SMS_OTP"))
                        .encryptedOtpBundle(
                            "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialVerifyRequest(
                    AuthCredentialVerifyRequestOneOf.builder()
                        .type(JsonValue.from("SMS_OTP"))
                        .encryptedOtpBundle(
                            "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9",
                    )
                    .put("Request-Id", "Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(
                    AuthCredentialVerifyRequestOneOf.builder()
                        .type(JsonValue.from("SMS_OTP"))
                        .encryptedOtpBundle(
                            "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialVerifyRequest(
                    AuthCredentialVerifyRequestOneOf.builder()
                        .type(JsonValue.from("SMS_OTP"))
                        .encryptedOtpBundle(
                            "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthCredentialVerifyRequestOneOf.builder()
                    .type(JsonValue.from("SMS_OTP"))
                    .encryptedOtpBundle(
                        "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(
                    AuthCredentialVerifyRequestOneOf.builder()
                        .type(JsonValue.from("SMS_OTP"))
                        .encryptedOtpBundle(
                            "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthCredentialVerifyRequestOneOf.builder()
                    .type(JsonValue.from("SMS_OTP"))
                    .encryptedOtpBundle(
                        "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                    )
                    .build()
            )
    }
}
