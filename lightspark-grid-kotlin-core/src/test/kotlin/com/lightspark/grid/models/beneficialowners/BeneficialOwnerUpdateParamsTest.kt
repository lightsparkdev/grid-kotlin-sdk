// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerUpdateParamsTest {

    @Test
    fun create() {
        BeneficialOwnerUpdateParams.builder()
            .beneficialOwnerId("beneficialOwnerId")
            .ownershipPercentage(51L)
            .personalInfo(
                BeneficialOwnerUpdateParams.PersonalInfo.builder()
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
                    .birthDate(LocalDate.parse("1978-06-15"))
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .firstName("Jane")
                    .identifier("123-45-6789")
                    .idType(BeneficialOwnerUpdateParams.PersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .middleName("Marie")
                    .nationality("US")
                    .phoneNumber("+14155550192")
                    .build()
            )
            .addRole(BeneficialOwnerUpdateParams.Role.UBO)
            .addRole(BeneficialOwnerUpdateParams.Role.DIRECTOR)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BeneficialOwnerUpdateParams.builder().beneficialOwnerId("beneficialOwnerId").build()

        assertThat(params._pathParam(0)).isEqualTo("beneficialOwnerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .beneficialOwnerId("beneficialOwnerId")
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerUpdateParams.PersonalInfo.builder()
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
                        .birthDate(LocalDate.parse("1978-06-15"))
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .firstName("Jane")
                        .identifier("123-45-6789")
                        .idType(BeneficialOwnerUpdateParams.PersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .middleName("Marie")
                        .nationality("US")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerUpdateParams.Role.UBO)
                .addRole(BeneficialOwnerUpdateParams.Role.DIRECTOR)
                .build()

        val body = params._body()

        assertThat(body.ownershipPercentage()).isEqualTo(51L)
        assertThat(body.personalInfo())
            .isEqualTo(
                BeneficialOwnerUpdateParams.PersonalInfo.builder()
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
                    .birthDate(LocalDate.parse("1978-06-15"))
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .firstName("Jane")
                    .identifier("123-45-6789")
                    .idType(BeneficialOwnerUpdateParams.PersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .middleName("Marie")
                    .nationality("US")
                    .phoneNumber("+14155550192")
                    .build()
            )
        assertThat(body.roles())
            .containsExactly(
                BeneficialOwnerUpdateParams.Role.UBO,
                BeneficialOwnerUpdateParams.Role.DIRECTOR,
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeneficialOwnerUpdateParams.builder().beneficialOwnerId("beneficialOwnerId").build()

        val body = params._body()
    }
}
