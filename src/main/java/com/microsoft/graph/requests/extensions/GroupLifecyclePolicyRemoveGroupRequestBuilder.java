// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRemoveGroupRequest;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicyRemoveGroupBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Remove Group Request Builder.
 */
public class GroupLifecyclePolicyRemoveGroupRequestBuilder extends BaseActionRequestBuilder<Boolean> {

    private GroupLifecyclePolicyRemoveGroupBody body;
    /**
     * The request builder for this GroupLifecyclePolicyRemoveGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupLifecyclePolicyRemoveGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupLifecyclePolicyRemoveGroupBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupLifecyclePolicyRemoveGroupRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupLifecyclePolicyRemoveGroupRequest instance
     */
    @Nonnull
    public GroupLifecyclePolicyRemoveGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupLifecyclePolicyRemoveGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupLifecyclePolicyRemoveGroupRequest instance
     */
    @Nonnull
    public GroupLifecyclePolicyRemoveGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupLifecyclePolicyRemoveGroupRequest request = new GroupLifecyclePolicyRemoveGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
