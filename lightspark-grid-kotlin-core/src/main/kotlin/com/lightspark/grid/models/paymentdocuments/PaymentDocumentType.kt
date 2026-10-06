// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * What a supporting document is. These are kinds of evidence, not file formats: `INVOICE` means the
 * file is an invoice.
 *
 * [Supporting
 * Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
 * lists the types each requirement accepts. When you upload a file with `POST /payment-documents`,
 * `documentType` declares which type the file is.
 */
class PaymentDocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PURCHASE_ORDER = of("PURCHASE_ORDER")

        val LOGISTICS_BILL = of("LOGISTICS_BILL")

        val CUSTOMS_DECLARATION = of("CUSTOMS_DECLARATION")

        val INVOICE = of("INVOICE")

        val CONTRACT = of("CONTRACT")

        val DELIVERY_SLIP = of("DELIVERY_SLIP")

        val BILL_OF_LADING = of("BILL_OF_LADING")

        val FLIGHT_TICKET = of("FLIGHT_TICKET")

        val TRAVEL_DOCUMENT = of("TRAVEL_DOCUMENT")

        val HOTEL_BOOKING_CONFIRMATION = of("HOTEL_BOOKING_CONFIRMATION")

        fun of(value: String) = PaymentDocumentType(JsonField.of(value))
    }

    /** An enum containing [PaymentDocumentType]'s known values. */
    enum class Known {
        PURCHASE_ORDER,
        LOGISTICS_BILL,
        CUSTOMS_DECLARATION,
        INVOICE,
        CONTRACT,
        DELIVERY_SLIP,
        BILL_OF_LADING,
        FLIGHT_TICKET,
        TRAVEL_DOCUMENT,
        HOTEL_BOOKING_CONFIRMATION,
    }

    /**
     * An enum containing [PaymentDocumentType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentDocumentType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PURCHASE_ORDER,
        LOGISTICS_BILL,
        CUSTOMS_DECLARATION,
        INVOICE,
        CONTRACT,
        DELIVERY_SLIP,
        BILL_OF_LADING,
        FLIGHT_TICKET,
        TRAVEL_DOCUMENT,
        HOTEL_BOOKING_CONFIRMATION,
        /**
         * An enum member indicating that [PaymentDocumentType] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            PURCHASE_ORDER -> Value.PURCHASE_ORDER
            LOGISTICS_BILL -> Value.LOGISTICS_BILL
            CUSTOMS_DECLARATION -> Value.CUSTOMS_DECLARATION
            INVOICE -> Value.INVOICE
            CONTRACT -> Value.CONTRACT
            DELIVERY_SLIP -> Value.DELIVERY_SLIP
            BILL_OF_LADING -> Value.BILL_OF_LADING
            FLIGHT_TICKET -> Value.FLIGHT_TICKET
            TRAVEL_DOCUMENT -> Value.TRAVEL_DOCUMENT
            HOTEL_BOOKING_CONFIRMATION -> Value.HOTEL_BOOKING_CONFIRMATION
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            PURCHASE_ORDER -> Known.PURCHASE_ORDER
            LOGISTICS_BILL -> Known.LOGISTICS_BILL
            CUSTOMS_DECLARATION -> Known.CUSTOMS_DECLARATION
            INVOICE -> Known.INVOICE
            CONTRACT -> Known.CONTRACT
            DELIVERY_SLIP -> Known.DELIVERY_SLIP
            BILL_OF_LADING -> Known.BILL_OF_LADING
            FLIGHT_TICKET -> Known.FLIGHT_TICKET
            TRAVEL_DOCUMENT -> Known.TRAVEL_DOCUMENT
            HOTEL_BOOKING_CONFIRMATION -> Known.HOTEL_BOOKING_CONFIRMATION
            else -> throw LightsparkGridInvalidDataException("Unknown PaymentDocumentType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PaymentDocumentType = apply {
        if (validated) {
            return@apply
        }

        known()
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
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentDocumentType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
