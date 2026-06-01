// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationClaimParamsTest {

    @Test
    fun create() {
        InvitationClaimParams.builder()
            .invitationCode("invitationCode")
            .umaInvitationClaimRequest(
                UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvitationClaimParams.builder()
                .invitationCode("invitationCode")
                .umaInvitationClaimRequest(
                    UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("invitationCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvitationClaimParams.builder()
                .invitationCode("invitationCode")
                .umaInvitationClaimRequest(
                    UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UmaInvitationClaimRequest.builder().inviteeUma("\$invitee@uma.domain").build()
            )
    }
}
