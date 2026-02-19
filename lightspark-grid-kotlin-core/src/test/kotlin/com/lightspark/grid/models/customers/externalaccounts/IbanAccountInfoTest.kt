// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IbanAccountInfoTest {

    @Test
    fun create() {
        val ibanAccountInfo =
            IbanAccountInfo.builder()
                .accountType(IbanAccountInfo.AccountType.IBAN)
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
                .iban("DE89370400440532013000")
                .swiftBic("DEUTDEFF")
                .build()

        assertThat(ibanAccountInfo.accountType()).isEqualTo(IbanAccountInfo.AccountType.IBAN)
        assertThat(ibanAccountInfo.beneficiary())
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
        assertThat(ibanAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(ibanAccountInfo.swiftBic()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ibanAccountInfo =
            IbanAccountInfo.builder()
                .accountType(IbanAccountInfo.AccountType.IBAN)
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
                .iban("DE89370400440532013000")
                .swiftBic("DEUTDEFF")
                .build()

        val roundtrippedIbanAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ibanAccountInfo),
                jacksonTypeRef<IbanAccountInfo>(),
            )

        assertThat(roundtrippedIbanAccountInfo).isEqualTo(ibanAccountInfo)
    }
}
