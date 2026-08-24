// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.BulkCustomerImportErrorEntry
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.SlvBeneficiary
import com.lightspark.grid.models.VerificationError
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.cards.Card
import com.lightspark.grid.models.cards.CardTransaction
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.customers.Customer
import com.lightspark.grid.models.customers.EndUserTermsConsentRequest
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.BeneficiaryVerifiedData
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.invitations.UmaInvitation
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.sandbox.cards.simulate.CardMerchant
import com.lightspark.grid.models.sandbox.cards.simulate.CardPullSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardRefundSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardSettlementSummary
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.models.sandbox.webhooks.TestWebhookRequest
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.verifications.Verification
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofAgentActionPendingApproval() {
        val agentActionPendingApproval =
            AgentActionWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentAction.Status.PENDING_APPROVAL)
                        .type(AgentAction.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(QuoteDestinationOneOf.builder().build())
                                .exchangeRate(1.0)
                                .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                .feesIncluded(10L)
                                .receivingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .sendingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .source(QuoteSourceOneOf.builder().build())
                                .status(Quote.Status.PENDING)
                                .totalReceivingAmount(1000L)
                                .totalSendingAmount(123010L)
                                .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                                .counterpartyInformation(
                                    Quote.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .MOBILE_MONEY
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("1234567890")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .BankAccountType
                                                        .CHECKING
                                                )
                                                .bankName("Chase Bank")
                                                .phoneNumber("+50312345678")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Include reference UMA-Q12345-REF in memo"
                                        )
                                        .isPlatformAccount(true)
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("0123456789")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .BankAccountType
                                                        .CHECKING
                                                )
                                                .bankName("Banco Cuscatlan")
                                                .phoneNumber("+50312345678")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Please ensure the reference code is included in the payment memo/description field"
                                        )
                                        .isPlatformAccount(true)
                                        .build()
                                )
                                .platformFeesIncluded(5L)
                                .rateDetails(
                                    OutgoingRateDetails.builder()
                                        .counterpartyFixedFee(10L)
                                        .counterpartyMultiplier(1.08)
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
                                        .build()
                                )
                                .scaChallenge(
                                    Quote.ScaChallenge.builder()
                                        .id("ScaChallenge:019542f5-b3e7-1d02-0000-000000000007")
                                        .addAvailableFactor(
                                            Quote.ScaChallenge.AvailableFactor.SMS_OTP
                                        )
                                        .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                        .factor(Quote.ScaChallenge.Factor.SMS_OTP)
                                        .addPasskeyAllowedOrigin("https://app.example.com")
                                        .passkeyAssertionOptions(
                                            Quote.ScaChallenge.PasskeyAssertionOptions.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .purpose("PAYOUT")
                                        .build()
                                )
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
                                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .destination(JsonValue.from(mapOf<String, Any>()))
                                .direction(IncomingTransaction.Direction.CREDIT)
                                .platformCustomerId("18d3e5f7b4a9c2")
                                .receivedAmount(
                                    CurrencyAmount.builder()
                                        .amount(12550L)
                                        .currency(
                                            Currency.builder()
                                                .code("USD")
                                                .decimals(2L)
                                                .name("United States Dollar")
                                                .symbol("\$")
                                                .build()
                                        )
                                        .build()
                                )
                                .status(TransactionStatus.CREATED)
                                .type(IncomingTransaction.Type.INCOMING)
                                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                                .counterpartyInformation(
                                    IncomingTransaction.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                                .description("Payment for invoice #1234")
                                .exchangeRate(1.08)
                                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                                .fees(10L)
                                .pendingReason(
                                    IncomingTransaction.PendingReason
                                        .COUNTERPARTY_DECLARATION_REQUIRED
                                )
                                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .receiptDeliveryConfirmedAt(
                                    OffsetDateTime.parse("2025-08-15T14:31:00Z")
                                )
                                .reconciliationInstructions(
                                    ReconciliationInstructions.builder()
                                        .reference("UMA-Q12345-REF")
                                        .transactionHash(
                                            "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                        )
                                        .build()
                                )
                                .refund(
                                    Refund.builder()
                                        .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                        .reference("UMA-Q12345-REFUND")
                                        .status(Refund.Status.COMPLETED)
                                        .reason(Refund.Reason.TRANSACTION_FAILED)
                                        .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                        .build()
                                )
                                .sentAmount(
                                    CurrencyAmount.builder()
                                        .amount(12550L)
                                        .currency(
                                            Currency.builder()
                                                .code("USD")
                                                .decimals(2L)
                                                .name("United States Dollar")
                                                .symbol("\$")
                                                .build()
                                        )
                                        .build()
                                )
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .source(TransactionSourceOneOf.builder().build())
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(AgentActionWebhookEvent.Type.AGENT_ACTION_PENDING_APPROVAL)
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofAgentActionPendingApproval(agentActionPendingApproval)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval())
            .isEqualTo(agentActionPendingApproval)
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofAgentActionPendingApprovalRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofAgentActionPendingApproval(
                AgentActionWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        AgentAction.builder()
                            .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                            .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                            .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                            .platformCustomerId("user-a1b2c3")
                            .status(AgentAction.Status.PENDING_APPROVAL)
                            .type(AgentAction.Type.EXECUTE_QUOTE)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                            .quote(
                                Quote.builder()
                                    .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                    .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                    .destination(QuoteDestinationOneOf.builder().build())
                                    .exchangeRate(1.0)
                                    .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                    .feesIncluded(10L)
                                    .receivingCurrency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .sendingCurrency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .source(QuoteSourceOneOf.builder().build())
                                    .status(Quote.Status.PENDING)
                                    .totalReceivingAmount(1000L)
                                    .totalSendingAmount(123010L)
                                    .transactionId(
                                        "Transaction:019542f5-b3e7-1d02-0000-000000000005"
                                    )
                                    .counterpartyInformation(
                                        Quote.CounterpartyInformation.builder()
                                            .putAdditionalProperty(
                                                "FULL_NAME",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty(
                                                "BIRTH_DATE",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty(
                                                "NATIONALITY",
                                                JsonValue.from("bar"),
                                            )
                                            .build()
                                    )
                                    .addPaymentInstruction(
                                        PaymentInstructions.builder()
                                            .accountOrWalletInfo(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .builder()
                                                    .addPaymentRail(
                                                        PaymentInstructions.AccountOrWalletInfo
                                                            .SlvAccount
                                                            .PaymentRail
                                                            .BANK_TRANSFER
                                                    )
                                                    .addPaymentRail(
                                                        PaymentInstructions.AccountOrWalletInfo
                                                            .SlvAccount
                                                            .PaymentRail
                                                            .MOBILE_MONEY
                                                    )
                                                    .reference("UMA-Q12345-REF")
                                                    .accountNumber("1234567890")
                                                    .bankAccountType(
                                                        PaymentInstructions.AccountOrWalletInfo
                                                            .SlvAccount
                                                            .BankAccountType
                                                            .CHECKING
                                                    )
                                                    .bankName("Chase Bank")
                                                    .phoneNumber("+50312345678")
                                                    .build()
                                            )
                                            .instructionsNotes(
                                                "Include reference UMA-Q12345-REF in memo"
                                            )
                                            .isPlatformAccount(true)
                                            .build()
                                    )
                                    .addPaymentInstruction(
                                        PaymentInstructions.builder()
                                            .accountOrWalletInfo(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .builder()
                                                    .addPaymentRail(
                                                        PaymentInstructions.AccountOrWalletInfo
                                                            .SlvAccount
                                                            .PaymentRail
                                                            .BANK_TRANSFER
                                                    )
                                                    .reference("UMA-Q12345-REF")
                                                    .accountNumber("0123456789")
                                                    .bankAccountType(
                                                        PaymentInstructions.AccountOrWalletInfo
                                                            .SlvAccount
                                                            .BankAccountType
                                                            .CHECKING
                                                    )
                                                    .bankName("Banco Cuscatlan")
                                                    .phoneNumber("+50312345678")
                                                    .build()
                                            )
                                            .instructionsNotes(
                                                "Please ensure the reference code is included in the payment memo/description field"
                                            )
                                            .isPlatformAccount(true)
                                            .build()
                                    )
                                    .platformFeesIncluded(5L)
                                    .rateDetails(
                                        OutgoingRateDetails.builder()
                                            .counterpartyFixedFee(10L)
                                            .counterpartyMultiplier(1.08)
                                            .gridApiFixedFee(10L)
                                            .gridApiMultiplier(0.925)
                                            .gridApiVariableFeeAmount(30L)
                                            .gridApiVariableFeeRate(0.003)
                                            .build()
                                    )
                                    .scaChallenge(
                                        Quote.ScaChallenge.builder()
                                            .id("ScaChallenge:019542f5-b3e7-1d02-0000-000000000007")
                                            .addAvailableFactor(
                                                Quote.ScaChallenge.AvailableFactor.SMS_OTP
                                            )
                                            .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                            .factor(Quote.ScaChallenge.Factor.SMS_OTP)
                                            .addPasskeyAllowedOrigin("https://app.example.com")
                                            .passkeyAssertionOptions(
                                                Quote.ScaChallenge.PasskeyAssertionOptions.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .purpose("PAYOUT")
                                            .build()
                                    )
                                    .build()
                            )
                            .rejectionReason(
                                "Transaction amount exceeds customer's current risk limit."
                            )
                            .transaction(
                                IncomingTransaction.builder()
                                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .destination(JsonValue.from(mapOf<String, Any>()))
                                    .direction(IncomingTransaction.Direction.CREDIT)
                                    .platformCustomerId("18d3e5f7b4a9c2")
                                    .receivedAmount(
                                        CurrencyAmount.builder()
                                            .amount(12550L)
                                            .currency(
                                                Currency.builder()
                                                    .code("USD")
                                                    .decimals(2L)
                                                    .name("United States Dollar")
                                                    .symbol("\$")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .status(TransactionStatus.CREATED)
                                    .type(IncomingTransaction.Type.INCOMING)
                                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                                    .counterpartyInformation(
                                        IncomingTransaction.CounterpartyInformation.builder()
                                            .putAdditionalProperty(
                                                "FULL_NAME",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty(
                                                "BIRTH_DATE",
                                                JsonValue.from("bar"),
                                            )
                                            .putAdditionalProperty(
                                                "NATIONALITY",
                                                JsonValue.from("bar"),
                                            )
                                            .build()
                                    )
                                    .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                                    .description("Payment for invoice #1234")
                                    .exchangeRate(1.08)
                                    .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                                    .fees(10L)
                                    .pendingReason(
                                        IncomingTransaction.PendingReason
                                            .COUNTERPARTY_DECLARATION_REQUIRED
                                    )
                                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                    .receiptDeliveryConfirmedAt(
                                        OffsetDateTime.parse("2025-08-15T14:31:00Z")
                                    )
                                    .reconciliationInstructions(
                                        ReconciliationInstructions.builder()
                                            .reference("UMA-Q12345-REF")
                                            .transactionHash(
                                                "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                            )
                                            .build()
                                    )
                                    .refund(
                                        Refund.builder()
                                            .initiatedAt(
                                                OffsetDateTime.parse("2025-08-15T14:30:00Z")
                                            )
                                            .reference("UMA-Q12345-REFUND")
                                            .status(Refund.Status.COMPLETED)
                                            .reason(Refund.Reason.TRANSACTION_FAILED)
                                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                            .build()
                                    )
                                    .sentAmount(
                                        CurrencyAmount.builder()
                                            .amount(12550L)
                                            .currency(
                                                Currency.builder()
                                                    .code("USD")
                                                    .decimals(2L)
                                                    .name("United States Dollar")
                                                    .symbol("\$")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .source(TransactionSourceOneOf.builder().build())
                                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(AgentActionWebhookEvent.Type.AGENT_ACTION_PENDING_APPROVAL)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofIncomingPayment() {
        val incomingPayment =
            IncomingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    IncomingPaymentWebhookEvent.Data.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(JsonValue.from(mapOf<String, Any>()))
                        .direction(IncomingTransaction.Direction.CREDIT)
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .receivedAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .status(TransactionStatus.CREATED)
                        .type(IncomingTransaction.Type.INCOMING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .counterpartyInformation(
                            IncomingTransaction.CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .exchangeRate(1.08)
                        .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                        .fees(10L)
                        .pendingReason(
                            IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                        )
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
                        .reconciliationInstructions(
                            ReconciliationInstructions.builder()
                                .reference("UMA-Q12345-REF")
                                .transactionHash(
                                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                )
                                .build()
                        )
                        .refund(
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .sentAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .source(TransactionSourceOneOf.builder().build())
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .addRequestedReceiverCustomerInfoField(
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.FULL_NAME)
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofIncomingPayment(incomingPayment)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isEqualTo(incomingPayment)
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofIncomingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofIncomingPayment(
                IncomingPaymentWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        IncomingPaymentWebhookEvent.Data.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(JsonValue.from(mapOf<String, Any>()))
                            .direction(IncomingTransaction.Direction.CREDIT)
                            .platformCustomerId("18d3e5f7b4a9c2")
                            .receivedAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .status(TransactionStatus.CREATED)
                            .type(IncomingTransaction.Type.INCOMING)
                            .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                            .counterpartyInformation(
                                IncomingTransaction.CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                            .description("Payment for invoice #1234")
                            .exchangeRate(1.08)
                            .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                            .fees(10L)
                            .pendingReason(
                                IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                            )
                            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .receiptDeliveryConfirmedAt(
                                OffsetDateTime.parse("2025-08-15T14:31:00Z")
                            )
                            .reconciliationInstructions(
                                ReconciliationInstructions.builder()
                                    .reference("UMA-Q12345-REF")
                                    .transactionHash(
                                        "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                    )
                                    .build()
                            )
                            .refund(
                                Refund.builder()
                                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .reference("UMA-Q12345-REFUND")
                                    .status(Refund.Status.COMPLETED)
                                    .reason(Refund.Reason.TRANSACTION_FAILED)
                                    .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                    .build()
                            )
                            .sentAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .source(TransactionSourceOneOf.builder().build())
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .addRequestedReceiverCustomerInfoField(
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.FULL_NAME)
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofOutgoingPayment() {
        val outgoingPayment =
            OutgoingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    OutgoingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(JsonValue.from(mapOf<String, Any>()))
                        .direction(OutgoingTransaction.Direction.CREDIT)
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .sentAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .source(TransactionSourceOneOf.builder().build())
                        .status(OutgoingTransaction.Status.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .counterpartyInformation(
                            OutgoingTransaction.CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .exchangeRate(1.08)
                        .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                        .fees(10L)
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .MOBILE_MONEY
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("1234567890")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Chase Bank")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                .isPlatformAccount(true)
                                .build()
                        )
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("0123456789")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Banco Cuscatlan")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .paymentRail(OutgoingTransaction.PaymentRail.ACH)
                        .pendingReason(
                            OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                        )
                        .platformFees(5L)
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .railSelectionMode(OutgoingTransaction.RailSelectionMode.AUTO)
                        .rateDetails(
                            OutgoingRateDetails.builder()
                                .counterpartyFixedFee(10L)
                                .counterpartyMultiplier(1.08)
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30L)
                                .gridApiVariableFeeRate(0.003)
                                .build()
                        )
                        .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
                        .receivedAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .reconciliationInstructions(
                            ReconciliationInstructions.builder()
                                .reference("UMA-Q12345-REF")
                                .transactionHash(
                                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                )
                                .build()
                        )
                        .refund(
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .settlementTimelineSeconds(0L)
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofOutgoingPayment(outgoingPayment)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isEqualTo(outgoingPayment)
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofOutgoingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofOutgoingPayment(
                OutgoingPaymentWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        OutgoingTransaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(JsonValue.from(mapOf<String, Any>()))
                            .direction(OutgoingTransaction.Direction.CREDIT)
                            .platformCustomerId("18d3e5f7b4a9c2")
                            .sentAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .source(TransactionSourceOneOf.builder().build())
                            .status(OutgoingTransaction.Status.PENDING)
                            .type(OutgoingTransaction.Type.OUTGOING)
                            .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                            .counterpartyInformation(
                                OutgoingTransaction.CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                            .description("Payment for invoice #1234")
                            .exchangeRate(1.08)
                            .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                            .fees(10L)
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .PaymentRail
                                                    .BANK_TRANSFER
                                            )
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .PaymentRail
                                                    .MOBILE_MONEY
                                            )
                                            .reference("UMA-Q12345-REF")
                                            .accountNumber("1234567890")
                                            .bankAccountType(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .BankAccountType
                                                    .CHECKING
                                            )
                                            .bankName("Chase Bank")
                                            .phoneNumber("+50312345678")
                                            .build()
                                    )
                                    .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .PaymentRail
                                                    .BANK_TRANSFER
                                            )
                                            .reference("UMA-Q12345-REF")
                                            .accountNumber("0123456789")
                                            .bankAccountType(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .BankAccountType
                                                    .CHECKING
                                            )
                                            .bankName("Banco Cuscatlan")
                                            .phoneNumber("+50312345678")
                                            .build()
                                    )
                                    .instructionsNotes(
                                        "Please ensure the reference code is included in the payment memo/description field"
                                    )
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .paymentRail(OutgoingTransaction.PaymentRail.ACH)
                            .pendingReason(
                                OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                            )
                            .platformFees(5L)
                            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .railSelectionMode(OutgoingTransaction.RailSelectionMode.AUTO)
                            .rateDetails(
                                OutgoingRateDetails.builder()
                                    .counterpartyFixedFee(10L)
                                    .counterpartyMultiplier(1.08)
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30L)
                                    .gridApiVariableFeeRate(0.003)
                                    .build()
                            )
                            .receiptDeliveryConfirmedAt(
                                OffsetDateTime.parse("2025-08-15T14:31:00Z")
                            )
                            .receivedAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .reconciliationInstructions(
                                ReconciliationInstructions.builder()
                                    .reference("UMA-Q12345-REF")
                                    .transactionHash(
                                        "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                    )
                                    .build()
                            )
                            .refund(
                                Refund.builder()
                                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .reference("UMA-Q12345-REFUND")
                                    .status(Refund.Status.COMPLETED)
                                    .reason(Refund.Reason.TRANSACTION_FAILED)
                                    .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                    .build()
                            )
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .settlementTimelineSeconds(0L)
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofTest() {
        val test =
            TestWebhookRequest.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(TestWebhookRequest.Type.TEST)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofTest(test)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isEqualTo(test)
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofTestRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofTest(
                TestWebhookRequest.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(TestWebhookRequest.Type.TEST)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofBulkUpload() {
        val bulkUpload =
            BulkUploadWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    BulkUploadWebhookEvent.Data.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhookEvent.Data.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhookEvent.Data.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkCustomerImportErrorEntry.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkCustomerImportErrorEntry.Details.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD_COMPLETED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofBulkUpload(bulkUpload)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isEqualTo(bulkUpload)
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofBulkUploadRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofBulkUpload(
                BulkUploadWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        BulkUploadWebhookEvent.Data.builder()
                            .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                            .progress(
                                BulkUploadWebhookEvent.Data.Progress.builder()
                                    .failed(50L)
                                    .processed(2500L)
                                    .successful(2450L)
                                    .total(5000L)
                                    .build()
                            )
                            .status(BulkUploadWebhookEvent.Data.Status.PROCESSING)
                            .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                            .addError(
                                BulkCustomerImportErrorEntry.builder()
                                    .correlationId("biz456")
                                    .code("code")
                                    .details(
                                        BulkCustomerImportErrorEntry.Details.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .message("message")
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD_COMPLETED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofInvitationClaimed() {
        val invitationClaimed =
            InvitationClaimedWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    UmaInvitation.builder()
                        .code("019542f5")
                        .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .inviterUma("\$inviter@uma.domain")
                        .status(UmaInvitation.Status.PENDING)
                        .url("https://uma.me/i/019542f5")
                        .amountToSend(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .firstName("Jane")
                        .inviteeUma("\$invitee@uma.domain")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InvitationClaimedWebhookEvent.Type.INVITATION_CLAIMED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofInvitationClaimed(invitationClaimed)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isEqualTo(invitationClaimed)
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofInvitationClaimedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInvitationClaimed(
                InvitationClaimedWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        UmaInvitation.builder()
                            .code("019542f5")
                            .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .inviterUma("\$inviter@uma.domain")
                            .status(UmaInvitation.Status.PENDING)
                            .url("https://uma.me/i/019542f5")
                            .amountToSend(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .firstName("Jane")
                            .inviteeUma("\$invitee@uma.domain")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(InvitationClaimedWebhookEvent.Type.INVITATION_CLAIMED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofCustomerUpdate() {
        val customerUpdate =
            CustomerUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    IndividualCustomer.builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .contactVerification(
                            Customer.ContactVerification.builder()
                                .email(Customer.ContactVerification.Email.VERIFIED)
                                .phone(Customer.ContactVerification.Phone.VERIFIED)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .addCurrency("USD")
                        .addCurrency("USDC")
                        .email("john.doe@example.com")
                        .endUserTermsConsent(
                            EndUserTermsConsentRequest.builder()
                                .acceptanceMethod(
                                    EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX
                                )
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .ipAddress("198.51.100.24")
                                .termsVersion("V1")
                                .build()
                        )
                        .isDeleted(false)
                        .phoneNumber("+14155551234")
                        .region("US")
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .annualIncomeRange(IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K)
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .countryOfIssuance("US")
                        .expectedMonthlyTransactionCount(
                            IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                        )
                        .expectedMonthlyTransactionVolume(
                            IndividualCustomer.ExpectedMonthlyTransactionVolume.VOLUME_100_K_TO_1_M
                        )
                        .fullName("John Michael Doe")
                        .identifier("123-45-6789")
                        .idType(IndividualCustomer.IdType.SSN)
                        .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                        .nationality("US")
                        .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                        .pepStatus(IndividualCustomer.PepStatus.NONE)
                        .purposeOfAccount(IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS)
                        .purposeOfAccountOtherDescription("Household budgeting between spouses")
                        .addSourceOfFundsCategory(IndividualCustomer.SourceOfFundsCategory.SALARY)
                        .sourceOfFundsOtherDescription("Contest winnings")
                        .addSourceOfWealthCategory(IndividualCustomer.SourceOfWealthCategory.SALARY)
                        .addSourceOfWealthCategory(
                            IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                        )
                        .sourceOfWealthOtherDescription("Royalty income from published works")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCustomerUpdate(customerUpdate)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isEqualTo(customerUpdate)
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofCustomerUpdateRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCustomerUpdate(
                CustomerUpdateWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        IndividualCustomer.builder()
                            .customerType(JsonValue.from("INDIVIDUAL"))
                            .platformCustomerId("9f84e0c2a72c4fa")
                            .umaAddress("\$john.doe@uma.domain.com")
                            .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .contactVerification(
                                Customer.ContactVerification.builder()
                                    .email(Customer.ContactVerification.Email.VERIFIED)
                                    .phone(Customer.ContactVerification.Phone.VERIFIED)
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                            .addCurrency("USD")
                            .addCurrency("USDC")
                            .email("john.doe@example.com")
                            .endUserTermsConsent(
                                EndUserTermsConsentRequest.builder()
                                    .acceptanceMethod(
                                        EndUserTermsConsentRequest.AcceptanceMethod.CHECKBOX
                                    )
                                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .ipAddress("198.51.100.24")
                                    .termsVersion("V1")
                                    .build()
                            )
                            .isDeleted(false)
                            .phoneNumber("+14155551234")
                            .region("US")
                            .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                            .address(
                                Address.builder()
                                    .country("US")
                                    .line1("123 Main Street")
                                    .postalCode("94105")
                                    .city("San Francisco")
                                    .line2("Apt 4B")
                                    .state("CA")
                                    .build()
                            )
                            .annualIncomeRange(
                                IndividualCustomer.AnnualIncomeRange.RANGE_100_K_250_K
                            )
                            .birthDate(LocalDate.parse("1990-01-15"))
                            .countryOfIssuance("US")
                            .expectedMonthlyTransactionCount(
                                IndividualCustomer.ExpectedMonthlyTransactionCount.COUNT_100_TO_500
                            )
                            .expectedMonthlyTransactionVolume(
                                IndividualCustomer.ExpectedMonthlyTransactionVolume
                                    .VOLUME_100_K_TO_1_M
                            )
                            .fullName("John Michael Doe")
                            .identifier("123-45-6789")
                            .idType(IndividualCustomer.IdType.SSN)
                            .kycStatus(IndividualCustomer.KycStatus.APPROVED)
                            .nationality("US")
                            .netWorthRange(IndividualCustomer.NetWorthRange.RANGE_500_K_1_M)
                            .pepStatus(IndividualCustomer.PepStatus.NONE)
                            .purposeOfAccount(
                                IndividualCustomer.PurposeOfAccount.CONTRACTOR_PAYOUTS
                            )
                            .purposeOfAccountOtherDescription("Household budgeting between spouses")
                            .addSourceOfFundsCategory(
                                IndividualCustomer.SourceOfFundsCategory.SALARY
                            )
                            .sourceOfFundsOtherDescription("Contest winnings")
                            .addSourceOfWealthCategory(
                                IndividualCustomer.SourceOfWealthCategory.SALARY
                            )
                            .addSourceOfWealthCategory(
                                IndividualCustomer.SourceOfWealthCategory.INVESTMENTS
                            )
                            .sourceOfWealthOtherDescription("Royalty income from published works")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofInternalAccountStatus() {
        val internalAccountStatus =
            InternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    InternalAccount.builder()
                        .id("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .balance(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .addFundingPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("0123456789")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Banco Cuscatlan")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .status(InternalAccount.Status.ACTIVE)
                        .totalBalance(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .type(InternalAccount.Type.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofInternalAccountStatus(internalAccountStatus)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isEqualTo(internalAccountStatus)
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofInternalAccountStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInternalAccountStatus(
                InternalAccountStatusWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        InternalAccount.builder()
                            .id("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .balance(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                            .addFundingPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .PaymentRail
                                                    .BANK_TRANSFER
                                            )
                                            .reference("UMA-Q12345-REF")
                                            .accountNumber("0123456789")
                                            .bankAccountType(
                                                PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                    .BankAccountType
                                                    .CHECKING
                                            )
                                            .bankName("Banco Cuscatlan")
                                            .phoneNumber("+50312345678")
                                            .build()
                                    )
                                    .instructionsNotes(
                                        "Please ensure the reference code is included in the payment memo/description field"
                                    )
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .status(InternalAccount.Status.ACTIVE)
                            .totalBalance(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .type(InternalAccount.Type.INTERNAL_FIAT)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .privateEnabled(true)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofExternalAccountStatusUpdated() {
        val externalAccountStatusUpdated =
            ExternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    ExternalAccount.builder()
                        .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .accountInfo(
                            ExternalAccountInfoOneOf.SlvAccount.builder()
                                .beneficiary(
                                    SlvBeneficiary.builder()
                                        .beneficiaryType(SlvBeneficiary.BeneficiaryType.INDIVIDUAL)
                                        .fullName("fullName")
                                        .address(
                                            Address.builder()
                                                .country("US")
                                                .line1("123 Main Street")
                                                .postalCode("94105")
                                                .city("San Francisco")
                                                .line2("Apt 4B")
                                                .state("CA")
                                                .build()
                                        )
                                        .birthDate("birthDate")
                                        .countryOfResidence("countryOfResidence")
                                        .email("email")
                                        .nationality("nationality")
                                        .phoneNumber("phoneNumber")
                                        .build()
                                )
                                .addPaymentRail(
                                    ExternalAccountInfoOneOf.SlvAccount.PaymentRail.BANK_TRANSFER
                                )
                                .accountNumber("0123456789")
                                .bankAccountType(
                                    ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING
                                )
                                .bankName("Banco Cuscatlan")
                                .phoneNumber("+50312345678")
                                .build()
                        )
                        .currency("USD")
                        .status(ExternalAccount.Status.ACTIVE)
                        .beneficiaryVerificationStatus(
                            ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                        )
                        .beneficiaryVerifiedData(
                            BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                        )
                        .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                        .defaultUmaDepositAccount(false)
                        .ownershipType(ExternalAccount.OwnershipType.FIRST_PARTY)
                        .platformAccountId("acc_123456789")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(ExternalAccountStatusWebhookEvent.Type.EXTERNAL_ACCOUNT_STATUS_UPDATED)
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofExternalAccountStatusUpdated(externalAccountStatusUpdated)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated())
            .isEqualTo(externalAccountStatusUpdated)
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofExternalAccountStatusUpdatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofExternalAccountStatusUpdated(
                ExternalAccountStatusWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        ExternalAccount.builder()
                            .id("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .accountInfo(
                                ExternalAccountInfoOneOf.SlvAccount.builder()
                                    .beneficiary(
                                        SlvBeneficiary.builder()
                                            .beneficiaryType(
                                                SlvBeneficiary.BeneficiaryType.INDIVIDUAL
                                            )
                                            .fullName("fullName")
                                            .address(
                                                Address.builder()
                                                    .country("US")
                                                    .line1("123 Main Street")
                                                    .postalCode("94105")
                                                    .city("San Francisco")
                                                    .line2("Apt 4B")
                                                    .state("CA")
                                                    .build()
                                            )
                                            .birthDate("birthDate")
                                            .countryOfResidence("countryOfResidence")
                                            .email("email")
                                            .nationality("nationality")
                                            .phoneNumber("phoneNumber")
                                            .build()
                                    )
                                    .addPaymentRail(
                                        ExternalAccountInfoOneOf.SlvAccount.PaymentRail
                                            .BANK_TRANSFER
                                    )
                                    .accountNumber("0123456789")
                                    .bankAccountType(
                                        ExternalAccountInfoOneOf.SlvAccount.BankAccountType.CHECKING
                                    )
                                    .bankName("Banco Cuscatlan")
                                    .phoneNumber("+50312345678")
                                    .build()
                            )
                            .currency("USD")
                            .status(ExternalAccount.Status.ACTIVE)
                            .beneficiaryVerificationStatus(
                                ExternalAccount.BeneficiaryVerificationStatus.MATCHED
                            )
                            .beneficiaryVerifiedData(
                                BeneficiaryVerifiedData.builder().fullName("John Doe").build()
                            )
                            .customerId("Customer:da459a29-1fb7-41ce-a4cb-eb3a3c9fd7a7")
                            .defaultUmaDepositAccount(false)
                            .ownershipType(ExternalAccount.OwnershipType.FIRST_PARTY)
                            .platformAccountId("acc_123456789")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(ExternalAccountStatusWebhookEvent.Type.EXTERNAL_ACCOUNT_STATUS_UPDATED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofVerificationUpdate() {
        val verificationUpdate =
            VerificationUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    Verification.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationError.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationError.AcceptedDocumentType.PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(Verification.VerificationStatus.RESOLVE_ERRORS)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofVerificationUpdate(verificationUpdate)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isEqualTo(verificationUpdate)
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofVerificationUpdateRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofVerificationUpdate(
                VerificationUpdateWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        Verification.builder()
                            .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .addError(
                                VerificationError.builder()
                                    .reason("Business address line 1 is required")
                                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .type(VerificationError.Type.MISSING_FIELD)
                                    .addAcceptedDocumentType(
                                        VerificationError.AcceptedDocumentType.PASSPORT
                                    )
                                    .field("customer.address.line1")
                                    .build()
                            )
                            .verificationStatus(Verification.VerificationStatus.RESOLVE_ERRORS)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofCardStateChange() {
        val cardStateChange =
            CardStateChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(Card.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .maxSpendPerTransaction(5000L)
                        .state(Card.State.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(Card.Brand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lead_card_7a1b9c3d")
                        .last4("4242")
                        .platformCardId("card-emp-aary-001")
                        .processorRef("card_b81c2a4f")
                        .stateReason(Card.StateReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardStateChangeWebhookEvent.Type.CARD_STATE_CHANGE)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCardStateChange(cardStateChange)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isEqualTo(cardStateChange)
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofCardStateChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardStateChange(
                CardStateChangeWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        Card.builder()
                            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                            .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                            .form(Card.Form.VIRTUAL)
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .maxSpendPerTransaction(5000L)
                            .state(Card.State.PENDING_KYC)
                            .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                            .brand(Card.Brand.VISA)
                            .currency("USD")
                            .expMonth(12L)
                            .expYear(2029L)
                            .issuerRef("lead_card_7a1b9c3d")
                            .last4("4242")
                            .platformCardId("card-emp-aary-001")
                            .processorRef("card_b81c2a4f")
                            .stateReason(Card.StateReason.ISSUER_REJECTED)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(CardStateChangeWebhookEvent.Type.CARD_STATE_CHANGE)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofCardFundingSourceChange() {
        val cardFundingSourceChange =
            CardFundingSourceChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(Card.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .maxSpendPerTransaction(5000L)
                        .state(Card.State.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(Card.Brand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lead_card_7a1b9c3d")
                        .last4("4242")
                        .platformCardId("card-emp-aary-001")
                        .processorRef("card_b81c2a4f")
                        .stateReason(Card.StateReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardFundingSourceChangeWebhookEvent.Type.CARD_FUNDING_SOURCE_CHANGE)
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardFundingSourceChange(cardFundingSourceChange)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isEqualTo(cardFundingSourceChange)
        assertThat(unwrapWebhookEvent.cardTransaction()).isNull()
    }

    @Test
    fun ofCardFundingSourceChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardFundingSourceChange(
                CardFundingSourceChangeWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        Card.builder()
                            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                            .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                            .form(Card.Form.VIRTUAL)
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .maxSpendPerTransaction(5000L)
                            .state(Card.State.PENDING_KYC)
                            .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                            .brand(Card.Brand.VISA)
                            .currency("USD")
                            .expMonth(12L)
                            .expYear(2029L)
                            .issuerRef("lead_card_7a1b9c3d")
                            .last4("4242")
                            .platformCardId("card-emp-aary-001")
                            .processorRef("card_b81c2a4f")
                            .stateReason(Card.StateReason.ISSUER_REJECTED)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(CardFundingSourceChangeWebhookEvent.Type.CARD_FUNDING_SOURCE_CHANGE)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofCardTransaction() {
        val cardTransaction =
            CardTransactionWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardTransaction.builder()
                        .id("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .authorizedAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .authorizedAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .direction(CardTransaction.Direction.DEBIT)
                        .merchant(
                            CardMerchant.builder()
                                .descriptor("BLUE BOTTLE COFFEE SF")
                                .country("US")
                                .mcc("5814")
                                .build()
                        )
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .status(CardTransaction.Status.AUTHORIZED)
                        .type(CardTransaction.Type.CARD)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                        .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .issuerTransactionToken("lithic_txn_b81c2a4f")
                        .lastEventAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                        .pullSummary(
                            CardPullSummary.builder()
                                .count(2L)
                                .totalAmount(1500L)
                                .pendingCount(0L)
                                .build()
                        )
                        .refundedAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .refundSummary(
                            CardRefundSummary.builder().count(0L).totalAmount(0L).build()
                        )
                        .settledAmount(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .settlementSummary(
                            CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardTransactionWebhookEvent.Type.CARD_TRANSACTION_AUTHORIZED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCardTransaction(cardTransaction)

        assertThat(unwrapWebhookEvent.agentActionPendingApproval()).isNull()
        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.test()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.externalAccountStatusUpdated()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChange()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChange()).isNull()
        assertThat(unwrapWebhookEvent.cardTransaction()).isEqualTo(cardTransaction)
    }

    @Test
    fun ofCardTransactionRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardTransaction(
                CardTransactionWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        CardTransaction.builder()
                            .id("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                            .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                            .authorizedAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .authorizedAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                            .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .direction(CardTransaction.Direction.DEBIT)
                            .merchant(
                                CardMerchant.builder()
                                    .descriptor("BLUE BOTTLE COFFEE SF")
                                    .country("US")
                                    .mcc("5814")
                                    .build()
                            )
                            .platformCustomerId("18d3e5f7b4a9c2")
                            .status(CardTransaction.Status.AUTHORIZED)
                            .type(CardTransaction.Type.CARD)
                            .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                            .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                            .issuerTransactionToken("lithic_txn_b81c2a4f")
                            .lastEventAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                            .pullSummary(
                                CardPullSummary.builder()
                                    .count(2L)
                                    .totalAmount(1500L)
                                    .pendingCount(0L)
                                    .build()
                            )
                            .refundedAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .refundSummary(
                                CardRefundSummary.builder().count(0L).totalAmount(0L).build()
                            )
                            .settledAmount(
                                CurrencyAmount.builder()
                                    .amount(12550L)
                                    .currency(
                                        Currency.builder()
                                            .code("USD")
                                            .decimals(2L)
                                            .name("United States Dollar")
                                            .symbol("\$")
                                            .build()
                                    )
                                    .build()
                            )
                            .settlementSummary(
                                CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(CardTransactionWebhookEvent.Type.CARD_TRANSACTION_AUTHORIZED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val unwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnwrapWebhookEvent>())

        val e = assertThrows<LightsparkGridInvalidDataException> { unwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
