// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.OwnershipChallengeRequest
import com.lightspark.grid.models.customers.externalaccounts.OwnershipVerificationMethod
import com.lightspark.grid.models.customers.externalaccounts.OwnershipVerifyRequest
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountChallengeParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountVerifyParams
import com.lightspark.grid.models.platform.externalaccounts.PlatformExternalAccountCreateRequest
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
        val externalAccountServiceAsync = client.platform().externalAccounts()

        val externalAccount =
            externalAccountServiceAsync.create(
                PlatformExternalAccountCreateRequest.builder()
                    .accountInfo(
                        AedExternalAccountCreateInfo.builder()
                            .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                            .beneficiary(
                                AedBeneficiary.builder()
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
                                    .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("fullName")
                                    .birthDate("birthDate")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .nationality("nationality")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .iban("AE070331234567890123456")
                            .swiftCode("EBILAEAD")
                            .build()
                    )
                    .currency("USD")
                    .ownershipType(PlatformExternalAccountCreateRequest.OwnershipType.FIRST_PARTY)
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
        val externalAccountServiceAsync = client.platform().externalAccounts()

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
        val externalAccountServiceAsync = client.platform().externalAccounts()

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
        val externalAccountServiceAsync = client.platform().externalAccounts()

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
        val externalAccountServiceAsync = client.platform().externalAccounts()

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
        val externalAccountServiceAsync = client.platform().externalAccounts()

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
