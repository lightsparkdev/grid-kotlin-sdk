// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceCodeRedeemResponseTest {

    @Test
    fun create() {
        val deviceCodeRedeemResponse =
            DeviceCodeRedeemResponse.builder()
                .accessToken("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .agentName("Payroll Automation Agent")
                .policy(
                    DeviceCodeRedeemResponse.Policy.builder()
                        .defaultExecutionMode(
                            DeviceCodeRedeemResponse.Policy.DefaultExecutionMode.AUTO
                        )
                        .addPermission(DeviceCodeRedeemResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            DeviceCodeRedeemResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            DeviceCodeRedeemResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    DeviceCodeRedeemResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            DeviceCodeRedeemResponse.Policy.AccountRestrictions
                                                .AccountRule
                                                .ExecutionMode
                                                .AUTO
                                        )
                                        .perTransactionLimit(10000L)
                                        .build()
                                )
                                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .build()
                        )
                        .approvalThresholds(
                            DeviceCodeRedeemResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(deviceCodeRedeemResponse.accessToken())
            .isEqualTo("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
        assertThat(deviceCodeRedeemResponse.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(deviceCodeRedeemResponse.agentName()).isEqualTo("Payroll Automation Agent")
        assertThat(deviceCodeRedeemResponse.policy())
            .isEqualTo(
                DeviceCodeRedeemResponse.Policy.builder()
                    .defaultExecutionMode(DeviceCodeRedeemResponse.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(DeviceCodeRedeemResponse.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        DeviceCodeRedeemResponse.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        DeviceCodeRedeemResponse.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                DeviceCodeRedeemResponse.Policy.AccountRestrictions.AccountRule
                                    .builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        DeviceCodeRedeemResponse.Policy.AccountRestrictions
                                            .AccountRule
                                            .ExecutionMode
                                            .AUTO
                                    )
                                    .perTransactionLimit(10000L)
                                    .build()
                            )
                            .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .approvalThresholds(
                        DeviceCodeRedeemResponse.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceCodeRedeemResponse =
            DeviceCodeRedeemResponse.builder()
                .accessToken("gat_ed0ad25881e234cc28fb2dec0a4fe64e4172a3b9")
                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .agentName("Payroll Automation Agent")
                .policy(
                    DeviceCodeRedeemResponse.Policy.builder()
                        .defaultExecutionMode(
                            DeviceCodeRedeemResponse.Policy.DefaultExecutionMode.AUTO
                        )
                        .addPermission(DeviceCodeRedeemResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            DeviceCodeRedeemResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            DeviceCodeRedeemResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    DeviceCodeRedeemResponse.Policy.AccountRestrictions.AccountRule
                                        .builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            DeviceCodeRedeemResponse.Policy.AccountRestrictions
                                                .AccountRule
                                                .ExecutionMode
                                                .AUTO
                                        )
                                        .perTransactionLimit(10000L)
                                        .build()
                                )
                                .addAllowedAccountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                .build()
                        )
                        .approvalThresholds(
                            DeviceCodeRedeemResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDeviceCodeRedeemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceCodeRedeemResponse),
                jacksonTypeRef<DeviceCodeRedeemResponse>(),
            )

        assertThat(roundtrippedDeviceCodeRedeemResponse).isEqualTo(deviceCodeRedeemResponse)
    }
}
