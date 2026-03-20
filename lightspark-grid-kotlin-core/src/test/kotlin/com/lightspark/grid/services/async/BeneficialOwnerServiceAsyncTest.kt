// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerUpdateParams
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BeneficialOwnerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val beneficialOwner =
            beneficialOwnerServiceAsync.create(
                BeneficialOwnerCreateParams.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .personalInfo(
                        BeneficialOwnerCreateParams.PersonalInfo.builder()
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
                            .lastName("Smith")
                            .nationality("US")
                            .personalIds(
                                BeneficialOwnerCreateParams.PersonalInfo.PersonalIds.builder()
                                    .identifier("123-45-6789")
                                    .idType(
                                        BeneficialOwnerCreateParams.PersonalInfo.PersonalIds.IdType
                                            .SSN
                                    )
                                    .countryOfIssuance("US")
                                    .build()
                            )
                            .email("jane.smith@acmecorp.com")
                            .middleName("Marie")
                            .phoneNumber("+14155550192")
                            .build()
                    )
                    .addRole(BeneficialOwnerCreateParams.Role.UBO)
                    .addRole(BeneficialOwnerCreateParams.Role.DIRECTOR)
                    .ownershipPercentage(51.0f)
                    .build()
            )

        beneficialOwner.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val beneficialOwner = beneficialOwnerServiceAsync.retrieve("beneficialOwnerId")

        beneficialOwner.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val beneficialOwner =
            beneficialOwnerServiceAsync.update(
                BeneficialOwnerUpdateParams.builder()
                    .beneficialOwnerId("beneficialOwnerId")
                    .ownershipPercentage(51.0f)
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
                            .email("jane.smith@acmecorp.com")
                            .firstName("Jane")
                            .lastName("Smith")
                            .middleName("Marie")
                            .nationality("US")
                            .personalIds(
                                BeneficialOwnerUpdateParams.PersonalInfo.PersonalIds.builder()
                                    .identifier("123-45-6789")
                                    .idType(
                                        BeneficialOwnerUpdateParams.PersonalInfo.PersonalIds.IdType
                                            .SSN
                                    )
                                    .countryOfIssuance("US")
                                    .build()
                            )
                            .phoneNumber("+14155550192")
                            .build()
                    )
                    .addRole(BeneficialOwnerUpdateParams.Role.UBO)
                    .addRole(BeneficialOwnerUpdateParams.Role.DIRECTOR)
                    .build()
            )

        beneficialOwner.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val beneficialOwnerServiceAsync = client.beneficialOwners()

        val page = beneficialOwnerServiceAsync.list()

        page.response().validate()
    }
}
