// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.HostComponent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Component Request.
 */
public class HostComponentRequest extends BaseRequest<HostComponent> {
	
    /**
     * The request for the HostComponent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostComponentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HostComponent.class);
    }

    /**
     * Gets the HostComponent from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostComponent> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the HostComponent from the service
     *
     * @return the HostComponent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostComponent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostComponent> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public HostComponent delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this HostComponent with a source
     *
     * @param sourceHostComponent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostComponent> patchAsync(@Nonnull final HostComponent sourceHostComponent) {
        return sendAsync(HttpMethod.PATCH, sourceHostComponent);
    }

    /**
     * Patches this HostComponent with a source
     *
     * @param sourceHostComponent the source object with updates
     * @return the updated HostComponent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostComponent patch(@Nonnull final HostComponent sourceHostComponent) throws ClientException {
        return send(HttpMethod.PATCH, sourceHostComponent);
    }

    /**
     * Creates a HostComponent with a new object
     *
     * @param newHostComponent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostComponent> postAsync(@Nonnull final HostComponent newHostComponent) {
        return sendAsync(HttpMethod.POST, newHostComponent);
    }

    /**
     * Creates a HostComponent with a new object
     *
     * @param newHostComponent the new object to create
     * @return the created HostComponent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostComponent post(@Nonnull final HostComponent newHostComponent) throws ClientException {
        return send(HttpMethod.POST, newHostComponent);
    }

    /**
     * Creates a HostComponent with a new object
     *
     * @param newHostComponent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostComponent> putAsync(@Nonnull final HostComponent newHostComponent) {
        return sendAsync(HttpMethod.PUT, newHostComponent);
    }

    /**
     * Creates a HostComponent with a new object
     *
     * @param newHostComponent the object to create/update
     * @return the created HostComponent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostComponent put(@Nonnull final HostComponent newHostComponent) throws ClientException {
        return send(HttpMethod.PUT, newHostComponent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public HostComponentRequest select(@Nonnull final String value) {
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
     public HostComponentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

