// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementDocumentTest {

    @Test
    fun create() {
        val agreementDocument =
            AgreementDocument.builder()
                .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                .url("https://www.lightspark.com/legal/grid/enduserterms")
                .version("2025-10-13")
                .build()

        assertThat(agreementDocument.type()).isEqualTo(AgreementType.LIGHTSPARK_END_USER_TERMS)
        assertThat(agreementDocument.url())
            .isEqualTo("https://www.lightspark.com/legal/grid/enduserterms")
        assertThat(agreementDocument.version()).isEqualTo("2025-10-13")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementDocument =
            AgreementDocument.builder()
                .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                .url("https://www.lightspark.com/legal/grid/enduserterms")
                .version("2025-10-13")
                .build()

        val roundtrippedAgreementDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementDocument),
                jacksonTypeRef<AgreementDocument>(),
            )

        assertThat(roundtrippedAgreementDocument).isEqualTo(agreementDocument)
    }
}
