// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.models.UserExperienceAnalyticsSummarizedBy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Request.
 */
public class UserExperienceAnalyticsDevicePerformanceRequest extends BaseRequest<UserExperienceAnalyticsDevicePerformance> {
	
    /**
     * The request for the UserExperienceAnalyticsDevicePerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDevicePerformanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDevicePerformance.class);
    }

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDevicePerformance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @return the UserExperienceAnalyticsDevicePerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDevicePerformance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDevicePerformance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsDevicePerformance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDevicePerformance> patchAsync(@Nonnull final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @return the updated UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDevicePerformance patch(@Nonnull final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDevicePerformance> postAsync(@Nonnull final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDevicePerformance post(@Nonnull final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDevicePerformance> putAsync(@Nonnull final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDevicePerformance put(@Nonnull final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsDevicePerformance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsDevicePerformanceRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsDevicePerformanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

