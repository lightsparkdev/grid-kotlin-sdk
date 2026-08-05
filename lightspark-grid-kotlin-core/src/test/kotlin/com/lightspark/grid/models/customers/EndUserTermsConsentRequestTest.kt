// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndUserTermsConsentRequestTest {

    @Test
    fun create() {
        val endUserTermsConsentRequest =
            EndUserTermsConsentRequest.builder()
                .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("V1")
                .build()

        assertThat(endUserTermsConsentRequest.acceptanceMethod())
            .isEqualTo(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
        assertThat(endUserTermsConsentRequest.acceptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(endUserTermsConsentRequest.ipAddress()).isEqualTo("198.51.100.24")
        assertThat(endUserTermsConsentRequest.termsVersion()).isEqualTo("V1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val endUserTermsConsentRequest =
            EndUserTermsConsentRequest.builder()
                .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ipAddress("198.51.100.24")
                .termsVersion("V1")
                .build()

        val roundtrippedEndUserTermsConsentRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(endUserTermsConsentRequest),
                jacksonTypeRef<EndUserTermsConsentRequest>(),
            )

        assertThat(roundtrippedEndUserTermsConsentRequest).isEqualTo(endUserTermsConsentRequest)
    }
}
