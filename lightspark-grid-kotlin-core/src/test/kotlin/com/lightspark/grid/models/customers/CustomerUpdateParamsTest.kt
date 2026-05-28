// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .customerId("customerId")
            .gridWalletSignature(
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
            )
            .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
            .updateCustomerRequest(
                IndividualCustomerUpdateRequest.builder()
                    .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                    .currencies(listOf("USD", "EUR", "USDC"))
                    .email("john.doe@example.com")
                    .fullName("John Michael Doe")
                    .kycStatus(KycStatus.APPROVED)
                    .nationality("US")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customerId")
                .updateCustomerRequest(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customerId")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .updateCustomerRequest(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .fullName("John Michael Doe")
                        .kycStatus(KycStatus.APPROVED)
                        .nationality("US")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ",
                    )
                    .put("Request-Id", "Request:019542f5-b3e7-1d02-0000-000000000010")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customerId")
                .updateCustomerRequest(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customerId")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .updateCustomerRequest(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .fullName("John Michael Doe")
                        .kycStatus(KycStatus.APPROVED)
                        .nationality("US")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerUpdateRequestOneOf.ofIndividual(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
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
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .fullName("John Michael Doe")
                        .kycStatus(KycStatus.APPROVED)
                        .nationality("US")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customerId")
                .updateCustomerRequest(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerUpdateRequestOneOf.ofIndividual(
                    IndividualCustomerUpdateRequest.builder()
                        .customerType(IndividualCustomerUpdateRequest.CustomerType.INDIVIDUAL)
                        .build()
                )
            )
    }
}
