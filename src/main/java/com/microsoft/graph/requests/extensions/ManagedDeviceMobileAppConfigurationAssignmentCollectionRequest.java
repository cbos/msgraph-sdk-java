// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Assignment Collection Request.
 */
public class ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest extends BaseCollectionRequest<ManagedDeviceMobileAppConfigurationAssignment, ManagedDeviceMobileAppConfigurationAssignmentCollectionResponse, ManagedDeviceMobileAppConfigurationAssignmentCollectionPage> {

    /**
     * The request builder for this collection of ManagedDeviceMobileAppConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationAssignmentCollectionResponse.class, ManagedDeviceMobileAppConfigurationAssignmentCollectionPage.class, ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ManagedDeviceMobileAppConfigurationAssignment
     * @param newManagedDeviceMobileAppConfigurationAssignment the ManagedDeviceMobileAppConfigurationAssignment to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationAssignment, callback);
    }

    /**
     * Creates a new ManagedDeviceMobileAppConfigurationAssignment
     * @param newManagedDeviceMobileAppConfigurationAssignment the ManagedDeviceMobileAppConfigurationAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationAssignment post(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest expand(@Nonnull final String value) {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest filter(@Nonnull final String value) {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest orderBy(@Nonnull final String value) {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest select(@Nonnull final String value) {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest top(final int value) {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest count() {
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
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

