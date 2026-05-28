// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UmaInvitationClaimRequestTest {

    @Test
    fun create() {
        val umaInvitationClaimRequest =
            UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()

        assertThat(umaInvitationClaimRequest.inviteeUma()).isEqualTo("\$invitee@uma.domain")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val umaInvitationClaimRequest =
            UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()

        val roundtrippedUmaInvitationClaimRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(umaInvitationClaimRequest),
                jacksonTypeRef<UmaInvitationClaimRequest>(),
            )

        assertThat(roundtrippedUmaInvitationClaimRequest).isEqualTo(umaInvitationClaimRequest)
    }
}
