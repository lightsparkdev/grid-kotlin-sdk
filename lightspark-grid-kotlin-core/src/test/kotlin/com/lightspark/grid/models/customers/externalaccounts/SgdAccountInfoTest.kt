// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdAccountInfoTest {

    @Test
    fun create() {
        val sgdAccountInfo =
            SgdAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
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
                .swiftCode("DBSSSGSG")
                .build()

        assertThat(sgdAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdAccountInfo.accountType()).isEqualTo(SgdAccountInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdAccountInfo.bankName()).isEqualTo("DBS Bank Ltd")
        assertThat(sgdAccountInfo.beneficiary())
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
        assertThat(sgdAccountInfo.swiftCode()).isEqualTo("DBSSSGSG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdAccountInfo =
            SgdAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
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
                .swiftCode("DBSSSGSG")
                .build()

        val roundtrippedSgdAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdAccountInfo),
                jacksonTypeRef<SgdAccountInfo>(),
            )

        assertThat(roundtrippedSgdAccountInfo).isEqualTo(sgdAccountInfo)
    }
}
