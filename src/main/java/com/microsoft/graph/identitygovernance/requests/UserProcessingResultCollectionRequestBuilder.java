// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.Run;
import com.microsoft.graph.identitygovernance.models.UserProcessingResult;
import com.microsoft.graph.identitygovernance.models.UserSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.UserProcessingResultRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionRequest;
import com.microsoft.graph.identitygovernance.requests.UserProcessingResultSummaryRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.identitygovernance.models.UserProcessingResultSummaryParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Processing Result Collection Request Builder.
 */
public class UserProcessingResultCollectionRequestBuilder extends BaseCollectionRequestBuilder<UserProcessingResult, UserProcessingResultRequestBuilder, UserProcessingResultCollectionResponse, UserProcessingResultCollectionPage, UserProcessingResultCollectionRequest> {

    /**
     * The request builder for this collection of Run
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserProcessingResultCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserProcessingResultRequestBuilder.class, UserProcessingResultCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserProcessingResultSummaryRequestBuilder summary(@Nonnull final UserProcessingResultSummaryParameterSet parameters) {
        return new UserProcessingResultSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.identityGovernance.summary"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
