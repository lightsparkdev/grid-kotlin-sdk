// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.TransactionType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlatformConfigUpdateRequestTest {

    @Test
    fun create() {
        val platformConfigUpdateRequest =
            PlatformConfigUpdateRequest.builder()
                .cardTokenization2faConfig(
                    PlatformConfigUpdateRequest.CardTokenization2faConfig.builder()
                        .displayName("Acme")
                        .email(
                            PlatformConfigUpdateRequest.CardTokenization2faConfig.Email.builder()
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
                            PlatformConfigUpdateRequest.CardTokenization2faConfig.Sms.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                .build()
                        )
                        .build()
                )
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
                    PlatformConfigUpdateRequest.FeeConfig.builder()
                        .feeType(
                            PlatformConfigUpdateRequest.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION
                        )
                        .fixedFee(
                            PlatformConfigUpdateRequest.FeeConfig.FixedFee.builder()
                                .amount(100L)
                                .currency("USD")
                                .build()
                        )
                        .sourceCurrency("USD")
                        .variableFeeBps(30L)
                        .build()
                )
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
                .umaDomain("mycompany.com")
                .webhookEndpoint("https://api.mycompany.com/webhooks/uma")
                .build()

        assertThat(platformConfigUpdateRequest.cardTokenization2faConfig())
            .isEqualTo(
                PlatformConfigUpdateRequest.CardTokenization2faConfig.builder()
                    .displayName("Acme")
                    .email(
                        PlatformConfigUpdateRequest.CardTokenization2faConfig.Email.builder()
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
                        PlatformConfigUpdateRequest.CardTokenization2faConfig.Sms.builder()
                            .bodyText(
                                "Use this code to finish adding your Acme card to your digital wallet."
                            )
                            .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                            .build()
                    )
                    .build()
            )
        assertThat(platformConfigUpdateRequest.embeddedWalletConfig())
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
        assertThat(platformConfigUpdateRequest.feeConfigs())
            .containsExactly(
                PlatformConfigUpdateRequest.FeeConfig.builder()
                    .feeType(
                        PlatformConfigUpdateRequest.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION
                    )
                    .fixedFee(
                        PlatformConfigUpdateRequest.FeeConfig.FixedFee.builder()
                            .amount(100L)
                            .currency("USD")
                            .build()
                    )
                    .sourceCurrency("USD")
                    .variableFeeBps(30L)
                    .build()
            )
        assertThat(platformConfigUpdateRequest.supportedCurrencies())
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
        assertThat(platformConfigUpdateRequest.umaDomain()).isEqualTo("mycompany.com")
        assertThat(platformConfigUpdateRequest.webhookEndpoint())
            .isEqualTo("https://api.mycompany.com/webhooks/uma")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val platformConfigUpdateRequest =
            PlatformConfigUpdateRequest.builder()
                .cardTokenization2faConfig(
                    PlatformConfigUpdateRequest.CardTokenization2faConfig.builder()
                        .displayName("Acme")
                        .email(
                            PlatformConfigUpdateRequest.CardTokenization2faConfig.Email.builder()
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
                            PlatformConfigUpdateRequest.CardTokenization2faConfig.Sms.builder()
                                .bodyText(
                                    "Use this code to finish adding your Acme card to your digital wallet."
                                )
                                .templateSid("HJaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                                .build()
                        )
                        .build()
                )
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
                    PlatformConfigUpdateRequest.FeeConfig.builder()
                        .feeType(
                            PlatformConfigUpdateRequest.FeeConfig.FeeType.CROSS_CURRENCY_TRANSACTION
                        )
                        .fixedFee(
                            PlatformConfigUpdateRequest.FeeConfig.FixedFee.builder()
                                .amount(100L)
                                .currency("USD")
                                .build()
                        )
                        .sourceCurrency("USD")
                        .variableFeeBps(30L)
                        .build()
                )
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
                .umaDomain("mycompany.com")
                .webhookEndpoint("https://api.mycompany.com/webhooks/uma")
                .build()

        val roundtrippedPlatformConfigUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(platformConfigUpdateRequest),
                jacksonTypeRef<PlatformConfigUpdateRequest>(),
            )

        assertThat(roundtrippedPlatformConfigUpdateRequest).isEqualTo(platformConfigUpdateRequest)
    }
}
