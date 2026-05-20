// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerCreateParamsTest {

    @Test
    fun create() {
        BeneficialOwnerCreateParams.builder()
            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
            .ownershipPercentage(51L)
            .personalInfo(
                BeneficialOwnerPersonalInfo.builder()
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
                    .firstName("Jane")
                    .identifier("123-45-6789")
                    .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .nationality("US")
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .middleName("Marie")
                    .phoneNumber("+14155550192")
                    .build()
            )
            .addRole(BeneficialOwnerCreateParams.Role.UBO)
            .addRole(BeneficialOwnerCreateParams.Role.DIRECTOR)
            .build()
    }

    @Test
    fun body() {
        val params =
            BeneficialOwnerCreateParams.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerPersonalInfo.builder()
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
                        .firstName("Jane")
                        .identifier("123-45-6789")
                        .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .countryOfIssuance("US")
                        .email("jane.smith@acmecorp.com")
                        .middleName("Marie")
                        .phoneNumber("+14155550192")
                        .build()
                )
                .addRole(BeneficialOwnerCreateParams.Role.UBO)
                .addRole(BeneficialOwnerCreateParams.Role.DIRECTOR)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.ownershipPercentage()).isEqualTo(51L)
        assertThat(body.personalInfo())
            .isEqualTo(
                BeneficialOwnerPersonalInfo.builder()
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
                    .firstName("Jane")
                    .identifier("123-45-6789")
                    .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .nationality("US")
                    .countryOfIssuance("US")
                    .email("jane.smith@acmecorp.com")
                    .middleName("Marie")
                    .phoneNumber("+14155550192")
                    .build()
            )
        assertThat(body.roles())
            .containsExactly(
                BeneficialOwnerCreateParams.Role.UBO,
                BeneficialOwnerCreateParams.Role.DIRECTOR,
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeneficialOwnerCreateParams.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .ownershipPercentage(51L)
                .personalInfo(
                    BeneficialOwnerPersonalInfo.builder()
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .build()
                        )
                        .birthDate(LocalDate.parse("1978-06-15"))
                        .firstName("Jane")
                        .identifier("123-45-6789")
                        .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                        .lastName("Smith")
                        .nationality("US")
                        .build()
                )
                .addRole(BeneficialOwnerCreateParams.Role.UBO)
                .addRole(BeneficialOwnerCreateParams.Role.DIRECTOR)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.ownershipPercentage()).isEqualTo(51L)
        assertThat(body.personalInfo())
            .isEqualTo(
                BeneficialOwnerPersonalInfo.builder()
                    .address(
                        Address.builder()
                            .country("US")
                            .line1("123 Main Street")
                            .postalCode("94105")
                            .build()
                    )
                    .birthDate(LocalDate.parse("1978-06-15"))
                    .firstName("Jane")
                    .identifier("123-45-6789")
                    .idType(BeneficialOwnerPersonalInfo.IdType.SSN)
                    .lastName("Smith")
                    .nationality("US")
                    .build()
            )
        assertThat(body.roles())
            .containsExactly(
                BeneficialOwnerCreateParams.Role.UBO,
                BeneficialOwnerCreateParams.Role.DIRECTOR,
            )
    }
}
