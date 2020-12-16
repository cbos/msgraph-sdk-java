// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCountRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointItemAtRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.WorkbookChartPointItemAtBody;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Collection Request Builder.
 */
public class WorkbookChartPointCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookChartPoint, WorkbookChartPointRequestBuilder, WorkbookChartPointCollectionResponse, WorkbookChartPointCollectionPage, WorkbookChartPointCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookChartSeries
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartPointRequestBuilder.class, WorkbookChartPointCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookChartPointCountRequestBuilder count() {
        return new WorkbookChartPointCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookChartPointItemAtRequestBuilder itemAt(@Nonnull final WorkbookChartPointItemAtBody parameters) {
        return new WorkbookChartPointItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, parameters);
    }
}
