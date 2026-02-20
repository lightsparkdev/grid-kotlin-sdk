// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.config.ConfigUpdateParams
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.config.PlatformCurrencyConfig
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.TransactionType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val configService = client.config()

        val platformConfig = configService.retrieve()

        platformConfig.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val configService = client.config()

        val platformConfig =
            configService.update(
                ConfigUpdateParams.builder()
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
                                        .name(CustomerInfoFieldName.NATIONALITY)
                                        .build(),
                                    CounterpartyFieldDefinition.builder()
                                        .mandatory(true)
                                        .name(CustomerInfoFieldName.BIRTH_DATE)
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

        platformConfig.validate()
    }
}
