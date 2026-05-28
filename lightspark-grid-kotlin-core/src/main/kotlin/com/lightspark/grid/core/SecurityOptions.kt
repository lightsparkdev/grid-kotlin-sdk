// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.core

import java.util.Objects

/** A class for configuring which security schemes are enabled for a request. */
class SecurityOptions
private constructor(
    /** Whether the BasicAuth security scheme is enabled. */
    val basicAuth: Boolean,
    /** Whether the AgentAuth security scheme is enabled. */
    val agentAuth: Boolean,
    /** Whether the WebhookSignature security scheme is enabled. */
    val webhookSignature: Boolean,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SecurityOptions]. */
        fun builder() = Builder()

        /** Returns a [Security] instance with all security schemes enabled. */
        fun all(): SecurityOptions =
            builder().basicAuth(true).agentAuth(true).webhookSignature(true).build()

        /** Returns a [Security] instance with no security schemes enabled. */
        fun none(): SecurityOptions = builder().build()
    }

    /** A builder for [SecurityOptions]. */
    class Builder internal constructor() {

        private var basicAuth: Boolean = false
        private var agentAuth: Boolean = false
        private var webhookSignature: Boolean = false

        internal fun from(securityOptions: SecurityOptions) = apply {
            basicAuth = securityOptions.basicAuth
            agentAuth = securityOptions.agentAuth
            webhookSignature = securityOptions.webhookSignature
        }

        /** Whether the BasicAuth security scheme is enabled. */
        fun basicAuth(basicAuth: Boolean) = apply { this.basicAuth = basicAuth }

        /** Whether the AgentAuth security scheme is enabled. */
        fun agentAuth(agentAuth: Boolean) = apply { this.agentAuth = agentAuth }

        /** Whether the WebhookSignature security scheme is enabled. */
        fun webhookSignature(webhookSignature: Boolean) = apply {
            this.webhookSignature = webhookSignature
        }

        /**
         * Returns an immutable instance of [SecurityOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecurityOptions = SecurityOptions(basicAuth, agentAuth, webhookSignature)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecurityOptions &&
            basicAuth == other.basicAuth &&
            agentAuth == other.agentAuth &&
            webhookSignature == other.webhookSignature
    }

    override fun hashCode(): Int = Objects.hash(basicAuth, agentAuth, webhookSignature)

    override fun toString() =
        "SecurityOptions{basicAuth=$basicAuth, agentAuth=$agentAuth, webhookSignature=$webhookSignature}"
}
