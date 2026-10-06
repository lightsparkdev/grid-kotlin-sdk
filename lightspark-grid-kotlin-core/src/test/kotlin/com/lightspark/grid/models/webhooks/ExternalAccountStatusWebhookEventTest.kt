// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.SlvBeneficiary
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BeneficiaryVerifiedData
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountStatusWebhookEventTest {

    @Test
    fun create() {
        val externalAccountStatusWebhookEvent =
            ExternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    ExternalAccount.builder()
                        .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .accountInfo(
                            ExternalAccountInfoOneOf.SlvAccount.builder()
                                .beneficiary(
                                    SlvBeneficiary.builder()
                                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
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
                                        .birthDate("birthDate")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .nationality("nationality")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .addPaymentRail(
                                    ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER
                                )
                                .accountNumber("0123456789")
                                .bankAccountType(
                                    ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING
                                )
                                .bankName("Banco Cuscatlan")
                                .phoneNumber("+50312345678")
                                .build()
                        )
                        .currency("USD")
                        .status(ExternalAccount.Status.ACTIVE)
                        .beneficiaryVerificationStatus(
                            ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                        )
                        .beneficiaryVerifiedData(
                            BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                        )
                        .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                        .defaultUmaDepositAccount(false)
                        .ownershipType(ExternalAccount.OwnershipType.FIRST_PARTY)
                        .platformAccountId("acc_123456789")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(ExternalAccountStatusWebhookEvent.Type.EXTERNAL_ACCOUNT_STATUS_UPDATED)
                .build()

        assertThat(externalAccountStatusWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(externalAccountStatusWebhookEvent.data())
            .isEqualTo(
                ExternalAccount.builder()
                    .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                    .accountInfo(
                        ExternalAccountInfoOneOf.SlvAccount.builder()
                            .beneficiary(
                                SlvBeneficiary.builder()
                                    .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                                    .fullName("fullName")
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
                                    .birthDate("birthDate")
                                    .countryOfResidence("countryOfResidence")
                                    .email("email")
                                    .nationality("nationality")
                                    .phoneNumber("phoneNumber")
                                    .build()
                            )
                            .addPaymentRail(
                                ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER
                            )
                            .accountNumber("0123456789")
                            .bankAccountType(
                                ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING
                            )
                            .bankName("Banco Cuscatlan")
                            .phoneNumber("+50312345678")
                            .build()
                    )
                    .currency("USD")
                    .status(ExternalAccount.Status.ACTIVE)
                    .beneficiaryVerificationStatus(
                        ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                    )
                    .beneficiaryVerifiedData(
                        BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                    )
                    .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                    .defaultUmaDepositAccount(false)
                    .ownershipType(ExternalAccount.OwnershipType.FIRST_PARTY)
                    .platformAccountId("acc_123456789")
                    .build()
            )
        assertThat(externalAccountStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(externalAccountStatusWebhookEvent.type())
            .isEqualTo(ExternalAccountStatusWebhookEvent.Type.EXTERNAL_ACCOUNT_STATUS_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountStatusWebhookEvent =
            ExternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    ExternalAccount.builder()
                        .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .accountInfo(
                            ExternalAccountInfoOneOf.SlvAccount.builder()
                                .beneficiary(
                                    SlvBeneficiary.builder()
                                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
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
                                        .birthDate("birthDate")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .nationality("nationality")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .addPaymentRail(
                                    ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER
                                )
                                .accountNumber("0123456789")
                                .bankAccountType(
                                    ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING
                                )
                                .bankName("Banco Cuscatlan")
                                .phoneNumber("+50312345678")
                                .build()
                        )
                        .currency("USD")
                        .status(ExternalAccount.Status.ACTIVE)
                        .beneficiaryVerificationStatus(
                            ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                        )
                        .beneficiaryVerifiedData(
                            BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                        )
                        .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                        .defaultUmaDepositAccount(false)
                        .ownershipType(ExternalAccount.OwnershipType.FIRST_PARTY)
                        .platformAccountId("acc_123456789")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(ExternalAccountStatusWebhookEvent.Type.EXTERNAL_ACCOUNT_STATUS_UPDATED)
                .build()

        val roundtrippedExternalAccountStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountStatusWebhookEvent),
                jacksonTypeRef<ExternalAccountStatusWebhookEvent>(),
            )

        assertThat(roundtrippedExternalAccountStatusWebhookEvent)
            .isEqualTo(externalAccountStatusWebhookEvent)
    }
}
