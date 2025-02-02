// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Site;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.SiteGetAllSitesCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteGetAllSitesCollectionPage;
import com.microsoft.graph.requests.SiteGetAllSitesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get All Sites Collection Page.
 */
public class SiteGetAllSitesCollectionPage extends BaseCollectionPage<Site, SiteGetAllSitesCollectionRequestBuilder> {

    /**
     * A collection page for Site.
     *
     * @param response The serialized SiteGetAllSitesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SiteGetAllSitesCollectionPage(@Nonnull final SiteGetAllSitesCollectionResponse response, @Nonnull final SiteGetAllSitesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SiteGetAllSites
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SiteGetAllSitesCollectionPage(@Nonnull final java.util.List<Site> pageContents, @Nullable final SiteGetAllSitesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
