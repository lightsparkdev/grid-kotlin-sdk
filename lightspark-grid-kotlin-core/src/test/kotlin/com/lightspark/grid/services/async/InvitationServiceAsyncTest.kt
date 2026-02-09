// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.invitations.InvitationClaimParams
import com.lightspark.grid.models.invitations.InvitationCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvitationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val invitationServiceAsync = client.invitations()

        val umaInvitation =
            invitationServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val invitationServiceAsync = client.invitations()

        val umaInvitation = invitationServiceAsync.retrieve("invitationCode")

        umaInvitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun cancel() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val invitationServiceAsync = client.invitations()

        val umaInvitation = invitationServiceAsync.cancel("invitationCode")

        umaInvitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun claim() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val invitationServiceAsync = client.invitations()

        val umaInvitation =
            invitationServiceAsync.claim(
                InvitationClaimParams.builder()
                    .invitationCode("invitationCode")
                    .inviteeUma("\$invitee@uma.domain")
                    .build()
            )

        umaInvitation.validate()
    }
}
