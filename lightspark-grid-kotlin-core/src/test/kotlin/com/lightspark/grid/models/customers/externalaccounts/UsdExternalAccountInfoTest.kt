// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdExternalAccountInfoTest {

    @Test
    fun create() {
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .address(
                            UsdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .routingNumber("routingNumber")
                .build()

        assertThat(usdExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(usdExternalAccountInfo.accountType())
            .isEqualTo(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
        assertThat(usdExternalAccountInfo.beneficiary())
            .isEqualTo(
                UsdExternalAccountInfo.Beneficiary.ofIndividual(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .address(
                            UsdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(usdExternalAccountInfo.routingNumber()).isEqualTo("routingNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .address(
                            UsdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .routingNumber("routingNumber")
                .build()

        val roundtrippedUsdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdExternalAccountInfo),
                jacksonTypeRef<UsdExternalAccountInfo>(),
            )

        assertThat(roundtrippedUsdExternalAccountInfo).isEqualTo(usdExternalAccountInfo)
    }
}
