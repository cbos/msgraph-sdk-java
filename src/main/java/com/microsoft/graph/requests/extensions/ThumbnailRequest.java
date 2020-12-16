// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Thumbnail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Request.
 */
public class ThumbnailRequest extends BaseRequest<Thumbnail> {
	
    /**
     * The request for the Thumbnail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Thumbnail.class);
    }

    /**
     * Gets the Thumbnail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Thumbnail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Thumbnail from the service
     *
     * @return the Thumbnail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Thumbnail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Thumbnail> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Thumbnail sourceThumbnail, @Nonnull final ICallback<? super Thumbnail> callback) {
        send(HttpMethod.PATCH, callback, sourceThumbnail);
    }

    /**
     * Patches this Thumbnail with a source
     *
     * @param sourceThumbnail the source object with updates
     * @return the updated Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Thumbnail patch(@Nonnull final Thumbnail sourceThumbnail) throws ClientException {
        return send(HttpMethod.PATCH, sourceThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Thumbnail newThumbnail, @Nonnull final ICallback<? super Thumbnail> callback) {
        send(HttpMethod.POST, callback, newThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     *
     * @param newThumbnail the new object to create
     * @return the created Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Thumbnail post(@Nonnull final Thumbnail newThumbnail) throws ClientException {
        return send(HttpMethod.POST, newThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     *
     * @param newThumbnail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Thumbnail newThumbnail, @Nonnull final ICallback<? super Thumbnail> callback) {
        send(HttpMethod.PUT, callback, newThumbnail);
    }

    /**
     * Creates a Thumbnail with a new object
     *
     * @param newThumbnail the object to create/update
     * @return the created Thumbnail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Thumbnail put(@Nonnull final Thumbnail newThumbnail) throws ClientException {
        return send(HttpMethod.PUT, newThumbnail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ThumbnailRequest select(@Nonnull final String value) {
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
     public ThumbnailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

