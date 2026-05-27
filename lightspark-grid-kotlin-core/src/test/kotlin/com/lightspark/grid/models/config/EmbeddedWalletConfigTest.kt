// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddedWalletConfigTest {

    @Test
    fun create() {
        val embeddedWalletConfig =
            EmbeddedWalletConfig.builder()
                .alphanumeric(false)
                .appName("Acme Wallet")
                .expirationSeconds(300L)
                .logoUrl("https://acme.com/logo.png")
                .otpLength(6L)
                .replyToEmailAddress("support@acme.com")
                .sendFromEmailAddress("noreply@acme.com")
                .sendFromEmailSenderName("Acme Notifications")
                .build()

        assertThat(embeddedWalletConfig.alphanumeric()).isEqualTo(false)
        assertThat(embeddedWalletConfig.appName()).isEqualTo("Acme Wallet")
        assertThat(embeddedWalletConfig.expirationSeconds()).isEqualTo(300L)
        assertThat(embeddedWalletConfig.logoUrl()).isEqualTo("https://acme.com/logo.png")
        assertThat(embeddedWalletConfig.otpLength()).isEqualTo(6L)
        assertThat(embeddedWalletConfig.replyToEmailAddress()).isEqualTo("support@acme.com")
        assertThat(embeddedWalletConfig.sendFromEmailAddress()).isEqualTo("noreply@acme.com")
        assertThat(embeddedWalletConfig.sendFromEmailSenderName()).isEqualTo("Acme Notifications")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddedWalletConfig =
            EmbeddedWalletConfig.builder()
                .alphanumeric(false)
                .appName("Acme Wallet")
                .expirationSeconds(300L)
                .logoUrl("https://acme.com/logo.png")
                .otpLength(6L)
                .replyToEmailAddress("support@acme.com")
                .sendFromEmailAddress("noreply@acme.com")
                .sendFromEmailSenderName("Acme Notifications")
                .build()

        val roundtrippedEmbeddedWalletConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddedWalletConfig),
                jacksonTypeRef<EmbeddedWalletConfig>(),
            )

        assertThat(roundtrippedEmbeddedWalletConfig).isEqualTo(embeddedWalletConfig)
    }
}
