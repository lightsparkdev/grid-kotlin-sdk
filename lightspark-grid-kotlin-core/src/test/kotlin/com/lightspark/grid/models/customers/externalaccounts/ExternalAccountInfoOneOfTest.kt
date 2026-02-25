// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExternalAccountInfoOneOfTest {

    @Test
    fun ofBrlAccount() {
        val brlAccount =
            ExternalAccountInfoOneOf.BrlAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isEqualTo(brlAccount)
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofBrlAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBrlAccount(
                ExternalAccountInfoOneOf.BrlAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.BrlAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.BrlAccount.Country.BR)
                    .addPaymentRail(ExternalAccountInfoOneOf.BrlAccount.PaymentRail.PIX)
                    .pixKey("pixKey")
                    .pixKeyType("pixKeyType")
                    .taxId("taxId")
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
    fun ofDkkAccount() {
        val dkkAccount =
            ExternalAccountInfoOneOf.DkkAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.DkkAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.DkkAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.DkkAccount.Country.DK)
                .iban("iban")
                .addPaymentRail(ExternalAccountInfoOneOf.DkkAccount.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isEqualTo(dkkAccount)
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofDkkAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofDkkAccount(
                ExternalAccountInfoOneOf.DkkAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.DkkAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.DkkAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.DkkAccount.Country.DK)
                    .iban("iban")
                    .addPaymentRail(ExternalAccountInfoOneOf.DkkAccount.PaymentRail.SEPA)
                    .swiftBic("swiftBic")
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
    fun ofEurAccount() {
        val eurAccount =
            ExternalAccountInfoOneOf.EurAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.EurAccount.Country.AT)
                .iban("iban")
                .addPaymentRail(ExternalAccountInfoOneOf.EurAccount.PaymentRail.SEPA)
                .swiftBic("swiftBic")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofEurAccount(eurAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isEqualTo(eurAccount)
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofEurAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEurAccount(
                ExternalAccountInfoOneOf.EurAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.EurAccount.Country.AT)
                    .iban("iban")
                    .addPaymentRail(ExternalAccountInfoOneOf.EurAccount.PaymentRail.SEPA)
                    .swiftBic("swiftBic")
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
    fun ofGbpAccount() {
        val gbpAccount =
            ExternalAccountInfoOneOf.GbpAccount.builder()
                .accountNumber("12345678")
                .beneficiary(
                    ExternalAccountInfoOneOf.GbpAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.GbpAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.GbpAccount.Country.GB)
                .addPaymentRail(ExternalAccountInfoOneOf.GbpAccount.PaymentRail.FASTER_PAYMENTS)
                .sortCode("20-00-00")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isEqualTo(gbpAccount)
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofGbpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofGbpAccount(
                ExternalAccountInfoOneOf.GbpAccount.builder()
                    .accountNumber("12345678")
                    .beneficiary(
                        ExternalAccountInfoOneOf.GbpAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.GbpAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.GbpAccount.Country.GB)
                    .addPaymentRail(ExternalAccountInfoOneOf.GbpAccount.PaymentRail.FASTER_PAYMENTS)
                    .sortCode("20-00-00")
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
    fun ofHkdAccount() {
        val hkdAccount =
            ExternalAccountInfoOneOf.HkdAccount.builder()
                .accountNumber("accountNumber")
                .bankName("bankName")
                .beneficiary(
                    ExternalAccountInfoOneOf.HkdAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.HkdAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.HkdAccount.Country.HK)
                .addPaymentRail(ExternalAccountInfoOneOf.HkdAccount.PaymentRail.BANK_TRANSFER)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isEqualTo(hkdAccount)
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofHkdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofHkdAccount(
                ExternalAccountInfoOneOf.HkdAccount.builder()
                    .accountNumber("accountNumber")
                    .bankName("bankName")
                    .beneficiary(
                        ExternalAccountInfoOneOf.HkdAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.HkdAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.HkdAccount.Country.HK)
                    .addPaymentRail(ExternalAccountInfoOneOf.HkdAccount.PaymentRail.BANK_TRANSFER)
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
    fun ofIdrAccount() {
        val idrAccount =
            ExternalAccountInfoOneOf.IdrAccount.builder()
                .accountNumber("accountNumber")
                .beneficiary(
                    ExternalAccountInfoOneOf.IdrAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.IdrAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.IdrAccount.Country.ID)
                .addPaymentRail(ExternalAccountInfoOneOf.IdrAccount.PaymentRail.BANK_TRANSFER)
                .sortCode("sortCode")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isEqualTo(idrAccount)
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofIdrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofIdrAccount(
                ExternalAccountInfoOneOf.IdrAccount.builder()
                    .accountNumber("accountNumber")
                    .beneficiary(
                        ExternalAccountInfoOneOf.IdrAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.IdrAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.IdrAccount.Country.ID)
                    .addPaymentRail(ExternalAccountInfoOneOf.IdrAccount.PaymentRail.BANK_TRANSFER)
                    .sortCode("sortCode")
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
    fun ofInrAccount() {
        val inrAccount =
            ExternalAccountInfoOneOf.InrAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.InrAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.InrAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.InrAccount.Country.IN)
                .addPaymentRail(ExternalAccountInfoOneOf.InrAccount.PaymentRail.UPI)
                .vpa("vpa")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofInrAccount(inrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isEqualTo(inrAccount)
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofInrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofInrAccount(
                ExternalAccountInfoOneOf.InrAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.InrAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.InrAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.InrAccount.Country.IN)
                    .addPaymentRail(ExternalAccountInfoOneOf.InrAccount.PaymentRail.UPI)
                    .vpa("vpa")
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
    fun ofMxnAccount() {
        val mxnAccount =
            ExternalAccountInfoOneOf.MxnAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.MxnAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.MxnAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .clabeNumber("123456789012345678")
                .addCountry(ExternalAccountInfoOneOf.MxnAccount.Country.MX)
                .addPaymentRail(ExternalAccountInfoOneOf.MxnAccount.PaymentRail.SPEI)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isEqualTo(mxnAccount)
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofMxnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMxnAccount(
                ExternalAccountInfoOneOf.MxnAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.MxnAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.MxnAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .clabeNumber("123456789012345678")
                    .addCountry(ExternalAccountInfoOneOf.MxnAccount.Country.MX)
                    .addPaymentRail(ExternalAccountInfoOneOf.MxnAccount.PaymentRail.SPEI)
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
    fun ofMyrAccount() {
        val myrAccount =
            ExternalAccountInfoOneOf.MyrAccount.builder()
                .accountNumber("accountNumber")
                .bankName("bankName")
                .beneficiary(
                    ExternalAccountInfoOneOf.MyrAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.MyrAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.MyrAccount.Country.MY)
                .addPaymentRail(ExternalAccountInfoOneOf.MyrAccount.PaymentRail.BANK_TRANSFER)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMyrAccount(myrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isEqualTo(myrAccount)
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofMyrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMyrAccount(
                ExternalAccountInfoOneOf.MyrAccount.builder()
                    .accountNumber("accountNumber")
                    .bankName("bankName")
                    .beneficiary(
                        ExternalAccountInfoOneOf.MyrAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.MyrAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.MyrAccount.Country.MY)
                    .addPaymentRail(ExternalAccountInfoOneOf.MyrAccount.PaymentRail.BANK_TRANSFER)
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
    fun ofPhpAccount() {
        val phpAccount =
            ExternalAccountInfoOneOf.PhpAccount.builder()
                .accountNumber("001234567890")
                .bankName("BDO Unibank")
                .beneficiary(
                    ExternalAccountInfoOneOf.PhpAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.PhpAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.PhpAccount.Country.PH)
                .addPaymentRail(ExternalAccountInfoOneOf.PhpAccount.PaymentRail.BANK_TRANSFER)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isEqualTo(phpAccount)
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofPhpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPhpAccount(
                ExternalAccountInfoOneOf.PhpAccount.builder()
                    .accountNumber("001234567890")
                    .bankName("BDO Unibank")
                    .beneficiary(
                        ExternalAccountInfoOneOf.PhpAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.PhpAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.PhpAccount.Country.PH)
                    .addPaymentRail(ExternalAccountInfoOneOf.PhpAccount.PaymentRail.BANK_TRANSFER)
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
    fun ofSgdAccount() {
        val sgdAccount =
            ExternalAccountInfoOneOf.SgdAccount.builder()
                .accountNumber("0123456789")
                .bankName("DBS Bank Ltd")
                .beneficiary(
                    ExternalAccountInfoOneOf.SgdAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.SgdAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.SgdAccount.Country.SG)
                .addPaymentRail(ExternalAccountInfoOneOf.SgdAccount.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isEqualTo(sgdAccount)
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofSgdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSgdAccount(
                ExternalAccountInfoOneOf.SgdAccount.builder()
                    .accountNumber("0123456789")
                    .bankName("DBS Bank Ltd")
                    .beneficiary(
                        ExternalAccountInfoOneOf.SgdAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.SgdAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.SgdAccount.Country.SG)
                    .addPaymentRail(ExternalAccountInfoOneOf.SgdAccount.PaymentRail.PAYNOW)
                    .swiftCode("DBSSSGSG")
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
    fun ofThbAccount() {
        val thbAccount =
            ExternalAccountInfoOneOf.ThbAccount.builder()
                .accountNumber("accountNumber")
                .bankName("bankName")
                .beneficiary(
                    ExternalAccountInfoOneOf.ThbAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.ThbAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.ThbAccount.Country.TH)
                .addPaymentRail(ExternalAccountInfoOneOf.ThbAccount.PaymentRail.BANK_TRANSFER)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofThbAccount(thbAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isEqualTo(thbAccount)
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofThbAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofThbAccount(
                ExternalAccountInfoOneOf.ThbAccount.builder()
                    .accountNumber("accountNumber")
                    .bankName("bankName")
                    .beneficiary(
                        ExternalAccountInfoOneOf.ThbAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.ThbAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.ThbAccount.Country.TH)
                    .addPaymentRail(ExternalAccountInfoOneOf.ThbAccount.PaymentRail.BANK_TRANSFER)
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
    fun ofUsdAccount() {
        val usdAccount =
            ExternalAccountInfoOneOf.UsdAccount.builder()
                .accountNumber("accountNumber")
                .beneficiary(
                    ExternalAccountInfoOneOf.UsdAccount.Beneficiary.Individual.builder()
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .address(
                            ExternalAccountInfoOneOf.UsdAccount.Beneficiary.Individual.Address
                                .builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.UsdAccount.Country.US)
                .addPaymentRail(ExternalAccountInfoOneOf.UsdAccount.PaymentRail.ACH)
                .routingNumber("routingNumber")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isEqualTo(usdAccount)
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofUsdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofUsdAccount(
                ExternalAccountInfoOneOf.UsdAccount.builder()
                    .accountNumber("accountNumber")
                    .beneficiary(
                        ExternalAccountInfoOneOf.UsdAccount.Beneficiary.Individual.builder()
                            .birthDate("birthDate")
                            .fullName("fullName")
                            .nationality("nationality")
                            .address(
                                ExternalAccountInfoOneOf.UsdAccount.Beneficiary.Individual.Address
                                    .builder()
                                    .country("US")
                                    .line1("123 Main Street")
                                    .postalCode("94105")
                                    .city("San Francisco")
                                    .line2("Apt 4B")
                                    .state("CA")
                                    .build()
                            )
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .phoneNumber("phoneNumber")
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.UsdAccount.Country.US)
                    .addPaymentRail(ExternalAccountInfoOneOf.UsdAccount.PaymentRail.ACH)
                    .routingNumber("routingNumber")
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
    fun ofVndAccount() {
        val vndAccount =
            ExternalAccountInfoOneOf.VndAccount.builder()
                .accountNumber("accountNumber")
                .bankName("bankName")
                .beneficiary(
                    ExternalAccountInfoOneOf.VndAccount.Beneficiary.Individual.builder()
                        .fullName("fullName")
                        .address(
                            ExternalAccountInfoOneOf.VndAccount.Beneficiary.Individual.Address
                                .builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(ExternalAccountInfoOneOf.VndAccount.Country.VN)
                .addPaymentRail(ExternalAccountInfoOneOf.VndAccount.PaymentRail.BANK_TRANSFER)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofVndAccount(vndAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isEqualTo(vndAccount)
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofVndAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofVndAccount(
                ExternalAccountInfoOneOf.VndAccount.builder()
                    .accountNumber("accountNumber")
                    .bankName("bankName")
                    .beneficiary(
                        ExternalAccountInfoOneOf.VndAccount.Beneficiary.Individual.builder()
                            .fullName("fullName")
                            .address(
                                ExternalAccountInfoOneOf.VndAccount.Beneficiary.Individual.Address
                                    .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addCountry(ExternalAccountInfoOneOf.VndAccount.Country.VN)
                    .addPaymentRail(ExternalAccountInfoOneOf.VndAccount.PaymentRail.BANK_TRANSFER)
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
    fun ofSparkWallet() {
        val sparkWallet =
            SparkWalletInfo.builder()
                .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                .address("spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isEqualTo(sparkWallet)
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofSparkWalletRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSparkWallet(
                SparkWalletInfo.builder()
                    .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                    .address("spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu")
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
    fun ofLightning() {
        val lightning =
            LightningWalletInfo.builder()
                .accountType(LightningWalletInfo.AccountType.LIGHTNING)
                .bolt12(
                    "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                )
                .invoice(
                    "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                )
                .lightningAddress("john.doe@lightningwallet.com")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofLightning(lightning)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isEqualTo(lightning)
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofLightningRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofLightning(
                LightningWalletInfo.builder()
                    .accountType(LightningWalletInfo.AccountType.LIGHTNING)
                    .bolt12(
                        "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                    )
                    .invoice(
                        "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                    )
                    .lightningAddress("john.doe@lightningwallet.com")
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
    fun ofSolanaWallet() {
        val solanaWallet =
            SolanaWalletInfo.builder()
                .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                .address("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isEqualTo(solanaWallet)
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofSolanaWalletRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSolanaWallet(
                SolanaWalletInfo.builder()
                    .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                    .address("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
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
    fun ofTronWallet() {
        val tronWallet =
            TronWalletInfo.builder()
                .accountType(TronWalletInfo.AccountType.TRON_WALLET)
                .address("TNPeeaaFB7K9cmo4uQpcU32zGK8G1NYqeL")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofTronWallet(tronWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isEqualTo(tronWallet)
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofTronWalletRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofTronWallet(
                TronWalletInfo.builder()
                    .accountType(TronWalletInfo.AccountType.TRON_WALLET)
                    .address("TNPeeaaFB7K9cmo4uQpcU32zGK8G1NYqeL")
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
    fun ofPolygonWallet() {
        val polygonWallet =
            PolygonWalletInfo.builder()
                .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isEqualTo(polygonWallet)
        assertThat(externalAccountInfoOneOf.baseWallet()).isNull()
    }

    @Test
    fun ofPolygonWalletRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPolygonWallet(
                PolygonWalletInfo.builder()
                    .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                    .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
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
    fun ofBaseWallet() {
        val baseWallet =
            BaseWalletInfo.builder()
                .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBaseWallet(baseWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWallet()).isNull()
        assertThat(externalAccountInfoOneOf.lightning()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWallet()).isNull()
        assertThat(externalAccountInfoOneOf.tronWallet()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWallet()).isNull()
        assertThat(externalAccountInfoOneOf.baseWallet()).isEqualTo(baseWallet)
    }

    @Test
    fun ofBaseWalletRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBaseWallet(
                BaseWalletInfo.builder()
                    .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
                    .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
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
