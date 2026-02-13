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
            BrlExternalAccountInfo.builder()
                .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                .beneficiary(
                    BrlBeneficiary.builder()
                        .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            BrlBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .pixKey("pixKey")
                .pixKeyType("pixKeyType")
                .taxId("taxId")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isEqualTo(brlAccount)
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                BrlExternalAccountInfo.builder()
                    .accountType(BrlExternalAccountInfo.AccountType.BRL_ACCOUNT)
                    .beneficiary(
                        BrlBeneficiary.builder()
                            .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                BrlBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
            DkkExternalAccountInfo.builder()
                .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            DkkBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .iban("iban")
                .swiftBic("swiftBic")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isEqualTo(dkkAccount)
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
                DkkExternalAccountInfo.builder()
                    .accountType(DkkExternalAccountInfo.AccountType.DKK_ACCOUNT)
                    .beneficiary(
                        DkkBeneficiary.builder()
                            .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                DkkBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
                    .iban("iban")
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
            GbpExternalAccountInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                .beneficiary(
                    GbpBeneficiary.builder()
                        .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            GbpBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .sortCode("20-00-00")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                GbpExternalAccountInfo.builder()
                    .accountNumber("12345678")
                    .accountType(GbpExternalAccountInfo.AccountType.GBP_ACCOUNT)
                    .beneficiary(
                        GbpBeneficiary.builder()
                            .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                GbpBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
            HkdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(HkdExternalAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    HkdBeneficiary.builder()
                        .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            HkdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                HkdExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(HkdExternalAccountInfo.AccountType.HKD_ACCOUNT)
                    .bankName("bankName")
                    .beneficiary(
                        HkdBeneficiary.builder()
                            .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                HkdBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
                .accountNumber("accountNumber")
                .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            IdrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .sortCode("sortCode")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                IdrExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                    .beneficiary(
                        IdrBeneficiary.builder()
                            .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                IdrBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
            InrExternalAccountInfo.builder()
                .accountType(InrExternalAccountInfo.AccountType.INR_ACCOUNT)
                .beneficiary(
                    InrBeneficiary.builder()
                        .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            InrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .vpa("vpa")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofInrAccount(inrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                InrExternalAccountInfo.builder()
                    .accountType(InrExternalAccountInfo.AccountType.INR_ACCOUNT)
                    .beneficiary(
                        InrBeneficiary.builder()
                            .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                InrBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
            MxnExternalAccountInfo.builder()
                .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MxnBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                MxnExternalAccountInfo.builder()
                    .accountType(MxnExternalAccountInfo.AccountType.MXN_ACCOUNT)
                    .beneficiary(
                        MxnBeneficiary.builder()
                            .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                MxnBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
                .accountNumber("accountNumber")
                .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            MyrBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                MyrExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                    .bankName("bankName")
                    .beneficiary(
                        MyrBeneficiary.builder()
                            .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                MyrBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            PhpBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                PhpExternalAccountInfo.builder()
                    .accountNumber("001234567890")
                    .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                    .bankName("BDO Unibank")
                    .beneficiary(
                        PhpBeneficiary.builder()
                            .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                PhpBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
    fun ofSgdAccount() {
        val sgdAccount =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            SgdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
                .swiftCode("DBSSSGSG")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                SgdExternalAccountInfo.builder()
                    .accountNumber("0123456789")
                    .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                    .bankName("DBS Bank Ltd")
                    .beneficiary(
                        SgdBeneficiary.builder()
                            .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                SgdBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
            ThbExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            ThbBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                ThbExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                    .bankName("bankName")
                    .beneficiary(
                        ThbBeneficiary.builder()
                            .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                ThbBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
    fun ofUsdAccount() {
        val usdAccount =
            UsdExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .address(
                            UsdBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
                                .build()
                        )
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .routingNumber("routingNumber")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                UsdExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(UsdExternalAccountInfo.AccountType.USD_ACCOUNT)
                    .beneficiary(
                        UsdBeneficiary.builder()
                            .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .birthDate("birthDate")
                            .fullName("fullName")
                            .nationality("nationality")
                            .address(
                                UsdBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
                                    .build()
                            )
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .phoneNumber("phoneNumber")
                            .registrationNumber("registrationNumber")
                            .build()
                    )
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
            VndExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .address(
                            VndBeneficiary.Address.builder()
                                .country("country")
                                .line1("line1")
                                .postalCode("postalCode")
                                .city("city")
                                .line2("line2")
                                .state("state")
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
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
                VndExternalAccountInfo.builder()
                    .accountNumber("accountNumber")
                    .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                    .bankName("bankName")
                    .beneficiary(
                        VndBeneficiary.builder()
                            .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .address(
                                VndBeneficiary.Address.builder()
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postalCode")
                                    .city("city")
                                    .line2("line2")
                                    .state("state")
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
    fun ofSparkWallet() {
        val sparkWallet =
            SparkWalletInfo.builder()
                .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                .address("spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu")
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
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
