// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.SlvBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExternalAccountInfoOneOfTest {

    @Test
    fun ofSlvAccount() {
        val slvAccount =
            ExternalAccountInfoOneOf.SlvAccount.builder()
                .beneficiary(
                    SlvBeneficiary.builder()
                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
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
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .addPaymentRail(ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER)
                .accountNumber("0123456789")
                .bankAccountType(ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING)
                .bankName("Banco Cuscatlan")
                .phoneNumber("+50312345678")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSlvAccount(slvAccount)

        assertThat(externalAccountInfoOneOf.slvAccount()).isEqualTo(slvAccount)
        assertThat(externalAccountInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofSlvAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSlvAccount(
                ExternalAccountInfoOneOf.SlvAccount.builder()
                    .beneficiary(
                        SlvBeneficiary.builder()
                            .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
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
                            .birthDate("birthDate")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("nationality")
                            .phoneNumber("phoneNumber")
                            .build()
                    )
                    .addPaymentRail(ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER)
                    .accountNumber("0123456789")
                    .bankAccountType(ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING)
                    .bankName("Banco Cuscatlan")
                    .phoneNumber("+50312345678")
                    .build()
            )

        val roundtrippedExternalAccountInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountInfoOneOf),
                jacksonTypeRef<ExternalAccountInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountInfoOneOf).isEqualTo(externalAccountInfoOneOf)
    }

    @Test
    fun ofSwiftAccount() {
        val swiftAccount =
            ExternalAccountInfoOneOf.SwiftAccount.builder()
                .bankName("Deutsche Bank")
                .beneficiary(
                    ExternalAccountInfoOneOf.SwiftAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
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
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .country("NG")
                .addPaymentRail(ExternalAccountInfoOneOf.SwiftAccount.PaymentRail.SWIFT)
                .swiftCode("DEUTDEFF")
                .accountNumber("1234567890")
                .iban("GB29NWBK60161331926819")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSwiftAccount(swiftAccount)

        assertThat(externalAccountInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountInfoOneOf.swiftAccount()).isEqualTo(swiftAccount)
    }

    @Test
    fun ofSwiftAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSwiftAccount(
                ExternalAccountInfoOneOf.SwiftAccount.builder()
                    .bankName("Deutsche Bank")
                    .beneficiary(
                        ExternalAccountInfoOneOf.SwiftAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
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
                            .birthDate("birthDate")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("nationality")
                            .phoneNumber("phoneNumber")
                            .build()
                    )
                    .country("NG")
                    .addPaymentRail(ExternalAccountInfoOneOf.SwiftAccount.PaymentRail.SWIFT)
                    .swiftCode("DEUTDEFF")
                    .accountNumber("1234567890")
                    .iban("GB29NWBK60161331926819")
                    .build()
            )

        val roundtrippedExternalAccountInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountInfoOneOf),
                jacksonTypeRef<ExternalAccountInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountInfoOneOf).isEqualTo(externalAccountInfoOneOf)
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
        val externalAccountInfoOneOf =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ExternalAccountInfoOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { externalAccountInfoOneOf.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
