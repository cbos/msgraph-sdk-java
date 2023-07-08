// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.IntelligenceProfile;
import com.microsoft.graph.security.models.IntelligenceProfileIndicator;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intelligence Profile Indicator Collection With References Request Builder.
 */
public class IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<IntelligenceProfileIndicator, IntelligenceProfileIndicatorWithReferenceRequest, IntelligenceProfileIndicatorReferenceRequestBuilder, IntelligenceProfileIndicatorWithReferenceRequestBuilder, IntelligenceProfileIndicatorCollectionResponse, IntelligenceProfileIndicatorCollectionWithReferencesPage, IntelligenceProfileIndicatorCollectionReferenceRequest, IntelligenceProfileIndicatorCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of IntelligenceProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IntelligenceProfileIndicatorReferenceRequestBuilder.class, IntelligenceProfileIndicatorCollectionReferenceRequest.class, IntelligenceProfileIndicatorCollectionReferenceRequestBuilder.class);
    }
}
