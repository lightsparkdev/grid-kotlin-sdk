// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerExportResponseTest {

    @Test
    fun ofInternalAccount() {
        val internalAccount =
            InternalAccountExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                )
                .build()

        val customerExportResponse = CustomerExportResponse.ofInternalAccount(internalAccount)

        assertThat(customerExportResponse.internalAccount()).isEqualTo(internalAccount)
        assertThat(customerExportResponse.walletOperationProcessing()).isNull()
    }

    @Test
    fun ofInternalAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerExportResponse =
            CustomerExportResponse.ofInternalAccount(
                InternalAccountExportResponse.builder()
                    .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .encryptedWalletCredentials(
                        "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                    )
                    .build()
            )

        val roundtrippedCustomerExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerExportResponse),
                jacksonTypeRef<CustomerExportResponse>(),
            )

        assertThat(roundtrippedCustomerExportResponse).isEqualTo(customerExportResponse)
    }

    @Test
    fun ofWalletOperationProcessing() {
        val walletOperationProcessing =
            CustomerExportResponse.WalletOperationProcessing.builder()
                .status(CustomerExportResponse.WalletOperationProcessing.Status.PROCESSING)
                .message("This login is still being processed. Retry the same request in a moment.")
                .build()

        val customerExportResponse =
            CustomerExportResponse.ofWalletOperationProcessing(walletOperationProcessing)

        assertThat(customerExportResponse.internalAccount()).isNull()
        assertThat(customerExportResponse.walletOperationProcessing())
            .isEqualTo(walletOperationProcessing)
    }

    @Test
    fun ofWalletOperationProcessingRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerExportResponse =
            CustomerExportResponse.ofWalletOperationProcessing(
                CustomerExportResponse.WalletOperationProcessing.builder()
                    .status(CustomerExportResponse.WalletOperationProcessing.Status.PROCESSING)
                    .message(
                        "This login is still being processed. Retry the same request in a moment."
                    )
                    .build()
            )

        val roundtrippedCustomerExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerExportResponse),
                jacksonTypeRef<CustomerExportResponse>(),
            )

        assertThat(roundtrippedCustomerExportResponse).isEqualTo(customerExportResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerExportResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerExportResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { customerExportResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
