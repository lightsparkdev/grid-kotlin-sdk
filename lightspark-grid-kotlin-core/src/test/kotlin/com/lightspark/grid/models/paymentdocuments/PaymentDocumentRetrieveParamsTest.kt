// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentDocumentRetrieveParamsTest {

    @Test
    fun create() {
        PaymentDocumentRetrieveParams.builder()
            .paymentDocumentId("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentDocumentRetrieveParams.builder()
                .paymentDocumentId("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("PaymentDocument:019542f5-b3e7-1d02-0000-000000000001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
