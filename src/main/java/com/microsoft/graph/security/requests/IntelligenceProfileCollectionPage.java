// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.IntelligenceProfile;
import com.microsoft.graph.security.requests.IntelligenceProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.IntelligenceProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intelligence Profile Collection Page.
 */
public class IntelligenceProfileCollectionPage extends BaseCollectionPage<IntelligenceProfile, IntelligenceProfileCollectionRequestBuilder> {

    /**
     * A collection page for IntelligenceProfile
     *
     * @param response the serialized IntelligenceProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IntelligenceProfileCollectionPage(@Nonnull final IntelligenceProfileCollectionResponse response, @Nonnull final IntelligenceProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IntelligenceProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IntelligenceProfileCollectionPage(@Nonnull final java.util.List<IntelligenceProfile> pageContents, @Nullable final IntelligenceProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
