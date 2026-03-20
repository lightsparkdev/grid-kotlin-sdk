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
                    .country("US")
                    .documentType(DocumentReplaceParams.DocumentType.PASSPORT)
                    .file("Example data".byteInputStream())
                    .documentNumber("A12345678")
                    .side(DocumentReplaceParams.Side.FRONT)
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
                DocumentUploadParams.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentType(DocumentUploadParams.DocumentType.PASSPORT)
                    .file("Example data".byteInputStream())
                    .documentNumber("A12345678")
                    .side(DocumentUploadParams.Side.FRONT)
                    .build()
            )

        response.validate()
    }
}
