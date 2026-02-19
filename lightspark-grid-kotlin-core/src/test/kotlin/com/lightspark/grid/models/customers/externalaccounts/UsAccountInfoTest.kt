// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsAccountInfoTest {

    @Test
    fun create() {
        val usAccountInfo =
            UsAccountInfo.builder()
                .accountCategory(UsAccountInfo.AccountCategory.CHECKING)
                .accountNumber("123456789")
                .accountType(UsAccountInfo.AccountType.US_ACCOUNT)
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
                .routingNumber("987654321")
                .bankName("Chase Bank")
                .build()

        assertThat(usAccountInfo.accountCategory())
            .isEqualTo(UsAccountInfo.AccountCategory.CHECKING)
        assertThat(usAccountInfo.accountNumber()).isEqualTo("123456789")
        assertThat(usAccountInfo.accountType()).isEqualTo(UsAccountInfo.AccountType.US_ACCOUNT)
        assertThat(usAccountInfo.beneficiary())
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
        assertThat(usAccountInfo.routingNumber()).isEqualTo("987654321")
        assertThat(usAccountInfo.bankName()).isEqualTo("Chase Bank")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usAccountInfo =
            UsAccountInfo.builder()
                .accountCategory(UsAccountInfo.AccountCategory.CHECKING)
                .accountNumber("123456789")
                .accountType(UsAccountInfo.AccountType.US_ACCOUNT)
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
                .routingNumber("987654321")
                .bankName("Chase Bank")
                .build()

        val roundtrippedUsAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usAccountInfo),
                jacksonTypeRef<UsAccountInfo>(),
            )

        assertThat(roundtrippedUsAccountInfo).isEqualTo(usAccountInfo)
    }
}
