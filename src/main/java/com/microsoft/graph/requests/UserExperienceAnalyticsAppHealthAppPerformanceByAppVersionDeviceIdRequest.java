// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By App Version Device Id Request.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdRequest extends BaseRequest<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> {
	
    /**
     * The request for the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId.class);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId from the service
     *
     * @return the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> patchAsync(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId patch(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> postAsync(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the new object to create
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId post(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> putAsync(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId put(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

