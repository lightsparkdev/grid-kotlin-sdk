// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.CustomerType
import com.lightspark.grid.models.customers.IndividualCustomerFields
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
    fun customerOneOfRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerOneOf =
            CustomerOneOf.ofIndividualCustomer(
                CustomerOneOf.IndividualCustomer.builder()
                    .customerType(JsonValue.from("INDIVIDUAL"))
                    .platformCustomerId("9f84e0c2a72c4fa")
                    .umaAddress("\$john.doe@uma.domain.com")
                    .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                    .addCurrency("USD")
                    .addCurrency("USDC")
                    .email("john.doe@example.com")
                    .isDeleted(false)
                    .region("US")
                    .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
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
                    .fullName("John Michael Doe")
                    .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                    .nationality("US")
                    .build()
            )

        val roundtrippedCustomerOneOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerOneOf),
                jacksonTypeRef<CustomerOneOf>(),
            )

        assertThat(roundtrippedCustomerOneOf).isEqualTo(customerOneOf)
    }

    @Test
    fun customerTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerType = CustomerType.INDIVIDUAL

        val roundtrippedCustomerType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerType),
                jacksonTypeRef<CustomerType>(),
            )

        assertThat(roundtrippedCustomerType).isEqualTo(customerType)
    }
}
