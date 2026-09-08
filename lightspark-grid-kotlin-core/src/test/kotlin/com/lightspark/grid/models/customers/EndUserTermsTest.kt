// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndUserTermsTest {

    @Test
    fun create() {
        val endUserTerms =
            EndUserTerms.builder()
                .url("https://www.lightspark.com/legal/grid/enduserterms")
                .version("V1")
                .build()

        assertThat(endUserTerms.url())
            .isEqualTo("https://www.lightspark.com/legal/grid/enduserterms")
        assertThat(endUserTerms.version()).isEqualTo("V1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val endUserTerms =
            EndUserTerms.builder()
                .url("https://www.lightspark.com/legal/grid/enduserterms")
                .version("V1")
                .build()

        val roundtrippedEndUserTerms =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(endUserTerms),
                jacksonTypeRef<EndUserTerms>(),
            )

        assertThat(roundtrippedEndUserTerms).isEqualTo(endUserTerms)
    }
}
