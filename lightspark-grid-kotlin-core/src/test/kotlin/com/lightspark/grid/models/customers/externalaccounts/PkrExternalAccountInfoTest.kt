// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.PkrBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.PkrAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PkrExternalAccountInfoTest {

    @Test
    fun create() {
        val pkrExternalAccountInfo =
            PkrExternalAccountInfo.builder()
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                .bankName("Habib Bank Limited")
                .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                .accountNumber("1234567890")
                .iban("PK36SCBL0000001123456702")
                .phoneNumber("+1234567890")
                .build()

        assertThat(pkrExternalAccountInfo.beneficiary())
            .isEqualTo(
                PkrExternalAccountInfo.Beneficiary.ofIndividual(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(pkrExternalAccountInfo.accountType())
            .isEqualTo(PkrAccountInfo.AccountType.PKR_ACCOUNT)
        assertThat(pkrExternalAccountInfo.bankName()).isEqualTo("Habib Bank Limited")
        assertThat(pkrExternalAccountInfo.paymentRails())
            .containsExactly(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(pkrExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(pkrExternalAccountInfo.iban()).isEqualTo("PK36SCBL0000001123456702")
        assertThat(pkrExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrExternalAccountInfo =
            PkrExternalAccountInfo.builder()
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                .bankName("Habib Bank Limited")
                .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                .accountNumber("1234567890")
                .iban("PK36SCBL0000001123456702")
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedPkrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrExternalAccountInfo),
                jacksonTypeRef<PkrExternalAccountInfo>(),
            )

        assertThat(roundtrippedPkrExternalAccountInfo).isEqualTo(pkrExternalAccountInfo)
    }
}
