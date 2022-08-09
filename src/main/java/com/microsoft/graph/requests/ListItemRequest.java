// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ListItem;
import com.microsoft.graph.models.ItemActivityStat;
import com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DocumentSetVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.DocumentSetVersionRequestBuilder;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.FieldValueSetRequestBuilder;
import com.microsoft.graph.requests.ListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.ListItemVersionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Request.
 */
public class ListItemRequest extends BaseRequest<ListItem> {
	
    /**
     * The request for the ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItem.class);
    }

    /**
     * Gets the ListItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ListItem from the service
     *
     * @return the ListItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ListItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ListItem with a source
     *
     * @param sourceListItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItem> patchAsync(@Nonnull final ListItem sourceListItem) {
        return sendAsync(HttpMethod.PATCH, sourceListItem);
    }

    /**
     * Patches this ListItem with a source
     *
     * @param sourceListItem the source object with updates
     * @return the updated ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItem patch(@Nonnull final ListItem sourceListItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItem> postAsync(@Nonnull final ListItem newListItem) {
        return sendAsync(HttpMethod.POST, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the new object to create
     * @return the created ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItem post(@Nonnull final ListItem newListItem) throws ClientException {
        return send(HttpMethod.POST, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItem> putAsync(@Nonnull final ListItem newListItem) {
        return sendAsync(HttpMethod.PUT, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the object to create/update
     * @return the created ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItem put(@Nonnull final ListItem newListItem) throws ClientException {
        return send(HttpMethod.PUT, newListItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ListItemRequest select(@Nonnull final String value) {
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
     public ListItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

