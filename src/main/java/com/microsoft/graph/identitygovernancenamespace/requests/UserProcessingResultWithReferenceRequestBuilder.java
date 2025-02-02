// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.UserProcessingResult;
import com.microsoft.graph.identitygovernance.models.UserSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Processing Result With Reference Request Builder.
 */
public class UserProcessingResultWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<UserProcessingResult, UserProcessingResultWithReferenceRequest, UserProcessingResultReferenceRequestBuilder> {

    /**
     * The request builder for the UserProcessingResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserProcessingResultWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserProcessingResultWithReferenceRequest.class, UserProcessingResultReferenceRequestBuilder.class);
    }
}
