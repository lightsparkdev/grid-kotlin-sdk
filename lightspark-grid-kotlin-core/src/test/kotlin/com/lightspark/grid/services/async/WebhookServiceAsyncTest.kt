// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.core.http.Headers
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Test
    suspend fun unwrap() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"id\":\"Webhook:019542f5-b3e7-1d02-0000-000000000007\",\"data\":{\"id\":\"Transaction:019542f5-b3e7-1d02-0000-000000000004\",\"customerId\":\"Customer:019542f5-b3e7-1d02-0000-000000000001\",\"destination\":{\"accountId\":\"ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123\",\"destinationType\":\"ACCOUNT\"},\"platformCustomerId\":\"18d3e5f7b4a9c2\",\"receivedAmount\":{\"amount\":12550,\"currency\":{\"code\":\"USD\",\"decimals\":2,\"name\":\"United States Dollar\",\"symbol\":\"\$\"}},\"status\":\"CREATED\",\"type\":\"INCOMING\",\"counterpartyInformation\":{\"FULL_NAME\":\"bar\",\"BIRTH_DATE\":\"bar\",\"NATIONALITY\":\"bar\"},\"createdAt\":\"2025-08-15T14:25:18Z\",\"description\":\"Payment for invoice #1234\",\"failureReason\":\"LNURLP_FAILED\",\"rateDetails\":{\"gridApiFixedFee\":10,\"gridApiMultiplier\":0.925,\"gridApiVariableFeeAmount\":30,\"gridApiVariableFeeRate\":0.003},\"reconciliationInstructions\":{\"reference\":\"UMA-Q12345-REF\"},\"settledAt\":\"2025-08-15T14:30:00Z\",\"source\":{\"accountId\":\"InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965\",\"sourceType\":\"ACCOUNT\"},\"updatedAt\":\"2025-08-15T14:30:00Z\",\"requestedReceiverCustomerInfoFields\":[{\"mandatory\":true,\"name\":\"FULL_NAME\"}]},\"timestamp\":\"2025-08-15T14:32:00Z\",\"type\":\"INCOMING_PAYMENT.PENDING\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookServiceAsync.unwrap(payload).validate()
    }
}
