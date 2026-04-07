// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerCreateParams
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerListParams
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
                    .ownershipPercentage(51L)
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
                            .identifier("123-45-6789")
                            .idType(BeneficialOwnerCreateParams.PersonalInfo.IdType.SSN)
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

        val page =
            beneficialOwnerServiceAsync.list(
                BeneficialOwnerListParams.builder().customerId("customerId").build()
            )

        page.response().validate()
    }
}
