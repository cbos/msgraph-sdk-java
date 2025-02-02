// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DelegatedAdminRelationshipRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Admin Relationship Request Request.
 */
public class DelegatedAdminRelationshipRequestRequest extends BaseRequest<DelegatedAdminRelationshipRequest> {
	
    /**
     * The request for the DelegatedAdminRelationshipRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DelegatedAdminRelationshipRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DelegatedAdminRelationshipRequest.class);
    }

    /**
     * Gets the DelegatedAdminRelationshipRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DelegatedAdminRelationshipRequest> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DelegatedAdminRelationshipRequest from the service
     *
     * @return the DelegatedAdminRelationshipRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DelegatedAdminRelationshipRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DelegatedAdminRelationshipRequest> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DelegatedAdminRelationshipRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DelegatedAdminRelationshipRequest with a source
     *
     * @param sourceDelegatedAdminRelationshipRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DelegatedAdminRelationshipRequest> patchAsync(@Nonnull final DelegatedAdminRelationshipRequest sourceDelegatedAdminRelationshipRequest) {
        return sendAsync(HttpMethod.PATCH, sourceDelegatedAdminRelationshipRequest);
    }

    /**
     * Patches this DelegatedAdminRelationshipRequest with a source
     *
     * @param sourceDelegatedAdminRelationshipRequest the source object with updates
     * @return the updated DelegatedAdminRelationshipRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DelegatedAdminRelationshipRequest patch(@Nonnull final DelegatedAdminRelationshipRequest sourceDelegatedAdminRelationshipRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceDelegatedAdminRelationshipRequest);
    }

    /**
     * Creates a DelegatedAdminRelationshipRequest with a new object
     *
     * @param newDelegatedAdminRelationshipRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DelegatedAdminRelationshipRequest> postAsync(@Nonnull final DelegatedAdminRelationshipRequest newDelegatedAdminRelationshipRequest) {
        return sendAsync(HttpMethod.POST, newDelegatedAdminRelationshipRequest);
    }

    /**
     * Creates a DelegatedAdminRelationshipRequest with a new object
     *
     * @param newDelegatedAdminRelationshipRequest the new object to create
     * @return the created DelegatedAdminRelationshipRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DelegatedAdminRelationshipRequest post(@Nonnull final DelegatedAdminRelationshipRequest newDelegatedAdminRelationshipRequest) throws ClientException {
        return send(HttpMethod.POST, newDelegatedAdminRelationshipRequest);
    }

    /**
     * Creates a DelegatedAdminRelationshipRequest with a new object
     *
     * @param newDelegatedAdminRelationshipRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DelegatedAdminRelationshipRequest> putAsync(@Nonnull final DelegatedAdminRelationshipRequest newDelegatedAdminRelationshipRequest) {
        return sendAsync(HttpMethod.PUT, newDelegatedAdminRelationshipRequest);
    }

    /**
     * Creates a DelegatedAdminRelationshipRequest with a new object
     *
     * @param newDelegatedAdminRelationshipRequest the object to create/update
     * @return the created DelegatedAdminRelationshipRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DelegatedAdminRelationshipRequest put(@Nonnull final DelegatedAdminRelationshipRequest newDelegatedAdminRelationshipRequest) throws ClientException {
        return send(HttpMethod.PUT, newDelegatedAdminRelationshipRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DelegatedAdminRelationshipRequestRequest select(@Nonnull final String value) {
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
     public DelegatedAdminRelationshipRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

