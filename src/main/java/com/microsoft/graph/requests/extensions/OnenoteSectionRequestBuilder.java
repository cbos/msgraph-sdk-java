// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.OnenoteSectionCopyToNotebookBody;
import com.microsoft.graph.models.extensions.OnenoteSectionCopyToSectionGroupBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section Request Builder.
 */
public class OnenoteSectionRequestBuilder extends BaseRequestBuilder<OnenoteSection> {

    /**
     * The request builder for the OnenoteSection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteSectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OnenoteSectionRequest instance
     */
    @Nonnull
    public OnenoteSectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OnenoteSectionRequest instance
     */
    @Nonnull
    public OnenoteSectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OnenoteSectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the OnenotePage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OnenotePageCollectionRequestBuilder pages() {
        return new OnenotePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnenotePage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OnenotePageRequestBuilder pages(@Nonnull final String id) {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Notebook
     *
     * @return the NotebookRequestBuilder instance
     */
    @Nonnull
    public NotebookRequestBuilder parentNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("parentNotebook"), getClient(), null);
    }

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the SectionGroupRequestBuilder instance
     */
    @Nonnull
    public SectionGroupRequestBuilder parentSectionGroup() {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("parentSectionGroup"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public OnenoteSectionCopyToNotebookRequestBuilder copyToNotebook(@Nonnull final OnenoteSectionCopyToNotebookBody parameters) {
        return new OnenoteSectionCopyToNotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToNotebook"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public OnenoteSectionCopyToSectionGroupRequestBuilder copyToSectionGroup(@Nonnull final OnenoteSectionCopyToSectionGroupBody parameters) {
        return new OnenoteSectionCopyToSectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToSectionGroup"), getClient(), null, parameters);
    }
}
