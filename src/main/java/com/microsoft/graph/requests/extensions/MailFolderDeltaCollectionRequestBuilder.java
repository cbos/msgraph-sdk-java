// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailFolder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.MailFolderDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Delta Collection Request Builder.
 */
public class MailFolderDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<MailFolder, MailFolderDeltaCollectionRequestBuilder, MailFolderDeltaCollectionResponse, MailFolderDeltaCollectionPage, MailFolderDeltaCollectionRequest> {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailFolderDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailFolderDeltaCollectionRequestBuilder.class, MailFolderDeltaCollectionRequest.class);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MailFolderDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public MailFolderDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MailFolderDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
