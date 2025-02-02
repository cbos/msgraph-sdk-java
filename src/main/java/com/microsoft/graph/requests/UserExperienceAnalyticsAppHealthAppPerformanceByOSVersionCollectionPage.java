// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By OSVersion Collection Page.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion, UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionResponse response, @Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> pageContents, @Nullable final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
