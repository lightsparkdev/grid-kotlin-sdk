// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.customers

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.bulk.BulkUploadCsvParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJobStatus() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val bulkService = client.customers().bulk()

        val response = bulkService.getJobStatus("jobId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadCsv() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val bulkService = client.customers().bulk()

        val response =
            bulkService.uploadCsv(
                BulkUploadCsvParams.builder().file("some content".byteInputStream()).build()
            )

        response.validate()
    }
}
