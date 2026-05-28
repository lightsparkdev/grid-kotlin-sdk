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
            .beneficialOwnerUpdateRequest(
                BeneficialOwnerUpdateRequest.builder()
                    .ownershipPercentage(51L)
                    .personalInfo(
                        BeneficialOwnerPersonalInfoUpdate.builder()
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
                            .idType(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
                            .lastName("Smith")
                            .middleName("Marie")
                            .nationality("US")
                            .phoneNumber("+14155550192")
                            .build()
                    )
                    .addRole(BeneficialOwnerRole.UBO)
                    .addRole(BeneficialOwnerRole.DIRECTOR)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .beneficialOwnerId("beneficialOwnerId")
                .beneficialOwnerUpdateRequest(BeneficialOwnerUpdateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("beneficialOwnerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .beneficialOwnerId("beneficialOwnerId")
                .beneficialOwnerUpdateRequest(
                    BeneficialOwnerUpdateRequest.builder()
                        .ownershipPercentage(51L)
                        .personalInfo(
                            BeneficialOwnerPersonalInfoUpdate.builder()
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
                                .idType(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
                                .lastName("Smith")
                                .middleName("Marie")
                                .nationality("US")
                                .phoneNumber("+14155550192")
                                .build()
                        )
                        .addRole(BeneficialOwnerRole.UBO)
                        .addRole(BeneficialOwnerRole.DIRECTOR)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BeneficialOwnerUpdateRequest.builder()
                    .ownershipPercentage(51L)
                    .personalInfo(
                        BeneficialOwnerPersonalInfoUpdate.builder()
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
                            .idType(BeneficialOwnerPersonalInfoUpdate.IdType.SSN)
                            .lastName("Smith")
                            .middleName("Marie")
                            .nationality("US")
                            .phoneNumber("+14155550192")
                            .build()
                    )
                    .addRole(BeneficialOwnerRole.UBO)
                    .addRole(BeneficialOwnerRole.DIRECTOR)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .beneficialOwnerId("beneficialOwnerId")
                .beneficialOwnerUpdateRequest(BeneficialOwnerUpdateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BeneficialOwnerUpdateRequest.builder().build())
    }
}
