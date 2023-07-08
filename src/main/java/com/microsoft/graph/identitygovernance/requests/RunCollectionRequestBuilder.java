// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.Workflow;
import com.microsoft.graph.identitygovernance.models.Run;
import com.microsoft.graph.identitygovernance.models.RunSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.identitygovernance.requests.RunCollectionRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.RunRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.RunCollectionRequest;
import com.microsoft.graph.identitygovernance.requests.RunSummaryRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.identitygovernance.models.RunSummaryParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Run Collection Request Builder.
 */
public class RunCollectionRequestBuilder extends BaseCollectionRequestBuilder<Run, RunRequestBuilder, RunCollectionResponse, RunCollectionPage, RunCollectionRequest> {

    /**
     * The request builder for this collection of Workflow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RunCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RunRequestBuilder.class, RunCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public RunSummaryRequestBuilder summary(@Nonnull final RunSummaryParameterSet parameters) {
        return new RunSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.identityGovernance.summary"), getClient(), null, parameters);
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
