// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Objects

@JsonDeserialize(using = TransactionRetrieveResponse.Deserializer::class)
@JsonSerialize(using = TransactionRetrieveResponse.Serializer::class)
class TransactionRetrieveResponse
private constructor(
    private val incomingTransaction: IncomingTransaction? = null,
    private val outgoingTransaction: OutgoingTransaction? = null,
    private val _json: JsonValue? = null,
) {

    fun incomingTransaction(): IncomingTransaction? = incomingTransaction

    fun outgoingTransaction(): OutgoingTransaction? = outgoingTransaction

    fun isIncomingTransaction(): Boolean = incomingTransaction != null

    fun isOutgoingTransaction(): Boolean = outgoingTransaction != null

    fun asIncomingTransaction(): IncomingTransaction =
        incomingTransaction.getOrThrow("incomingTransaction")

    fun asOutgoingTransaction(): OutgoingTransaction =
        outgoingTransaction.getOrThrow("outgoingTransaction")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            incomingTransaction != null -> visitor.visitIncomingTransaction(incomingTransaction)
            outgoingTransaction != null -> visitor.visitOutgoingTransaction(outgoingTransaction)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TransactionRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncomingTransaction(incomingTransaction: IncomingTransaction) {
                    incomingTransaction.validate()
                }

                override fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction) {
                    outgoingTransaction.validate()
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
                override fun visitIncomingTransaction(incomingTransaction: IncomingTransaction) =
                    incomingTransaction.validity()

                override fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction) =
                    outgoingTransaction.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionRetrieveResponse &&
            incomingTransaction == other.incomingTransaction &&
            outgoingTransaction == other.outgoingTransaction
    }

    override fun hashCode(): Int = Objects.hash(incomingTransaction, outgoingTransaction)

    override fun toString(): String =
        when {
            incomingTransaction != null ->
                "TransactionRetrieveResponse{incomingTransaction=$incomingTransaction}"
            outgoingTransaction != null ->
                "TransactionRetrieveResponse{outgoingTransaction=$outgoingTransaction}"
            _json != null -> "TransactionRetrieveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TransactionRetrieveResponse")
        }

    companion object {

        fun ofIncomingTransaction(incomingTransaction: IncomingTransaction) =
            TransactionRetrieveResponse(incomingTransaction = incomingTransaction)

        fun ofOutgoingTransaction(outgoingTransaction: OutgoingTransaction) =
            TransactionRetrieveResponse(outgoingTransaction = outgoingTransaction)
    }

    /**
     * An interface that defines how to map each variant of [TransactionRetrieveResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitIncomingTransaction(incomingTransaction: IncomingTransaction): T

        fun visitOutgoingTransaction(outgoingTransaction: OutgoingTransaction): T

        /**
         * Maps an unknown variant of [TransactionRetrieveResponse] to a value of type [T].
         *
         * An instance of [TransactionRetrieveResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown TransactionRetrieveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TransactionRetrieveResponse>(TransactionRetrieveResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TransactionRetrieveResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IncomingTransaction>())?.let {
                            TransactionRetrieveResponse(incomingTransaction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OutgoingTransaction>())?.let {
                            TransactionRetrieveResponse(outgoingTransaction = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TransactionRetrieveResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TransactionRetrieveResponse>(TransactionRetrieveResponse::class) {

        override fun serialize(
            value: TransactionRetrieveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.incomingTransaction != null ->
                    generator.writeObject(value.incomingTransaction)
                value.outgoingTransaction != null ->
                    generator.writeObject(value.outgoingTransaction)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TransactionRetrieveResponse")
            }
        }
    }
}
