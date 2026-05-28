// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.TransactionType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigUpdateParamsTest {

    @Test
    fun create() {
        ConfigUpdateParams.builder()
            .platformConfigUpdateRequest(
                PlatformConfigUpdateRequest.builder()
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ConfigUpdateParams.builder()
                .platformConfigUpdateRequest(
                    PlatformConfigUpdateRequest.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlatformConfigUpdateRequest.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConfigUpdateParams.builder()
                .platformConfigUpdateRequest(PlatformConfigUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PlatformConfigUpdateRequest.builder().build())
    }
}
