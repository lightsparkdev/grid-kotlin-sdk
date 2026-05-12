// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateInternalAccountParamsTest {

    @Test
    fun create() {
        CustomerUpdateInternalAccountParams.builder()
            .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
            .gridWalletSignature(
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
            )
            .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
            .privateEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerUpdateInternalAccountParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CustomerUpdateInternalAccountParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .privateEnabled(true)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ",
                    )
                    .put("Request-Id", "Request:019542f5-b3e7-1d02-0000-000000000010")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CustomerUpdateInternalAccountParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateInternalAccountParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .privateEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.privateEnabled()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerUpdateInternalAccountParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .build()

        val body = params._body()
    }
}
