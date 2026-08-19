// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.vasps

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

/**
 * A Virtual Asset Service Provider (VASP) — an exchange or other custodial platform — recognized
 * for counterparty declarations.
 */
class Vasp
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val url: JsonField<String>,
    private val vaspName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vaspName") @ExcludeMissing vaspName: JsonField<String> = JsonMissing.of(),
    ) : this(url, vaspName, mutableMapOf())

    /**
     * The VASP's website.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Name of this VASP. Pass this value as `vaspName` when declaring a VASP-hosted counterparty.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaspName(): String = vaspName.getRequired("vaspName")

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [vaspName].
     *
     * Unlike [vaspName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaspName") @ExcludeMissing fun _vaspName(): JsonField<String> = vaspName

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
         * Returns a mutable builder for constructing an instance of [Vasp].
         *
         * The following fields are required:
         * ```kotlin
         * .url()
         * .vaspName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Vasp]. */
    class Builder internal constructor() {

        private var url: JsonField<String>? = null
        private var vaspName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vasp: Vasp) = apply {
            url = vasp.url
            vaspName = vasp.vaspName
            additionalProperties = vasp.additionalProperties.toMutableMap()
        }

        /** The VASP's website. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * Name of this VASP. Pass this value as `vaspName` when declaring a VASP-hosted
         * counterparty.
         */
        fun vaspName(vaspName: String) = vaspName(JsonField.of(vaspName))

        /**
         * Sets [Builder.vaspName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaspName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaspName(vaspName: JsonField<String>) = apply { this.vaspName = vaspName }

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
         * Returns an immutable instance of [Vasp].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .url()
         * .vaspName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Vasp =
            Vasp(
                checkRequired("url", url),
                checkRequired("vaspName", vaspName),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): Vasp = apply {
        if (validated) {
            return@apply
        }

        url()
        vaspName()
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
        (if (url.asKnown() == null) 0 else 1) + (if (vaspName.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Vasp &&
            url == other.url &&
            vaspName == other.vaspName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(url, vaspName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Vasp{url=$url, vaspName=$vaspName, additionalProperties=$additionalProperties}"
}
