// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.customers

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountChallengeParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountVerifyParams
import com.lightspark.grid.models.customers.externalaccounts.OwnershipChallengeRequest
import com.lightspark.grid.models.customers.externalaccounts.OwnershipVerificationMethod
import com.lightspark.grid.models.customers.externalaccounts.OwnershipVerifyRequest
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                ExternalAccountCreateParams.builder()
                    .accountInfo(
                        UsdExternalAccountCreateInfo.builder()
                            .accountNumber("12345678901")
                            .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                            .beneficiary(
                                UsdBeneficiary.builder()
                                    .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("John Doe")
                                    .address(
                                        Address.builder()
                                            .country("US")
                                            .line1("123 Main Street")
                                            .postalCode("94105")
                                            .city("San Francisco")
                                            .line2("Apt 4B")
                                            .state("CA")
                                            .build()
                                    )
                                    .birthDate("1990-01-15")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .nationality("US")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .routingNumber("123456789")
                            .bankAccountType(UsdExternalAccountCreateInfo.BankAccountType.CHECKING)
                            .bankName("Chase Bank")
                            .fiToFiInformation("/BNF/Invoice 4471")
                            .intermediaryBankName("JPMorgan Chase Bank")
                            .intermediaryRoutingNumber("021000021")
                            .build()
                    )
                    .currency("USD")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .defaultUmaDepositAccount(true)
                    .ownershipType(ExternalAccountCreateParams.OwnershipType.FIRST_PARTY)
                    .platformAccountId("ext_acc_123456")
                    .build()
            )

        externalAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val externalAccount = externalAccountServiceAsync.retrieve("externalAccountId")

        externalAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val page = externalAccountServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        externalAccountServiceAsync.delete("externalAccountId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun challenge() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val ownershipChallenge =
            externalAccountServiceAsync.challenge(
                ExternalAccountChallengeParams.builder()
                    .externalAccountId("externalAccountId")
                    .ownershipChallengeRequest(
                        OwnershipChallengeRequest.builder()
                            .method(OwnershipVerificationMethod.WALLET_SIGNATURE)
                            .build()
                    )
                    .build()
            )

        ownershipChallenge.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun verify() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val externalAccountServiceAsync = client.customers().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.verify(
                ExternalAccountVerifyParams.builder()
                    .externalAccountId("externalAccountId")
                    .ownershipVerifyRequest(
                        OwnershipVerifyRequest.builder()
                            .signature(
                                "0x52d75f01c9e7b8b2ce2fbcbd21bfeeee7bcd1a2f01ce6b8ad9a67a45e83a8f5d1c"
                            )
                            .signatureScheme(OwnershipVerifyRequest.SignatureScheme.BIP137)
                            .build()
                    )
                    .build()
            )

        externalAccount.validate()
    }
}
