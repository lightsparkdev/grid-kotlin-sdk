// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndUserTermsConsentTest {

    @Test
    fun create() {
        val endUserTermsConsent =
            EndUserTermsConsent.builder()
                .acceptanceMethod(EndUserTermsConsent.AcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("V1")
                .build()

        assertThat(endUserTermsConsent.acceptanceMethod())
            .isEqualTo(EndUserTermsConsent.AcceptanceMethod.CHECKBOX)
        assertThat(endUserTermsConsent.acceptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(endUserTermsConsent.ipAddress()).isEqualTo("198.51.100.24")
        assertThat(endUserTermsConsent.termsVersion()).isEqualTo("V1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val endUserTermsConsent =
            EndUserTermsConsent.builder()
                .acceptanceMethod(EndUserTermsConsent.AcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("V1")
                .build()

        val roundtrippedEndUserTermsConsent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(endUserTermsConsent),
                jacksonTypeRef<EndUserTermsConsent>(),
            )

        assertThat(roundtrippedEndUserTermsConsent).isEqualTo(endUserTermsConsent)
    }
}
