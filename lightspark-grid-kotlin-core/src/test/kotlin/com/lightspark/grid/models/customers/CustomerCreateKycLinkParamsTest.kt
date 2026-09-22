// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateKycLinkParamsTest {

    @Test
    fun create() {
        CustomerCreateKycLinkParams.builder()
            .customerId("customerId")
            .kycLinkCreateRequest(
                KycLinkCreateRequest.builder()
                    .redirectUri("https://app.example.com/onboarding/completed")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerCreateKycLinkParams.builder().customerId("customerId").build()

        assertThat(params._pathParam(0)).isEqualTo("customerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerCreateKycLinkParams.builder()
                .customerId("customerId")
                .kycLinkCreateRequest(
                    KycLinkCreateRequest.builder()
                        .redirectUri("https://app.example.com/onboarding/completed")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                KycLinkCreateRequest.builder()
                    .redirectUri("https://app.example.com/onboarding/completed")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateKycLinkParams.builder().customerId("customerId").build()

        val body = params._body()
    }
}
