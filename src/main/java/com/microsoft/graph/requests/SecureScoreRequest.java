// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SecureScore;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Request.
 */
public class SecureScoreRequest extends BaseRequest<SecureScore> {
	
    /**
     * The request for the SecureScore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecureScoreRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecureScore.class);
    }

    /**
     * Gets the SecureScore from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecureScore> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SecureScore from the service
     *
     * @return the SecureScore from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecureScore get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecureScore> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SecureScore delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SecureScore with a source
     *
     * @param sourceSecureScore the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecureScore> patchAsync(@Nonnull final SecureScore sourceSecureScore) {
        return sendAsync(HttpMethod.PATCH, sourceSecureScore);
    }

    /**
     * Patches this SecureScore with a source
     *
     * @param sourceSecureScore the source object with updates
     * @return the updated SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecureScore patch(@Nonnull final SecureScore sourceSecureScore) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecureScore> postAsync(@Nonnull final SecureScore newSecureScore) {
        return sendAsync(HttpMethod.POST, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the new object to create
     * @return the created SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecureScore post(@Nonnull final SecureScore newSecureScore) throws ClientException {
        return send(HttpMethod.POST, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecureScore> putAsync(@Nonnull final SecureScore newSecureScore) {
        return sendAsync(HttpMethod.PUT, newSecureScore);
    }

    /**
     * Creates a SecureScore with a new object
     *
     * @param newSecureScore the object to create/update
     * @return the created SecureScore
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecureScore put(@Nonnull final SecureScore newSecureScore) throws ClientException {
        return send(HttpMethod.PUT, newSecureScore);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SecureScoreRequest select(@Nonnull final String value) {
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
     public SecureScoreRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

