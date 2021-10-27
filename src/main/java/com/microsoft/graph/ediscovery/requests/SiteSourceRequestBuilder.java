// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SiteSource;
import com.microsoft.graph.requests.SiteWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Source Request Builder.
 */
public class SiteSourceRequestBuilder extends BaseRequestBuilder<SiteSource> {

    /**
     * The request builder for the SiteSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteSourceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SiteSourceRequest instance
     */
    @Nonnull
    public SiteSourceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SiteSourceRequest instance
     */
    @Nonnull
    public SiteSourceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.SiteSourceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Site
     *
     * @return the SiteWithReferenceRequestBuilder instance
     */
    @Nonnull
    public SiteWithReferenceRequestBuilder site() {
        return new SiteWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("site"), getClient(), null);
    }
}
