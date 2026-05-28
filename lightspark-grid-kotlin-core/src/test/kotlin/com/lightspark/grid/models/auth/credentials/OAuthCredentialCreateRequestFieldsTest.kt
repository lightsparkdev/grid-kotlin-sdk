// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialCreateRequestFieldsTest {

    @Test
    fun create() {
        val oauthCredentialCreateRequestFields =
            OAuthCredentialCreateRequestFields.builder()
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                .build()

        assertThat(oauthCredentialCreateRequestFields.oidcToken())
            .isEqualTo(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
            )
        assertThat(oauthCredentialCreateRequestFields.type())
            .isEqualTo(OAuthCredentialCreateRequestFields.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialCreateRequestFields =
            OAuthCredentialCreateRequestFields.builder()
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                .build()

        val roundtrippedOAuthCredentialCreateRequestFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialCreateRequestFields),
                jacksonTypeRef<OAuthCredentialCreateRequestFields>(),
            )

        assertThat(roundtrippedOAuthCredentialCreateRequestFields)
            .isEqualTo(oauthCredentialCreateRequestFields)
    }
}
