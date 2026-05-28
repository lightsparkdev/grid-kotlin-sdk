// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/** Type of external account or wallet */
class ExternalAccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val AED_ACCOUNT = of("AED_ACCOUNT")

        val BDT_ACCOUNT = of("BDT_ACCOUNT")

        val BRL_ACCOUNT = of("BRL_ACCOUNT")

        val BWP_ACCOUNT = of("BWP_ACCOUNT")

        val CAD_ACCOUNT = of("CAD_ACCOUNT")

        val COP_ACCOUNT = of("COP_ACCOUNT")

        val DKK_ACCOUNT = of("DKK_ACCOUNT")

        val EGP_ACCOUNT = of("EGP_ACCOUNT")

        val EUR_ACCOUNT = of("EUR_ACCOUNT")

        val GBP_ACCOUNT = of("GBP_ACCOUNT")

        val GHS_ACCOUNT = of("GHS_ACCOUNT")

        val GTQ_ACCOUNT = of("GTQ_ACCOUNT")

        val HKD_ACCOUNT = of("HKD_ACCOUNT")

        val HTG_ACCOUNT = of("HTG_ACCOUNT")

        val IDR_ACCOUNT = of("IDR_ACCOUNT")

        val INR_ACCOUNT = of("INR_ACCOUNT")

        val JMD_ACCOUNT = of("JMD_ACCOUNT")

        val KES_ACCOUNT = of("KES_ACCOUNT")

        val MWK_ACCOUNT = of("MWK_ACCOUNT")

        val MXN_ACCOUNT = of("MXN_ACCOUNT")

        val MYR_ACCOUNT = of("MYR_ACCOUNT")

        val NGN_ACCOUNT = of("NGN_ACCOUNT")

        val PHP_ACCOUNT = of("PHP_ACCOUNT")

        val PKR_ACCOUNT = of("PKR_ACCOUNT")

        val RWF_ACCOUNT = of("RWF_ACCOUNT")

        val SGD_ACCOUNT = of("SGD_ACCOUNT")

        val SLV_ACCOUNT = of("SLV_ACCOUNT")

        val THB_ACCOUNT = of("THB_ACCOUNT")

        val TZS_ACCOUNT = of("TZS_ACCOUNT")

        val UGX_ACCOUNT = of("UGX_ACCOUNT")

        val USD_ACCOUNT = of("USD_ACCOUNT")

        val VND_ACCOUNT = of("VND_ACCOUNT")

        val XAF_ACCOUNT = of("XAF_ACCOUNT")

        val XOF_ACCOUNT = of("XOF_ACCOUNT")

        val ZAR_ACCOUNT = of("ZAR_ACCOUNT")

        val ZMW_ACCOUNT = of("ZMW_ACCOUNT")

        val SWIFT_ACCOUNT = of("SWIFT_ACCOUNT")

        val BASE_WALLET = of("BASE_WALLET")

        val ETHEREUM_WALLET = of("ETHEREUM_WALLET")

        val LIGHTNING = of("LIGHTNING")

        val POLYGON_WALLET = of("POLYGON_WALLET")

        val SOLANA_WALLET = of("SOLANA_WALLET")

        val SPARK_WALLET = of("SPARK_WALLET")

        val TRON_WALLET = of("TRON_WALLET")

        fun of(value: String) = ExternalAccountType(JsonField.of(value))
    }

    /** An enum containing [ExternalAccountType]'s known values. */
    enum class Known {
        AED_ACCOUNT,
        BDT_ACCOUNT,
        BRL_ACCOUNT,
        BWP_ACCOUNT,
        CAD_ACCOUNT,
        COP_ACCOUNT,
        DKK_ACCOUNT,
        EGP_ACCOUNT,
        EUR_ACCOUNT,
        GBP_ACCOUNT,
        GHS_ACCOUNT,
        GTQ_ACCOUNT,
        HKD_ACCOUNT,
        HTG_ACCOUNT,
        IDR_ACCOUNT,
        INR_ACCOUNT,
        JMD_ACCOUNT,
        KES_ACCOUNT,
        MWK_ACCOUNT,
        MXN_ACCOUNT,
        MYR_ACCOUNT,
        NGN_ACCOUNT,
        PHP_ACCOUNT,
        PKR_ACCOUNT,
        RWF_ACCOUNT,
        SGD_ACCOUNT,
        SLV_ACCOUNT,
        THB_ACCOUNT,
        TZS_ACCOUNT,
        UGX_ACCOUNT,
        USD_ACCOUNT,
        VND_ACCOUNT,
        XAF_ACCOUNT,
        XOF_ACCOUNT,
        ZAR_ACCOUNT,
        ZMW_ACCOUNT,
        SWIFT_ACCOUNT,
        BASE_WALLET,
        ETHEREUM_WALLET,
        LIGHTNING,
        POLYGON_WALLET,
        SOLANA_WALLET,
        SPARK_WALLET,
        TRON_WALLET,
    }

    /**
     * An enum containing [ExternalAccountType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ExternalAccountType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AED_ACCOUNT,
        BDT_ACCOUNT,
        BRL_ACCOUNT,
        BWP_ACCOUNT,
        CAD_ACCOUNT,
        COP_ACCOUNT,
        DKK_ACCOUNT,
        EGP_ACCOUNT,
        EUR_ACCOUNT,
        GBP_ACCOUNT,
        GHS_ACCOUNT,
        GTQ_ACCOUNT,
        HKD_ACCOUNT,
        HTG_ACCOUNT,
        IDR_ACCOUNT,
        INR_ACCOUNT,
        JMD_ACCOUNT,
        KES_ACCOUNT,
        MWK_ACCOUNT,
        MXN_ACCOUNT,
        MYR_ACCOUNT,
        NGN_ACCOUNT,
        PHP_ACCOUNT,
        PKR_ACCOUNT,
        RWF_ACCOUNT,
        SGD_ACCOUNT,
        SLV_ACCOUNT,
        THB_ACCOUNT,
        TZS_ACCOUNT,
        UGX_ACCOUNT,
        USD_ACCOUNT,
        VND_ACCOUNT,
        XAF_ACCOUNT,
        XOF_ACCOUNT,
        ZAR_ACCOUNT,
        ZMW_ACCOUNT,
        SWIFT_ACCOUNT,
        BASE_WALLET,
        ETHEREUM_WALLET,
        LIGHTNING,
        POLYGON_WALLET,
        SOLANA_WALLET,
        SPARK_WALLET,
        TRON_WALLET,
        /**
         * An enum member indicating that [ExternalAccountType] was instantiated with an unknown
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
            AED_ACCOUNT -> Value.AED_ACCOUNT
            BDT_ACCOUNT -> Value.BDT_ACCOUNT
            BRL_ACCOUNT -> Value.BRL_ACCOUNT
            BWP_ACCOUNT -> Value.BWP_ACCOUNT
            CAD_ACCOUNT -> Value.CAD_ACCOUNT
            COP_ACCOUNT -> Value.COP_ACCOUNT
            DKK_ACCOUNT -> Value.DKK_ACCOUNT
            EGP_ACCOUNT -> Value.EGP_ACCOUNT
            EUR_ACCOUNT -> Value.EUR_ACCOUNT
            GBP_ACCOUNT -> Value.GBP_ACCOUNT
            GHS_ACCOUNT -> Value.GHS_ACCOUNT
            GTQ_ACCOUNT -> Value.GTQ_ACCOUNT
            HKD_ACCOUNT -> Value.HKD_ACCOUNT
            HTG_ACCOUNT -> Value.HTG_ACCOUNT
            IDR_ACCOUNT -> Value.IDR_ACCOUNT
            INR_ACCOUNT -> Value.INR_ACCOUNT
            JMD_ACCOUNT -> Value.JMD_ACCOUNT
            KES_ACCOUNT -> Value.KES_ACCOUNT
            MWK_ACCOUNT -> Value.MWK_ACCOUNT
            MXN_ACCOUNT -> Value.MXN_ACCOUNT
            MYR_ACCOUNT -> Value.MYR_ACCOUNT
            NGN_ACCOUNT -> Value.NGN_ACCOUNT
            PHP_ACCOUNT -> Value.PHP_ACCOUNT
            PKR_ACCOUNT -> Value.PKR_ACCOUNT
            RWF_ACCOUNT -> Value.RWF_ACCOUNT
            SGD_ACCOUNT -> Value.SGD_ACCOUNT
            SLV_ACCOUNT -> Value.SLV_ACCOUNT
            THB_ACCOUNT -> Value.THB_ACCOUNT
            TZS_ACCOUNT -> Value.TZS_ACCOUNT
            UGX_ACCOUNT -> Value.UGX_ACCOUNT
            USD_ACCOUNT -> Value.USD_ACCOUNT
            VND_ACCOUNT -> Value.VND_ACCOUNT
            XAF_ACCOUNT -> Value.XAF_ACCOUNT
            XOF_ACCOUNT -> Value.XOF_ACCOUNT
            ZAR_ACCOUNT -> Value.ZAR_ACCOUNT
            ZMW_ACCOUNT -> Value.ZMW_ACCOUNT
            SWIFT_ACCOUNT -> Value.SWIFT_ACCOUNT
            BASE_WALLET -> Value.BASE_WALLET
            ETHEREUM_WALLET -> Value.ETHEREUM_WALLET
            LIGHTNING -> Value.LIGHTNING
            POLYGON_WALLET -> Value.POLYGON_WALLET
            SOLANA_WALLET -> Value.SOLANA_WALLET
            SPARK_WALLET -> Value.SPARK_WALLET
            TRON_WALLET -> Value.TRON_WALLET
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
            AED_ACCOUNT -> Known.AED_ACCOUNT
            BDT_ACCOUNT -> Known.BDT_ACCOUNT
            BRL_ACCOUNT -> Known.BRL_ACCOUNT
            BWP_ACCOUNT -> Known.BWP_ACCOUNT
            CAD_ACCOUNT -> Known.CAD_ACCOUNT
            COP_ACCOUNT -> Known.COP_ACCOUNT
            DKK_ACCOUNT -> Known.DKK_ACCOUNT
            EGP_ACCOUNT -> Known.EGP_ACCOUNT
            EUR_ACCOUNT -> Known.EUR_ACCOUNT
            GBP_ACCOUNT -> Known.GBP_ACCOUNT
            GHS_ACCOUNT -> Known.GHS_ACCOUNT
            GTQ_ACCOUNT -> Known.GTQ_ACCOUNT
            HKD_ACCOUNT -> Known.HKD_ACCOUNT
            HTG_ACCOUNT -> Known.HTG_ACCOUNT
            IDR_ACCOUNT -> Known.IDR_ACCOUNT
            INR_ACCOUNT -> Known.INR_ACCOUNT
            JMD_ACCOUNT -> Known.JMD_ACCOUNT
            KES_ACCOUNT -> Known.KES_ACCOUNT
            MWK_ACCOUNT -> Known.MWK_ACCOUNT
            MXN_ACCOUNT -> Known.MXN_ACCOUNT
            MYR_ACCOUNT -> Known.MYR_ACCOUNT
            NGN_ACCOUNT -> Known.NGN_ACCOUNT
            PHP_ACCOUNT -> Known.PHP_ACCOUNT
            PKR_ACCOUNT -> Known.PKR_ACCOUNT
            RWF_ACCOUNT -> Known.RWF_ACCOUNT
            SGD_ACCOUNT -> Known.SGD_ACCOUNT
            SLV_ACCOUNT -> Known.SLV_ACCOUNT
            THB_ACCOUNT -> Known.THB_ACCOUNT
            TZS_ACCOUNT -> Known.TZS_ACCOUNT
            UGX_ACCOUNT -> Known.UGX_ACCOUNT
            USD_ACCOUNT -> Known.USD_ACCOUNT
            VND_ACCOUNT -> Known.VND_ACCOUNT
            XAF_ACCOUNT -> Known.XAF_ACCOUNT
            XOF_ACCOUNT -> Known.XOF_ACCOUNT
            ZAR_ACCOUNT -> Known.ZAR_ACCOUNT
            ZMW_ACCOUNT -> Known.ZMW_ACCOUNT
            SWIFT_ACCOUNT -> Known.SWIFT_ACCOUNT
            BASE_WALLET -> Known.BASE_WALLET
            ETHEREUM_WALLET -> Known.ETHEREUM_WALLET
            LIGHTNING -> Known.LIGHTNING
            POLYGON_WALLET -> Known.POLYGON_WALLET
            SOLANA_WALLET -> Known.SOLANA_WALLET
            SPARK_WALLET -> Known.SPARK_WALLET
            TRON_WALLET -> Known.TRON_WALLET
            else -> throw LightsparkGridInvalidDataException("Unknown ExternalAccountType: $value")
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
    fun validate(): ExternalAccountType = apply {
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

        return other is ExternalAccountType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
