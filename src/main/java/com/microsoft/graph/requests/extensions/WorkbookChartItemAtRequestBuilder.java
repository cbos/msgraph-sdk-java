// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookChartItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookChartItemAtBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Item At Request Builder.
 */
public class WorkbookChartItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookChart> {

    /**
     * The request builder for this WorkbookChartItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookChartItemAtRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookChartItemAtBody parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the WorkbookChartItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartItemAtRequest instance
     */
    @Nonnull
    public WorkbookChartItemAtRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartItemAtRequest instance
     */
    @Nonnull
    public WorkbookChartItemAtRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartItemAtRequest request = new WorkbookChartItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }

    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the WorkbookChartAxesRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxesRequestBuilder axes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the WorkbookChartDataLabelsRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartDataLabelsRequestBuilder dataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the WorkbookChartAreaFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAreaFormatRequestBuilder format() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the WorkbookChartLegendRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartLegendRequestBuilder legend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookChartSeries collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookChartSeriesCollectionRequestBuilder series() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookChartSeries item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookChartSeriesRequestBuilder series(@Nonnull final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the WorkbookChartTitleRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartTitleRequestBuilder title() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    @Nonnull
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
