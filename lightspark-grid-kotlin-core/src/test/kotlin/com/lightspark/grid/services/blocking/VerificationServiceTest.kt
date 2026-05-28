// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.verifications.VerificationSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationService = client.verifications()

        val verification = verificationService.retrieve("verificationId")

        verification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationService = client.verifications()

        val page = verificationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val verificationService = client.verifications()

        val response =
            verificationService.submit(
                VerificationSubmitParams.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )

        response.validate()
    }
}
