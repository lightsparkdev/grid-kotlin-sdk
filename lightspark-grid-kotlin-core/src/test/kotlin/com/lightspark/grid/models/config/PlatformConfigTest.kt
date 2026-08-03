// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.TransactionType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlatformConfigTest {

    @Test
    fun create() {
        val platformConfig =
            PlatformConfig.builder()
                .id("PlatformConfig:019542f5-b3e7-1d02-0000-000000000003")
                .cardTokenization2faConfig(
                    PlatformConfig.CardTokenization2faConfig.builder()
                        .displayName("Acme")
                        .email(
                            PlatformConfig.CardTokenization2faConfig.Email.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .fromAddress("cards@acme.com")
                                .fromName("Acme Cards")
                                .replyToAddress("support@acme.com")
                                .subject("Your Acme card verification code")
                                .build()
                        )
                        .logoUrl("https://acme.com/card-email-logo.png")
                        .sms(
                            PlatformConfig.CardTokenization2faConfig.Sms.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
                .embeddedWalletConfig(
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
                )
                .addFeeConfig(
                    PlatformConfig.FeeConfig.builder()
                        .feeType(PlatformConfig.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION)
                        .fixedFee(
                            PlatformConfig.FeeConfig.FixedFee.builder()
                                .amount(100L)
                                .currency("USD")
                                .build()
                        )
                        .sourceCurrency("USD")
                        .variableFeeBps(30L)
                        .build()
                )
                .isRegulatedFinancialInstitution(false)
                .proxyUmaSubdomain("platform")
                .addSupportedCurrency(
                    PlatformCurrencyConfig.builder()
                        .currencyCode("USD")
                        .addEnabledTransactionType(TransactionType.OUTGOING)
                        .addEnabledTransactionType(TransactionType.INCOMING)
                        .maxAmount(1000000L)
                        .minAmount(100L)
                        .requiredCounterpartyFields(
                            listOf(
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.FULL_NAME)
                                    .build(),
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.BIRTH_DATE)
                                    .build(),
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.NATIONALITY)
                                    .build(),
                            )
                        )
                        .addProviderRequiredCounterpartyCustomerField(
                            CustomerInfoFieldName.FULL_NAME
                        )
                        .addProviderRequiredCounterpartyCustomerField(
                            CustomerInfoFieldName.COUNTRY_OF_RESIDENCE
                        )
                        .addProviderRequiredCustomerField(CustomerInfoFieldName.NATIONALITY)
                        .addProviderRequiredCustomerField(CustomerInfoFieldName.BIRTH_DATE)
                        .build()
                )
                .umaDomain("platform.uma.domain")
                .updatedAt(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
                .webhookEndpoint("https://api.mycompany.com/webhooks/uma")
                .build()

        assertThat(platformConfig.id())
            .isEqualTo("PlatformConfig:019542f5-b3e7-1d02-0000-000000000003")
        assertThat(platformConfig.cardTokenization2faConfig())
            .isEqualTo(
                PlatformConfig.CardTokenization2faConfig.builder()
                    .displayName("Acme")
                    .email(
                        PlatformConfig.CardTokenization2faConfig.Email.builder()
                            .bodyText(
                                "Use this code to finish adding your Acme card to your digital wallet."
                            )
                            .fromAddress("cards@acme.com")
                            .fromName("Acme Cards")
                            .replyToAddress("support@acme.com")
                            .subject("Your Acme card verification code")
                            .build()
                    )
                    .logoUrl("https://acme.com/card-email-logo.png")
                    .sms(
                        PlatformConfig.CardTokenization2faConfig.Sms.builder()
                            .bodyText(
                                "Use this code to finish adding your Acme card to your digital wallet."
                            )
                            .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                            .build()
                    )
                    .build()
            )
        assertThat(platformConfig.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
        assertThat(platformConfig.embeddedWalletConfig())
            .isEqualTo(
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
            )
        assertThat(platformConfig.feeConfigs())
            .containsExactly(
                PlatformConfig.FeeConfig.builder()
                    .feeType(PlatformConfig.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION)
                    .fixedFee(
                        PlatformConfig.FeeConfig.FixedFee.builder()
                            .amount(100L)
                            .currency("USD")
                            .build()
                    )
                    .sourceCurrency("USD")
                    .variableFeeBps(30L)
                    .build()
            )
        assertThat(platformConfig.isRegulatedFinancialInstitution()).isEqualTo(false)
        assertThat(platformConfig.proxyUmaSubdomain()).isEqualTo("platform")
        assertThat(platformConfig.supportedCurrencies())
            .containsExactly(
                PlatformCurrencyConfig.builder()
                    .currencyCode("USD")
                    .addEnabledTransactionType(TransactionType.OUTGOING)
                    .addEnabledTransactionType(TransactionType.INCOMING)
                    .maxAmount(1000000L)
                    .minAmount(100L)
                    .requiredCounterpartyFields(
                        listOf(
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.FULL_NAME)
                                .build(),
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.BIRTH_DATE)
                                .build(),
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.NATIONALITY)
                                .build(),
                        )
                    )
                    .addProviderRequiredCounterpartyCustomerField(CustomerInfoFieldName.FULL_NAME)
                    .addProviderRequiredCounterpartyCustomerField(
                        CustomerInfoFieldName.COUNTRY_OF_RESIDENCE
                    )
                    .addProviderRequiredCustomerField(CustomerInfoFieldName.NATIONALITY)
                    .addProviderRequiredCustomerField(CustomerInfoFieldName.BIRTH_DATE)
                    .build()
            )
        assertThat(platformConfig.umaDomain()).isEqualTo("platform.uma.domain")
        assertThat(platformConfig.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
        assertThat(platformConfig.webhookEndpoint())
            .isEqualTo("https://api.mycompany.com/webhooks/uma")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val platformConfig =
            PlatformConfig.builder()
                .id("PlatformConfig:019542f5-b3e7-1d02-0000-000000000003")
                .cardTokenization2faConfig(
                    PlatformConfig.CardTokenization2faConfig.builder()
                        .displayName("Acme")
                        .email(
                            PlatformConfig.CardTokenization2faConfig.Email.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .fromAddress("cards@acme.com")
                                .fromName("Acme Cards")
                                .replyToAddress("support@acme.com")
                                .subject("Your Acme card verification code")
                                .build()
                        )
                        .logoUrl("https://acme.com/card-email-logo.png")
                        .sms(
                            PlatformConfig.CardTokenization2faConfig.Sms.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
                .embeddedWalletConfig(
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
                )
                .addFeeConfig(
                    PlatformConfig.FeeConfig.builder()
                        .feeType(PlatformConfig.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION)
                        .fixedFee(
                            PlatformConfig.FeeConfig.FixedFee.builder()
                                .amount(100L)
                                .currency("USD")
                                .build()
                        )
                        .sourceCurrency("USD")
                        .variableFeeBps(30L)
                        .build()
                )
                .isRegulatedFinancialInstitution(false)
                .proxyUmaSubdomain("platform")
                .addSupportedCurrency(
                    PlatformCurrencyConfig.builder()
                        .currencyCode("USD")
                        .addEnabledTransactionType(TransactionType.OUTGOING)
                        .addEnabledTransactionType(TransactionType.INCOMING)
                        .maxAmount(1000000L)
                        .minAmount(100L)
                        .requiredCounterpartyFields(
                            listOf(
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.FULL_NAME)
                                    .build(),
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.BIRTH_DATE)
                                    .build(),
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.NATIONALITY)
                                    .build(),
                            )
                        )
                        .addProviderRequiredCounterpartyCustomerField(
                            CustomerInfoFieldName.FULL_NAME
                        )
                        .addProviderRequiredCounterpartyCustomerField(
                            CustomerInfoFieldName.COUNTRY_OF_RESIDENCE
                        )
                        .addProviderRequiredCustomerField(CustomerInfoFieldName.NATIONALITY)
                        .addProviderRequiredCustomerField(CustomerInfoFieldName.BIRTH_DATE)
                        .build()
                )
                .umaDomain("platform.uma.domain")
                .updatedAt(OffsetDateTime.parse("2025-06-15T12:30:45Z"))
                .webhookEndpoint("https://api.mycompany.com/webhooks/uma")
                .build()

        val roundtrippedPlatformConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(platformConfig),
                jacksonTypeRef<PlatformConfig>(),
            )

        assertThat(roundtrippedPlatformConfig).isEqualTo(platformConfig)
    }
}
