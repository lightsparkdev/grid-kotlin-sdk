// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentReplaceRequest
import com.lightspark.grid.models.documents.DocumentType
import com.lightspark.grid.models.documents.DocumentUploadRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceAsyncTest {

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
        val documentServiceAsync = client.documents()

        val document = documentServiceAsync.retrieve("documentId")

        document.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val documentServiceAsync = client.documents()

        val page = documentServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val documentServiceAsync = client.documents()

        documentServiceAsync.delete("documentId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun replace() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.replace(
                DocumentReplaceParams.builder()
                    .documentId("documentId")
                    .documentReplaceRequest(
                        DocumentReplaceRequest.builder()
                            .country("US")
                            .documentType(DocumentType.PASSPORT)
                            .file("Example data")
                            .documentNumber("A12345678")
                            .issuingAuthority("U.S. Department of State")
                            .side(DocumentReplaceRequest.Side.FRONT)
                            .build()
                    )
                    .build()
            )

        document.validate()
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
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.upload(
                DocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentType(DocumentType.PASSPORT)
                    .file("Example data")
                    .documentNumber("A12345678")
                    .issuingAuthority("U.S. Department of State")
                    .side(DocumentUploadRequest.Side.FRONT)
                    .build()
            )

        document.validate()
    }
}
