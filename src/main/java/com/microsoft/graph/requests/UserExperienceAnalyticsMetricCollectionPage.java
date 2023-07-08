// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsMetric;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric Collection Page.
 */
public class UserExperienceAnalyticsMetricCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsMetric, UserExperienceAnalyticsMetricCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsMetric
     *
     * @param response the serialized UserExperienceAnalyticsMetricCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsMetricCollectionPage(@Nonnull final UserExperienceAnalyticsMetricCollectionResponse response, @Nonnull final UserExperienceAnalyticsMetricCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsMetric
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsMetricCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsMetric> pageContents, @Nullable final UserExperienceAnalyticsMetricCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
