// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpiAccountInfoTest {

    @Test
    fun create() {
        val upiAccountInfo =
            UpiAccountInfo.builder()
                .accountType(UpiAccountInfo.AccountType.UPI)
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
                .vpa("somecustomers@okbank")
                .build()

        assertThat(upiAccountInfo.accountType()).isEqualTo(UpiAccountInfo.AccountType.UPI)
        assertThat(upiAccountInfo.beneficiary())
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
        assertThat(upiAccountInfo.vpa()).isEqualTo("somecustomers@okbank")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val upiAccountInfo =
            UpiAccountInfo.builder()
                .accountType(UpiAccountInfo.AccountType.UPI)
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
                .vpa("somecustomers@okbank")
                .build()

        val roundtrippedUpiAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(upiAccountInfo),
                jacksonTypeRef<UpiAccountInfo>(),
            )

        assertThat(roundtrippedUpiAccountInfo).isEqualTo(upiAccountInfo)
    }
}
