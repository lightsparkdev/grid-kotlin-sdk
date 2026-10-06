// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementDocumentListResponseTest {

    @Test
    fun create() {
        val agreementDocumentListResponse =
            AgreementDocumentListResponse.builder()
                .addData(
                    AgreementDocument.builder()
                        .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                        .url("https://www.lightspark.com/legal/grid/enduserterms")
                        .version("2025-10-13")
                        .build()
                )
                .build()

        assertThat(agreementDocumentListResponse.data())
            .containsExactly(
                AgreementDocument.builder()
                    .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                    .url("https://www.lightspark.com/legal/grid/enduserterms")
                    .version("2025-10-13")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementDocumentListResponse =
            AgreementDocumentListResponse.builder()
                .addData(
                    AgreementDocument.builder()
                        .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                        .url("https://www.lightspark.com/legal/grid/enduserterms")
                        .version("2025-10-13")
                        .build()
                )
                .build()

        val roundtrippedAgreementDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementDocumentListResponse),
                jacksonTypeRef<AgreementDocumentListResponse>(),
            )

        assertThat(roundtrippedAgreementDocumentListResponse)
            .isEqualTo(agreementDocumentListResponse)
    }
}
