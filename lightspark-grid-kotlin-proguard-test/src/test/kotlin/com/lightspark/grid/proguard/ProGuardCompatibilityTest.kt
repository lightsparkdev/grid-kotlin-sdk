// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.customers.CustomerCreateRequestOneOf
import com.lightspark.grid.models.customers.EndUserTermsConsentRequest
import com.lightspark.grid.models.customers.IndividualCustomerCreateRequest
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.quotes.BaseDestination
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/lightspark-grid-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.config()).isNotNull()
        assertThat(client.customers()).isNotNull()
        assertThat(client.platform()).isNotNull()
        assertThat(client.transferIn()).isNotNull()
        assertThat(client.transferOut()).isNotNull()
        assertThat(client.receiver()).isNotNull()
        assertThat(client.quotes()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.invitations()).isNotNull()
        assertThat(client.sandbox()).isNotNull()
        assertThat(client.umaProviders()).isNotNull()
        assertThat(client.vasps()).isNotNull()
        assertThat(client.tokens()).isNotNull()
        assertThat(client.exchangeRates()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.crypto()).isNotNull()
        assertThat(client.beneficialOwners()).isNotNull()
        assertThat(client.documents()).isNotNull()
        assertThat(client.verifications()).isNotNull()
        assertThat(client.discoveries()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.agents()).isNotNull()
        assertThat(client.cards()).isNotNull()
    }

    @Test
    fun baseDestinationRoundtrip() {
        val jsonMapper = jsonMapper()
        val baseDestination =
            BaseDestination.builder().destinationType(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedBaseDestination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseDestination),
                jacksonTypeRef<BaseDestination>(),
            )

        assertThat(roundtrippedBaseDestination).isEqualTo(baseDestination)
    }

    @Test
    fun customerCreateRequestOneOfRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreateRequestOneOf =
            CustomerCreateRequestOneOf.ofIndividual(
                IndividualCustomerCreateRequest.builder()
                    .customerType(IndividualCustomerCreateRequest.CustomerType.INDIVIDUAL)
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
                    .annualIncomeRange(
                        IndividualCustomerCreateRequest.AnnualIncomeRange.RANGE_100_K_250_K
                    )
                    .birthDate(LocalDate.parse("1990-01-15"))
                    .countryOfIssuance("US")
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .endUserTermsConsent(
                        EndUserTermsConsentRequest.builder()
                            .acceptanceMethod(EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX)
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ipAddress("198.51.100.24")
                            .termsVersion("V1")
                            .build()
                    )
                    .expectedMonthlyTransactionCount(
                        IndividualCustomerCreateRequest.ExpectedMonthlyTransactionCount
                            .COUNT_100_TO_500
                    )
                    .expectedMonthlyTransactionVolume(
                        IndividualCustomerCreateRequest.ExpectedMonthlyTransactionVolume
                            .VOLUME_100_K_TO_1_M
                    )
                    .fullName("John Michael Doe")
                    .identifier("123-45-6789")
                    .idType(IndividualCustomerCreateRequest.IdType.SSN)
                    .kycStatus(IndividualCustomerCreateRequest.KycStatus.APPROVED)
                    .nationality("US")
                    .netWorthRange(IndividualCustomerCreateRequest.NetWorthRange.RANGE_500_K_1_M)
                    .pepStatus(IndividualCustomerCreateRequest.PepStatus.NONE)
                    .phoneNumber("+14155551234")
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .purposeOfAccount(
                        IndividualCustomerCreateRequest.PurposeOfAccount.CONTRACTOR_PAYOUTS
                    )
                    .purposeOfAccountOtherDescription("Household budgeting between spouses")
                    .region("US")
                    .addSourceOfFundsCategory(
                        IndividualCustomerCreateRequest.SourceOfFundsCategory.SALARY
                    )
                    .sourceOfFundsOtherDescription("Contest winnings")
                    .addSourceOfWealthCategory(
                        IndividualCustomerCreateRequest.SourceOfWealthCategory.SALARY
                    )
                    .addSourceOfWealthCategory(
                        IndividualCustomerCreateRequest.SourceOfWealthCategory.INVESTMENTS
                    )
                    .sourceOfWealthOtherDescription("Royalty income from published works")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .build()
            )

        val roundtrippedCustomerCreateRequestOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreateRequestOneOf),
                jacksonTypeRef<CustomerCreateRequestOneOf>(),
            )

        assertThat(roundtrippedCustomerCreateRequestOneOf).isEqualTo(customerCreateRequestOneOf)
    }

    @Test
    fun customerInfoFieldNameRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerInfoFieldName = CustomerInfoFieldName.FULL_NAME

        val roundtrippedCustomerInfoFieldName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerInfoFieldName),
                jacksonTypeRef<CustomerInfoFieldName>(),
            )

        assertThat(roundtrippedCustomerInfoFieldName).isEqualTo(customerInfoFieldName)
    }
}
