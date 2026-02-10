// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnAccountInfoTest {

    @Test
    fun create() {
        val ngnAccountInfo =
            NgnAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("First Bank of Nigeria")
                .beneficiary(
                    BeneficiaryOneOf.Individual.builder()
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
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
                .purposeOfPayment(NgnAccountInfo.PurposeOfPayment.GOODS_OR_SERVICES)
                .build()

        assertThat(ngnAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(ngnAccountInfo.accountType()).isEqualTo(NgnAccountInfo.AccountType.NGN_ACCOUNT)
        assertThat(ngnAccountInfo.bankName()).isEqualTo("First Bank of Nigeria")
        assertThat(ngnAccountInfo.beneficiary())
            .isEqualTo(
                BeneficiaryOneOf.ofIndividual(
                    BeneficiaryOneOf.Individual.builder()
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
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
            )
        assertThat(ngnAccountInfo.purposeOfPayment())
            .isEqualTo(NgnAccountInfo.PurposeOfPayment.GOODS_OR_SERVICES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnAccountInfo =
            NgnAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("First Bank of Nigeria")
                .beneficiary(
                    BeneficiaryOneOf.Individual.builder()
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
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
                .purposeOfPayment(NgnAccountInfo.PurposeOfPayment.GOODS_OR_SERVICES)
                .build()

        val roundtrippedNgnAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnAccountInfo),
                jacksonTypeRef<NgnAccountInfo>(),
            )

        assertThat(roundtrippedNgnAccountInfo).isEqualTo(ngnAccountInfo)
    }
}
