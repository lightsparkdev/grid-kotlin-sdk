// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualCustomerFieldsTest {

    @Test
    fun create() {
        val individualCustomerFields =
            IndividualCustomerFields.builder()
                .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                .birthDate(LocalDate.parse("1990-01-15"))
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                .nationality("US")
                .build()

        assertThat(individualCustomerFields.customerType())
            .isEqualTo(IndividualCustomerFields.CustomerType.INDIVIDUAL)
        assertThat(individualCustomerFields.address())
            .isEqualTo(
                Address.builder()
                    .country("US")
                    .line1("123 Main Street")
                    .postalCode("94105")
                    .city("San Francisco")
                    .line2("Apt 4B")
                    .state("CA")
                    .build()
            )
        assertThat(individualCustomerFields.birthDate()).isEqualTo(LocalDate.parse("1990-01-15"))
        assertThat(individualCustomerFields.fullName()).isEqualTo("John Michael Doe")
        assertThat(individualCustomerFields.kycStatus())
            .isEqualTo(IndividualCustomerFields.KycStatus.APPROVED)
        assertThat(individualCustomerFields.nationality()).isEqualTo("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualCustomerFields =
            IndividualCustomerFields.builder()
                .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
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
                .birthDate(LocalDate.parse("1990-01-15"))
                .fullName("John Michael Doe")
                .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                .nationality("US")
                .build()

        val roundtrippedIndividualCustomerFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualCustomerFields),
                jacksonTypeRef<IndividualCustomerFields>(),
            )

        assertThat(roundtrippedIndividualCustomerFields).isEqualTo(individualCustomerFields)
    }
}
