// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents.me

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.handlers.emptyHandler
import com.lightspark.grid.core.handlers.errorBodyHandler
import com.lightspark.grid.core.handlers.errorHandler
import com.lightspark.grid.core.handlers.jsonHandler
import com.lightspark.grid.core.http.HttpMethod
import com.lightspark.grid.core.http.HttpRequest
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponse.Handler
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.core.http.json
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepareAsync
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountAddParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountDeleteParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountListPageAsync
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountListPageResponse
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountListParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountRetrieveParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
class ExternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalAccountServiceAsync {

    private val withRawResponse: ExternalAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ExternalAccountServiceAsync =
        ExternalAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // get /agents/me/external-accounts/{externalAccountId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): ExternalAccountListPageAsync =
        // get /agents/me/external-accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /agents/me/external-accounts/{externalAccountId}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun add(
        params: ExternalAccountAddParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // post /agents/me/external-accounts
        withRawResponse().add(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalAccountServiceAsync.WithRawResponse =
            ExternalAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalAccountId", params.externalAccountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "external-accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ExternalAccountListPageResponse> =
            jsonHandler<ExternalAccountListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ExternalAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "external-accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExternalAccountListPageAsync.builder()
                            .service(ExternalAccountServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalAccountId", params.externalAccountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "external-accounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val addHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper)

        override suspend fun add(
            params: ExternalAccountAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agents", "me", "external-accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
