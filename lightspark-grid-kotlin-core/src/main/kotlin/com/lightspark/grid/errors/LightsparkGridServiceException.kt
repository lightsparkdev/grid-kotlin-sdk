// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.errors

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.http.Headers

abstract class LightsparkGridServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LightsparkGridException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
