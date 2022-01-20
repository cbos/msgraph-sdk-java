// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServiceUpdateMessage;
import com.microsoft.graph.requests.ServiceAnnouncementAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.ServiceAnnouncementAttachmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Update Message Request Builder.
 */
public class ServiceUpdateMessageRequestBuilder extends BaseRequestBuilder<ServiceUpdateMessage> {

    /**
     * The request builder for the ServiceUpdateMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServiceUpdateMessageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ServiceUpdateMessageRequest instance
     */
    @Nonnull
    public ServiceUpdateMessageRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ServiceUpdateMessageRequest instance
     */
    @Nonnull
    public ServiceUpdateMessageRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ServiceUpdateMessageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ServiceAnnouncementAttachment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServiceAnnouncementAttachmentCollectionRequestBuilder attachments() {
        return new ServiceAnnouncementAttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    /**
     * Gets a request builder for the ServiceAnnouncementAttachment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServiceAnnouncementAttachmentRequestBuilder attachments(@Nonnull final String id) {
        return new ServiceAnnouncementAttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for attachmentsArchive
     *
     * @return the ServiceUpdateMessageAttachmentsArchiveStreamRequestBuilder instance
     */
    @Nonnull
    public ServiceUpdateMessageAttachmentsArchiveStreamRequestBuilder attachmentsArchive() {
        return new ServiceUpdateMessageAttachmentsArchiveStreamRequestBuilder(getRequestUrlWithAdditionalSegment("attachmentsArchive"), getClient(), null);
    }
}
