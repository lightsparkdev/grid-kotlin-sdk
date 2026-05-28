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
import com.lightspark.grid.models.BusinessCustomer
import com.lightspark.grid.models.IndividualCustomer
import java.util.Objects

@JsonDeserialize(using = CustomerUpdateResponse.Deserializer::class)
@JsonSerialize(using = CustomerUpdateResponse.Serializer::class)
class CustomerUpdateResponse
private constructor(
    private val individual: IndividualCustomer? = null,
    private val business: BusinessCustomer? = null,
    private val _json: JsonValue? = null,
) {

    fun individual(): IndividualCustomer? = individual

    fun business(): BusinessCustomer? = business

    fun isIndividual(): Boolean = individual != null

    fun isBusiness(): Boolean = business != null

    fun asIndividual(): IndividualCustomer = individual.getOrThrow("individual")

    fun asBusiness(): BusinessCustomer = business.getOrThrow("business")

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
     * val result: String? = customerUpdateResponse.accept(object : CustomerUpdateResponse.Visitor<String?> {
     *     override fun visitIndividual(individual: IndividualCustomer): String? = individual.toString()
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
    fun validate(): CustomerUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIndividual(individual: IndividualCustomer) {
                    individual.validate()
                }

                override fun visitBusiness(business: BusinessCustomer) {
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
                override fun visitIndividual(individual: IndividualCustomer) = individual.validity()

                override fun visitBusiness(business: BusinessCustomer) = business.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerUpdateResponse &&
            individual == other.individual &&
            business == other.business
    }

    override fun hashCode(): Int = Objects.hash(individual, business)

    override fun toString(): String =
        when {
            individual != null -> "CustomerUpdateResponse{individual=$individual}"
            business != null -> "CustomerUpdateResponse{business=$business}"
            _json != null -> "CustomerUpdateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerUpdateResponse")
        }

    companion object {

        fun ofIndividual(individual: IndividualCustomer) =
            CustomerUpdateResponse(individual = individual)

        fun ofBusiness(business: BusinessCustomer) = CustomerUpdateResponse(business = business)
    }

    /**
     * An interface that defines how to map each variant of [CustomerUpdateResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitIndividual(individual: IndividualCustomer): T

        fun visitBusiness(business: BusinessCustomer): T

        /**
         * Maps an unknown variant of [CustomerUpdateResponse] to a value of type [T].
         *
         * An instance of [CustomerUpdateResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CustomerUpdateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CustomerUpdateResponse>(CustomerUpdateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CustomerUpdateResponse {
            val json = JsonValue.fromJsonNode(node)
            val customerType = json.asObject()?.get("customerType")?.asString()

            when (customerType) {
                "INDIVIDUAL" -> {
                    return tryDeserialize(node, jacksonTypeRef<IndividualCustomer>())?.let {
                        CustomerUpdateResponse(individual = it, _json = json)
                    } ?: CustomerUpdateResponse(_json = json)
                }
                "BUSINESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<BusinessCustomer>())?.let {
                        CustomerUpdateResponse(business = it, _json = json)
                    } ?: CustomerUpdateResponse(_json = json)
                }
            }

            return CustomerUpdateResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerUpdateResponse>(CustomerUpdateResponse::class) {

        override fun serialize(
            value: CustomerUpdateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.individual != null -> generator.writeObject(value.individual)
                value.business != null -> generator.writeObject(value.business)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerUpdateResponse")
            }
        }
    }
}
