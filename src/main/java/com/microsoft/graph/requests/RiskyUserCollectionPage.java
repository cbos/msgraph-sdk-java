// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RiskyUser;
import com.microsoft.graph.requests.RiskyUserCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RiskyUserCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky User Collection Page.
 */
public class RiskyUserCollectionPage extends BaseCollectionPage<RiskyUser, RiskyUserCollectionRequestBuilder> {

    /**
     * A collection page for RiskyUser
     *
     * @param response the serialized RiskyUserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RiskyUserCollectionPage(@Nonnull final RiskyUserCollectionResponse response, @Nonnull final RiskyUserCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RiskyUser
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RiskyUserCollectionPage(@Nonnull final java.util.List<RiskyUser> pageContents, @Nullable final RiskyUserCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
