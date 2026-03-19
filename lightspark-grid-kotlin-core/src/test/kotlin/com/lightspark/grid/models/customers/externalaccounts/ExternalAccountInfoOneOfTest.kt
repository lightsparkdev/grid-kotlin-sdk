// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.DkkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GbpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HkdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.IdrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.InrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MxnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MyrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PhpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.SgdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ThbAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.VndAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExternalAccountInfoOneOfTest {

    @Test
    fun ofBrlAccount() {
        val brlAccount =
            BrlExternalAccountInfo.builder()
                .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                .pixKey("x")
                .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                .taxId("26912511571360")
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isEqualTo(brlAccount)
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofBrlAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBrlAccount(
                BrlExternalAccountInfo.builder()
                    .accountType(BrlAccountInfo.AccountType.BRL_ACCOUNT)
                    .addPaymentRail(BrlAccountInfo.PaymentRail.PIX)
                    .pixKey("x")
                    .pixKeyType(BrlAccountInfo.PixKeyType.CPF)
                    .taxId("26912511571360")
                    .beneficiary(
                        BrlBeneficiary.builder()
                            .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofCadAccount() {
        val cadAccount =
            ExternalAccountInfoOneOf.CadAccount.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    ExternalAccountInfoOneOf.CadAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofCadAccount(cadAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isEqualTo(cadAccount)
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofCadAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofCadAccount(
                ExternalAccountInfoOneOf.CadAccount.builder()
                    .accountNumber("1234567")
                    .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                    .bankCode("001")
                    .branchCode("00012")
                    .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        ExternalAccountInfoOneOf.CadAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            DkkExternalAccountInfo.builder()
                .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isEqualTo(dkkAccount)
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofDkkAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofDkkAccount(
                DkkExternalAccountInfo.builder()
                    .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                    .iban("DE89370400440532013000")
                    .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                    .swiftCode("DEUTDEFF")
                    .beneficiary(
                        DkkBeneficiary.builder()
                            .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofEurAccount(eurAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isEqualTo(eurAccount)
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofEurAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEurAccount(
                ExternalAccountInfoOneOf.EurAccount.builder()
                    .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                    .iban("DE89370400440532013000")
                    .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                    .swiftCode("DEUTDEFF")
                    .beneficiary(
                        ExternalAccountInfoOneOf.EurAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                .sortCode("123456")
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isEqualTo(gbpAccount)
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofGbpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofGbpAccount(
                GbpExternalAccountInfo.builder()
                    .accountNumber("12345678")
                    .accountType(GbpAccountInfo.AccountType.GBP_ACCOUNT)
                    .addPaymentRail(GbpAccountInfo.PaymentRail.FASTER_PAYMENTS)
                    .sortCode("123456")
                    .beneficiary(
                        GbpBeneficiary.builder()
                            .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            HkdExternalAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("x")
                .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
                .beneficiary(
                    HkdBeneficiary.builder()
                        .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isEqualTo(hkdAccount)
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofHkdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofHkdAccount(
                HkdExternalAccountInfo.builder()
                    .accountNumber("123456789012")
                    .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                    .swiftCode("HSBCHKHHHKH")
                    .beneficiary(
                        HkdBeneficiary.builder()
                            .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            IdrExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
                .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isEqualTo(idrAccount)
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofIdrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofIdrAccount(
                IdrExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                    .bankName("Bank Central Asia")
                    .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                    .phoneNumber("+6281234567890")
                    .swiftCode("CENAIDJA")
                    .beneficiary(
                        IdrBeneficiary.builder()
                            .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            InrExternalAccountInfo.builder()
                .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                .vpa("user@upi")
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofInrAccount(inrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isEqualTo(inrAccount)
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofInrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofInrAccount(
                InrExternalAccountInfo.builder()
                    .accountType(InrAccountInfo.AccountType.INR_ACCOUNT)
                    .addPaymentRail(InrAccountInfo.PaymentRail.UPI)
                    .vpa("user@upi")
                    .beneficiary(
                        InrBeneficiary.builder()
                            .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofKesExternalAccountInfo() {
        val kesExternalAccountInfo =
            ExternalAccountInfoOneOf.KesExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.KesExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.KesExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+254712345678")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofKesExternalAccountInfo(kesExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo())
            .isEqualTo(kesExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofKesExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofKesExternalAccountInfo(
                ExternalAccountInfoOneOf.KesExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.KesExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.KesExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+254712345678")
                    .provider("x")
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
    fun ofMwkExternalAccountInfo() {
        val mwkExternalAccountInfo =
            ExternalAccountInfoOneOf.MwkExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.MwkExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.MwkExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMwkExternalAccountInfo(mwkExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo())
            .isEqualTo(mwkExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofMwkExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMwkExternalAccountInfo(
                ExternalAccountInfoOneOf.MwkExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.MwkExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.MwkExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+1234567890")
                    .provider("x")
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
            MxnExternalAccountInfo.builder()
                .accountType(MxnAccountInfo.AccountType.MXN_ACCOUNT)
                .clabeNumber("123456789012345678")
                .addPaymentRail(MxnAccountInfo.PaymentRail.SPEI)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isEqualTo(mxnAccount)
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofMxnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMxnAccount(
                MxnExternalAccountInfo.builder()
                    .accountType(MxnAccountInfo.AccountType.MXN_ACCOUNT)
                    .clabeNumber("123456789012345678")
                    .addPaymentRail(MxnAccountInfo.PaymentRail.SPEI)
                    .beneficiary(
                        MxnBeneficiary.builder()
                            .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            MyrExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("MABORUMMYYY")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMyrAccount(myrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isEqualTo(myrAccount)
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofMyrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMyrAccount(
                MyrExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                    .swiftCode("MABORUMMYYY")
                    .beneficiary(
                        MyrBeneficiary.builder()
                            .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofNgnAccount() {
        val ngnAccount =
            ExternalAccountInfoOneOf.NgnAccount.builder()
                .accountNumber("2102979809")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("x")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    ExternalAccountInfoOneOf.NgnAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isEqualTo(ngnAccount)
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofNgnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofNgnAccount(
                ExternalAccountInfoOneOf.NgnAccount.builder()
                    .accountNumber("2102979809")
                    .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        ExternalAccountInfoOneOf.NgnAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            PhpExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isEqualTo(phpAccount)
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofPhpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPhpAccount(
                PhpExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                    .bankName("BDO Unibank")
                    .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        PhpBeneficiary.builder()
                            .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofRwfExternalAccountInfo() {
        val rwfExternalAccountInfo =
            ExternalAccountInfoOneOf.RwfExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.RwfExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.RwfExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+250781234567")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofRwfExternalAccountInfo(rwfExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo())
            .isEqualTo(rwfExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofRwfExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofRwfExternalAccountInfo(
                ExternalAccountInfoOneOf.RwfExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.RwfExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.RwfExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+250781234567")
                    .provider("x")
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
            SgdExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isEqualTo(sgdAccount)
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofSgdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSgdAccount(
                SgdExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                    .bankName("DBS Bank Ltd")
                    .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                    .swiftCode("DBSSSGSG")
                    .beneficiary(
                        SgdBeneficiary.builder()
                            .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            ThbExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ThbAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BKKBTHBK")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofThbAccount(thbAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isEqualTo(thbAccount)
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofThbAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofThbAccount(
                ThbExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(ThbAccountInfo.AccountType.THB_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(ThbAccountInfo.PaymentRail.BANK_TRANSFER)
                    .swiftCode("BKKBTHBK")
                    .beneficiary(
                        ThbBeneficiary.builder()
                            .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofTzsExternalAccountInfo() {
        val tzsExternalAccountInfo =
            ExternalAccountInfoOneOf.TzsExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.TzsExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.TzsExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+255712345678")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofTzsExternalAccountInfo(tzsExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo())
            .isEqualTo(tzsExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofTzsExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofTzsExternalAccountInfo(
                ExternalAccountInfoOneOf.TzsExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.TzsExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.TzsExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+255712345678")
                    .provider("x")
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
    fun ofUgxExternalAccountInfo() {
        val ugxExternalAccountInfo =
            ExternalAccountInfoOneOf.UgxExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.UgxExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.UgxExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofUgxExternalAccountInfo(ugxExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo())
            .isEqualTo(ugxExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofUgxExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofUgxExternalAccountInfo(
                ExternalAccountInfoOneOf.UgxExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.UgxExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.UgxExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+1234567890")
                    .provider("x")
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
            UsdExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                .routingNumber("021000021")
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
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
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isEqualTo(usdAccount)
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofUsdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofUsdAccount(
                UsdExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                    .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                    .routingNumber("021000021")
                    .beneficiary(
                        UsdBeneficiary.builder()
                            .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .birthDate("birthDate")
                            .fullName("fullName")
                            .nationality("nationality")
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
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .phoneNumber("phoneNumber")
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            VndExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("x")
                .addPaymentRail(VndAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BFTVVNVX")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofVndAccount(vndAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isEqualTo(vndAccount)
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofVndAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofVndAccount(
                VndExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(VndAccountInfo.AccountType.VND_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(VndAccountInfo.PaymentRail.BANK_TRANSFER)
                    .swiftCode("BFTVVNVX")
                    .beneficiary(
                        VndBeneficiary.builder()
                            .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
    fun ofXofExternalAccountInfo() {
        val xofExternalAccountInfo =
            ExternalAccountInfoOneOf.XofExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.XofExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.XofExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .region(ExternalAccountInfoOneOf.XofExternalAccountInfo.Region.BJ)
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofXofExternalAccountInfo(xofExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo())
            .isEqualTo(xofExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofXofExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofXofExternalAccountInfo(
                ExternalAccountInfoOneOf.XofExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.XofExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.XofExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .region(ExternalAccountInfoOneOf.XofExternalAccountInfo.Region.BJ)
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
    fun ofZarExternalAccountInfo() {
        val zarExternalAccountInfo =
            ExternalAccountInfoOneOf.ZarExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .bankName("x")
                .beneficiary(
                    ExternalAccountInfoOneOf.ZarExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.ZarExternalAccountInfo.PaymentRail.BANK_TRANSFER
                )
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZarExternalAccountInfo(zarExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo())
            .isEqualTo(zarExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofZarExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZarExternalAccountInfo(
                ExternalAccountInfoOneOf.ZarExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .bankName("x")
                    .beneficiary(
                        ExternalAccountInfoOneOf.ZarExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.ZarExternalAccountInfo.PaymentRail.BANK_TRANSFER
                    )
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
    fun ofZmwExternalAccountInfo() {
        val zmwExternalAccountInfo =
            ExternalAccountInfoOneOf.ZmwExternalAccountInfo.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.ZmwExternalAccountInfo.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(
                    ExternalAccountInfoOneOf.ZmwExternalAccountInfo.PaymentRail.MOBILE_MONEY
                )
                .phoneNumber("+260971234567")
                .provider("x")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZmwExternalAccountInfo(zmwExternalAccountInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo())
            .isEqualTo(zmwExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofZmwExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZmwExternalAccountInfo(
                ExternalAccountInfoOneOf.ZmwExternalAccountInfo.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.ZmwExternalAccountInfo.Beneficiary.Individual
                            .builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(
                        ExternalAccountInfoOneOf.ZmwExternalAccountInfo.PaymentRail.MOBILE_MONEY
                    )
                    .phoneNumber("+260971234567")
                    .provider("x")
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
    fun ofSparkWalletInfo() {
        val sparkWalletInfo =
            SparkWalletInfo.builder()
                .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                .address("spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSparkWalletInfo(sparkWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isEqualTo(sparkWalletInfo)
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofSparkWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSparkWalletInfo(
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
    fun ofLightningWalletInfo() {
        val lightningWalletInfo =
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

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofLightningWalletInfo(lightningWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isEqualTo(lightningWalletInfo)
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofLightningWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofLightningWalletInfo(
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
    fun ofSolanaWalletInfo() {
        val solanaWalletInfo =
            SolanaWalletInfo.builder()
                .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                .address("4Nd1m6Qkq7RfKuE5vQ9qP9Tn6H94Ueqb4xXHzsAbd8Wg")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSolanaWalletInfo(solanaWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isEqualTo(solanaWalletInfo)
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofSolanaWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSolanaWalletInfo(
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
    fun ofTronWalletInfo() {
        val tronWalletInfo =
            TronWalletInfo.builder()
                .accountType(TronWalletInfo.AccountType.TRON_WALLET)
                .address("TNPeeaaFB7K9cmo4uQpcU32zGK8G1NYqeL")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofTronWalletInfo(tronWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isEqualTo(tronWalletInfo)
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofTronWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofTronWalletInfo(
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
    fun ofPolygonWalletInfo() {
        val polygonWalletInfo =
            PolygonWalletInfo.builder()
                .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPolygonWalletInfo(polygonWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isEqualTo(polygonWalletInfo)
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofPolygonWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPolygonWalletInfo(
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
    fun ofBaseWalletInfo() {
        val baseWalletInfo =
            BaseWalletInfo.builder()
                .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBaseWalletInfo(baseWalletInfo)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isEqualTo(baseWalletInfo)
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofBaseWalletInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBaseWalletInfo(
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

    @Test
    fun ofAedAccount() {
        val aedAccount =
            ExternalAccountInfoOneOf.AedAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.AedAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .iban("AE070331234567890123456")
                .addPaymentRail(ExternalAccountInfoOneOf.AedAccount.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofAedAccount(aedAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isEqualTo(aedAccount)
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofAedAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofAedAccount(
                ExternalAccountInfoOneOf.AedAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.AedAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .iban("AE070331234567890123456")
                    .addPaymentRail(ExternalAccountInfoOneOf.AedAccount.PaymentRail.BANK_TRANSFER)
                    .swiftCode("EBILAEAD")
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
    fun ofBwpAccount() {
        val bwpAccount =
            ExternalAccountInfoOneOf.BwpAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.BwpAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(ExternalAccountInfoOneOf.BwpAccount.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBwpAccount(bwpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isEqualTo(bwpAccount)
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
    }

    @Test
    fun ofBwpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBwpAccount(
                ExternalAccountInfoOneOf.BwpAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.BwpAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(ExternalAccountInfoOneOf.BwpAccount.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
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
    fun ofXafAccount() {
        val xafAccount =
            ExternalAccountInfoOneOf.XafAccount.builder()
                .beneficiary(
                    ExternalAccountInfoOneOf.XafAccount.Beneficiary.Individual.builder()
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(ExternalAccountInfoOneOf.XafAccount.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(ExternalAccountInfoOneOf.XafAccount.Region.CM)
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofXafAccount(xafAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mwkExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ugxExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zarExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.zmwExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isEqualTo(xafAccount)
    }

    @Test
    fun ofXafAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofXafAccount(
                ExternalAccountInfoOneOf.XafAccount.builder()
                    .beneficiary(
                        ExternalAccountInfoOneOf.XafAccount.Beneficiary.Individual.builder()
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
                            .registrationNumber("registrationNumber")
                            .build()
                    )
                    .addPaymentRail(ExternalAccountInfoOneOf.XafAccount.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .region(ExternalAccountInfoOneOf.XafAccount.Region.CM)
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
