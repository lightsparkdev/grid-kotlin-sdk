// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentType
import com.lightspark.grid.models.paymentdocuments.PaymentDocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentDocumentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val paymentDocumentServiceAsync = client.paymentDocuments()

        val paymentDocument =
            paymentDocumentServiceAsync.retrieve(
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001"
            )

        paymentDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun upload() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val paymentDocumentServiceAsync = client.paymentDocuments()

        val paymentDocument =
            paymentDocumentServiceAsync.upload(
                PaymentDocumentUploadParams.builder()
                    .documentType(PaymentDocumentType.INVOICE)
                    .file("Example data".byteInputStream())
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )

        paymentDocument.validate()
    }
}
