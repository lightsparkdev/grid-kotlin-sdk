// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerRetrieveParamsTest {

    @Test
    fun create() {
        BeneficialOwnerRetrieveParams.builder().beneficialOwnerId("beneficialOwnerId").build()
    }

    @Test
    fun pathParams() {
        val params =
            BeneficialOwnerRetrieveParams.builder().beneficialOwnerId("beneficialOwnerId").build()

        assertThat(params._pathParam(0)).isEqualTo("beneficialOwnerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
