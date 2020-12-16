// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxes;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axes Request Builder.
 */
public class WorkbookChartAxesRequestBuilder extends BaseRequestBuilder<WorkbookChartAxes> {

    /**
     * The request builder for the WorkbookChartAxes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxesRequest instance
     */
    @Nonnull
    public WorkbookChartAxesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxesRequest instance
     */
    @Nonnull
    public WorkbookChartAxesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartAxesRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxis
     *
     * @return the WorkbookChartAxisRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxisRequestBuilder categoryAxis() {
        return new WorkbookChartAxisRequestBuilder(getRequestUrlWithAdditionalSegment("categoryAxis"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAxis
     *
     * @return the WorkbookChartAxisRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxisRequestBuilder seriesAxis() {
        return new WorkbookChartAxisRequestBuilder(getRequestUrlWithAdditionalSegment("seriesAxis"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAxis
     *
     * @return the WorkbookChartAxisRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxisRequestBuilder valueAxis() {
        return new WorkbookChartAxisRequestBuilder(getRequestUrlWithAdditionalSegment("valueAxis"), getClient(), null);
    }
}
