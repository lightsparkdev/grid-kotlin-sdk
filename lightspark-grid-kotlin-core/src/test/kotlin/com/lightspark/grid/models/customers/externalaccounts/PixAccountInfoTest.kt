// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PixAccountInfoTest {

    @Test
    fun create() {
        val pixAccountInfo =
            PixAccountInfo.builder()
                .accountType(PixAccountInfo.AccountType.PIX)
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
                .pixKey("55119876543210")
                .pixKeyType(PixAccountInfo.PixKeyType.PHONE)
                .taxId("1234567890")
                .build()

        assertThat(pixAccountInfo.accountType()).isEqualTo(PixAccountInfo.AccountType.PIX)
        assertThat(pixAccountInfo.beneficiary())
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
        assertThat(pixAccountInfo.pixKey()).isEqualTo("55119876543210")
        assertThat(pixAccountInfo.pixKeyType()).isEqualTo(PixAccountInfo.PixKeyType.PHONE)
        assertThat(pixAccountInfo.taxId()).isEqualTo("1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pixAccountInfo =
            PixAccountInfo.builder()
                .accountType(PixAccountInfo.AccountType.PIX)
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
                .pixKey("55119876543210")
                .pixKeyType(PixAccountInfo.PixKeyType.PHONE)
                .taxId("1234567890")
                .build()

        val roundtrippedPixAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pixAccountInfo),
                jacksonTypeRef<PixAccountInfo>(),
            )

        assertThat(roundtrippedPixAccountInfo).isEqualTo(pixAccountInfo)
    }
}
