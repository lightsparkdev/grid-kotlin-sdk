// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.http.Headers
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Test
    fun unwrap() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"Webhook:019542f5-b3e7-1d02-0000-000000000007\",\"timestamp\":\"2025-08-15T14:32:00Z\",\"type\":\"AGENT_ACTION.PENDING_APPROVAL\",\"data\":{\"id\":\"AgentAction:019542f5-b3e7-1d02-0000-000000000099\",\"agentId\":\"Agent:019542f5-b3e7-1d02-0000-000000000042\",\"createdAt\":\"2025-10-03T15:00:00Z\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000010\",\"platformCustomerId\":\"user-a1b2c3\",\"status\":\"PENDING_APPROVAL\",\"type\":\"EXECUTE_QUOTE\",\"updatedAt\":\"2025-10-03T15:02:00Z\",\"quote\":{\"id\":\"Quote:019542f5-b3e7-1d02-0000-000000000006\",\"createdAt\":\"2025-10-03T12:00:00Z\",\"destination\":{},\"exchangeRate\":1,\"expiresAt\":\"2025-10-03T12:05:00Z\",\"feesIncluded\":10,\"receivingCurrency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"},\"sendingCurrency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"},\"source\":{},\"status\":\"PENDING\",\"totalReceivingAmount\":1000,\"totalSendingAmount\":123010,\"transactionId\":\"Transaction:019542f5-b3e7-1d02-0000-000000000005\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"paymentInstructions\":[{\"accountOrWalletInfo\":{\"accountType\":\"SLV_ACCOUNT\",\"paymentRails\":[\"BANK_TRANSFER\",\"MOBILE_MONEY\"],\"reference\":\"UMA-Q12345-REF\",\"accountNumber\":\"1234567890\",\"bankAccountType\":\"CHECKING\",\"bankName\":\"Chase Bank\",\"phoneNumber\":\"+50312345678\"},\"instructionsNotes\":\"Include reference UMA-Q12345-REF in memo\",\"isPlatformAccount\":true},{\"accountOrWalletInfo\":{\"accountType\":\"SLV_ACCOUNT\",\"paymentRails\":[\"BANK_TRANSFER\"],\"reference\":\"UMA-Q12345-REF\",\"accountNumber\":\"0123456789\",\"bankAccountType\":\"CHECKING\",\"bankName\":\"Banco Cuscatlan\",\"phoneNumber\":\"+50312345678\"},\"instructionsNotes\":\"Please ensure the reference code is included in the payment memo/description field\",\"isPlatformAccount\":true}],\"rateDetails\":{\"counterpartyFixedFee\":10,\"counterpartyMultiplier\":1.08,\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003}},\"rejectionReason\":\"Transaction amount exceeds customer's current risk limit.\",\"transaction\":{\"id\":\"Transaction:019542f5-b3e7-1d02-0000-000000000004\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000001\",\"destination\":{},\"platformCustomerId\":\"18d3e5f7b4a9c2\",\"receivedAmount\":{\"amount\":12550,\"currency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"}},\"status\":\"CREATED\",\"type\":\"INCOMING\",\"agentId\":\"Agent:019542f5-b3e7-1d02-0000-000000000042\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"createdAt\":\"2025-08-15T14:25:18Z\",\"description\":\"Payment for invoice #1234\",\"failureReason\":\"LNURLP_FAILED\",\"fees\":10,\"rateDetails\":{\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003},\"reconciliationInstructions\":{\"reference\":\"UMA-Q12345-REF\",\"transactionHash\":\"0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566\"},\"settledAt\":\"2025-08-15T14:30:00Z\",\"source\":{},\"updatedAt\":\"2025-08-15T14:30:00Z\"},\"transferDetails\":{\"amount\":50000,\"currency\":\"USD\",\"destinationAccountId\":\"ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceAccountId\":\"InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\"}}}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookService.unwrap(payload).validate()
    }
}
