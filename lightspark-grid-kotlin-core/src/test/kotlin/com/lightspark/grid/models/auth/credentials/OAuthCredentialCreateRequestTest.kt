// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialCreateRequestTest {

    @Test
    fun create() {
        val oauthCredentialCreateRequest =
            OAuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                .build()

        assertThat(oauthCredentialCreateRequest.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(oauthCredentialCreateRequest.oidcToken())
            .isEqualTo(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
            )
        assertThat(oauthCredentialCreateRequest.type())
            .isEqualTo(OAuthCredentialCreateRequestFields.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialCreateRequest =
            OAuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.signature"
                )
                .type(OAuthCredentialCreateRequestFields.Type.OAUTH)
                .build()

        val roundtrippedOAuthCredentialCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialCreateRequest),
                jacksonTypeRef<OAuthCredentialCreateRequest>(),
            )

        assertThat(roundtrippedOAuthCredentialCreateRequest).isEqualTo(oauthCredentialCreateRequest)
    }
}
