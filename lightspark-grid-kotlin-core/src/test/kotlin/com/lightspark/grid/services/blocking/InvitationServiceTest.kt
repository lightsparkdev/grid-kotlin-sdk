// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.invitations.InvitationClaimParams
import com.lightspark.grid.models.invitations.InvitationCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val invitationService = client.invitations()

        val umaInvitation =
            invitationService.create(
                InvitationCreateParams.builder()
                    .inviterUma("\$inviter@uma.domain")
                    .amountToSend(12550L)
                    .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .firstName("Alice")
                    .build()
            )

        umaInvitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val invitationService = client.invitations()

        val umaInvitation = invitationService.retrieve("invitationCode")

        umaInvitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val invitationService = client.invitations()

        val umaInvitation = invitationService.cancel("invitationCode")

        umaInvitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun claim() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val invitationService = client.invitations()

        val umaInvitation =
            invitationService.claim(
                InvitationClaimParams.builder()
                    .invitationCode("invitationCode")
                    .inviteeUma("\$invitee@uma.domain")
                    .build()
            )

        umaInvitation.validate()
    }
}
