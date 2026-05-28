// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialVerifyRequestOneOfTest {

    @Test
    fun create() {
        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialVerifyRequestOneOf = AuthCredentialVerifyRequestOneOf.builder().build()

        val roundtrippedAuthCredentialVerifyRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialVerifyRequestOneOf),
                jacksonTypeRef<AuthCredentialVerifyRequestOneOf>(),
            )

        assertThat(roundtrippedAuthCredentialVerifyRequestOneOf)
            .isEqualTo(authCredentialVerifyRequestOneOf)
    }
}
