// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Objects

/**
 * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an individual
 * customer. Referenced via `allOf` from `IndividualCustomerFields`, so these appear as top-level
 * optional fields on the customer resource itself; there is no separate EDD resource. The specific
 * set required for a given customer is driven by the KYC provider's per-jurisdiction / per-flow /
 * per-volume-tier rules (surfaced through `MISSING_FIELD` errors on `POST /verifications`).
 */
@JsonDeserialize(using = CustomerUpdateRequestOneOf.Deserializer::class)
@JsonSerialize(using = CustomerUpdateRequestOneOf.Serializer::class)
class CustomerUpdateRequestOneOf
private constructor(
    private val individual: IndividualCustomerUpdateRequest? = null,
    private val business: BusinessCustomerUpdateRequest? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an
     * individual customer. Referenced via `allOf` from `IndividualCustomerFields`, so these appear
     * as top-level optional fields on the customer resource itself; there is no separate EDD
     * resource. The specific set required for a given customer is driven by the KYC provider's
     * per-jurisdiction / per-flow / per-volume-tier rules (surfaced through `MISSING_FIELD` errors
     * on `POST /verifications`).
     */
    fun individual(): IndividualCustomerUpdateRequest? = individual

    /**
     * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer with
     * tied Embedded Wallet internal accounts, Grid updates the customer email and every tied
     * `EMAIL_OTP` credential through the endpoint's signed-retry flow. When `phoneNumber` changes
     * for a customer with tied Embedded Wallet internal accounts, Grid updates the customer phone
     * number and every tied `SMS_OTP` credential through the same signed-retry flow. Update `email`
     * and `phoneNumber` in separate PATCH calls.
     */
    fun business(): BusinessCustomerUpdateRequest? = business

    fun isIndividual(): Boolean = individual != null

    fun isBusiness(): Boolean = business != null

    /**
     * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an
     * individual customer. Referenced via `allOf` from `IndividualCustomerFields`, so these appear
     * as top-level optional fields on the customer resource itself; there is no separate EDD
     * resource. The specific set required for a given customer is driven by the KYC provider's
     * per-jurisdiction / per-flow / per-volume-tier rules (surfaced through `MISSING_FIELD` errors
     * on `POST /verifications`).
     */
    fun asIndividual(): IndividualCustomerUpdateRequest = individual.getOrThrow("individual")

    /**
     * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer with
     * tied Embedded Wallet internal accounts, Grid updates the customer email and every tied
     * `EMAIL_OTP` credential through the endpoint's signed-retry flow. When `phoneNumber` changes
     * for a customer with tied Embedded Wallet internal accounts, Grid updates the customer phone
     * number and every tied `SMS_OTP` credential through the same signed-retry flow. Update `email`
     * and `phoneNumber` in separate PATCH calls.
     */
    fun asBusiness(): BusinessCustomerUpdateRequest = business.getOrThrow("business")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = customerUpdateRequestOneOf.accept(object : CustomerUpdateRequestOneOf.Visitor<String?> {
     *     override fun visitIndividual(individual: IndividualCustomerUpdateRequest): String? = individual.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            individual != null -> visitor.visitIndividual(individual)
            business != null -> visitor.visitBusiness(business)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CustomerUpdateRequestOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIndividual(individual: IndividualCustomerUpdateRequest) {
                    individual.validate()
                }

                override fun visitBusiness(business: BusinessCustomerUpdateRequest) {
                    business.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LightsparkGridInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitIndividual(individual: IndividualCustomerUpdateRequest) =
                    individual.validity()

                override fun visitBusiness(business: BusinessCustomerUpdateRequest) =
                    business.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerUpdateRequestOneOf &&
            individual == other.individual &&
            business == other.business
    }

    override fun hashCode(): Int = Objects.hash(individual, business)

    override fun toString(): String =
        when {
            individual != null -> "CustomerUpdateRequestOneOf{individual=$individual}"
            business != null -> "CustomerUpdateRequestOneOf{business=$business}"
            _json != null -> "CustomerUpdateRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerUpdateRequestOneOf")
        }

    companion object {

        /**
         * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an
         * individual customer. Referenced via `allOf` from `IndividualCustomerFields`, so these
         * appear as top-level optional fields on the customer resource itself; there is no separate
         * EDD resource. The specific set required for a given customer is driven by the KYC
         * provider's per-jurisdiction / per-flow / per-volume-tier rules (surfaced through
         * `MISSING_FIELD` errors on `POST /verifications`).
         */
        fun ofIndividual(individual: IndividualCustomerUpdateRequest) =
            CustomerUpdateRequestOneOf(individual = individual)

        /**
         * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer
         * with tied Embedded Wallet internal accounts, Grid updates the customer email and every
         * tied `EMAIL_OTP` credential through the endpoint's signed-retry flow. When `phoneNumber`
         * changes for a customer with tied Embedded Wallet internal accounts, Grid updates the
         * customer phone number and every tied `SMS_OTP` credential through the same signed-retry
         * flow. Update `email` and `phoneNumber` in separate PATCH calls.
         */
        fun ofBusiness(business: BusinessCustomerUpdateRequest) =
            CustomerUpdateRequestOneOf(business = business)
    }

    /**
     * An interface that defines how to map each variant of [CustomerUpdateRequestOneOf] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /**
         * Enhanced-due-diligence (EDD) fields available as optional patchable attributes on an
         * individual customer. Referenced via `allOf` from `IndividualCustomerFields`, so these
         * appear as top-level optional fields on the customer resource itself; there is no separate
         * EDD resource. The specific set required for a given customer is driven by the KYC
         * provider's per-jurisdiction / per-flow / per-volume-tier rules (surfaced through
         * `MISSING_FIELD` errors on `POST /verifications`).
         */
        fun visitIndividual(individual: IndividualCustomerUpdateRequest): T

        /**
         * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer
         * with tied Embedded Wallet internal accounts, Grid updates the customer email and every
         * tied `EMAIL_OTP` credential through the endpoint's signed-retry flow. When `phoneNumber`
         * changes for a customer with tied Embedded Wallet internal accounts, Grid updates the
         * customer phone number and every tied `SMS_OTP` credential through the same signed-retry
         * flow. Update `email` and `phoneNumber` in separate PATCH calls.
         */
        fun visitBusiness(business: BusinessCustomerUpdateRequest): T

        /**
         * Maps an unknown variant of [CustomerUpdateRequestOneOf] to a value of type [T].
         *
         * An instance of [CustomerUpdateRequestOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CustomerUpdateRequestOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CustomerUpdateRequestOneOf>(CustomerUpdateRequestOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CustomerUpdateRequestOneOf {
            val json = JsonValue.fromJsonNode(node)
            val customerType = json.asObject()?.get("customerType")?.asString()

            when (customerType) {
                "INDIVIDUAL" -> {
                    return tryDeserialize(node, jacksonTypeRef<IndividualCustomerUpdateRequest>())
                        ?.let { CustomerUpdateRequestOneOf(individual = it, _json = json) }
                        ?: CustomerUpdateRequestOneOf(_json = json)
                }
                "BUSINESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<BusinessCustomerUpdateRequest>())
                        ?.let { CustomerUpdateRequestOneOf(business = it, _json = json) }
                        ?: CustomerUpdateRequestOneOf(_json = json)
                }
            }

            return CustomerUpdateRequestOneOf(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerUpdateRequestOneOf>(CustomerUpdateRequestOneOf::class) {

        override fun serialize(
            value: CustomerUpdateRequestOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.individual != null -> generator.writeObject(value.individual)
                value.business != null -> generator.writeObject(value.business)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerUpdateRequestOneOf")
            }
        }
    }
}
