// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.LandingPageDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Landing Page Detail Request.
 */
public class LandingPageDetailRequest extends BaseRequest<LandingPageDetail> {
	
    /**
     * The request for the LandingPageDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LandingPageDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LandingPageDetail.class);
    }

    /**
     * Gets the LandingPageDetail from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LandingPageDetail> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the LandingPageDetail from the service
     *
     * @return the LandingPageDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LandingPageDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LandingPageDetail> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public LandingPageDetail delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this LandingPageDetail with a source
     *
     * @param sourceLandingPageDetail the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LandingPageDetail> patchAsync(@Nonnull final LandingPageDetail sourceLandingPageDetail) {
        return sendAsync(HttpMethod.PATCH, sourceLandingPageDetail);
    }

    /**
     * Patches this LandingPageDetail with a source
     *
     * @param sourceLandingPageDetail the source object with updates
     * @return the updated LandingPageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LandingPageDetail patch(@Nonnull final LandingPageDetail sourceLandingPageDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceLandingPageDetail);
    }

    /**
     * Creates a LandingPageDetail with a new object
     *
     * @param newLandingPageDetail the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LandingPageDetail> postAsync(@Nonnull final LandingPageDetail newLandingPageDetail) {
        return sendAsync(HttpMethod.POST, newLandingPageDetail);
    }

    /**
     * Creates a LandingPageDetail with a new object
     *
     * @param newLandingPageDetail the new object to create
     * @return the created LandingPageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LandingPageDetail post(@Nonnull final LandingPageDetail newLandingPageDetail) throws ClientException {
        return send(HttpMethod.POST, newLandingPageDetail);
    }

    /**
     * Creates a LandingPageDetail with a new object
     *
     * @param newLandingPageDetail the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LandingPageDetail> putAsync(@Nonnull final LandingPageDetail newLandingPageDetail) {
        return sendAsync(HttpMethod.PUT, newLandingPageDetail);
    }

    /**
     * Creates a LandingPageDetail with a new object
     *
     * @param newLandingPageDetail the object to create/update
     * @return the created LandingPageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LandingPageDetail put(@Nonnull final LandingPageDetail newLandingPageDetail) throws ClientException {
        return send(HttpMethod.PUT, newLandingPageDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public LandingPageDetailRequest select(@Nonnull final String value) {
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
     public LandingPageDetailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

