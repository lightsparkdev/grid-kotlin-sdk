// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Re-issue the challenge for an existing authentication credential.
 *
 * For `EMAIL_OTP` credentials, this triggers a new one-time password email to the address on file.
 * The response is a plain `AuthMethod`; there is no challenge body to surface because the OTP is
 * delivered out-of-band via email. After the user receives the new OTP, call `POST
 * /auth/credentials/{id}/verify` to complete verification and issue a session.
 *
 * For `PASSKEY` credentials, this issues a fresh Grid-generated WebAuthn challenge for
 * reauthentication. The request body must carry the client's ephemeral `clientPublicKey` so Grid
 * can bake it into the Turnkey session-creation payload the returned challenge is computed from —
 * this seals the resulting session signing key to the client. The response is a
 * `PasskeyAuthChallenge` — the base `AuthMethod` fields plus the new `challenge`, `requestId`, and
 * `expiresAt`. The client passes the `challenge` into `navigator.credentials.get()` and submits the
 * resulting assertion to `POST /auth/credentials/{id}/verify` with `Request-Id: <requestId>` to
 * receive a session.
 */
class CredentialResendChallengeParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
     * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y coordinates;
     * 130 hex characters total). The matching private key must remain on the client. Grid bakes
     * this key into the Turnkey session-creation payload that the returned `challenge` is computed
     * from, so the resulting session signing key is sealed to the client. Ignored for `EMAIL_OTP`
     * and `OAUTH` credentials.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientPublicKey(): String? = body.clientPublicKey()

    /**
     * Returns the raw JSON value of [clientPublicKey].
     *
     * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientPublicKey(): JsonField<String> = body._clientPublicKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CredentialResendChallengeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CredentialResendChallengeParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialResendChallengeParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialResendChallengeParams: CredentialResendChallengeParams) =
            apply {
                id = credentialResendChallengeParams.id
                body = credentialResendChallengeParams.body.toBuilder()
                additionalHeaders = credentialResendChallengeParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    credentialResendChallengeParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [clientPublicKey]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
         * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y
         * coordinates; 130 hex characters total). The matching private key must remain on the
         * client. Grid bakes this key into the Turnkey session-creation payload that the returned
         * `challenge` is computed from, so the resulting session signing key is sealed to the
         * client. Ignored for `EMAIL_OTP` and `OAUTH` credentials.
         */
        fun clientPublicKey(clientPublicKey: String) = apply {
            body.clientPublicKey(clientPublicKey)
        }

        /**
         * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientPublicKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
            body.clientPublicKey(clientPublicKey)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CredentialResendChallengeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CredentialResendChallengeParams =
            CredentialResendChallengeParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for `POST /auth/credentials/{id}/challenge`. Required when re-challenging a
     * `PASSKEY` credential — must carry `clientPublicKey` so Grid can bake it into the Turnkey
     * session-creation payload the returned challenge is computed from. Ignored for `EMAIL_OTP` and
     * `OAUTH`, where the credential type alone is sufficient (the OTP is delivered out-of-band for
     * `EMAIL_OTP`; there is no server-side challenge for `OAUTH`).
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientPublicKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("clientPublicKey")
            @ExcludeMissing
            clientPublicKey: JsonField<String> = JsonMissing.of()
        ) : this(clientPublicKey, mutableMapOf())

        /**
         * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
         * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y
         * coordinates; 130 hex characters total). The matching private key must remain on the
         * client. Grid bakes this key into the Turnkey session-creation payload that the returned
         * `challenge` is computed from, so the resulting session signing key is sealed to the
         * client. Ignored for `EMAIL_OTP` and `OAUTH` credentials.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun clientPublicKey(): String? = clientPublicKey.getNullable("clientPublicKey")

        /**
         * Returns the raw JSON value of [clientPublicKey].
         *
         * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("clientPublicKey")
        @ExcludeMissing
        fun _clientPublicKey(): JsonField<String> = clientPublicKey

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var clientPublicKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                clientPublicKey = body.clientPublicKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
             * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y
             * coordinates; 130 hex characters total). The matching private key must remain on the
             * client. Grid bakes this key into the Turnkey session-creation payload that the
             * returned `challenge` is computed from, so the resulting session signing key is sealed
             * to the client. Ignored for `EMAIL_OTP` and `OAUTH` credentials.
             */
            fun clientPublicKey(clientPublicKey: String) =
                clientPublicKey(JsonField.of(clientPublicKey))

            /**
             * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientPublicKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
                this.clientPublicKey = clientPublicKey
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(clientPublicKey, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientPublicKey()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (if (clientPublicKey.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientPublicKey == other.clientPublicKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(clientPublicKey, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientPublicKey=$clientPublicKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialResendChallengeParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CredentialResendChallengeParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
