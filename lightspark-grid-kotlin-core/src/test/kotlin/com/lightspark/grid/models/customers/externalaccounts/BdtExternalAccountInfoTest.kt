// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.BdtBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.BdtAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BdtExternalAccountInfoTest {

    @Test
    fun create() {
        val bdtExternalAccountInfo =
            BdtExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                .branchCode("21029")
                .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(bdtExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(bdtExternalAccountInfo.accountType())
            .isEqualTo(BdtAccountInfo.AccountType.BDT_ACCOUNT)
        assertThat(bdtExternalAccountInfo.branchCode()).isEqualTo("21029")
        assertThat(bdtExternalAccountInfo.paymentRails())
            .containsExactly(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(bdtExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bdtExternalAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
        assertThat(bdtExternalAccountInfo.beneficiary())
            .isEqualTo(
                BdtExternalAccountInfo.Beneficiary.ofIndividual(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val bdtExternalAccountInfo =
            BdtExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                .branchCode("21029")
                .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBdtExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bdtExternalAccountInfo),
                jacksonTypeRef<BdtExternalAccountInfo>(),
            )

        assertThat(roundtrippedBdtExternalAccountInfo).isEqualTo(bdtExternalAccountInfo)
    }
}
