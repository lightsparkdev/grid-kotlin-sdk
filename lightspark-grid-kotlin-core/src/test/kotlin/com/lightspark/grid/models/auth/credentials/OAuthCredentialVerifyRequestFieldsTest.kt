// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialVerifyRequestFieldsTest {

    @Test
    fun create() {
        val oauthCredentialVerifyRequestFields =
            OAuthCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialVerifyRequestFields.Type.OAUTH)
                .build()

        assertThat(oauthCredentialVerifyRequestFields.clientPublicKey())
            .isEqualTo(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
        assertThat(oauthCredentialVerifyRequestFields.oidcToken())
            .isEqualTo(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
            )
        assertThat(oauthCredentialVerifyRequestFields.type())
            .isEqualTo(OAuthCredentialVerifyRequestFields.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialVerifyRequestFields =
            OAuthCredentialVerifyRequestFields.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialVerifyRequestFields.Type.OAUTH)
                .build()

        val roundtrippedOAuthCredentialVerifyRequestFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialVerifyRequestFields),
                jacksonTypeRef<OAuthCredentialVerifyRequestFields>(),
            )

        assertThat(roundtrippedOAuthCredentialVerifyRequestFields)
            .isEqualTo(oauthCredentialVerifyRequestFields)
    }
}
