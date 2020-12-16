// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookRangeClearBody;
import com.microsoft.graph.models.extensions.WorkbookRangeDeleteBody;
import com.microsoft.graph.models.extensions.WorkbookRangeInsertBody;
import com.microsoft.graph.models.extensions.WorkbookRangeMergeBody;
import com.microsoft.graph.models.extensions.WorkbookRangeBoundingRectBody;
import com.microsoft.graph.models.extensions.WorkbookRangeCellBody;
import com.microsoft.graph.models.extensions.WorkbookRangeColumnBody;
import com.microsoft.graph.models.extensions.WorkbookRangeColumnsAfterBody;
import com.microsoft.graph.models.extensions.WorkbookRangeColumnsBeforeBody;
import com.microsoft.graph.models.extensions.WorkbookRangeIntersectionBody;
import com.microsoft.graph.models.extensions.WorkbookRangeOffsetRangeBody;
import com.microsoft.graph.models.extensions.WorkbookRangeResizedRangeBody;
import com.microsoft.graph.models.extensions.WorkbookRangeRowBody;
import com.microsoft.graph.models.extensions.WorkbookRangeRowsAboveBody;
import com.microsoft.graph.models.extensions.WorkbookRangeRowsBelowBody;
import com.microsoft.graph.models.extensions.WorkbookRangeUsedRangeBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Request Builder.
 */
public class WorkbookRangeRequestBuilder extends BaseRequestBuilder<WorkbookRange> {

    /**
     * The request builder for the WorkbookRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeRequest instance
     */
    @Nonnull
    public WorkbookRangeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeRequest instance
     */
    @Nonnull
    public WorkbookRangeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookRangeRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the WorkbookRangeFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the WorkbookRangeSortRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
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

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeClearRequestBuilder clear(@Nonnull final WorkbookRangeClearBody parameters) {
        return new WorkbookRangeClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeDeleteRequestBuilder delete(@Nonnull final WorkbookRangeDeleteBody parameters) {
        return new WorkbookRangeDeleteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delete"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeInsertRequestBuilder insert(@Nonnull final WorkbookRangeInsertBody parameters) {
        return new WorkbookRangeInsertRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.insert"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeMergeRequestBuilder merge(@Nonnull final WorkbookRangeMergeBody parameters) {
        return new WorkbookRangeMergeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.merge"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeUnmergeRequestBuilder unmerge() {
        return new WorkbookRangeUnmergeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmerge"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeBoundingRectRequestBuilder boundingRect(@Nonnull final WorkbookRangeBoundingRectBody parameters) {
        return new WorkbookRangeBoundingRectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.boundingRect"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeCellRequestBuilder cell(@Nonnull final WorkbookRangeCellBody parameters) {
        return new WorkbookRangeCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cell"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeColumnRequestBuilder column(@Nonnull final WorkbookRangeColumnBody parameters) {
        return new WorkbookRangeColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.column"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeColumnsAfterRequestBuilder columnsAfter() {
        return new WorkbookRangeColumnsAfterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsAfter"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeColumnsAfterRequestBuilder columnsAfter(@Nonnull final WorkbookRangeColumnsAfterBody parameters) {
        return new WorkbookRangeColumnsAfterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsAfter"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeColumnsBeforeRequestBuilder columnsBefore() {
        return new WorkbookRangeColumnsBeforeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsBefore"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeColumnsBeforeRequestBuilder columnsBefore(@Nonnull final WorkbookRangeColumnsBeforeBody parameters) {
        return new WorkbookRangeColumnsBeforeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columnsBefore"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeEntireColumnRequestBuilder entireColumn() {
        return new WorkbookRangeEntireColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.entireColumn"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeEntireRowRequestBuilder entireRow() {
        return new WorkbookRangeEntireRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.entireRow"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeIntersectionRequestBuilder intersection(@Nonnull final WorkbookRangeIntersectionBody parameters) {
        return new WorkbookRangeIntersectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.intersection"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeLastCellRequestBuilder lastCell() {
        return new WorkbookRangeLastCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastCell"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeLastColumnRequestBuilder lastColumn() {
        return new WorkbookRangeLastColumnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastColumn"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeLastRowRequestBuilder lastRow() {
        return new WorkbookRangeLastRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lastRow"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeOffsetRangeRequestBuilder offsetRange(@Nonnull final WorkbookRangeOffsetRangeBody parameters) {
        return new WorkbookRangeOffsetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.offsetRange"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeResizedRangeRequestBuilder resizedRange(@Nonnull final WorkbookRangeResizedRangeBody parameters) {
        return new WorkbookRangeResizedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resizedRange"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeRowRequestBuilder row(@Nonnull final WorkbookRangeRowBody parameters) {
        return new WorkbookRangeRowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.row"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeRowsAboveRequestBuilder rowsAbove() {
        return new WorkbookRangeRowsAboveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsAbove"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeRowsAboveRequestBuilder rowsAbove(@Nonnull final WorkbookRangeRowsAboveBody parameters) {
        return new WorkbookRangeRowsAboveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsAbove"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeRowsBelowRequestBuilder rowsBelow() {
        return new WorkbookRangeRowsBelowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsBelow"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeRowsBelowRequestBuilder rowsBelow(@Nonnull final WorkbookRangeRowsBelowBody parameters) {
        return new WorkbookRangeRowsBelowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rowsBelow"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeUsedRangeRequestBuilder usedRange() {
        return new WorkbookRangeUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookRangeUsedRangeRequestBuilder usedRange(@Nonnull final WorkbookRangeUsedRangeBody parameters) {
        return new WorkbookRangeUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeVisibleViewRequestBuilder visibleView() {
        return new WorkbookRangeVisibleViewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.visibleView"), getClient(), null);
    }
}
