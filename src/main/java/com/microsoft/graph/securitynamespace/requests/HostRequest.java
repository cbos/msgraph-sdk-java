// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.Host;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Request.
 */
public class HostRequest extends BaseRequest<Host> {
	
    /**
     * The request for the Host
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public HostRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Host> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Host
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Host.class);
    }

    /**
     * Gets the Host from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Host> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Host from the service
     *
     * @return the Host from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Host get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Host> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Host delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Host with a source
     *
     * @param sourceHost the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Host> patchAsync(@Nonnull final Host sourceHost) {
        return sendAsync(HttpMethod.PATCH, sourceHost);
    }

    /**
     * Patches this Host with a source
     *
     * @param sourceHost the source object with updates
     * @return the updated Host
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Host patch(@Nonnull final Host sourceHost) throws ClientException {
        return send(HttpMethod.PATCH, sourceHost);
    }

    /**
     * Creates a Host with a new object
     *
     * @param newHost the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Host> postAsync(@Nonnull final Host newHost) {
        return sendAsync(HttpMethod.POST, newHost);
    }

    /**
     * Creates a Host with a new object
     *
     * @param newHost the new object to create
     * @return the created Host
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Host post(@Nonnull final Host newHost) throws ClientException {
        return send(HttpMethod.POST, newHost);
    }

    /**
     * Creates a Host with a new object
     *
     * @param newHost the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Host> putAsync(@Nonnull final Host newHost) {
        return sendAsync(HttpMethod.PUT, newHost);
    }

    /**
     * Creates a Host with a new object
     *
     * @param newHost the object to create/update
     * @return the created Host
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Host put(@Nonnull final Host newHost) throws ClientException {
        return send(HttpMethod.PUT, newHost);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public HostRequest select(@Nonnull final String value) {
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
     public HostRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

