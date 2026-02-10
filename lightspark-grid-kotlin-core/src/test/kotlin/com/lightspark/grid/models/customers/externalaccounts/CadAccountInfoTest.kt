// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadAccountInfoTest {

    @Test
    fun create() {
        val cadAccountInfo =
            CadAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
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
                .branchCode("00012")
                .build()

        assertThat(cadAccountInfo.accountNumber()).isEqualTo("1234567")
        assertThat(cadAccountInfo.accountType()).isEqualTo(CadAccountInfo.AccountType.CAD_ACCOUNT)
        assertThat(cadAccountInfo.bankCode()).isEqualTo("001")
        assertThat(cadAccountInfo.beneficiary())
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
        assertThat(cadAccountInfo.branchCode()).isEqualTo("00012")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cadAccountInfo =
            CadAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
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
                .branchCode("00012")
                .build()

        val roundtrippedCadAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadAccountInfo),
                jacksonTypeRef<CadAccountInfo>(),
            )

        assertThat(roundtrippedCadAccountInfo).isEqualTo(cadAccountInfo)
    }
}
