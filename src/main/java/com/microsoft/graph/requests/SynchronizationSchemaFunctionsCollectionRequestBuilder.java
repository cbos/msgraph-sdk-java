// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttributeMappingFunctionSchema;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SynchronizationSchemaFunctionsCollectionRequestBuilder;
import com.microsoft.graph.requests.SynchronizationSchemaFunctionsCollectionRequest;
import com.microsoft.graph.requests.SynchronizationSchemaFunctionsCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Functions Collection Request Builder.
 */
public class SynchronizationSchemaFunctionsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AttributeMappingFunctionSchema, SynchronizationSchemaFunctionsCollectionRequestBuilder, SynchronizationSchemaFunctionsCollectionResponse, SynchronizationSchemaFunctionsCollectionPage, SynchronizationSchemaFunctionsCollectionRequest> {

    /**
     * The request builder for this collection of SynchronizationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationSchemaFunctionsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationSchemaFunctionsCollectionRequestBuilder.class, SynchronizationSchemaFunctionsCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SynchronizationSchemaFunctionsCollectionRequest instance
     */
    @Override
    @Nonnull
    public SynchronizationSchemaFunctionsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SynchronizationSchemaFunctionsCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
