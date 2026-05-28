// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.ZarBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.ZarAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZarExternalAccountInfoTest {

    @Test
    fun create() {
        val zarExternalAccountInfo =
            ZarExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        assertThat(zarExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(zarExternalAccountInfo.accountType())
            .isEqualTo(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
        assertThat(zarExternalAccountInfo.bankName()).isEqualTo("x")
        assertThat(zarExternalAccountInfo.paymentRails())
            .containsExactly(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(zarExternalAccountInfo.beneficiary())
            .isEqualTo(
                ZarExternalAccountInfo.Beneficiary.ofIndividual(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zarExternalAccountInfo =
            ZarExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedZarExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zarExternalAccountInfo),
                jacksonTypeRef<ZarExternalAccountInfo>(),
            )

        assertThat(roundtrippedZarExternalAccountInfo).isEqualTo(zarExternalAccountInfo)
    }
}
