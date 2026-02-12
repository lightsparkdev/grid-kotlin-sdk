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
import java.util.Objects

@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val incomingPayment: IncomingPaymentWebhookEvent? = null,
    private val outgoingPayment: OutgoingPaymentWebhookEvent? = null,
    private val testWebhook: TestWebhookWebhookEvent? = null,
    private val bulkUpload: BulkUploadWebhookEvent? = null,
    private val invitationClaimed: InvitationClaimedWebhookEvent? = null,
    private val kycStatus: KycStatusWebhookEvent? = null,
    private val accountStatus: AccountStatusWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun incomingPayment(): IncomingPaymentWebhookEvent? = incomingPayment

    fun outgoingPayment(): OutgoingPaymentWebhookEvent? = outgoingPayment

    fun testWebhook(): TestWebhookWebhookEvent? = testWebhook

    fun bulkUpload(): BulkUploadWebhookEvent? = bulkUpload

    fun invitationClaimed(): InvitationClaimedWebhookEvent? = invitationClaimed

    fun kycStatus(): KycStatusWebhookEvent? = kycStatus

    fun accountStatus(): AccountStatusWebhookEvent? = accountStatus

    fun isIncomingPayment(): Boolean = incomingPayment != null

    fun isOutgoingPayment(): Boolean = outgoingPayment != null

    fun isTestWebhook(): Boolean = testWebhook != null

    fun isBulkUpload(): Boolean = bulkUpload != null

    fun isInvitationClaimed(): Boolean = invitationClaimed != null

    fun isKycStatus(): Boolean = kycStatus != null

    fun isAccountStatus(): Boolean = accountStatus != null

    fun asIncomingPayment(): IncomingPaymentWebhookEvent =
        incomingPayment.getOrThrow("incomingPayment")

    fun asOutgoingPayment(): OutgoingPaymentWebhookEvent =
        outgoingPayment.getOrThrow("outgoingPayment")

    fun asTestWebhook(): TestWebhookWebhookEvent = testWebhook.getOrThrow("testWebhook")

    fun asBulkUpload(): BulkUploadWebhookEvent = bulkUpload.getOrThrow("bulkUpload")

    fun asInvitationClaimed(): InvitationClaimedWebhookEvent =
        invitationClaimed.getOrThrow("invitationClaimed")

    fun asKycStatus(): KycStatusWebhookEvent = kycStatus.getOrThrow("kycStatus")

    fun asAccountStatus(): AccountStatusWebhookEvent = accountStatus.getOrThrow("accountStatus")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            incomingPayment != null -> visitor.visitIncomingPayment(incomingPayment)
            outgoingPayment != null -> visitor.visitOutgoingPayment(outgoingPayment)
            testWebhook != null -> visitor.visitTestWebhook(testWebhook)
            bulkUpload != null -> visitor.visitBulkUpload(bulkUpload)
            invitationClaimed != null -> visitor.visitInvitationClaimed(invitationClaimed)
            kycStatus != null -> visitor.visitKycStatus(kycStatus)
            accountStatus != null -> visitor.visitAccountStatus(accountStatus)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncomingPayment(incomingPayment: IncomingPaymentWebhookEvent) {
                    incomingPayment.validate()
                }

                override fun visitOutgoingPayment(outgoingPayment: OutgoingPaymentWebhookEvent) {
                    outgoingPayment.validate()
                }

                override fun visitTestWebhook(testWebhook: TestWebhookWebhookEvent) {
                    testWebhook.validate()
                }

                override fun visitBulkUpload(bulkUpload: BulkUploadWebhookEvent) {
                    bulkUpload.validate()
                }

                override fun visitInvitationClaimed(
                    invitationClaimed: InvitationClaimedWebhookEvent
                ) {
                    invitationClaimed.validate()
                }

                override fun visitKycStatus(kycStatus: KycStatusWebhookEvent) {
                    kycStatus.validate()
                }

                override fun visitAccountStatus(accountStatus: AccountStatusWebhookEvent) {
                    accountStatus.validate()
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
                override fun visitIncomingPayment(incomingPayment: IncomingPaymentWebhookEvent) =
                    incomingPayment.validity()

                override fun visitOutgoingPayment(outgoingPayment: OutgoingPaymentWebhookEvent) =
                    outgoingPayment.validity()

                override fun visitTestWebhook(testWebhook: TestWebhookWebhookEvent) =
                    testWebhook.validity()

                override fun visitBulkUpload(bulkUpload: BulkUploadWebhookEvent) =
                    bulkUpload.validity()

                override fun visitInvitationClaimed(
                    invitationClaimed: InvitationClaimedWebhookEvent
                ) = invitationClaimed.validity()

                override fun visitKycStatus(kycStatus: KycStatusWebhookEvent) = kycStatus.validity()

                override fun visitAccountStatus(accountStatus: AccountStatusWebhookEvent) =
                    accountStatus.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            incomingPayment == other.incomingPayment &&
            outgoingPayment == other.outgoingPayment &&
            testWebhook == other.testWebhook &&
            bulkUpload == other.bulkUpload &&
            invitationClaimed == other.invitationClaimed &&
            kycStatus == other.kycStatus &&
            accountStatus == other.accountStatus
    }

    override fun hashCode(): Int =
        Objects.hash(
            incomingPayment,
            outgoingPayment,
            testWebhook,
            bulkUpload,
            invitationClaimed,
            kycStatus,
            accountStatus,
        )

    override fun toString(): String =
        when {
            incomingPayment != null -> "UnwrapWebhookEvent{incomingPayment=$incomingPayment}"
            outgoingPayment != null -> "UnwrapWebhookEvent{outgoingPayment=$outgoingPayment}"
            testWebhook != null -> "UnwrapWebhookEvent{testWebhook=$testWebhook}"
            bulkUpload != null -> "UnwrapWebhookEvent{bulkUpload=$bulkUpload}"
            invitationClaimed != null -> "UnwrapWebhookEvent{invitationClaimed=$invitationClaimed}"
            kycStatus != null -> "UnwrapWebhookEvent{kycStatus=$kycStatus}"
            accountStatus != null -> "UnwrapWebhookEvent{accountStatus=$accountStatus}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        fun ofIncomingPayment(incomingPayment: IncomingPaymentWebhookEvent) =
            UnwrapWebhookEvent(incomingPayment = incomingPayment)

        fun ofOutgoingPayment(outgoingPayment: OutgoingPaymentWebhookEvent) =
            UnwrapWebhookEvent(outgoingPayment = outgoingPayment)

        fun ofTestWebhook(testWebhook: TestWebhookWebhookEvent) =
            UnwrapWebhookEvent(testWebhook = testWebhook)

        fun ofBulkUpload(bulkUpload: BulkUploadWebhookEvent) =
            UnwrapWebhookEvent(bulkUpload = bulkUpload)

        fun ofInvitationClaimed(invitationClaimed: InvitationClaimedWebhookEvent) =
            UnwrapWebhookEvent(invitationClaimed = invitationClaimed)

        fun ofKycStatus(kycStatus: KycStatusWebhookEvent) =
            UnwrapWebhookEvent(kycStatus = kycStatus)

        fun ofAccountStatus(accountStatus: AccountStatusWebhookEvent) =
            UnwrapWebhookEvent(accountStatus = accountStatus)
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitIncomingPayment(incomingPayment: IncomingPaymentWebhookEvent): T

        fun visitOutgoingPayment(outgoingPayment: OutgoingPaymentWebhookEvent): T

        fun visitTestWebhook(testWebhook: TestWebhookWebhookEvent): T

        fun visitBulkUpload(bulkUpload: BulkUploadWebhookEvent): T

        fun visitInvitationClaimed(invitationClaimed: InvitationClaimedWebhookEvent): T

        fun visitKycStatus(kycStatus: KycStatusWebhookEvent): T

        fun visitAccountStatus(accountStatus: AccountStatusWebhookEvent): T

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
                        tryDeserialize(node, jacksonTypeRef<IncomingPaymentWebhookEvent>())?.let {
                            UnwrapWebhookEvent(incomingPayment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OutgoingPaymentWebhookEvent>())?.let {
                            UnwrapWebhookEvent(outgoingPayment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TestWebhookWebhookEvent>())?.let {
                            UnwrapWebhookEvent(testWebhook = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BulkUploadWebhookEvent>())?.let {
                            UnwrapWebhookEvent(bulkUpload = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InvitationClaimedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(invitationClaimed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<KycStatusWebhookEvent>())?.let {
                            UnwrapWebhookEvent(kycStatus = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AccountStatusWebhookEvent>())?.let {
                            UnwrapWebhookEvent(accountStatus = it, _json = json)
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
                value.incomingPayment != null -> generator.writeObject(value.incomingPayment)
                value.outgoingPayment != null -> generator.writeObject(value.outgoingPayment)
                value.testWebhook != null -> generator.writeObject(value.testWebhook)
                value.bulkUpload != null -> generator.writeObject(value.bulkUpload)
                value.invitationClaimed != null -> generator.writeObject(value.invitationClaimed)
                value.kycStatus != null -> generator.writeObject(value.kycStatus)
                value.accountStatus != null -> generator.writeObject(value.accountStatus)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
