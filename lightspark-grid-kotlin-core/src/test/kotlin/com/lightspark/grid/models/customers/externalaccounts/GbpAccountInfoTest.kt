// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpAccountInfoTest {

    @Test
    fun create() {
        val gbpAccountInfo =
            GbpAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
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
                .sortCode("20-00-00")
                .build()

        assertThat(gbpAccountInfo.accountNumber()).isEqualTo("12345678")
        assertThat(gbpAccountInfo.accountType()).isEqualTo(GbpAccountInfo.AccountType.GBP_ACCOUNT)
        assertThat(gbpAccountInfo.beneficiary())
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
        assertThat(gbpAccountInfo.sortCode()).isEqualTo("20-00-00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpAccountInfo =
            GbpAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
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
                .sortCode("20-00-00")
                .build()

        val roundtrippedGbpAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpAccountInfo),
                jacksonTypeRef<GbpAccountInfo>(),
            )

        assertThat(roundtrippedGbpAccountInfo).isEqualTo(gbpAccountInfo)
    }
}
