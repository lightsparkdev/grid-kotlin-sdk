// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PasskeyCredentialVerifyRequestTest {

    @Test
    fun create() {
        val passkeyCredentialVerifyRequest = PasskeyCredentialVerifyRequest.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passkeyCredentialVerifyRequest = PasskeyCredentialVerifyRequest.builder().build()

        val roundtrippedPasskeyCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passkeyCredentialVerifyRequest),
                jacksonTypeRef<PasskeyCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedPasskeyCredentialVerifyRequest)
            .isEqualTo(passkeyCredentialVerifyRequest)
    }
}
