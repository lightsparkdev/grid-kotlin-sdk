// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCustomerImportErrorEntryTest {

    @Test
    fun create() {
        val bulkCustomerImportErrorEntry =
            BulkCustomerImportErrorEntry.builder()
                .correlationId("biz456")
                .code("code")
                .details(
                    BulkCustomerImportErrorEntry.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(bulkCustomerImportErrorEntry.correlationId()).isEqualTo("biz456")
        assertThat(bulkCustomerImportErrorEntry.code()).isEqualTo("code")
        assertThat(bulkCustomerImportErrorEntry.details())
            .isEqualTo(
                BulkCustomerImportErrorEntry.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(bulkCustomerImportErrorEntry.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkCustomerImportErrorEntry =
            BulkCustomerImportErrorEntry.builder()
                .correlationId("biz456")
                .code("code")
                .details(
                    BulkCustomerImportErrorEntry.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedBulkCustomerImportErrorEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkCustomerImportErrorEntry),
                jacksonTypeRef<BulkCustomerImportErrorEntry>(),
            )

        assertThat(roundtrippedBulkCustomerImportErrorEntry).isEqualTo(bulkCustomerImportErrorEntry)
    }
}
