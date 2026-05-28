// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.documents

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

/** Replace an existing document. */
@JsonDeserialize(using = DocumentReplaceRequest.Deserializer::class)
@JsonSerialize(using = DocumentReplaceRequest.Serializer::class)
class DocumentReplaceRequest
private constructor(
    private val identity: IdentityDocumentReplaceRequest? = null,
    private val nonIdentity: NonIdentityDocumentReplaceRequest? = null,
    private val _json: JsonValue? = null,
) {

    /** Replace an existing identity document. */
    fun identity(): IdentityDocumentReplaceRequest? = identity

    /** Replace an existing non-identity verification document. */
    fun nonIdentity(): NonIdentityDocumentReplaceRequest? = nonIdentity

    fun isIdentity(): Boolean = identity != null

    fun isNonIdentity(): Boolean = nonIdentity != null

    /** Replace an existing identity document. */
    fun asIdentity(): IdentityDocumentReplaceRequest = identity.getOrThrow("identity")

    /** Replace an existing non-identity verification document. */
    fun asNonIdentity(): NonIdentityDocumentReplaceRequest = nonIdentity.getOrThrow("nonIdentity")

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
     * val result: String? = documentReplaceRequest.accept(object : DocumentReplaceRequest.Visitor<String?> {
     *     override fun visitIdentity(identity: IdentityDocumentReplaceRequest): String? = identity.toString()
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
            identity != null -> visitor.visitIdentity(identity)
            nonIdentity != null -> visitor.visitNonIdentity(nonIdentity)
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
    fun validate(): DocumentReplaceRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIdentity(identity: IdentityDocumentReplaceRequest) {
                    identity.validate()
                }

                override fun visitNonIdentity(nonIdentity: NonIdentityDocumentReplaceRequest) {
                    nonIdentity.validate()
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
                override fun visitIdentity(identity: IdentityDocumentReplaceRequest) =
                    identity.validity()

                override fun visitNonIdentity(nonIdentity: NonIdentityDocumentReplaceRequest) =
                    nonIdentity.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentReplaceRequest &&
            identity == other.identity &&
            nonIdentity == other.nonIdentity
    }

    override fun hashCode(): Int = Objects.hash(identity, nonIdentity)

    override fun toString(): String =
        when {
            identity != null -> "DocumentReplaceRequest{identity=$identity}"
            nonIdentity != null -> "DocumentReplaceRequest{nonIdentity=$nonIdentity}"
            _json != null -> "DocumentReplaceRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DocumentReplaceRequest")
        }

    companion object {

        /** Replace an existing identity document. */
        fun ofIdentity(identity: IdentityDocumentReplaceRequest) =
            DocumentReplaceRequest(identity = identity)

        /** Replace an existing non-identity verification document. */
        fun ofNonIdentity(nonIdentity: NonIdentityDocumentReplaceRequest) =
            DocumentReplaceRequest(nonIdentity = nonIdentity)
    }

    /**
     * An interface that defines how to map each variant of [DocumentReplaceRequest] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Replace an existing identity document. */
        fun visitIdentity(identity: IdentityDocumentReplaceRequest): T

        /** Replace an existing non-identity verification document. */
        fun visitNonIdentity(nonIdentity: NonIdentityDocumentReplaceRequest): T

        /**
         * Maps an unknown variant of [DocumentReplaceRequest] to a value of type [T].
         *
         * An instance of [DocumentReplaceRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown DocumentReplaceRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DocumentReplaceRequest>(DocumentReplaceRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DocumentReplaceRequest {
            val json = JsonValue.fromJsonNode(node)
            val documentType = json.asObject()?.get("documentType")?.asString()

            when (documentType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IdentityDocumentReplaceRequest>())
                            ?.let { DocumentReplaceRequest(identity = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<NonIdentityDocumentReplaceRequest>())
                            ?.let { DocumentReplaceRequest(nonIdentity = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DocumentReplaceRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DocumentReplaceRequest>(DocumentReplaceRequest::class) {

        override fun serialize(
            value: DocumentReplaceRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.identity != null -> generator.writeObject(value.identity)
                value.nonIdentity != null -> generator.writeObject(value.nonIdentity)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DocumentReplaceRequest")
            }
        }
    }
}
