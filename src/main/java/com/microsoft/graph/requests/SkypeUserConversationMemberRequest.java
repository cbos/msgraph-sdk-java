// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SkypeUserConversationMember;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ActionResultPart;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype User Conversation Member Request.
 */
public class SkypeUserConversationMemberRequest extends BaseRequest<SkypeUserConversationMember> {
	
    /**
     * The request for the SkypeUserConversationMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeUserConversationMemberRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeUserConversationMember.class);
    }

    /**
     * Gets the SkypeUserConversationMember from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeUserConversationMember> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SkypeUserConversationMember from the service
     *
     * @return the SkypeUserConversationMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeUserConversationMember get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeUserConversationMember> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SkypeUserConversationMember delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SkypeUserConversationMember with a source
     *
     * @param sourceSkypeUserConversationMember the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeUserConversationMember> patchAsync(@Nonnull final SkypeUserConversationMember sourceSkypeUserConversationMember) {
        return sendAsync(HttpMethod.PATCH, sourceSkypeUserConversationMember);
    }

    /**
     * Patches this SkypeUserConversationMember with a source
     *
     * @param sourceSkypeUserConversationMember the source object with updates
     * @return the updated SkypeUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeUserConversationMember patch(@Nonnull final SkypeUserConversationMember sourceSkypeUserConversationMember) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeUserConversationMember);
    }

    /**
     * Creates a SkypeUserConversationMember with a new object
     *
     * @param newSkypeUserConversationMember the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeUserConversationMember> postAsync(@Nonnull final SkypeUserConversationMember newSkypeUserConversationMember) {
        return sendAsync(HttpMethod.POST, newSkypeUserConversationMember);
    }

    /**
     * Creates a SkypeUserConversationMember with a new object
     *
     * @param newSkypeUserConversationMember the new object to create
     * @return the created SkypeUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeUserConversationMember post(@Nonnull final SkypeUserConversationMember newSkypeUserConversationMember) throws ClientException {
        return send(HttpMethod.POST, newSkypeUserConversationMember);
    }

    /**
     * Creates a SkypeUserConversationMember with a new object
     *
     * @param newSkypeUserConversationMember the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeUserConversationMember> putAsync(@Nonnull final SkypeUserConversationMember newSkypeUserConversationMember) {
        return sendAsync(HttpMethod.PUT, newSkypeUserConversationMember);
    }

    /**
     * Creates a SkypeUserConversationMember with a new object
     *
     * @param newSkypeUserConversationMember the object to create/update
     * @return the created SkypeUserConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeUserConversationMember put(@Nonnull final SkypeUserConversationMember newSkypeUserConversationMember) throws ClientException {
        return send(HttpMethod.PUT, newSkypeUserConversationMember);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SkypeUserConversationMemberRequest select(@Nonnull final String value) {
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
     public SkypeUserConversationMemberRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

