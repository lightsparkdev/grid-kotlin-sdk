// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.AgentTransferDetails
import com.lightspark.grid.models.BulkCustomerImportErrorEntry
import com.lightspark.grid.models.IndividualCustomer
import com.lightspark.grid.models.VerificationError
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.AgentActionStatus
import com.lightspark.grid.models.agents.AgentActionType
import com.lightspark.grid.models.cards.Card
import com.lightspark.grid.models.cards.CardBrand
import com.lightspark.grid.models.cards.CardForm
import com.lightspark.grid.models.cards.CardState
import com.lightspark.grid.models.cards.CardStateReason
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.customers.InternalAccountStatus
import com.lightspark.grid.models.customers.InternalAccountType
import com.lightspark.grid.models.customers.KycStatus
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.CounterpartyInformation
import com.lightspark.grid.models.documents.DocumentType
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.invitations.UmaInvitation
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.models.sandbox.webhooks.TestWebhookRequest
import com.lightspark.grid.models.transactions.IncomingRateDetails
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.IncomingTransactionFailureReason
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransactionFailureReason
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionDestinationOneOf
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.verifications.Verification
import com.lightspark.grid.models.verifications.VerificationErrorType
import com.lightspark.grid.models.verifications.VerificationStatus
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofAgentActionWebhook() {
        val agentActionWebhook =
            AgentActionWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("AGENT_ACTION.PENDING_APPROVAL"))
                .data(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentActionStatus.PENDING_APPROVAL)
                        .type(AgentActionType.EXECUTE_QUOTE)
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
                                    CounterpartyInformation.builder()
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
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
                                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .destination(TransactionDestinationOneOf.builder().build())
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
                                    CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                                .description("Payment for invoice #1234")
                                .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
                                .fees(10L)
                                .rateDetails(
                                    IncomingRateDetails.builder()
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
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
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .source(TransactionSourceOneOf.builder().build())
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .transferDetails(
                            AgentTransferDetails.builder()
                                .amount(50000L)
                                .currency("USD")
                                .destinationAccountId(
                                    "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                )
                                .sourceAccountId(
                                    "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofAgentActionWebhook(agentActionWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isEqualTo(agentActionWebhook)
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofAgentActionWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofAgentActionWebhook(
                AgentActionWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("AGENT_ACTION.PENDING_APPROVAL"))
                    .data(
                        AgentAction.builder()
                            .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                            .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                            .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                            .platformCustomerId("user-a1b2c3")
                            .status(AgentActionStatus.PENDING_APPROVAL)
                            .type(AgentActionType.EXECUTE_QUOTE)
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
                                        CounterpartyInformation.builder()
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
                                    .build()
                            )
                            .rejectionReason(
                                "Transaction amount exceeds customer's current risk limit."
                            )
                            .transaction(
                                IncomingTransaction.builder()
                                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .destination(TransactionDestinationOneOf.builder().build())
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
                                        CounterpartyInformation.builder()
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
                                    .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
                                    .fees(10L)
                                    .rateDetails(
                                        IncomingRateDetails.builder()
                                            .gridApiFixedFee(10L)
                                            .gridApiMultiplier(0.925)
                                            .gridApiVariableFeeAmount(30L)
                                            .gridApiVariableFeeRate(0.003)
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
                                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .source(TransactionSourceOneOf.builder().build())
                                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .build()
                            )
                            .transferDetails(
                                AgentTransferDetails.builder()
                                    .amount(50000L)
                                    .currency("USD")
                                    .destinationAccountId(
                                        "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .sourceAccountId(
                                        "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .build()
                            )
                            .build()
                    )
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
    fun ofIncomingPaymentWebhook() {
        val incomingPaymentWebhook =
            IncomingPaymentWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INCOMING_PAYMENT.PENDING"))
                .data(
                    IncomingPaymentWebhook.Data.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
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
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
                        .fees(10L)
                        .rateDetails(
                            IncomingRateDetails.builder()
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30L)
                                .gridApiVariableFeeRate(0.003)
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
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofIncomingPaymentWebhook(incomingPaymentWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isEqualTo(incomingPaymentWebhook)
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofIncomingPaymentWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofIncomingPaymentWebhook(
                IncomingPaymentWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("INCOMING_PAYMENT.PENDING"))
                    .data(
                        IncomingPaymentWebhook.Data.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(TransactionDestinationOneOf.builder().build())
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
                                CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                            .description("Payment for invoice #1234")
                            .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
                            .fees(10L)
                            .rateDetails(
                                IncomingRateDetails.builder()
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30L)
                                    .gridApiVariableFeeRate(0.003)
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
    fun ofOutgoingPaymentWebhook() {
        val outgoingPaymentWebhook =
            OutgoingPaymentWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("OUTGOING_PAYMENT.PENDING"))
                .data(
                    OutgoingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
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
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .exchangeRate(1.08)
                        .failureReason(OutgoingTransactionFailureReason.QUOTE_EXPIRED)
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
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
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
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofOutgoingPaymentWebhook(outgoingPaymentWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isEqualTo(outgoingPaymentWebhook)
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofOutgoingPaymentWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofOutgoingPaymentWebhook(
                OutgoingPaymentWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("OUTGOING_PAYMENT.PENDING"))
                    .data(
                        OutgoingTransaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(TransactionDestinationOneOf.builder().build())
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
                                CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                            .description("Payment for invoice #1234")
                            .exchangeRate(1.08)
                            .failureReason(OutgoingTransactionFailureReason.QUOTE_EXPIRED)
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
                            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
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
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .build()
                    )
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
    fun ofTestWebhookRequest() {
        val testWebhookRequest =
            TestWebhookRequest.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("TEST"))
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofTestWebhookRequest(testWebhookRequest)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isEqualTo(testWebhookRequest)
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofTestWebhookRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofTestWebhookRequest(
                TestWebhookRequest.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("TEST"))
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
    fun ofBulkUploadWebhook() {
        val bulkUploadWebhook =
            BulkUploadWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("BULK_UPLOAD.COMPLETED"))
                .data(
                    BulkUploadWebhook.Data.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhook.Data.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhook.Data.Status.PROCESSING)
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
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofBulkUploadWebhook(bulkUploadWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isEqualTo(bulkUploadWebhook)
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofBulkUploadWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofBulkUploadWebhook(
                BulkUploadWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("BULK_UPLOAD.COMPLETED"))
                    .data(
                        BulkUploadWebhook.Data.builder()
                            .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                            .progress(
                                BulkUploadWebhook.Data.Progress.builder()
                                    .failed(50L)
                                    .processed(2500L)
                                    .successful(2450L)
                                    .total(5000L)
                                    .build()
                            )
                            .status(BulkUploadWebhook.Data.Status.PROCESSING)
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
    fun ofInvitationClaimedWebhook() {
        val invitationClaimedWebhook =
            InvitationClaimedWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INVITATION.CLAIMED"))
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
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInvitationClaimedWebhook(invitationClaimedWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook())
            .isEqualTo(invitationClaimedWebhook)
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofInvitationClaimedWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInvitationClaimedWebhook(
                InvitationClaimedWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("INVITATION.CLAIMED"))
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
    fun ofCustomerWebhook() {
        val customerWebhook =
            CustomerWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CUSTOMER.KYC_APPROVED"))
                .data(
                    IndividualCustomer.builder()
                        .customerType(JsonValue.from("INDIVIDUAL"))
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .addCurrency("USD")
                        .addCurrency("USDC")
                        .email("john.doe@example.com")
                        .isDeleted(false)
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
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
                        .kycStatus(KycStatus.APPROVED)
                        .nationality("US")
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCustomerWebhook(customerWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isEqualTo(customerWebhook)
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofCustomerWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCustomerWebhook(
                CustomerWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("CUSTOMER.KYC_APPROVED"))
                    .data(
                        IndividualCustomer.builder()
                            .customerType(JsonValue.from("INDIVIDUAL"))
                            .platformCustomerId("9f84e0c2a72c4fa")
                            .umaAddress("\$john.doe@uma.domain.com")
                            .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                            .addCurrency("USD")
                            .addCurrency("USDC")
                            .email("john.doe@example.com")
                            .isDeleted(false)
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
                            .birthDate(LocalDate.parse("1990-01-15"))
                            .fullName("John Michael Doe")
                            .kycStatus(KycStatus.APPROVED)
                            .nationality("US")
                            .build()
                    )
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
    fun ofInternalAccountStatusWebhook() {
        val internalAccountStatusWebhook =
            InternalAccountStatusWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INTERNAL_ACCOUNT.BALANCE_UPDATED"))
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
                        .status(InternalAccountStatus.ACTIVE)
                        .type(InternalAccountType.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInternalAccountStatusWebhook(internalAccountStatusWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook())
            .isEqualTo(internalAccountStatusWebhook)
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofInternalAccountStatusWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInternalAccountStatusWebhook(
                InternalAccountStatusWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("INTERNAL_ACCOUNT.BALANCE_UPDATED"))
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
                            .status(InternalAccountStatus.ACTIVE)
                            .type(InternalAccountType.INTERNAL_FIAT)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .privateEnabled(true)
                            .build()
                    )
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
    fun ofVerificationWebhook() {
        val verificationWebhook =
            VerificationWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("VERIFICATION.APPROVED"))
                .data(
                    Verification.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationErrorType.MISSING_FIELD)
                                .addAcceptedDocumentType(DocumentType.PASSPORT)
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(VerificationStatus.RESOLVE_ERRORS)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofVerificationWebhook(verificationWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isEqualTo(verificationWebhook)
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofVerificationWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofVerificationWebhook(
                VerificationWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("VERIFICATION.APPROVED"))
                    .data(
                        Verification.builder()
                            .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .addError(
                                VerificationError.builder()
                                    .reason("Business address line 1 is required")
                                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .type(VerificationErrorType.MISSING_FIELD)
                                    .addAcceptedDocumentType(DocumentType.PASSPORT)
                                    .field("customer.address.line1")
                                    .build()
                            )
                            .verificationStatus(VerificationStatus.RESOLVE_ERRORS)
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .build()
                    )
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
    fun ofCardStateChangeWebhook() {
        val cardStateChangeWebhook =
            CardStateChangeWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CARD.STATE_CHANGE"))
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCardStateChangeWebhook(cardStateChangeWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isEqualTo(cardStateChangeWebhook)
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook()).isNull()
    }

    @Test
    fun ofCardStateChangeWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardStateChangeWebhook(
                CardStateChangeWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("CARD.STATE_CHANGE"))
                    .data(
                        Card.builder()
                            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                            .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                            .form(CardForm.VIRTUAL)
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .state(CardState.PENDING_KYC)
                            .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                            .brand(CardBrand.VISA)
                            .currency("USD")
                            .expMonth(12L)
                            .expYear(2029L)
                            .issuerRef("lithic_card_4f8d3a2b1c")
                            .last4("4242")
                            .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                            .platformCardId("card-emp-aary-001")
                            .stateReason(CardStateReason.ISSUER_REJECTED)
                            .build()
                    )
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
    fun ofCardFundingSourceChangeWebhook() {
        val cardFundingSourceChangeWebhook =
            CardFundingSourceChangeWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CARD.FUNDING_SOURCE_CHANGE"))
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardFundingSourceChangeWebhook(cardFundingSourceChangeWebhook)

        assertThat(unwrapWebhookEvent.agentActionWebhook()).isNull()
        assertThat(unwrapWebhookEvent.incomingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPaymentWebhook()).isNull()
        assertThat(unwrapWebhookEvent.testWebhookRequest()).isNull()
        assertThat(unwrapWebhookEvent.bulkUploadWebhook()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimedWebhook()).isNull()
        assertThat(unwrapWebhookEvent.customerWebhook()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatusWebhook()).isNull()
        assertThat(unwrapWebhookEvent.verificationWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardStateChangeWebhook()).isNull()
        assertThat(unwrapWebhookEvent.cardFundingSourceChangeWebhook())
            .isEqualTo(cardFundingSourceChangeWebhook)
    }

    @Test
    fun ofCardFundingSourceChangeWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCardFundingSourceChangeWebhook(
                CardFundingSourceChangeWebhook.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(JsonValue.from("CARD.FUNDING_SOURCE_CHANGE"))
                    .data(
                        Card.builder()
                            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                            .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                            .form(CardForm.VIRTUAL)
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                            )
                            .addFundingSource(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003"
                            )
                            .state(CardState.PENDING_KYC)
                            .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                            .brand(CardBrand.VISA)
                            .currency("USD")
                            .expMonth(12L)
                            .expYear(2029L)
                            .issuerRef("lithic_card_4f8d3a2b1c")
                            .last4("4242")
                            .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                            .platformCardId("card-emp-aary-001")
                            .stateReason(CardStateReason.ISSUER_REJECTED)
                            .build()
                    )
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
