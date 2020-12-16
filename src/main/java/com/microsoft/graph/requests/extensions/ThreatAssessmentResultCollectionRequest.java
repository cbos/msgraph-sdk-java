// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionResponse;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Collection Request.
 */
public class ThreatAssessmentResultCollectionRequest extends BaseCollectionRequest<ThreatAssessmentResult, ThreatAssessmentResultCollectionResponse, ThreatAssessmentResultCollectionPage> {

    /**
     * The request builder for this collection of ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResultCollectionResponse.class, ThreatAssessmentResultCollectionPage.class, ThreatAssessmentResultCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ThreatAssessmentResult
     * @param newThreatAssessmentResult the ThreatAssessmentResult to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult, @Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newThreatAssessmentResult, callback);
    }

    /**
     * Creates a new ThreatAssessmentResult
     * @param newThreatAssessmentResult the ThreatAssessmentResult to create
     * @return the newly created object
     */
    @Nonnull
    public ThreatAssessmentResult post(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newThreatAssessmentResult);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

