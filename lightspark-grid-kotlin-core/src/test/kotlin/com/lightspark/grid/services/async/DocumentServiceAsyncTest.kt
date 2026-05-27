// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentUploadParams
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
                .build()
        val documentServiceAsync = client.documents()

        val response =
            documentServiceAsync.replace(
                DocumentReplaceParams.builder()
                    .documentId("documentId")
                    .body(
                        DocumentReplaceParams.Body.IdentityDocumentReplaceRequest.builder()
                            .country("US")
                            .documentNumber("A12345678")
                            .documentType(
                                DocumentReplaceParams.Body.IdentityDocumentReplaceRequest
                                    .DocumentType
                                    .PASSPORT
                            )
                            .file("Example data".byteInputStream())
                            .issuingAuthority("U.S. Department of State")
                            .side(
                                DocumentReplaceParams.Body.IdentityDocumentReplaceRequest.Side.FRONT
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun upload() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentServiceAsync = client.documents()

        val response =
            documentServiceAsync.upload(
                DocumentUploadParams.Body.IdentityDocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentNumber("A12345678")
                    .documentType(
                        DocumentUploadParams.Body.IdentityDocumentUploadRequest.DocumentType
                            .PASSPORT
                    )
                    .file("Example data".byteInputStream())
                    .issuingAuthority("U.S. Department of State")
                    .side(DocumentUploadParams.Body.IdentityDocumentUploadRequest.Side.FRONT)
                    .build()
            )

        response.validate()
    }
}
