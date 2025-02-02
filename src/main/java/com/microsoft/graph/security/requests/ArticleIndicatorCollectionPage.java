// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.ArticleIndicator;
import com.microsoft.graph.security.requests.ArticleIndicatorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.ArticleIndicatorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Article Indicator Collection Page.
 */
public class ArticleIndicatorCollectionPage extends BaseCollectionPage<ArticleIndicator, ArticleIndicatorCollectionRequestBuilder> {

    /**
     * A collection page for ArticleIndicator
     *
     * @param response the serialized ArticleIndicatorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ArticleIndicatorCollectionPage(@Nonnull final ArticleIndicatorCollectionResponse response, @Nonnull final ArticleIndicatorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ArticleIndicator
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ArticleIndicatorCollectionPage(@Nonnull final java.util.List<ArticleIndicator> pageContents, @Nullable final ArticleIndicatorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
