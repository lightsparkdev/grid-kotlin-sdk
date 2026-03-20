// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.verifications.VerificationSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationServiceAsync = client.verifications()

        val verification = verificationServiceAsync.retrieve("verificationId")

        verification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationServiceAsync = client.verifications()

        val page = verificationServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun submit() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationServiceAsync = client.verifications()

        val response =
            verificationServiceAsync.submit(
                VerificationSubmitParams.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )

        response.validate()
    }
}
