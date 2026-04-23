// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.internalaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class InternalAccountExportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val encryptedWalletCredentials: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("encryptedWalletCredentials")
        @ExcludeMissing
        encryptedWalletCredentials: JsonField<String> = JsonMissing.of(),
    ) : this(id, encryptedWalletCredentials, mutableMapOf())

    /**
     * The id of the internal account that was exported.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Encrypted wallet mnemonic, sealed to the `clientPublicKey` supplied on the verify request.
     * Decrypt with the matching private key, then manage the mnemonic securely — it is the master
     * key of the self-custodial Embedded Wallet. Encoded as base58check (same format as
     * `AuthSession.encryptedSessionSigningKey`).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedWalletCredentials(): String =
        encryptedWalletCredentials.getRequired("encryptedWalletCredentials")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [encryptedWalletCredentials].
     *
     * Unlike [encryptedWalletCredentials], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("encryptedWalletCredentials")
    @ExcludeMissing
    fun _encryptedWalletCredentials(): JsonField<String> = encryptedWalletCredentials

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InternalAccountExportResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .encryptedWalletCredentials()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InternalAccountExportResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var encryptedWalletCredentials: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccountExportResponse: InternalAccountExportResponse) = apply {
            id = internalAccountExportResponse.id
            encryptedWalletCredentials = internalAccountExportResponse.encryptedWalletCredentials
            additionalProperties = internalAccountExportResponse.additionalProperties.toMutableMap()
        }

        /** The id of the internal account that was exported. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Encrypted wallet mnemonic, sealed to the `clientPublicKey` supplied on the verify
         * request. Decrypt with the matching private key, then manage the mnemonic securely — it is
         * the master key of the self-custodial Embedded Wallet. Encoded as base58check (same format
         * as `AuthSession.encryptedSessionSigningKey`).
         */
        fun encryptedWalletCredentials(encryptedWalletCredentials: String) =
            encryptedWalletCredentials(JsonField.of(encryptedWalletCredentials))

        /**
         * Sets [Builder.encryptedWalletCredentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedWalletCredentials] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun encryptedWalletCredentials(encryptedWalletCredentials: JsonField<String>) = apply {
            this.encryptedWalletCredentials = encryptedWalletCredentials
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [InternalAccountExportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .encryptedWalletCredentials()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InternalAccountExportResponse =
            InternalAccountExportResponse(
                checkRequired("id", id),
                checkRequired("encryptedWalletCredentials", encryptedWalletCredentials),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InternalAccountExportResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        encryptedWalletCredentials()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (encryptedWalletCredentials.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InternalAccountExportResponse &&
            id == other.id &&
            encryptedWalletCredentials == other.encryptedWalletCredentials &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, encryptedWalletCredentials, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternalAccountExportResponse{id=$id, encryptedWalletCredentials=$encryptedWalletCredentials, additionalProperties=$additionalProperties}"
}
