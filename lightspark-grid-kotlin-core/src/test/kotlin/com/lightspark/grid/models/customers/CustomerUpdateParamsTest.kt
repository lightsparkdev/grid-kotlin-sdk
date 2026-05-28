// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.JsonValue
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
                CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest.builder()
                    .customerType(JsonValue.from("INDIVIDUAL"))
                    .currencies(listOf("USD", "EUR", "USDC"))
                    .email("john.doe@example.com")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .address(
                        Address.builder()
                            .country("US")
                            .line1("456 Market St")
                            .postalCode("94103")
                            .city("San Francisco")
                            .line2("Apt 4B")
                            .state("CA")
                            .build()
                    )
                    .birthDate(LocalDate.parse("1985-06-15"))
                    .fullName("John Smith")
                    .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                    .nationality("US")
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
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
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
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("456 Market St")
                                .postalCode("94103")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate(LocalDate.parse("1985-06-15"))
                        .fullName("John Smith")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
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
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
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
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("456 Market St")
                                .postalCode("94103")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate(LocalDate.parse("1985-06-15"))
                        .fullName("John Smith")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerUpdateParams.UpdateCustomerRequest.ofIndividualCustomerUpdate(
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .currencies(listOf("USD", "EUR", "USDC"))
                        .email("john.doe@example.com")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("456 Market St")
                                .postalCode("94103")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate(LocalDate.parse("1985-06-15"))
                        .fullName("John Smith")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
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
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerUpdateParams.UpdateCustomerRequest.ofIndividualCustomerUpdate(
                    CustomerUpdateParams.UpdateCustomerRequest.IndividualCustomerUpdateRequest
                        .builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .build()
                )
            )
    }
}
