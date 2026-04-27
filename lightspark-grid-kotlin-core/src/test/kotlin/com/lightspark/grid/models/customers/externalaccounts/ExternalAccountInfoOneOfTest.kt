// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.BdtBeneficiary
import com.lightspark.grid.models.BwpBeneficiary
import com.lightspark.grid.models.CadBeneficiary
import com.lightspark.grid.models.CopBeneficiary
import com.lightspark.grid.models.EgpBeneficiary
import com.lightspark.grid.models.EthereumWalletExternalAccountInfo
import com.lightspark.grid.models.EurBeneficiary
import com.lightspark.grid.models.GhsBeneficiary
import com.lightspark.grid.models.GtqBeneficiary
import com.lightspark.grid.models.HtgBeneficiary
import com.lightspark.grid.models.JmdBeneficiary
import com.lightspark.grid.models.KesBeneficiary
import com.lightspark.grid.models.MwkBeneficiary
import com.lightspark.grid.models.NgnBeneficiary
import com.lightspark.grid.models.PkrBeneficiary
import com.lightspark.grid.models.RwfBeneficiary
import com.lightspark.grid.models.TzsBeneficiary
import com.lightspark.grid.models.UgxBeneficiary
import com.lightspark.grid.models.XafBeneficiary
import com.lightspark.grid.models.XofBeneficiary
import com.lightspark.grid.models.ZarBeneficiary
import com.lightspark.grid.models.ZmwBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BdtAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BrlAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.BwpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.CopAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.DkkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EgpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GbpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GhsAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.GtqAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HkdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.HtgAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.IdrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.InrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.JmdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.KesAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MwkAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MxnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.MyrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PhpAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.PkrAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.RwfAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.SgdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ThbAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.TzsAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UgxAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.VndAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.XafAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.XofAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ZarAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.ZmwAccountInfo
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
            CadExternalAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofCadAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofCadAccount(
                CadExternalAccountInfo.builder()
                    .accountNumber("1234567")
                    .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                    .bankCode("001")
                    .branchCode("00012")
                    .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        CadBeneficiary.builder()
                            .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
            EurExternalAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofEurAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEurAccount(
                EurExternalAccountInfo.builder()
                    .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                    .iban("DE89370400440532013000")
                    .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                    .swiftCode("DEUTDEFF")
                    .beneficiary(
                        EurBeneficiary.builder()
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
                            .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .birthDate("birthDate")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("nationality")
                            .phoneNumber("phoneNumber")
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
    fun ofKesAccount() {
        val kesAccount =
            KesExternalAccountInfo.builder()
                .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+254712345678")
                .provider("x")
                .beneficiary(
                    KesBeneficiary.builder()
                        .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofKesAccount(kesAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isEqualTo(kesAccount)
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofKesAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofKesAccount(
                KesExternalAccountInfo.builder()
                    .accountType(KesAccountInfo.AccountType.KES_ACCOUNT)
                    .addPaymentRail(KesAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+254712345678")
                    .provider("x")
                    .beneficiary(
                        KesBeneficiary.builder()
                            .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofMwkAccount() {
        val mwkAccount =
            MwkExternalAccountInfo.builder()
                .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    MwkBeneficiary.builder()
                        .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofMwkAccount(mwkAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isEqualTo(mwkAccount)
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofMwkAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofMwkAccount(
                MwkExternalAccountInfo.builder()
                    .accountType(MwkAccountInfo.AccountType.MWK_ACCOUNT)
                    .addPaymentRail(MwkAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .beneficiary(
                        MwkBeneficiary.builder()
                            .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isEqualTo(mxnAccount)
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isEqualTo(myrAccount)
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
            NgnExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("x")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isEqualTo(ngnAccount)
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofNgnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofNgnAccount(
                NgnExternalAccountInfo.builder()
                    .accountNumber("0123456789")
                    .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        NgnBeneficiary.builder()
                            .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isEqualTo(phpAccount)
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofPhpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPhpAccount(
                PhpExternalAccountInfo.builder()
                    .accountNumber("001234567890")
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
    fun ofRwfAccount() {
        val rwfAccount =
            RwfExternalAccountInfo.builder()
                .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+250781234567")
                .provider("x")
                .beneficiary(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofRwfAccount(rwfAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isEqualTo(rwfAccount)
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofRwfAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofRwfAccount(
                RwfExternalAccountInfo.builder()
                    .accountType(RwfAccountInfo.AccountType.RWF_ACCOUNT)
                    .addPaymentRail(RwfAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+250781234567")
                    .provider("x")
                    .beneficiary(
                        RwfBeneficiary.builder()
                            .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isEqualTo(sgdAccount)
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofSgdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofSgdAccount(
                SgdExternalAccountInfo.builder()
                    .accountNumber("0123456789")
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isEqualTo(thbAccount)
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
    fun ofTzsAccount() {
        val tzsAccount =
            TzsExternalAccountInfo.builder()
                .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+255712345678")
                .provider("x")
                .beneficiary(
                    TzsBeneficiary.builder()
                        .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofTzsAccount(tzsAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isEqualTo(tzsAccount)
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofTzsAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofTzsAccount(
                TzsExternalAccountInfo.builder()
                    .accountType(TzsAccountInfo.AccountType.TZS_ACCOUNT)
                    .addPaymentRail(TzsAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+255712345678")
                    .provider("x")
                    .beneficiary(
                        TzsBeneficiary.builder()
                            .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofUgxAccount() {
        val ugxAccount =
            UgxExternalAccountInfo.builder()
                .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    UgxBeneficiary.builder()
                        .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofUgxAccount(ugxAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isEqualTo(ugxAccount)
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofUgxAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofUgxAccount(
                UgxExternalAccountInfo.builder()
                    .accountType(UgxAccountInfo.AccountType.UGX_ACCOUNT)
                    .addPaymentRail(UgxAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .beneficiary(
                        UgxBeneficiary.builder()
                            .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isEqualTo(usdAccount)
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isEqualTo(vndAccount)
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
    fun ofXofAccount() {
        val xofAccount =
            XofExternalAccountInfo.builder()
                .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofAccountInfo.Region.BJ)
                .beneficiary(
                    XofBeneficiary.builder()
                        .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofXofAccount(xofAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isEqualTo(xofAccount)
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofXofAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofXofAccount(
                XofExternalAccountInfo.builder()
                    .accountType(XofAccountInfo.AccountType.XOF_ACCOUNT)
                    .addPaymentRail(XofAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .region(XofAccountInfo.Region.BJ)
                    .beneficiary(
                        XofBeneficiary.builder()
                            .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofZarAccount() {
        val zarAccount =
            ZarExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofZarAccount(zarAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isEqualTo(zarAccount)
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofZarAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZarAccount(
                ZarExternalAccountInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(ZarAccountInfo.AccountType.ZAR_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(ZarAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        ZarBeneficiary.builder()
                            .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofZmwAccount() {
        val zmwAccount =
            ZmwExternalAccountInfo.builder()
                .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+260971234567")
                .provider("x")
                .beneficiary(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofZmwAccount(zmwAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isEqualTo(zmwAccount)
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofZmwAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofZmwAccount(
                ZmwExternalAccountInfo.builder()
                    .accountType(ZmwAccountInfo.AccountType.ZMW_ACCOUNT)
                    .addPaymentRail(ZmwAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+260971234567")
                    .provider("x")
                    .beneficiary(
                        ZmwBeneficiary.builder()
                            .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isEqualTo(sparkWalletInfo)
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isEqualTo(lightningWalletInfo)
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isEqualTo(solanaWalletInfo)
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isEqualTo(tronWalletInfo)
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isEqualTo(polygonWalletInfo)
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isEqualTo(baseWalletInfo)
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
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
    fun ofEthereumWalletExternalAccountInfo() {
        val ethereumWalletExternalAccountInfo =
            EthereumWalletExternalAccountInfo.builder()
                .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEthereumWalletExternalAccountInfo(
                ethereumWalletExternalAccountInfo
            )

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo())
            .isEqualTo(ethereumWalletExternalAccountInfo)
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofEthereumWalletExternalAccountInfoRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEthereumWalletExternalAccountInfo(
                EthereumWalletExternalAccountInfo.builder()
                    .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
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
            AedExternalAccountInfo.builder()
                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                .iban("AE070331234567890123456")
                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .beneficiary(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isEqualTo(aedAccount)
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofAedAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofAedAccount(
                AedExternalAccountInfo.builder()
                    .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                    .iban("AE070331234567890123456")
                    .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                    .swiftCode("EBILAEAD")
                    .beneficiary(
                        AedBeneficiary.builder()
                            .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
            BwpExternalAccountInfo.builder()
                .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .beneficiary(
                    BwpBeneficiary.builder()
                        .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isEqualTo(bwpAccount)
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofBwpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBwpAccount(
                BwpExternalAccountInfo.builder()
                    .accountType(BwpAccountInfo.AccountType.BWP_ACCOUNT)
                    .addPaymentRail(BwpAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .beneficiary(
                        BwpBeneficiary.builder()
                            .beneficiaryType(BwpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
            XafExternalAccountInfo.builder()
                .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafAccountInfo.Region.CM)
                .beneficiary(
                    XafBeneficiary.builder()
                        .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isEqualTo(xafAccount)
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofXafAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofXafAccount(
                XafExternalAccountInfo.builder()
                    .accountType(XafAccountInfo.AccountType.XAF_ACCOUNT)
                    .addPaymentRail(XafAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .provider("x")
                    .region(XafAccountInfo.Region.CM)
                    .beneficiary(
                        XafBeneficiary.builder()
                            .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofBdtAccount() {
        val bdtAccount =
            BdtExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                .bankName("x")
                .branchCode("21029")
                .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofBdtAccount(bdtAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isEqualTo(bdtAccount)
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofBdtAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofBdtAccount(
                BdtExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(BdtAccountInfo.AccountType.BDT_ACCOUNT)
                    .bankName("x")
                    .branchCode("21029")
                    .addPaymentRail(BdtAccountInfo.PaymentRail.BANK_TRANSFER)
                    .phoneNumber("+1234567890")
                    .swiftCode("DEUTDEFF")
                    .beneficiary(
                        BdtBeneficiary.builder()
                            .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofCopAccount() {
        val copAccount =
            CopExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .documentNumber("documentNumber")
                        .documentType("documentType")
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofCopAccount(copAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isEqualTo(copAccount)
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofCopAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofCopAccount(
                CopExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                    .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                    .bankName("x")
                    .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        CopBeneficiary.builder()
                            .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .documentNumber("documentNumber")
                            .documentType("documentType")
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
    fun ofEgpAccount() {
        val egpAccount =
            EgpExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofEgpAccount(egpAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isEqualTo(egpAccount)
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofEgpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofEgpAccount(
                EgpExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                    .iban("DE89370400440532013000")
                    .swiftCode("DEUTDEFF")
                    .beneficiary(
                        EgpBeneficiary.builder()
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
                            .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .countryOfResidence("countryOfResidence")
                            .fullName("fullName")
                            .phoneNumber("phoneNumber")
                            .birthDate("birthDate")
                            .email("email")
                            .nationality("nationality")
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
    fun ofGhsAccount() {
        val ghsAccount =
            GhsExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                .bankName("x")
                .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    GhsBeneficiary.builder()
                        .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofGhsAccount(ghsAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isEqualTo(ghsAccount)
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofGhsAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofGhsAccount(
                GhsExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(GhsAccountInfo.AccountType.GHS_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(GhsAccountInfo.PaymentRail.BANK_TRANSFER)
                    .phoneNumber("+1234567890")
                    .beneficiary(
                        GhsBeneficiary.builder()
                            .beneficiaryType(GhsBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofGtqAccount() {
        val gtqAccount =
            GtqExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    GtqBeneficiary.builder()
                        .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
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
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofGtqAccount(gtqAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isEqualTo(gtqAccount)
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofGtqAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofGtqAccount(
                GtqExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(GtqAccountInfo.AccountType.GTQ_ACCOUNT)
                    .bankAccountType(GtqAccountInfo.BankAccountType.CHECKING)
                    .bankName("x")
                    .addPaymentRail(GtqAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        GtqBeneficiary.builder()
                            .beneficiaryType(GtqBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .countryOfResidence("countryOfResidence")
                            .fullName("fullName")
                            .phoneNumber("phoneNumber")
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
                            .email("email")
                            .nationality("nationality")
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
    fun ofHtgAccount() {
        val htgAccount =
            HtgExternalAccountInfo.builder()
                .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                .phoneNumber("+1234567890")
                .beneficiary(
                    HtgBeneficiary.builder()
                        .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofHtgAccount(htgAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isEqualTo(htgAccount)
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofHtgAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofHtgAccount(
                HtgExternalAccountInfo.builder()
                    .accountType(HtgAccountInfo.AccountType.HTG_ACCOUNT)
                    .addPaymentRail(HtgAccountInfo.PaymentRail.MOBILE_MONEY)
                    .phoneNumber("+1234567890")
                    .beneficiary(
                        HtgBeneficiary.builder()
                            .beneficiaryType(HtgBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    fun ofJmdAccount() {
        val jmdAccount =
            JmdExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                .bankName("x")
                .branchCode("21029")
                .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    JmdBeneficiary.builder()
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
                        .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofJmdAccount(jmdAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isEqualTo(jmdAccount)
        assertThat(externalAccountInfoOneOf.pkrAccount()).isNull()
    }

    @Test
    fun ofJmdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofJmdAccount(
                JmdExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(JmdAccountInfo.AccountType.JMD_ACCOUNT)
                    .bankAccountType(JmdAccountInfo.BankAccountType.CHECKING)
                    .bankName("x")
                    .branchCode("21029")
                    .addPaymentRail(JmdAccountInfo.PaymentRail.BANK_TRANSFER)
                    .beneficiary(
                        JmdBeneficiary.builder()
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
                            .beneficiaryType(JmdBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .phoneNumber("phoneNumber")
                            .birthDate("birthDate")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("nationality")
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
    fun ofPkrAccount() {
        val pkrAccount =
            PkrExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                .bankName("x")
                .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .iban("DE89370400440532013000")
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val externalAccountInfoOneOf = ExternalAccountInfoOneOf.ofPkrAccount(pkrAccount)

        assertThat(externalAccountInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountInfoOneOf.sparkWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.lightningWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.solanaWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.tronWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.polygonWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.baseWalletInfo()).isNull()
        assertThat(externalAccountInfoOneOf.ethereumWalletExternalAccountInfo()).isNull()
        assertThat(externalAccountInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountInfoOneOf.pkrAccount()).isEqualTo(pkrAccount)
    }

    @Test
    fun ofPkrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountInfoOneOf =
            ExternalAccountInfoOneOf.ofPkrAccount(
                PkrExternalAccountInfo.builder()
                    .accountNumber("x")
                    .accountType(PkrAccountInfo.AccountType.PKR_ACCOUNT)
                    .bankName("x")
                    .addPaymentRail(PkrAccountInfo.PaymentRail.BANK_TRANSFER)
                    .phoneNumber("+1234567890")
                    .iban("DE89370400440532013000")
                    .beneficiary(
                        PkrBeneficiary.builder()
                            .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
