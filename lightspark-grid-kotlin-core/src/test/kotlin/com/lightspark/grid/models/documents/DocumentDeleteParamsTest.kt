// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentDeleteParamsTest {

    @Test
    fun create() {
        DocumentDeleteParams.builder().documentId("documentId").build()
    }

    @Test
    fun pathParams() {
        val params = DocumentDeleteParams.builder().documentId("documentId").build()

        assertThat(params._pathParam(0)).isEqualTo("documentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
