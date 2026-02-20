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
            "{\"timestamp\":\"2025-08-15T14:32:00Z\",\"transaction\":{\"id\":\"Transaction:019542f5-b3e7-1d02-0000-000000000004\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000001\",\"destination\":{\"accountId\":\"ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\",\"destinationType\":\"ACCOUNT\"},\"platformCustomerId\":\"18d3e5f7b4a9c2\",\"status\":\"CREATED\",\"type\":\"INCOMING\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"createdAt\":\"2025-08-15T14:25:18Z\",\"description\":\"Payment for invoice #1234\",\"settledAt\":\"2025-08-15T14:30:00Z\",\"updatedAt\":\"2025-08-15T14:30:00Z\",\"receivedAmount\":{\"amount\":12550,\"currency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"}},\"failureReason\":\"LNURLP_FAILED\",\"rateDetails\":{\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003},\"reconciliationInstructions\":{\"reference\":\"UMA-Q12345-REF\"},\"source\":{\"currency\":\"USD\",\"accountId\":\"InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceType\":\"ACCOUNT\"}},\"type\":\"INCOMING_PAYMENT\",\"webhookId\":\"Webhook:019542f5-b3e7-1d02-0000-000000000007\",\"requestedReceiverCustomerInfoFields\":[{\"mandatory\":true,\"name\":\"FULL_NAME\"}]}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookService.unwrap(payload).validate()
    }
}
