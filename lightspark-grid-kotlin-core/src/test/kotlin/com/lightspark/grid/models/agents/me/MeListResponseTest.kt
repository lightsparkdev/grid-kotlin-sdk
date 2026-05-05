// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeListResponseTest {

    @Test
    fun create() {
        val meListResponse =
            MeListResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    MeListResponse.Policy.builder()
                        .defaultExecutionMode(MeListResponse.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(MeListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            MeListResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            MeListResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    MeListResponse.Policy.AccountRestrictions.AccountRule.builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            MeListResponse.Policy.AccountRestrictions.AccountRule
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
                            MeListResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    MeListResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        assertThat(meListResponse.id()).isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(meListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(meListResponse.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(meListResponse.isConnected()).isEqualTo(true)
        assertThat(meListResponse.isPaused()).isEqualTo(false)
        assertThat(meListResponse.name()).isEqualTo("Payroll Automation Agent")
        assertThat(meListResponse.policy())
            .isEqualTo(
                MeListResponse.Policy.builder()
                    .defaultExecutionMode(MeListResponse.Policy.DefaultExecutionMode.AUTO)
                    .addPermission(MeListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                    .spendingLimits(
                        MeListResponse.Policy.SpendingLimits.builder()
                            .currency("USD")
                            .perTransactionLimit(50000L)
                            .dailyLimit(500000L)
                            .dailyTransactionLimit(10L)
                            .monthlyLimit(5000000L)
                            .build()
                    )
                    .accountRestrictions(
                        MeListResponse.Policy.AccountRestrictions.builder()
                            .addAccountRule(
                                MeListResponse.Policy.AccountRestrictions.AccountRule.builder()
                                    .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                    .executionMode(
                                        MeListResponse.Policy.AccountRestrictions.AccountRule
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
                        MeListResponse.Policy.ApprovalThresholds.builder()
                            .amount(100000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(meListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
        assertThat(meListResponse.usage())
            .isEqualTo(
                MeListResponse.Usage.builder()
                    .dailySpend(150000L)
                    .dailyTransactionCount(3L)
                    .monthlySpend(750000L)
                    .dailyResetDate(LocalDate.parse("2025-07-22"))
                    .monthlyResetMonth("2025-08")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meListResponse =
            MeListResponse.builder()
                .id("Agent:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .isConnected(true)
                .isPaused(false)
                .name("Payroll Automation Agent")
                .policy(
                    MeListResponse.Policy.builder()
                        .defaultExecutionMode(MeListResponse.Policy.DefaultExecutionMode.AUTO)
                        .addPermission(MeListResponse.Policy.Permission.VIEW_TRANSACTIONS)
                        .spendingLimits(
                            MeListResponse.Policy.SpendingLimits.builder()
                                .currency("USD")
                                .perTransactionLimit(50000L)
                                .dailyLimit(500000L)
                                .dailyTransactionLimit(10L)
                                .monthlyLimit(5000000L)
                                .build()
                        )
                        .accountRestrictions(
                            MeListResponse.Policy.AccountRestrictions.builder()
                                .addAccountRule(
                                    MeListResponse.Policy.AccountRestrictions.AccountRule.builder()
                                        .accountId("Account:019542f5-b3e7-1d02-0000-000000000001")
                                        .executionMode(
                                            MeListResponse.Policy.AccountRestrictions.AccountRule
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
                            MeListResponse.Policy.ApprovalThresholds.builder()
                                .amount(100000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                .usage(
                    MeListResponse.Usage.builder()
                        .dailySpend(150000L)
                        .dailyTransactionCount(3L)
                        .monthlySpend(750000L)
                        .dailyResetDate(LocalDate.parse("2025-07-22"))
                        .monthlyResetMonth("2025-08")
                        .build()
                )
                .build()

        val roundtrippedMeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meListResponse),
                jacksonTypeRef<MeListResponse>(),
            )

        assertThat(roundtrippedMeListResponse).isEqualTo(meListResponse)
    }
}
