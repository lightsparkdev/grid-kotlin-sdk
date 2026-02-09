// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.platform

import com.lightspark.grid.TestServerExtension
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.customers.externalaccounts.BeneficiaryOneOf
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountListParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountService = client.platform().externalAccounts()

        val externalAccount =
            externalAccountService.create(
                ExternalAccountCreate.builder()
                    .accountInfo(
                        ExternalAccountInfoOneOf.UsAccount.builder()
                            .accountCategory(
                                ExternalAccountInfoOneOf.UsAccount.AccountCategory.CHECKING
                            )
                            .accountNumber("12345678901")
                            .beneficiary(
                                BeneficiaryOneOf.Individual.builder()
                                    .birthDate(LocalDate.parse("1990-01-15"))
                                    .fullName("John Doe")
                                    .nationality("US")
                                    .address(
                                        BeneficiaryOneOf.Individual.Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .city("San Francisco")
                                            .line2("Apt 4B")
                                            .state("CA")
                                            .build()
                                    )
                                    .build()
                            )
                            .routingNumber("123456789")
                            .bankName("Chase Bank")
                            .build()
                    )
                    .currency("USD")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )

        externalAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .username("My Username")
                .password("My Password")
                .build()
        val externalAccountService = client.platform().externalAccounts()

        val externalAccounts =
            externalAccountService.list(
                ExternalAccountListParams.builder().currency("currency").build()
            )

        externalAccounts.validate()
    }
}
