// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.UnclassifiedArtifact;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unclassified Artifact Request.
 */
public class UnclassifiedArtifactRequest extends BaseRequest<UnclassifiedArtifact> {
	
    /**
     * The request for the UnclassifiedArtifact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnclassifiedArtifactRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnclassifiedArtifact.class);
    }

    /**
     * Gets the UnclassifiedArtifact from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnclassifiedArtifact> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnclassifiedArtifact from the service
     *
     * @return the UnclassifiedArtifact from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnclassifiedArtifact get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnclassifiedArtifact> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnclassifiedArtifact delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnclassifiedArtifact with a source
     *
     * @param sourceUnclassifiedArtifact the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnclassifiedArtifact> patchAsync(@Nonnull final UnclassifiedArtifact sourceUnclassifiedArtifact) {
        return sendAsync(HttpMethod.PATCH, sourceUnclassifiedArtifact);
    }

    /**
     * Patches this UnclassifiedArtifact with a source
     *
     * @param sourceUnclassifiedArtifact the source object with updates
     * @return the updated UnclassifiedArtifact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnclassifiedArtifact patch(@Nonnull final UnclassifiedArtifact sourceUnclassifiedArtifact) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnclassifiedArtifact);
    }

    /**
     * Creates a UnclassifiedArtifact with a new object
     *
     * @param newUnclassifiedArtifact the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnclassifiedArtifact> postAsync(@Nonnull final UnclassifiedArtifact newUnclassifiedArtifact) {
        return sendAsync(HttpMethod.POST, newUnclassifiedArtifact);
    }

    /**
     * Creates a UnclassifiedArtifact with a new object
     *
     * @param newUnclassifiedArtifact the new object to create
     * @return the created UnclassifiedArtifact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnclassifiedArtifact post(@Nonnull final UnclassifiedArtifact newUnclassifiedArtifact) throws ClientException {
        return send(HttpMethod.POST, newUnclassifiedArtifact);
    }

    /**
     * Creates a UnclassifiedArtifact with a new object
     *
     * @param newUnclassifiedArtifact the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnclassifiedArtifact> putAsync(@Nonnull final UnclassifiedArtifact newUnclassifiedArtifact) {
        return sendAsync(HttpMethod.PUT, newUnclassifiedArtifact);
    }

    /**
     * Creates a UnclassifiedArtifact with a new object
     *
     * @param newUnclassifiedArtifact the object to create/update
     * @return the created UnclassifiedArtifact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnclassifiedArtifact put(@Nonnull final UnclassifiedArtifact newUnclassifiedArtifact) throws ClientException {
        return send(HttpMethod.PUT, newUnclassifiedArtifact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnclassifiedArtifactRequest select(@Nonnull final String value) {
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
     public UnclassifiedArtifactRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

