// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialCreateRequestTest {

    @Test
    fun create() {
        val oauthCredentialCreateRequest =
            OAuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(JsonValue.from("OAUTH"))
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                )
                .build()

        assertThat(oauthCredentialCreateRequest.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(oauthCredentialCreateRequest._type()).isEqualTo(JsonValue.from("OAUTH"))
        assertThat(oauthCredentialCreateRequest.oidcToken())
            .isEqualTo(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialCreateRequest =
            OAuthCredentialCreateRequest.builder()
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .type(JsonValue.from("OAUTH"))
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                )
                .build()

        val roundtrippedOAuthCredentialCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialCreateRequest),
                jacksonTypeRef<OAuthCredentialCreateRequest>(),
            )

        assertThat(roundtrippedOAuthCredentialCreateRequest).isEqualTo(oauthCredentialCreateRequest)
    }
}
