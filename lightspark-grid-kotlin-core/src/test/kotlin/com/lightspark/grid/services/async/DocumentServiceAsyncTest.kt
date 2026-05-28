// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.IdentityDocumentReplaceRequest
import com.lightspark.grid.models.documents.IdentityDocumentType
import com.lightspark.grid.models.documents.IdentityDocumentUploadRequest
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

        val document =
            documentServiceAsync.replace(
                DocumentReplaceParams.builder()
                    .documentId("documentId")
                    .documentReplaceRequest(
                        IdentityDocumentReplaceRequest.builder()
                            .country("US")
                            .documentNumber("A12345678")
                            .documentType(IdentityDocumentType.PASSPORT)
                            .file("Example data")
                            .issuingAuthority("U.S. Department of State")
                            .side(IdentityDocumentReplaceRequest.Side.FRONT)
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
                .build()
        val documentServiceAsync = client.documents()

        val document =
            documentServiceAsync.upload(
                IdentityDocumentUploadRequest.builder()
                    .country("US")
                    .documentHolder("BeneficialOwner:019542f5-b3e7-1d02-0000-000000000001")
                    .documentNumber("A12345678")
                    .documentType(IdentityDocumentType.PASSPORT)
                    .file("Example data")
                    .issuingAuthority("U.S. Department of State")
                    .side(IdentityDocumentUploadRequest.Side.FRONT)
                    .build()
            )

        document.validate()
    }
}
