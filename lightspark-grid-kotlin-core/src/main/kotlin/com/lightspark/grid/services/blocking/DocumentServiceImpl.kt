// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

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
import com.lightspark.grid.core.http.multipartFormData
import com.lightspark.grid.core.http.parseable
import com.lightspark.grid.core.prepare
import com.lightspark.grid.models.documents.DocumentDeleteParams
import com.lightspark.grid.models.documents.DocumentListPage
import com.lightspark.grid.models.documents.DocumentListPageResponse
import com.lightspark.grid.models.documents.DocumentListParams
import com.lightspark.grid.models.documents.DocumentReplaceParams
import com.lightspark.grid.models.documents.DocumentReplaceResponse
import com.lightspark.grid.models.documents.DocumentRetrieveParams
import com.lightspark.grid.models.documents.DocumentRetrieveResponse
import com.lightspark.grid.models.documents.DocumentUploadParams
import com.lightspark.grid.models.documents.DocumentUploadResponse

/**
 * Endpoints for uploading and managing verification documents for customers and beneficial owners.
 * Supports KYC and KYB document requirements.
 */
class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService =
        DocumentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentRetrieveResponse =
        // get /documents/{documentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentListPage =
        // get /documents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DocumentDeleteParams, requestOptions: RequestOptions) {
        // delete /documents/{documentId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun replace(
        params: DocumentReplaceParams,
        requestOptions: RequestOptions,
    ): DocumentReplaceResponse =
        // put /documents/{documentId}
        withRawResponse().replace(params, requestOptions).parse()

    override fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions,
    ): DocumentUploadResponse =
        // post /documents
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentService.WithRawResponse =
            DocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<DocumentRetrieveResponse> =
            jsonHandler<DocumentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<DocumentListPageResponse> =
            jsonHandler<DocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DocumentListPage.builder()
                            .service(DocumentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val replaceHandler: Handler<DocumentReplaceResponse> =
            jsonHandler<DocumentReplaceResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: DocumentReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentReplaceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<DocumentUploadResponse> =
            jsonHandler<DocumentUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentUploadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
