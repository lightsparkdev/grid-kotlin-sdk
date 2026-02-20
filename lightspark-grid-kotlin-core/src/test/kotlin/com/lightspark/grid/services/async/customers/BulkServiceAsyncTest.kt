// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.customers

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.customers.bulk.BulkUploadCsvParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getJobStatus() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val bulkServiceAsync = client.customers().bulk()

        val response = bulkServiceAsync.getJobStatus("jobId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadCsv() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val bulkServiceAsync = client.customers().bulk()

        val response =
            bulkServiceAsync.uploadCsv(
                BulkUploadCsvParams.builder().file("some content".byteInputStream()).build()
            )

        response.validate()
    }
}
