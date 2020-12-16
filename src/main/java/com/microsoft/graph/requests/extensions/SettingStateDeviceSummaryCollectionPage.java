// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Setting State Device Summary Collection Page.
 */
public class SettingStateDeviceSummaryCollectionPage extends BaseCollectionPage<SettingStateDeviceSummary, SettingStateDeviceSummaryCollectionRequestBuilder> {

    /**
     * A collection page for SettingStateDeviceSummary
     *
     * @param response the serialized SettingStateDeviceSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SettingStateDeviceSummaryCollectionPage(@Nonnull final SettingStateDeviceSummaryCollectionResponse response, @Nonnull final SettingStateDeviceSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SettingStateDeviceSummary
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SettingStateDeviceSummaryCollectionPage(@Nonnull final java.util.List<SettingStateDeviceSummary> pageContents, @Nullable final SettingStateDeviceSummaryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
