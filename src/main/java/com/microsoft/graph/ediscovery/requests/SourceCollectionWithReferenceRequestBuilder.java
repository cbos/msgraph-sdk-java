// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.EstimateStatisticsOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Source Collection With Reference Request Builder.
 */
public class SourceCollectionWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<SourceCollection, SourceCollectionWithReferenceRequest, SourceCollectionReferenceRequestBuilder> {

    /**
     * The request builder for the SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SourceCollectionWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SourceCollectionWithReferenceRequest.class, SourceCollectionReferenceRequestBuilder.class);
    }
}
