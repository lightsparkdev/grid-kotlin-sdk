// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementConsentTest {

    @Test
    fun create() {
        val agreementConsent =
            AgreementConsent.builder()
                .acceptanceMethod(AgreementAcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("2025-10-13")
                .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                .build()

        assertThat(agreementConsent.acceptanceMethod())
            .isEqualTo(AgreementAcceptanceMethod.CHECKBOX)
        assertThat(agreementConsent.acceptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agreementConsent.ipAddress()).isEqualTo("198.51.100.24")
        assertThat(agreementConsent.termsVersion()).isEqualTo("2025-10-13")
        assertThat(agreementConsent.type()).isEqualTo(AgreementType.LIGHTSPARK_END_USER_TERMS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementConsent =
            AgreementConsent.builder()
                .acceptanceMethod(AgreementAcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("2025-10-13")
                .type(AgreementType.LIGHTSPARK_END_USER_TERMS)
                .build()

        val roundtrippedAgreementConsent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementConsent),
                jacksonTypeRef<AgreementConsent>(),
            )

        assertThat(roundtrippedAgreementConsent).isEqualTo(agreementConsent)
    }
}
