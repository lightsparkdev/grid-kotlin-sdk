package com.lightspark.grid.utils

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.lightspark.grid.core.ExcludeMissing
import java.security.KeyFactory
import java.security.PublicKey
import java.security.Signature
import java.security.spec.X509EncodedKeySpec
import java.util.*

data class SignatureHeader(
    @JsonProperty("v") @ExcludeMissing val v: Int,
    @JsonProperty("s") @ExcludeMissing val s: String,
)

object WebhookUtils {
    private const val VERSION = 1
    private val objectMapper = jacksonObjectMapper()
    private var publicKey: PublicKey? = null

    /** Sets the public key for webhook signature verification */
    fun setPublicKey(publicKeyString: String) {
        publicKey = createPublicKey(publicKeyString)
    }

    /** Verifies the webhook signature using the previously set public key */
    fun verifyWebhookSignature(body: String, signatureHeaderValue: String): Boolean {
        return try {
            val sigHeader =
                objectMapper.readValue(signatureHeaderValue, SignatureHeader::class.java)
            if (sigHeader.v != VERSION) {
                println("Invalid signature version: ${sigHeader.v}, expected: $VERSION")
                return false
            }
            val pubKeyObj =
                publicKey
                    ?: throw IllegalStateException("Public key not set. Call setPublicKey() first.")
            val signature = Base64.getDecoder().decode(sigHeader.s)
            val verifier = Signature.getInstance("SHA256withECDSA")
            verifier.initVerify(pubKeyObj)
            verifier.update(body.toByteArray())
            verifier.verify(signature)
        } catch (e: Exception) {
            println("Error verifying webhook signature: ${e.message}")
            false
        }
    }

    /** Creates a PublicKey object from either PEM or DER format */
    private fun createPublicKey(publicKey: String): PublicKey {
        val keyBytes =
            if (publicKey.contains("-----BEGIN") && publicKey.contains("-----END")) {
                // PEM format - remove headers and decode
                val keyData =
                    publicKey
                        .replace("-----BEGIN PUBLIC KEY-----", "")
                        .replace("-----END PUBLIC KEY-----", "")
                        .replace("\\s".toRegex(), "")
                        .trim()
                Base64.getDecoder().decode(keyData)
            } else {
                // DER format - assume hex-encoded binary data
                hexStringToByteArray(publicKey)
            }
        val keySpec = X509EncodedKeySpec(keyBytes)
        return try {
            KeyFactory.getInstance("EC").generatePublic(keySpec)
        } catch (e: Exception) {
            throw IllegalArgumentException("Unable to parse public key ", e)
        }
    }

    /** Converts hex string to byte array */
    private fun hexStringToByteArray(hex: String): ByteArray {
        val cleanHex = hex.replace("\\s+".toRegex(), "")
        return cleanHex.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
    }
}
