// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.vasps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaspTest {

    @Test
    fun create() {
        val vasp = Vasp.builder().vaspName("Kraken").url("https://www.kraken.com").build()

        assertThat(vasp.vaspName()).isEqualTo("Kraken")
        assertThat(vasp.url()).isEqualTo("https://www.kraken.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vasp = Vasp.builder().vaspName("Kraken").url("https://www.kraken.com").build()

        val roundtrippedVasp =
            jsonMapper.readValue(jsonMapper.writeValueAsString(vasp), jacksonTypeRef<Vasp>())

        assertThat(roundtrippedVasp).isEqualTo(vasp)
    }
}
