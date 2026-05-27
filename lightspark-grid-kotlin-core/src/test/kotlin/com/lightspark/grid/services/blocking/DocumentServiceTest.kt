// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentService = client.documents()

        val document = documentService.retrieve("documentId")

        document.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentService = client.documents()

        val page = documentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentService = client.documents()

        documentService.delete("documentId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentService = client.documents()

        val response =
            documentService.replace(
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
    fun upload() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val documentService = client.documents()

        val response =
            documentService.upload(
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
