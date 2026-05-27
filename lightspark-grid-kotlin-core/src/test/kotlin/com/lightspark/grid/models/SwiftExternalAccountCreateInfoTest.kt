// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwiftExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val swiftExternalAccountCreateInfo =
            SwiftExternalAccountCreateInfo.builder()
                .accountType(SwiftExternalAccountCreateInfo.AccountType.SWIFT_ACCOUNT)
                .bankName("Deutsche Bank")
                .beneficiary(
                    SwiftExternalAccountCreateInfo.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .country("NG")
                .swiftCode("DEUTDEFF")
                .accountNumber("1234567890")
                .iban("GB29NWBK60161331926819")
                .build()

        assertThat(swiftExternalAccountCreateInfo.accountType())
            .isEqualTo(SwiftExternalAccountCreateInfo.AccountType.SWIFT_ACCOUNT)
        assertThat(swiftExternalAccountCreateInfo.bankName()).isEqualTo("Deutsche Bank")
        assertThat(swiftExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                SwiftExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    SwiftExternalAccountCreateInfo.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(swiftExternalAccountCreateInfo.country()).isEqualTo("NG")
        assertThat(swiftExternalAccountCreateInfo.swiftCode()).isEqualTo("DEUTDEFF")
        assertThat(swiftExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(swiftExternalAccountCreateInfo.iban()).isEqualTo("GB29NWBK60161331926819")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swiftExternalAccountCreateInfo =
            SwiftExternalAccountCreateInfo.builder()
                .accountType(SwiftExternalAccountCreateInfo.AccountType.SWIFT_ACCOUNT)
                .bankName("Deutsche Bank")
                .beneficiary(
                    SwiftExternalAccountCreateInfo.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .country("NG")
                .swiftCode("DEUTDEFF")
                .accountNumber("1234567890")
                .iban("GB29NWBK60161331926819")
                .build()

        val roundtrippedSwiftExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swiftExternalAccountCreateInfo),
                jacksonTypeRef<SwiftExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedSwiftExternalAccountCreateInfo)
            .isEqualTo(swiftExternalAccountCreateInfo)
    }
}
