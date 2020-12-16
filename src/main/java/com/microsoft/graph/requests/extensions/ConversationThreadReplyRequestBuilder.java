// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ConversationThreadReplyRequest;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.ConversationThreadReplyBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Reply Request Builder.
 */
public class ConversationThreadReplyRequestBuilder extends BaseActionRequestBuilder<ConversationThread> {

    private ConversationThreadReplyBody body;
    /**
     * The request builder for this ConversationThreadReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ConversationThreadReplyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ConversationThreadReplyBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ConversationThreadReplyRequest
     *
     * @param requestOptions the options for the request
     * @return the ConversationThreadReplyRequest instance
     */
    @Nonnull
    public ConversationThreadReplyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ConversationThreadReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ConversationThreadReplyRequest instance
     */
    @Nonnull
    public ConversationThreadReplyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ConversationThreadReplyRequest request = new ConversationThreadReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
