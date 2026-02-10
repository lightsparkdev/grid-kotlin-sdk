// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpAccountInfoTest {

    @Test
    fun create() {
        val phpAccountInfo =
            PhpAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
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
                .build()

        assertThat(phpAccountInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpAccountInfo.accountType()).isEqualTo(PhpAccountInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpAccountInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpAccountInfo.beneficiary())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpAccountInfo =
            PhpAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
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
                .build()

        val roundtrippedPhpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpAccountInfo),
                jacksonTypeRef<PhpAccountInfo>(),
            )

        assertThat(roundtrippedPhpAccountInfo).isEqualTo(phpAccountInfo)
    }
}
