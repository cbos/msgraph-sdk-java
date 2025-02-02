// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.BrowserSite;
import com.microsoft.graph.requests.BrowserSiteCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.BrowserSiteCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Browser Site Collection Page.
 */
public class BrowserSiteCollectionPage extends BaseCollectionPage<BrowserSite, BrowserSiteCollectionRequestBuilder> {

    /**
     * A collection page for BrowserSite
     *
     * @param response the serialized BrowserSiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BrowserSiteCollectionPage(@Nonnull final BrowserSiteCollectionResponse response, @Nonnull final BrowserSiteCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for BrowserSite
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BrowserSiteCollectionPage(@Nonnull final java.util.List<BrowserSite> pageContents, @Nullable final BrowserSiteCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
