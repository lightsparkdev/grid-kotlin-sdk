// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationRetrieveParamsTest {

    @Test
    fun create() {
        VerificationRetrieveParams.builder().verificationId("verificationId").build()
    }

    @Test
    fun pathParams() {
        val params = VerificationRetrieveParams.builder().verificationId("verificationId").build()

        assertThat(params._pathParam(0)).isEqualTo("verificationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
