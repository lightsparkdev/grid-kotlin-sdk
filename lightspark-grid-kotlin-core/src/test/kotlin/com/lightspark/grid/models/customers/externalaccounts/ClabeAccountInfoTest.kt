// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClabeAccountInfoTest {

    @Test
    fun create() {
        val clabeAccountInfo =
            ClabeAccountInfo.builder()
                .accountType(ClabeAccountInfo.AccountType.CLABE)
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
                .clabeNumber("123456789012345678")
                .build()

        assertThat(clabeAccountInfo.accountType()).isEqualTo(ClabeAccountInfo.AccountType.CLABE)
        assertThat(clabeAccountInfo.beneficiary())
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
        assertThat(clabeAccountInfo.clabeNumber()).isEqualTo("123456789012345678")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clabeAccountInfo =
            ClabeAccountInfo.builder()
                .accountType(ClabeAccountInfo.AccountType.CLABE)
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
                .clabeNumber("123456789012345678")
                .build()

        val roundtrippedClabeAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clabeAccountInfo),
                jacksonTypeRef<ClabeAccountInfo>(),
            )

        assertThat(roundtrippedClabeAccountInfo).isEqualTo(clabeAccountInfo)
    }
}
