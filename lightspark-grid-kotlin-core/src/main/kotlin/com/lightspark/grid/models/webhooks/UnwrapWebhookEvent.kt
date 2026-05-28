// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

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
import com.lightspark.grid.models.sandbox.webhooks.TestWebhookRequest
import java.util.Objects

@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val agentActionWebhook: AgentActionWebhook? = null,
    private val incomingPaymentWebhook: IncomingPaymentWebhook? = null,
    private val outgoingPaymentWebhook: OutgoingPaymentWebhook? = null,
    private val testWebhookRequest: TestWebhookRequest? = null,
    private val bulkUploadWebhook: BulkUploadWebhook? = null,
    private val invitationClaimedWebhook: InvitationClaimedWebhook? = null,
    private val customerWebhook: CustomerWebhook? = null,
    private val internalAccountStatusWebhook: InternalAccountStatusWebhook? = null,
    private val verificationWebhook: VerificationWebhook? = null,
    private val cardStateChangeWebhook: CardStateChangeWebhook? = null,
    private val cardFundingSourceChangeWebhook: CardFundingSourceChangeWebhook? = null,
    private val _json: JsonValue? = null,
) {

    fun agentActionWebhook(): AgentActionWebhook? = agentActionWebhook

    fun incomingPaymentWebhook(): IncomingPaymentWebhook? = incomingPaymentWebhook

    fun outgoingPaymentWebhook(): OutgoingPaymentWebhook? = outgoingPaymentWebhook

    fun testWebhookRequest(): TestWebhookRequest? = testWebhookRequest

    fun bulkUploadWebhook(): BulkUploadWebhook? = bulkUploadWebhook

    fun invitationClaimedWebhook(): InvitationClaimedWebhook? = invitationClaimedWebhook

    fun customerWebhook(): CustomerWebhook? = customerWebhook

    fun internalAccountStatusWebhook(): InternalAccountStatusWebhook? = internalAccountStatusWebhook

    fun verificationWebhook(): VerificationWebhook? = verificationWebhook

    fun cardStateChangeWebhook(): CardStateChangeWebhook? = cardStateChangeWebhook

    fun cardFundingSourceChangeWebhook(): CardFundingSourceChangeWebhook? =
        cardFundingSourceChangeWebhook

    fun isAgentActionWebhook(): Boolean = agentActionWebhook != null

    fun isIncomingPaymentWebhook(): Boolean = incomingPaymentWebhook != null

    fun isOutgoingPaymentWebhook(): Boolean = outgoingPaymentWebhook != null

    fun isTestWebhookRequest(): Boolean = testWebhookRequest != null

    fun isBulkUploadWebhook(): Boolean = bulkUploadWebhook != null

    fun isInvitationClaimedWebhook(): Boolean = invitationClaimedWebhook != null

    fun isCustomerWebhook(): Boolean = customerWebhook != null

    fun isInternalAccountStatusWebhook(): Boolean = internalAccountStatusWebhook != null

    fun isVerificationWebhook(): Boolean = verificationWebhook != null

    fun isCardStateChangeWebhook(): Boolean = cardStateChangeWebhook != null

    fun isCardFundingSourceChangeWebhook(): Boolean = cardFundingSourceChangeWebhook != null

    fun asAgentActionWebhook(): AgentActionWebhook =
        agentActionWebhook.getOrThrow("agentActionWebhook")

    fun asIncomingPaymentWebhook(): IncomingPaymentWebhook =
        incomingPaymentWebhook.getOrThrow("incomingPaymentWebhook")

    fun asOutgoingPaymentWebhook(): OutgoingPaymentWebhook =
        outgoingPaymentWebhook.getOrThrow("outgoingPaymentWebhook")

    fun asTestWebhookRequest(): TestWebhookRequest =
        testWebhookRequest.getOrThrow("testWebhookRequest")

    fun asBulkUploadWebhook(): BulkUploadWebhook = bulkUploadWebhook.getOrThrow("bulkUploadWebhook")

    fun asInvitationClaimedWebhook(): InvitationClaimedWebhook =
        invitationClaimedWebhook.getOrThrow("invitationClaimedWebhook")

    fun asCustomerWebhook(): CustomerWebhook = customerWebhook.getOrThrow("customerWebhook")

    fun asInternalAccountStatusWebhook(): InternalAccountStatusWebhook =
        internalAccountStatusWebhook.getOrThrow("internalAccountStatusWebhook")

    fun asVerificationWebhook(): VerificationWebhook =
        verificationWebhook.getOrThrow("verificationWebhook")

    fun asCardStateChangeWebhook(): CardStateChangeWebhook =
        cardStateChangeWebhook.getOrThrow("cardStateChangeWebhook")

    fun asCardFundingSourceChangeWebhook(): CardFundingSourceChangeWebhook =
        cardFundingSourceChangeWebhook.getOrThrow("cardFundingSourceChangeWebhook")

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
     * val result: String? = unwrapWebhookEvent.accept(object : UnwrapWebhookEvent.Visitor<String?> {
     *     override fun visitAgentActionWebhook(agentActionWebhook: AgentActionWebhook): String? = agentActionWebhook.toString()
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
            agentActionWebhook != null -> visitor.visitAgentActionWebhook(agentActionWebhook)
            incomingPaymentWebhook != null ->
                visitor.visitIncomingPaymentWebhook(incomingPaymentWebhook)
            outgoingPaymentWebhook != null ->
                visitor.visitOutgoingPaymentWebhook(outgoingPaymentWebhook)
            testWebhookRequest != null -> visitor.visitTestWebhookRequest(testWebhookRequest)
            bulkUploadWebhook != null -> visitor.visitBulkUploadWebhook(bulkUploadWebhook)
            invitationClaimedWebhook != null ->
                visitor.visitInvitationClaimedWebhook(invitationClaimedWebhook)
            customerWebhook != null -> visitor.visitCustomerWebhook(customerWebhook)
            internalAccountStatusWebhook != null ->
                visitor.visitInternalAccountStatusWebhook(internalAccountStatusWebhook)
            verificationWebhook != null -> visitor.visitVerificationWebhook(verificationWebhook)
            cardStateChangeWebhook != null ->
                visitor.visitCardStateChangeWebhook(cardStateChangeWebhook)
            cardFundingSourceChangeWebhook != null ->
                visitor.visitCardFundingSourceChangeWebhook(cardFundingSourceChangeWebhook)
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
    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAgentActionWebhook(agentActionWebhook: AgentActionWebhook) {
                    agentActionWebhook.validate()
                }

                override fun visitIncomingPaymentWebhook(
                    incomingPaymentWebhook: IncomingPaymentWebhook
                ) {
                    incomingPaymentWebhook.validate()
                }

                override fun visitOutgoingPaymentWebhook(
                    outgoingPaymentWebhook: OutgoingPaymentWebhook
                ) {
                    outgoingPaymentWebhook.validate()
                }

                override fun visitTestWebhookRequest(testWebhookRequest: TestWebhookRequest) {
                    testWebhookRequest.validate()
                }

                override fun visitBulkUploadWebhook(bulkUploadWebhook: BulkUploadWebhook) {
                    bulkUploadWebhook.validate()
                }

                override fun visitInvitationClaimedWebhook(
                    invitationClaimedWebhook: InvitationClaimedWebhook
                ) {
                    invitationClaimedWebhook.validate()
                }

                override fun visitCustomerWebhook(customerWebhook: CustomerWebhook) {
                    customerWebhook.validate()
                }

                override fun visitInternalAccountStatusWebhook(
                    internalAccountStatusWebhook: InternalAccountStatusWebhook
                ) {
                    internalAccountStatusWebhook.validate()
                }

                override fun visitVerificationWebhook(verificationWebhook: VerificationWebhook) {
                    verificationWebhook.validate()
                }

                override fun visitCardStateChangeWebhook(
                    cardStateChangeWebhook: CardStateChangeWebhook
                ) {
                    cardStateChangeWebhook.validate()
                }

                override fun visitCardFundingSourceChangeWebhook(
                    cardFundingSourceChangeWebhook: CardFundingSourceChangeWebhook
                ) {
                    cardFundingSourceChangeWebhook.validate()
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
                override fun visitAgentActionWebhook(agentActionWebhook: AgentActionWebhook) =
                    agentActionWebhook.validity()

                override fun visitIncomingPaymentWebhook(
                    incomingPaymentWebhook: IncomingPaymentWebhook
                ) = incomingPaymentWebhook.validity()

                override fun visitOutgoingPaymentWebhook(
                    outgoingPaymentWebhook: OutgoingPaymentWebhook
                ) = outgoingPaymentWebhook.validity()

                override fun visitTestWebhookRequest(testWebhookRequest: TestWebhookRequest) =
                    testWebhookRequest.validity()

                override fun visitBulkUploadWebhook(bulkUploadWebhook: BulkUploadWebhook) =
                    bulkUploadWebhook.validity()

                override fun visitInvitationClaimedWebhook(
                    invitationClaimedWebhook: InvitationClaimedWebhook
                ) = invitationClaimedWebhook.validity()

                override fun visitCustomerWebhook(customerWebhook: CustomerWebhook) =
                    customerWebhook.validity()

                override fun visitInternalAccountStatusWebhook(
                    internalAccountStatusWebhook: InternalAccountStatusWebhook
                ) = internalAccountStatusWebhook.validity()

                override fun visitVerificationWebhook(verificationWebhook: VerificationWebhook) =
                    verificationWebhook.validity()

                override fun visitCardStateChangeWebhook(
                    cardStateChangeWebhook: CardStateChangeWebhook
                ) = cardStateChangeWebhook.validity()

                override fun visitCardFundingSourceChangeWebhook(
                    cardFundingSourceChangeWebhook: CardFundingSourceChangeWebhook
                ) = cardFundingSourceChangeWebhook.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            agentActionWebhook == other.agentActionWebhook &&
            incomingPaymentWebhook == other.incomingPaymentWebhook &&
            outgoingPaymentWebhook == other.outgoingPaymentWebhook &&
            testWebhookRequest == other.testWebhookRequest &&
            bulkUploadWebhook == other.bulkUploadWebhook &&
            invitationClaimedWebhook == other.invitationClaimedWebhook &&
            customerWebhook == other.customerWebhook &&
            internalAccountStatusWebhook == other.internalAccountStatusWebhook &&
            verificationWebhook == other.verificationWebhook &&
            cardStateChangeWebhook == other.cardStateChangeWebhook &&
            cardFundingSourceChangeWebhook == other.cardFundingSourceChangeWebhook
    }

    override fun hashCode(): Int =
        Objects.hash(
            agentActionWebhook,
            incomingPaymentWebhook,
            outgoingPaymentWebhook,
            testWebhookRequest,
            bulkUploadWebhook,
            invitationClaimedWebhook,
            customerWebhook,
            internalAccountStatusWebhook,
            verificationWebhook,
            cardStateChangeWebhook,
            cardFundingSourceChangeWebhook,
        )

    override fun toString(): String =
        when {
            agentActionWebhook != null ->
                "UnwrapWebhookEvent{agentActionWebhook=$agentActionWebhook}"
            incomingPaymentWebhook != null ->
                "UnwrapWebhookEvent{incomingPaymentWebhook=$incomingPaymentWebhook}"
            outgoingPaymentWebhook != null ->
                "UnwrapWebhookEvent{outgoingPaymentWebhook=$outgoingPaymentWebhook}"
            testWebhookRequest != null ->
                "UnwrapWebhookEvent{testWebhookRequest=$testWebhookRequest}"
            bulkUploadWebhook != null -> "UnwrapWebhookEvent{bulkUploadWebhook=$bulkUploadWebhook}"
            invitationClaimedWebhook != null ->
                "UnwrapWebhookEvent{invitationClaimedWebhook=$invitationClaimedWebhook}"
            customerWebhook != null -> "UnwrapWebhookEvent{customerWebhook=$customerWebhook}"
            internalAccountStatusWebhook != null ->
                "UnwrapWebhookEvent{internalAccountStatusWebhook=$internalAccountStatusWebhook}"
            verificationWebhook != null ->
                "UnwrapWebhookEvent{verificationWebhook=$verificationWebhook}"
            cardStateChangeWebhook != null ->
                "UnwrapWebhookEvent{cardStateChangeWebhook=$cardStateChangeWebhook}"
            cardFundingSourceChangeWebhook != null ->
                "UnwrapWebhookEvent{cardFundingSourceChangeWebhook=$cardFundingSourceChangeWebhook}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        fun ofAgentActionWebhook(agentActionWebhook: AgentActionWebhook) =
            UnwrapWebhookEvent(agentActionWebhook = agentActionWebhook)

        fun ofIncomingPaymentWebhook(incomingPaymentWebhook: IncomingPaymentWebhook) =
            UnwrapWebhookEvent(incomingPaymentWebhook = incomingPaymentWebhook)

        fun ofOutgoingPaymentWebhook(outgoingPaymentWebhook: OutgoingPaymentWebhook) =
            UnwrapWebhookEvent(outgoingPaymentWebhook = outgoingPaymentWebhook)

        fun ofTestWebhookRequest(testWebhookRequest: TestWebhookRequest) =
            UnwrapWebhookEvent(testWebhookRequest = testWebhookRequest)

        fun ofBulkUploadWebhook(bulkUploadWebhook: BulkUploadWebhook) =
            UnwrapWebhookEvent(bulkUploadWebhook = bulkUploadWebhook)

        fun ofInvitationClaimedWebhook(invitationClaimedWebhook: InvitationClaimedWebhook) =
            UnwrapWebhookEvent(invitationClaimedWebhook = invitationClaimedWebhook)

        fun ofCustomerWebhook(customerWebhook: CustomerWebhook) =
            UnwrapWebhookEvent(customerWebhook = customerWebhook)

        fun ofInternalAccountStatusWebhook(
            internalAccountStatusWebhook: InternalAccountStatusWebhook
        ) = UnwrapWebhookEvent(internalAccountStatusWebhook = internalAccountStatusWebhook)

        fun ofVerificationWebhook(verificationWebhook: VerificationWebhook) =
            UnwrapWebhookEvent(verificationWebhook = verificationWebhook)

        fun ofCardStateChangeWebhook(cardStateChangeWebhook: CardStateChangeWebhook) =
            UnwrapWebhookEvent(cardStateChangeWebhook = cardStateChangeWebhook)

        fun ofCardFundingSourceChangeWebhook(
            cardFundingSourceChangeWebhook: CardFundingSourceChangeWebhook
        ) = UnwrapWebhookEvent(cardFundingSourceChangeWebhook = cardFundingSourceChangeWebhook)
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitAgentActionWebhook(agentActionWebhook: AgentActionWebhook): T

        fun visitIncomingPaymentWebhook(incomingPaymentWebhook: IncomingPaymentWebhook): T

        fun visitOutgoingPaymentWebhook(outgoingPaymentWebhook: OutgoingPaymentWebhook): T

        fun visitTestWebhookRequest(testWebhookRequest: TestWebhookRequest): T

        fun visitBulkUploadWebhook(bulkUploadWebhook: BulkUploadWebhook): T

        fun visitInvitationClaimedWebhook(invitationClaimedWebhook: InvitationClaimedWebhook): T

        fun visitCustomerWebhook(customerWebhook: CustomerWebhook): T

        fun visitInternalAccountStatusWebhook(
            internalAccountStatusWebhook: InternalAccountStatusWebhook
        ): T

        fun visitVerificationWebhook(verificationWebhook: VerificationWebhook): T

        fun visitCardStateChangeWebhook(cardStateChangeWebhook: CardStateChangeWebhook): T

        fun visitCardFundingSourceChangeWebhook(
            cardFundingSourceChangeWebhook: CardFundingSourceChangeWebhook
        ): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AgentActionWebhook>())?.let {
                            UnwrapWebhookEvent(agentActionWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IncomingPaymentWebhook>())?.let {
                            UnwrapWebhookEvent(incomingPaymentWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OutgoingPaymentWebhook>())?.let {
                            UnwrapWebhookEvent(outgoingPaymentWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TestWebhookRequest>())?.let {
                            UnwrapWebhookEvent(testWebhookRequest = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BulkUploadWebhook>())?.let {
                            UnwrapWebhookEvent(bulkUploadWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InvitationClaimedWebhook>())?.let {
                            UnwrapWebhookEvent(invitationClaimedWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CustomerWebhook>())?.let {
                            UnwrapWebhookEvent(customerWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InternalAccountStatusWebhook>())?.let {
                            UnwrapWebhookEvent(internalAccountStatusWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<VerificationWebhook>())?.let {
                            UnwrapWebhookEvent(verificationWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardStateChangeWebhook>())?.let {
                            UnwrapWebhookEvent(cardStateChangeWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardFundingSourceChangeWebhook>())
                            ?.let {
                                UnwrapWebhookEvent(
                                    cardFundingSourceChangeWebhook = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnwrapWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.agentActionWebhook != null -> generator.writeObject(value.agentActionWebhook)
                value.incomingPaymentWebhook != null ->
                    generator.writeObject(value.incomingPaymentWebhook)
                value.outgoingPaymentWebhook != null ->
                    generator.writeObject(value.outgoingPaymentWebhook)
                value.testWebhookRequest != null -> generator.writeObject(value.testWebhookRequest)
                value.bulkUploadWebhook != null -> generator.writeObject(value.bulkUploadWebhook)
                value.invitationClaimedWebhook != null ->
                    generator.writeObject(value.invitationClaimedWebhook)
                value.customerWebhook != null -> generator.writeObject(value.customerWebhook)
                value.internalAccountStatusWebhook != null ->
                    generator.writeObject(value.internalAccountStatusWebhook)
                value.verificationWebhook != null ->
                    generator.writeObject(value.verificationWebhook)
                value.cardStateChangeWebhook != null ->
                    generator.writeObject(value.cardStateChangeWebhook)
                value.cardFundingSourceChangeWebhook != null ->
                    generator.writeObject(value.cardFundingSourceChangeWebhook)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
