// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.ReviewSetQuery;
import com.microsoft.graph.ediscovery.models.Tag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.ediscovery.models.ReviewSetQueryApplyTagsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Query Request Builder.
 */
public class ReviewSetQueryRequestBuilder extends BaseRequestBuilder<ReviewSetQuery> {

    /**
     * The request builder for the ReviewSetQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetQueryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReviewSetQueryRequest instance
     */
    @Nonnull
    public ReviewSetQueryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ReviewSetQueryRequest instance
     */
    @Nonnull
    public ReviewSetQueryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.ReviewSetQueryRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ReviewSetQueryApplyTagsRequestBuilder applyTags(@Nonnull final ReviewSetQueryApplyTagsParameterSet parameters) {
        return new ReviewSetQueryApplyTagsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.applyTags"), getClient(), null, parameters);
    }
}
