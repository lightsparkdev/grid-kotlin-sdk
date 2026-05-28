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

/** Upload a verification document. */
@JsonDeserialize(using = DocumentUploadRequest.Deserializer::class)
@JsonSerialize(using = DocumentUploadRequest.Serializer::class)
class DocumentUploadRequest
private constructor(
    private val identity: IdentityDocumentUploadRequest? = null,
    private val nonIdentity: NonIdentityDocumentUploadRequest? = null,
    private val _json: JsonValue? = null,
) {

    /** Upload an identity document (passport, driver's license, or national ID). */
    fun identity(): IdentityDocumentUploadRequest? = identity

    /**
     * Upload a non-identity verification document such as proof of address, business registry
     * documents, or supporting evidence.
     */
    fun nonIdentity(): NonIdentityDocumentUploadRequest? = nonIdentity

    fun isIdentity(): Boolean = identity != null

    fun isNonIdentity(): Boolean = nonIdentity != null

    /** Upload an identity document (passport, driver's license, or national ID). */
    fun asIdentity(): IdentityDocumentUploadRequest = identity.getOrThrow("identity")

    /**
     * Upload a non-identity verification document such as proof of address, business registry
     * documents, or supporting evidence.
     */
    fun asNonIdentity(): NonIdentityDocumentUploadRequest = nonIdentity.getOrThrow("nonIdentity")

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
     * val result: String? = documentUploadRequest.accept(object : DocumentUploadRequest.Visitor<String?> {
     *     override fun visitIdentity(identity: IdentityDocumentUploadRequest): String? = identity.toString()
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
    fun validate(): DocumentUploadRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIdentity(identity: IdentityDocumentUploadRequest) {
                    identity.validate()
                }

                override fun visitNonIdentity(nonIdentity: NonIdentityDocumentUploadRequest) {
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
                override fun visitIdentity(identity: IdentityDocumentUploadRequest) =
                    identity.validity()

                override fun visitNonIdentity(nonIdentity: NonIdentityDocumentUploadRequest) =
                    nonIdentity.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentUploadRequest &&
            identity == other.identity &&
            nonIdentity == other.nonIdentity
    }

    override fun hashCode(): Int = Objects.hash(identity, nonIdentity)

    override fun toString(): String =
        when {
            identity != null -> "DocumentUploadRequest{identity=$identity}"
            nonIdentity != null -> "DocumentUploadRequest{nonIdentity=$nonIdentity}"
            _json != null -> "DocumentUploadRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DocumentUploadRequest")
        }

    companion object {

        /** Upload an identity document (passport, driver's license, or national ID). */
        fun ofIdentity(identity: IdentityDocumentUploadRequest) =
            DocumentUploadRequest(identity = identity)

        /**
         * Upload a non-identity verification document such as proof of address, business registry
         * documents, or supporting evidence.
         */
        fun ofNonIdentity(nonIdentity: NonIdentityDocumentUploadRequest) =
            DocumentUploadRequest(nonIdentity = nonIdentity)
    }

    /**
     * An interface that defines how to map each variant of [DocumentUploadRequest] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Upload an identity document (passport, driver's license, or national ID). */
        fun visitIdentity(identity: IdentityDocumentUploadRequest): T

        /**
         * Upload a non-identity verification document such as proof of address, business registry
         * documents, or supporting evidence.
         */
        fun visitNonIdentity(nonIdentity: NonIdentityDocumentUploadRequest): T

        /**
         * Maps an unknown variant of [DocumentUploadRequest] to a value of type [T].
         *
         * An instance of [DocumentUploadRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown DocumentUploadRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DocumentUploadRequest>(DocumentUploadRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DocumentUploadRequest {
            val json = JsonValue.fromJsonNode(node)
            val documentType = json.asObject()?.get("documentType")?.asString()

            when (documentType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IdentityDocumentUploadRequest>())?.let {
                            DocumentUploadRequest(identity = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NonIdentityDocumentUploadRequest>())
                            ?.let { DocumentUploadRequest(nonIdentity = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DocumentUploadRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DocumentUploadRequest>(DocumentUploadRequest::class) {

        override fun serialize(
            value: DocumentUploadRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.identity != null -> generator.writeObject(value.identity)
                value.nonIdentity != null -> generator.writeObject(value.nonIdentity)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DocumentUploadRequest")
            }
        }
    }
}
