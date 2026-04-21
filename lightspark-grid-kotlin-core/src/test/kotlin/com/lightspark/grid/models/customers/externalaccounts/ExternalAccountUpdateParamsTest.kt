// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountUpdateParamsTest {

    @Test
    fun create() {
        ExternalAccountUpdateParams.builder()
            .externalAccountId("externalAccountId")
            .beneficiary(
                ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary.builder()
                    .beneficiaryType(
                        ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary
                            .BeneficiaryType
                            .INDIVIDUAL
                    )
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .fullName("John Michael Doe")
                    .nationality("US")
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
                    .build()
            )
            .platformAccountId("ext_acc_654321")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountUpdateParams.builder().externalAccountId("externalAccountId").build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountUpdateParams.builder()
                .externalAccountId("externalAccountId")
                .beneficiary(
                    ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary.builder()
                        .beneficiaryType(
                            ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary
                                .BeneficiaryType
                                .INDIVIDUAL
                        )
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
                        .nationality("US")
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
                        .build()
                )
                .platformAccountId("ext_acc_654321")
                .build()

        val body = params._body()

        assertThat(body.beneficiary())
            .isEqualTo(
                ExternalAccountUpdateParams.Beneficiary.ofIndividual(
                    ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary.builder()
                        .beneficiaryType(
                            ExternalAccountUpdateParams.Beneficiary.IndividualBeneficiary
                                .BeneficiaryType
                                .INDIVIDUAL
                        )
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
                        .nationality("US")
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
                        .build()
                )
            )
        assertThat(body.platformAccountId()).isEqualTo("ext_acc_654321")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountUpdateParams.builder().externalAccountId("externalAccountId").build()

        val body = params._body()
    }
}
