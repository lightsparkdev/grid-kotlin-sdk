// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountExportRequestTest {

    @Test
    fun create() {
        val internalAccountExportRequest =
            InternalAccountExportRequest.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .build()

        assertThat(internalAccountExportRequest.clientPublicKey())
            .isEqualTo(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountExportRequest =
            InternalAccountExportRequest.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .build()

        val roundtrippedInternalAccountExportRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountExportRequest),
                jacksonTypeRef<InternalAccountExportRequest>(),
            )

        assertThat(roundtrippedInternalAccountExportRequest).isEqualTo(internalAccountExportRequest)
    }
}
