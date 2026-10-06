// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCredentialVerifyRequestTest {

    @Test
    fun create() {
        val oauthCredentialVerifyRequest =
            OAuthCredentialVerifyRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                )
                .type(OAuthCredentialVerifyRequest.Type.OAUTH)
                .build()

        assertThat(oauthCredentialVerifyRequest.clientPublicKey())
            .isEqualTo("02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31")
        assertThat(oauthCredentialVerifyRequest.oidcToken())
            .isEqualTo(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
            )
        assertThat(oauthCredentialVerifyRequest.type())
            .isEqualTo(OAuthCredentialVerifyRequest.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthCredentialVerifyRequest =
            OAuthCredentialVerifyRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .oidcToken(
                    "eyJhbGciOiJSUzI1NiIsImtpZCI6ImFiYzEyMyIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJzdWIiOiIxMTIyMzM0NDU1IiwiYXVkIjoiMTIzNDU2Ny5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsImVtYWlsIjoidXNlckBleGFtcGxlLmNvbSIsImlhdCI6MTc0NjczNjUwOSwiZXhwIjoxNzQ2NzQwMTA5fQ.-3_ETmSGOl4wGNLR1QSOMlHk5IvADpX3YdHFmTH9KmRu6sEhM20RsURjKrI4-_EKj7J_HtsdS1tCHm0iw2J0qtoczYFQqEW_U9qJD6QsuvTFx8Fj9rFa3ieYhZKi3kkBu6cADogUiudP50kf9345ATys2GrYm-ba5esgReW1WzGJG3SgCyIDnHFfxmeLjE2YE9EFxT73To3mPYAk0ywPL2MpFFV9F8I3PsnbDAxinaY75GeA8vJXATr8weEIXqHD2lxmXVE95qd2ZlcuyLUaEYyp9GXcOnx7SjhdJG88jl5BZQvxOVgBMo42iGjK674lSwsMiHpzLX98j6C786Rd9Q"
                )
                .type(OAuthCredentialVerifyRequest.Type.OAUTH)
                .build()

        val roundtrippedOAuthCredentialVerifyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthCredentialVerifyRequest),
                jacksonTypeRef<OAuthCredentialVerifyRequest>(),
            )

        assertThat(roundtrippedOAuthCredentialVerifyRequest).isEqualTo(oauthCredentialVerifyRequest)
    }
}
