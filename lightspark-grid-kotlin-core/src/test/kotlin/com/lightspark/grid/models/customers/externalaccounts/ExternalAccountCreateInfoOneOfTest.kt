// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.BdtBeneficiary
import com.lightspark.grid.models.BdtExternalAccountCreateInfo
import com.lightspark.grid.models.BrlExternalAccountCreateInfo
import com.lightspark.grid.models.BwpBeneficiary
import com.lightspark.grid.models.BwpExternalAccountCreateInfo
import com.lightspark.grid.models.CadBeneficiary
import com.lightspark.grid.models.CadExternalAccountCreateInfo
import com.lightspark.grid.models.CopBeneficiary
import com.lightspark.grid.models.CopExternalAccountCreateInfo
import com.lightspark.grid.models.DkkExternalAccountCreateInfo
import com.lightspark.grid.models.EgpBeneficiary
import com.lightspark.grid.models.EgpExternalAccountCreateInfo
import com.lightspark.grid.models.EurBeneficiary
import com.lightspark.grid.models.EurExternalAccountCreateInfo
import com.lightspark.grid.models.GbpExternalAccountCreateInfo
import com.lightspark.grid.models.GhsBeneficiary
import com.lightspark.grid.models.GhsExternalAccountCreateInfo
import com.lightspark.grid.models.GtqBeneficiary
import com.lightspark.grid.models.GtqExternalAccountCreateInfo
import com.lightspark.grid.models.HkdExternalAccountCreateInfo
import com.lightspark.grid.models.HtgBeneficiary
import com.lightspark.grid.models.HtgExternalAccountCreateInfo
import com.lightspark.grid.models.IdrExternalAccountCreateInfo
import com.lightspark.grid.models.InrExternalAccountCreateInfo
import com.lightspark.grid.models.JmdBeneficiary
import com.lightspark.grid.models.JmdExternalAccountCreateInfo
import com.lightspark.grid.models.KesBeneficiary
import com.lightspark.grid.models.KesExternalAccountCreateInfo
import com.lightspark.grid.models.MwkBeneficiary
import com.lightspark.grid.models.MwkExternalAccountCreateInfo
import com.lightspark.grid.models.MxnExternalAccountCreateInfo
import com.lightspark.grid.models.MyrExternalAccountCreateInfo
import com.lightspark.grid.models.NgnBeneficiary
import com.lightspark.grid.models.NgnExternalAccountCreateInfo
import com.lightspark.grid.models.PhpExternalAccountCreateInfo
import com.lightspark.grid.models.PkrBeneficiary
import com.lightspark.grid.models.PkrExternalAccountCreateInfo
import com.lightspark.grid.models.RwfBeneficiary
import com.lightspark.grid.models.RwfExternalAccountCreateInfo
import com.lightspark.grid.models.SgdExternalAccountCreateInfo
import com.lightspark.grid.models.SlvBeneficiary
import com.lightspark.grid.models.SlvExternalAccountCreateInfo
import com.lightspark.grid.models.SwiftBeneficiary
import com.lightspark.grid.models.SwiftExternalAccountCreateInfo
import com.lightspark.grid.models.ThbExternalAccountCreateInfo
import com.lightspark.grid.models.TzsBeneficiary
import com.lightspark.grid.models.TzsExternalAccountCreateInfo
import com.lightspark.grid.models.UgxBeneficiary
import com.lightspark.grid.models.UgxExternalAccountCreateInfo
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.VndExternalAccountCreateInfo
import com.lightspark.grid.models.XafBeneficiary
import com.lightspark.grid.models.XafExternalAccountCreateInfo
import com.lightspark.grid.models.XofBeneficiary
import com.lightspark.grid.models.XofExternalAccountCreateInfo
import com.lightspark.grid.models.ZarBeneficiary
import com.lightspark.grid.models.ZarExternalAccountCreateInfo
import com.lightspark.grid.models.ZmwBeneficiary
import com.lightspark.grid.models.ZmwExternalAccountCreateInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExternalAccountCreateInfoOneOfTest {

    @Test
    fun ofAedAccount() {
        val aedAccount =
            AedExternalAccountCreateInfo.builder()
                .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                .beneficiary(
                    AedBeneficiary.builder()
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
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .iban("AE070331234567890123456")
                .swiftCode("EBILAEAD")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofAedAccount(aedAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isEqualTo(aedAccount)
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofAedAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofAedAccount(
                AedExternalAccountCreateInfo.builder()
                    .accountType(AedExternalAccountCreateInfo.AccountType.AED_ACCOUNT)
                    .beneficiary(
                        AedBeneficiary.builder()
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
                            .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
                            .fullName("fullName")
                            .birthDate("birthDate")
                            .countryOfResidence("countryOfResidence")
                            .email("email")
                            .nationality("nationality")
                            .phoneNumber("phoneNumber")
                            .build()
                    )
                    .iban("AE070331234567890123456")
                    .swiftCode("EBILAEAD")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofBdtAccount() {
        val bdtAccount =
            BdtExternalAccountCreateInfo.builder()
                .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
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
                .accountNumber("1234567890")
                .branchCode("11111")
                .phoneNumber("+1234567890")
                .swiftCode("DEUTDEFF")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofBdtAccount(bdtAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isEqualTo(bdtAccount)
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofBdtAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofBdtAccount(
                BdtExternalAccountCreateInfo.builder()
                    .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
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
                    .accountNumber("1234567890")
                    .branchCode("11111")
                    .phoneNumber("+1234567890")
                    .swiftCode("DEUTDEFF")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofBrlAccount() {
        val brlAccount =
            BrlExternalAccountCreateInfo.builder()
                .accountType(BrlExternalAccountCreateInfo.AccountType.BRL_ACCOUNT)
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
                .pixKey("user@example.com")
                .pixKeyType(BrlExternalAccountCreateInfo.PixKeyType.CPF)
                .taxId("11111111111")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofBrlAccount(brlAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isEqualTo(brlAccount)
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofBrlAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofBrlAccount(
                BrlExternalAccountCreateInfo.builder()
                    .accountType(BrlExternalAccountCreateInfo.AccountType.BRL_ACCOUNT)
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
                    .pixKey("user@example.com")
                    .pixKeyType(BrlExternalAccountCreateInfo.PixKeyType.CPF)
                    .taxId("11111111111")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofBwpAccount() {
        val bwpAccount =
            BwpExternalAccountCreateInfo.builder()
                .accountType(BwpExternalAccountCreateInfo.AccountType.BWP_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofBwpAccount(bwpAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isEqualTo(bwpAccount)
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofBwpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofBwpAccount(
                BwpExternalAccountCreateInfo.builder()
                    .accountType(BwpExternalAccountCreateInfo.AccountType.BWP_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofCadAccount() {
        val cadAccount =
            CadExternalAccountCreateInfo.builder()
                .accountNumber("1234567")
                .accountType(CadExternalAccountCreateInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
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
                .branchCode("00012")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofCadAccount(cadAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isEqualTo(cadAccount)
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofCadAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofCadAccount(
                CadExternalAccountCreateInfo.builder()
                    .accountNumber("1234567")
                    .accountType(CadExternalAccountCreateInfo.AccountType.CAD_ACCOUNT)
                    .bankCode("001")
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
                    .branchCode("00012")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofCopAccount() {
        val copAccount =
            CopExternalAccountCreateInfo.builder()
                .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .accountNumber("1234567890")
                .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("Bancolombia")
                .phoneNumber("+1234567890")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofCopAccount(copAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isEqualTo(copAccount)
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofCopAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofCopAccount(
                CopExternalAccountCreateInfo.builder()
                    .accountType(CopExternalAccountCreateInfo.AccountType.COP_ACCOUNT)
                    .beneficiary(
                        CopBeneficiary.builder()
                            .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                            .documentNumber("x")
                            .documentType(CopBeneficiary.DocumentType.CC)
                            .email("email")
                            .nationality("nationality")
                            .phoneNumber("phoneNumber")
                            .build()
                    )
                    .accountNumber("1234567890")
                    .bankAccountType(CopExternalAccountCreateInfo.BankAccountType.CHECKING)
                    .bankName("Bancolombia")
                    .phoneNumber("+1234567890")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofDkkAccount() {
        val dkkAccount =
            DkkExternalAccountCreateInfo.builder()
                .accountType(DkkExternalAccountCreateInfo.AccountType.DKK_ACCOUNT)
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
                .iban("DK5000400040116243")
                .swiftCode("DABADKKK")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofDkkAccount(dkkAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isEqualTo(dkkAccount)
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofDkkAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofDkkAccount(
                DkkExternalAccountCreateInfo.builder()
                    .accountType(DkkExternalAccountCreateInfo.AccountType.DKK_ACCOUNT)
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
                    .iban("DK5000400040116243")
                    .swiftCode("DABADKKK")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofEgpAccount() {
        val egpAccount =
            EgpExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                .bankName("Example Bank")
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
                .iban("EG380019000500000000263180002")
                .swiftCode("NBEGEGCX")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofEgpAccount(egpAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isEqualTo(egpAccount)
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofEgpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofEgpAccount(
                EgpExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(EgpExternalAccountCreateInfo.AccountType.EGP_ACCOUNT)
                    .bankName("Example Bank")
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
                    .iban("EG380019000500000000263180002")
                    .swiftCode("NBEGEGCX")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofEurAccount() {
        val eurAccount =
            EurExternalAccountCreateInfo.builder()
                .accountType(EurExternalAccountCreateInfo.AccountType.EUR_ACCOUNT)
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
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofEurAccount(eurAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isEqualTo(eurAccount)
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofEurAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofEurAccount(
                EurExternalAccountCreateInfo.builder()
                    .accountType(EurExternalAccountCreateInfo.AccountType.EUR_ACCOUNT)
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
                    .iban("DE89370400440532013000")
                    .swiftCode("DEUTDEFF")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofGbpAccount() {
        val gbpAccount =
            GbpExternalAccountCreateInfo.builder()
                .accountNumber("12345678")
                .accountType(GbpExternalAccountCreateInfo.AccountType.GBP_ACCOUNT)
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
                .sortCode("123456")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofGbpAccount(gbpAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isEqualTo(gbpAccount)
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofGbpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofGbpAccount(
                GbpExternalAccountCreateInfo.builder()
                    .accountNumber("12345678")
                    .accountType(GbpExternalAccountCreateInfo.AccountType.GBP_ACCOUNT)
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
                    .sortCode("123456")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofGhsAccount() {
        val ghsAccount =
            GhsExternalAccountCreateInfo.builder()
                .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
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
                .accountNumber("1234567890")
                .phoneNumber("+1234567890")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofGhsAccount(ghsAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isEqualTo(ghsAccount)
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofGhsAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofGhsAccount(
                GhsExternalAccountCreateInfo.builder()
                    .accountType(GhsExternalAccountCreateInfo.AccountType.GHS_ACCOUNT)
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
                    .accountNumber("1234567890")
                    .phoneNumber("+1234567890")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofGtqAccount() {
        val gtqAccount =
            GtqExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(GtqExternalAccountCreateInfo.AccountType.GTQ_ACCOUNT)
                .bankAccountType(GtqExternalAccountCreateInfo.BankAccountType.CHECKING)
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

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofGtqAccount(gtqAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isEqualTo(gtqAccount)
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofGtqAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofGtqAccount(
                GtqExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(GtqExternalAccountCreateInfo.AccountType.GTQ_ACCOUNT)
                    .bankAccountType(GtqExternalAccountCreateInfo.BankAccountType.CHECKING)
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

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofHkdAccount() {
        val hkdAccount =
            HkdExternalAccountCreateInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdExternalAccountCreateInfo.AccountType.HKD_ACCOUNT)
                .bankName("Example Bank")
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
                .swiftCode("HSBCHKHHHKH")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofHkdAccount(hkdAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isEqualTo(hkdAccount)
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofHkdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofHkdAccount(
                HkdExternalAccountCreateInfo.builder()
                    .accountNumber("123456789012")
                    .accountType(HkdExternalAccountCreateInfo.AccountType.HKD_ACCOUNT)
                    .bankName("Example Bank")
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
                    .swiftCode("HSBCHKHHHKH")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofHtgAccount() {
        val htgAccount =
            HtgExternalAccountCreateInfo.builder()
                .accountType(HtgExternalAccountCreateInfo.AccountType.HTG_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofHtgAccount(htgAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isEqualTo(htgAccount)
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofHtgAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofHtgAccount(
                HtgExternalAccountCreateInfo.builder()
                    .accountType(HtgExternalAccountCreateInfo.AccountType.HTG_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofIdrAccount() {
        val idrAccount =
            IdrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrExternalAccountCreateInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
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
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofIdrAccount(idrAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isEqualTo(idrAccount)
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofIdrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofIdrAccount(
                IdrExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(IdrExternalAccountCreateInfo.AccountType.IDR_ACCOUNT)
                    .bankName("Bank Central Asia")
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
                    .phoneNumber("+6281234567890")
                    .swiftCode("CENAIDJA")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofInrAccount() {
        val inrAccount =
            InrExternalAccountCreateInfo.builder()
                .accountType(InrExternalAccountCreateInfo.AccountType.INR_ACCOUNT)
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
                .vpa("user@upi")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofInrAccount(inrAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isEqualTo(inrAccount)
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofInrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofInrAccount(
                InrExternalAccountCreateInfo.builder()
                    .accountType(InrExternalAccountCreateInfo.AccountType.INR_ACCOUNT)
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
                    .vpa("user@upi")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofJmdAccount() {
        val jmdAccount =
            JmdExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(JmdExternalAccountCreateInfo.AccountType.JMD_ACCOUNT)
                .bankAccountType(JmdExternalAccountCreateInfo.BankAccountType.CHECKING)
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
                .branchCode("11111")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofJmdAccount(jmdAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isEqualTo(jmdAccount)
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofJmdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofJmdAccount(
                JmdExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(JmdExternalAccountCreateInfo.AccountType.JMD_ACCOUNT)
                    .bankAccountType(JmdExternalAccountCreateInfo.BankAccountType.CHECKING)
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
                    .branchCode("11111")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofKesAccount() {
        val kesAccount =
            KesExternalAccountCreateInfo.builder()
                .accountType(KesExternalAccountCreateInfo.AccountType.KES_ACCOUNT)
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
                .phoneNumber("+254712345678")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofKesAccount(kesAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isEqualTo(kesAccount)
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofKesAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofKesAccount(
                KesExternalAccountCreateInfo.builder()
                    .accountType(KesExternalAccountCreateInfo.AccountType.KES_ACCOUNT)
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
                    .phoneNumber("+254712345678")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofMwkAccount() {
        val mwkAccount =
            MwkExternalAccountCreateInfo.builder()
                .accountType(MwkExternalAccountCreateInfo.AccountType.MWK_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofMwkAccount(mwkAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isEqualTo(mwkAccount)
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofMwkAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofMwkAccount(
                MwkExternalAccountCreateInfo.builder()
                    .accountType(MwkExternalAccountCreateInfo.AccountType.MWK_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofMxnAccount() {
        val mxnAccount =
            MxnExternalAccountCreateInfo.builder()
                .accountType(MxnExternalAccountCreateInfo.AccountType.MXN_ACCOUNT)
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
                .clabeNumber("123456789012345678")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofMxnAccount(mxnAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isEqualTo(mxnAccount)
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofMxnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofMxnAccount(
                MxnExternalAccountCreateInfo.builder()
                    .accountType(MxnExternalAccountCreateInfo.AccountType.MXN_ACCOUNT)
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
                    .clabeNumber("123456789012345678")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofMyrAccount() {
        val myrAccount =
            MyrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrExternalAccountCreateInfo.AccountType.MYR_ACCOUNT)
                .bankName("Example Bank")
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
                .swiftCode("MABORUMMYYY")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofMyrAccount(myrAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isEqualTo(myrAccount)
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofMyrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofMyrAccount(
                MyrExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(MyrExternalAccountCreateInfo.AccountType.MYR_ACCOUNT)
                    .bankName("Example Bank")
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
                    .swiftCode("MABORUMMYYY")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofNgnAccount() {
        val ngnAccount =
            NgnExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(NgnExternalAccountCreateInfo.AccountType.NGN_ACCOUNT)
                .bankName("Example Bank")
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

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofNgnAccount(ngnAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isEqualTo(ngnAccount)
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofNgnAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofNgnAccount(
                NgnExternalAccountCreateInfo.builder()
                    .accountNumber("0123456789")
                    .accountType(NgnExternalAccountCreateInfo.AccountType.NGN_ACCOUNT)
                    .bankName("Example Bank")
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

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofPhpAccount() {
        val phpAccount =
            PhpExternalAccountCreateInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountCreateInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
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

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofPhpAccount(phpAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isEqualTo(phpAccount)
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofPhpAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofPhpAccount(
                PhpExternalAccountCreateInfo.builder()
                    .accountNumber("001234567890")
                    .accountType(PhpExternalAccountCreateInfo.AccountType.PHP_ACCOUNT)
                    .bankName("BDO Unibank")
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

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofPkrAccount() {
        val pkrAccount =
            PkrExternalAccountCreateInfo.builder()
                .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
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
                .accountNumber("1234567890")
                .bankName("Example Bank")
                .iban("PK36SCBL0000001123456702")
                .phoneNumber("+1234567890")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofPkrAccount(pkrAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isEqualTo(pkrAccount)
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofPkrAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofPkrAccount(
                PkrExternalAccountCreateInfo.builder()
                    .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
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
                    .accountNumber("1234567890")
                    .bankName("Example Bank")
                    .iban("PK36SCBL0000001123456702")
                    .phoneNumber("+1234567890")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofRwfAccount() {
        val rwfAccount =
            RwfExternalAccountCreateInfo.builder()
                .accountType(RwfExternalAccountCreateInfo.AccountType.RWF_ACCOUNT)
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
                .phoneNumber("+250781234567")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofRwfAccount(rwfAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isEqualTo(rwfAccount)
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofRwfAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofRwfAccount(
                RwfExternalAccountCreateInfo.builder()
                    .accountType(RwfExternalAccountCreateInfo.AccountType.RWF_ACCOUNT)
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
                    .phoneNumber("+250781234567")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofSgdAccount() {
        val sgdAccount =
            SgdExternalAccountCreateInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountCreateInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
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
                .swiftCode("DBSSSGSG")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofSgdAccount(sgdAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isEqualTo(sgdAccount)
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofSgdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofSgdAccount(
                SgdExternalAccountCreateInfo.builder()
                    .accountNumber("0123456789")
                    .accountType(SgdExternalAccountCreateInfo.AccountType.SGD_ACCOUNT)
                    .bankName("DBS Bank Ltd")
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
                    .swiftCode("DBSSSGSG")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofSlvAccount() {
        val slvAccount =
            SlvExternalAccountCreateInfo.builder()
                .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
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
                .accountNumber("0123456789")
                .bankAccountType(SlvExternalAccountCreateInfo.BankAccountType.CHECKING)
                .bankName("Banco Cuscatlan")
                .phoneNumber("+50312345678")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofSlvAccount(slvAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isEqualTo(slvAccount)
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofSlvAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofSlvAccount(
                SlvExternalAccountCreateInfo.builder()
                    .accountType(SlvExternalAccountCreateInfo.AccountType.SLV_ACCOUNT)
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
                    .accountNumber("0123456789")
                    .bankAccountType(SlvExternalAccountCreateInfo.BankAccountType.CHECKING)
                    .bankName("Banco Cuscatlan")
                    .phoneNumber("+50312345678")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofThbAccount() {
        val thbAccount =
            ThbExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbExternalAccountCreateInfo.AccountType.THB_ACCOUNT)
                .bankName("Example Bank")
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
                .swiftCode("BKKBTHBK")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofThbAccount(thbAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isEqualTo(thbAccount)
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofThbAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofThbAccount(
                ThbExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(ThbExternalAccountCreateInfo.AccountType.THB_ACCOUNT)
                    .bankName("Example Bank")
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
                    .swiftCode("BKKBTHBK")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofTzsAccount() {
        val tzsAccount =
            TzsExternalAccountCreateInfo.builder()
                .accountType(TzsExternalAccountCreateInfo.AccountType.TZS_ACCOUNT)
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
                .phoneNumber("+255712345678")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofTzsAccount(tzsAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isEqualTo(tzsAccount)
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofTzsAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofTzsAccount(
                TzsExternalAccountCreateInfo.builder()
                    .accountType(TzsExternalAccountCreateInfo.AccountType.TZS_ACCOUNT)
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
                    .phoneNumber("+255712345678")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofUgxAccount() {
        val ugxAccount =
            UgxExternalAccountCreateInfo.builder()
                .accountType(UgxExternalAccountCreateInfo.AccountType.UGX_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofUgxAccount(ugxAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isEqualTo(ugxAccount)
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofUgxAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofUgxAccount(
                UgxExternalAccountCreateInfo.builder()
                    .accountType(UgxExternalAccountCreateInfo.AccountType.UGX_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofUsdAccount() {
        val usdAccount =
            UsdExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
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
                .routingNumber("021000021")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofUsdAccount(usdAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isEqualTo(usdAccount)
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofUsdAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofUsdAccount(
                UsdExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
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
                    .routingNumber("021000021")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofVndAccount() {
        val vndAccount =
            VndExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndExternalAccountCreateInfo.AccountType.VND_ACCOUNT)
                .bankName("Example Bank")
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
                .swiftCode("BFTVVNVX")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofVndAccount(vndAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isEqualTo(vndAccount)
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofVndAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofVndAccount(
                VndExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(VndExternalAccountCreateInfo.AccountType.VND_ACCOUNT)
                    .bankName("Example Bank")
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
                    .swiftCode("BFTVVNVX")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofXafAccount() {
        val xafAccount =
            XafExternalAccountCreateInfo.builder()
                .accountType(XafExternalAccountCreateInfo.AccountType.XAF_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .provider("Example Provider")
                .region(XafExternalAccountCreateInfo.Region.CM)
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofXafAccount(xafAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isEqualTo(xafAccount)
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofXafAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofXafAccount(
                XafExternalAccountCreateInfo.builder()
                    .accountType(XafExternalAccountCreateInfo.AccountType.XAF_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .provider("Example Provider")
                    .region(XafExternalAccountCreateInfo.Region.CM)
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofXofAccount() {
        val xofAccount =
            XofExternalAccountCreateInfo.builder()
                .accountType(XofExternalAccountCreateInfo.AccountType.XOF_ACCOUNT)
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
                .phoneNumber("+1234567890")
                .provider("Example Provider")
                .region(XofExternalAccountCreateInfo.Region.BJ)
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofXofAccount(xofAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isEqualTo(xofAccount)
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofXofAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofXofAccount(
                XofExternalAccountCreateInfo.builder()
                    .accountType(XofExternalAccountCreateInfo.AccountType.XOF_ACCOUNT)
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
                    .phoneNumber("+1234567890")
                    .provider("Example Provider")
                    .region(XofExternalAccountCreateInfo.Region.BJ)
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofZarAccount() {
        val zarAccount =
            ZarExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarExternalAccountCreateInfo.AccountType.ZAR_ACCOUNT)
                .bankName("Example Bank")
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

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofZarAccount(zarAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isEqualTo(zarAccount)
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofZarAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofZarAccount(
                ZarExternalAccountCreateInfo.builder()
                    .accountNumber("1234567890")
                    .accountType(ZarExternalAccountCreateInfo.AccountType.ZAR_ACCOUNT)
                    .bankName("Example Bank")
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

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofZmwAccount() {
        val zmwAccount =
            ZmwExternalAccountCreateInfo.builder()
                .accountType(ZmwExternalAccountCreateInfo.AccountType.ZMW_ACCOUNT)
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
                .phoneNumber("+260971234567")
                .provider("Example Provider")
                .build()

        val externalAccountCreateInfoOneOf = ExternalAccountCreateInfoOneOf.ofZmwAccount(zmwAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isEqualTo(zmwAccount)
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isNull()
    }

    @Test
    fun ofZmwAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofZmwAccount(
                ZmwExternalAccountCreateInfo.builder()
                    .accountType(ZmwExternalAccountCreateInfo.AccountType.ZMW_ACCOUNT)
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
                    .phoneNumber("+260971234567")
                    .provider("Example Provider")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
    }

    @Test
    fun ofSwiftAccount() {
        val swiftAccount =
            SwiftExternalAccountCreateInfo.builder()
                .accountType(SwiftExternalAccountCreateInfo.AccountType.SWIFT_ACCOUNT)
                .bankName("Deutsche Bank")
                .beneficiary(
                    SwiftBeneficiary.builder()
                        .beneficiaryType(SwiftBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("DEUTDEFF")
                .accountNumber("1234567890")
                .iban("GB29NWBK60161331926819")
                .build()

        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofSwiftAccount(swiftAccount)

        assertThat(externalAccountCreateInfoOneOf.aedAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bdtAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.brlAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.bwpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.cadAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.copAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.dkkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.egpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.eurAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gbpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ghsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.gtqAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.hkdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.htgAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.idrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.inrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.jmdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.kesAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mwkAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.mxnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.myrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ngnAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.phpAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.pkrAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.rwfAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.sgdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.slvAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.thbAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.tzsAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.ugxAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.usdAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.vndAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xafAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.xofAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zarAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.zmwAccount()).isNull()
        assertThat(externalAccountCreateInfoOneOf.swiftAccount()).isEqualTo(swiftAccount)
    }

    @Test
    fun ofSwiftAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountCreateInfoOneOf =
            ExternalAccountCreateInfoOneOf.ofSwiftAccount(
                SwiftExternalAccountCreateInfo.builder()
                    .accountType(SwiftExternalAccountCreateInfo.AccountType.SWIFT_ACCOUNT)
                    .bankName("Deutsche Bank")
                    .beneficiary(
                        SwiftBeneficiary.builder()
                            .beneficiaryType(SwiftBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                    .swiftCode("DEUTDEFF")
                    .accountNumber("1234567890")
                    .iban("GB29NWBK60161331926819")
                    .build()
            )

        val roundtrippedExternalAccountCreateInfoOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountCreateInfoOneOf),
                jacksonTypeRef<ExternalAccountCreateInfoOneOf>(),
            )

        assertThat(roundtrippedExternalAccountCreateInfoOneOf)
            .isEqualTo(externalAccountCreateInfoOneOf)
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
        val externalAccountCreateInfoOneOf =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<ExternalAccountCreateInfoOneOf>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> {
                externalAccountCreateInfoOneOf.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
