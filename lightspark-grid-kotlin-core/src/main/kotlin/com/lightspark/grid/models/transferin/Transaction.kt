// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

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
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransaction
import java.util.Objects

@JsonDeserialize(using = Transaction.Deserializer::class)
@JsonSerialize(using = Transaction.Serializer::class)
class Transaction
private constructor(
    private val incoming: IncomingTransaction? = null,
    private val outgoing: OutgoingTransaction? = null,
    private val _json: JsonValue? = null,
) {

    fun incoming(): IncomingTransaction? = incoming

    fun outgoing(): OutgoingTransaction? = outgoing

    fun isIncoming(): Boolean = incoming != null

    fun isOutgoing(): Boolean = outgoing != null

    fun asIncoming(): IncomingTransaction = incoming.getOrThrow("incoming")

    fun asOutgoing(): OutgoingTransaction = outgoing.getOrThrow("outgoing")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            incoming != null -> visitor.visitIncoming(incoming)
            outgoing != null -> visitor.visitOutgoing(outgoing)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncoming(incoming: IncomingTransaction) {
                    incoming.validate()
                }

                override fun visitOutgoing(outgoing: OutgoingTransaction) {
                    outgoing.validate()
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
                override fun visitIncoming(incoming: IncomingTransaction) = incoming.validity()

                override fun visitOutgoing(outgoing: OutgoingTransaction) = outgoing.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction && incoming == other.incoming && outgoing == other.outgoing
    }

    override fun hashCode(): Int = Objects.hash(incoming, outgoing)

    override fun toString(): String =
        when {
            incoming != null -> "Transaction{incoming=$incoming}"
            outgoing != null -> "Transaction{outgoing=$outgoing}"
            _json != null -> "Transaction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Transaction")
        }

    companion object {

        fun ofIncoming(incoming: IncomingTransaction) = Transaction(incoming = incoming)

        fun ofOutgoing(outgoing: OutgoingTransaction) = Transaction(outgoing = outgoing)
    }

    /**
     * An interface that defines how to map each variant of [Transaction] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitIncoming(incoming: IncomingTransaction): T

        fun visitOutgoing(outgoing: OutgoingTransaction): T

        /**
         * Maps an unknown variant of [Transaction] to a value of type [T].
         *
         * An instance of [Transaction] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown Transaction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Transaction>(Transaction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Transaction {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IncomingTransaction>())?.let {
                            Transaction(incoming = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OutgoingTransaction>())?.let {
                            Transaction(outgoing = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Transaction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Transaction>(Transaction::class) {

        override fun serialize(
            value: Transaction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.incoming != null -> generator.writeObject(value.incoming)
                value.outgoing != null -> generator.writeObject(value.outgoing)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Transaction")
            }
        }
    }
}
