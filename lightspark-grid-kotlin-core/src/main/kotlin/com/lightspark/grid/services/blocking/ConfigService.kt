// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.config.ConfigRetrieveParams
import com.lightspark.grid.models.config.ConfigUpdateParams
import com.lightspark.grid.models.config.PlatformConfig
import com.lightspark.grid.models.config.PlatformConfigUpdateRequest

/**
 * Platform configuration endpoints for managing global settings. You can also configure these
 * settings in the Grid dashboard.
 */
interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService

    /** Retrieve the current platform configuration */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlatformConfig

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): PlatformConfig =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /** Update the platform configuration settings */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlatformConfig

    /** @see update */
    fun update(
        platformConfigUpdateRequest: PlatformConfigUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlatformConfig =
        update(
            ConfigUpdateParams.builder()
                .platformConfigUpdateRequest(platformConfigUpdateRequest)
                .build(),
            requestOptions,
        )

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /config`, but is otherwise the same as
         * [ConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlatformConfig>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<PlatformConfig> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /config`, but is otherwise the same as
         * [ConfigService.update].
         */
        @MustBeClosed
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlatformConfig>

        /** @see update */
        @MustBeClosed
        fun update(
            platformConfigUpdateRequest: PlatformConfigUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlatformConfig> =
            update(
                ConfigUpdateParams.builder()
                    .platformConfigUpdateRequest(platformConfigUpdateRequest)
                    .build(),
                requestOptions,
            )
    }
}
