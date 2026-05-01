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
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"Webhook:019542f5-b3e7-1d02-0000-000000000007\",\"data\":{\"id\":\"AgentAction:019542f5-b3e7-1d02-0000-000000000099\",\"agentId\":\"Agent:019542f5-b3e7-1d02-0000-000000000042\",\"createdAt\":\"2025-10-03T15:00:00Z\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000010\",\"platformCustomerId\":\"user-a1b2c3\",\"status\":\"PENDING_APPROVAL\",\"type\":\"EXECUTE_QUOTE\",\"updatedAt\":\"2025-10-03T15:02:00Z\",\"quote\":{\"id\":\"Quote:019542f5-b3e7-1d02-0000-000000000006\",\"createdAt\":\"2025-10-03T12:00:00Z\",\"destination\":{\"accountId\":\"ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\",\"destinationType\":\"ACCOUNT\",\"paymentRail\":\"ACH\"},\"exchangeRate\":1,\"expiresAt\":\"2025-10-03T12:05:00Z\",\"feesIncluded\":10,\"receivingCurrency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"},\"sendingCurrency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"},\"source\":{\"accountId\":\"InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceType\":\"ACCOUNT\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000001\"},\"status\":\"PENDING\",\"totalReceivingAmount\":1000,\"totalSendingAmount\":123010,\"transactionId\":\"Transaction:019542f5-b3e7-1d02-0000-000000000005\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"paymentInstructions\":[{\"accountOrWalletInfo\":{\"accountNumber\":\"1234567890\",\"accountType\":\"USD_ACCOUNT\",\"paymentRails\":[\"ACH\",\"WIRE\"],\"routingNumber\":\"021000021\",\"reference\":\"UMA-Q12345-REF\"},\"instructionsNotes\":\"Include reference UMA-Q12345-REF in memo\",\"isPlatformAccount\":true},{\"accountOrWalletInfo\":{\"accountType\":\"SPARK_WALLET\",\"address\":\"spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu\",\"assetType\":\"BTC\",\"invoice\":\"lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs\"},\"instructionsNotes\":\"Please ensure the reference code is included in the payment memo/description field\",\"isPlatformAccount\":true}],\"rateDetails\":{\"counterpartyFixedFee\":10,\"counterpartyMultiplier\":1.08,\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003}},\"rejectionReason\":\"Transaction amount exceeds customer's current risk limit.\",\"transaction\":{\"id\":\"Transaction:019542f5-b3e7-1d02-0000-000000000004\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000001\",\"destination\":{\"accountId\":\"ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\",\"destinationType\":\"ACCOUNT\"},\"platformCustomerId\":\"18d3e5f7b4a9c2\",\"receivedAmount\":{\"amount\":12550,\"currency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"}},\"status\":\"CREATED\",\"type\":\"INCOMING\",\"agentId\":\"Agent:019542f5-b3e7-1d02-0000-000000000042\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"createdAt\":\"2025-08-15T14:25:18Z\",\"description\":\"Payment for invoice #1234\",\"failureReason\":\"LNURLP_FAILED\",\"rateDetails\":{\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003},\"reconciliationInstructions\":{\"reference\":\"UMA-Q12345-REF\"},\"settledAt\":\"2025-08-15T14:30:00Z\",\"source\":{\"accountId\":\"InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceType\":\"ACCOUNT\"},\"updatedAt\":\"2025-08-15T14:30:00Z\"},\"transferDetails\":{\"amount\":50000,\"currency\":\"USD\",\"destinationAccountId\":\"ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceAccountId\":\"InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\"}},\"timestamp\":\"2025-08-15T14:32:00Z\",\"type\":\"AGENT_ACTION.PENDING_APPROVAL\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookService.unwrap(payload).validate()
    }
}
