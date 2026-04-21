// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountRetrieveParamsTest {

    @Test
    fun create() {
        ExternalAccountRetrieveParams.builder().externalAccountId("externalAccountId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountRetrieveParams.builder().externalAccountId("externalAccountId").build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
