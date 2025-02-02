// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ArchivedPrintJob;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetPrinterArchivedPrintJobsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetPrinterArchivedPrintJobsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetPrinterArchivedPrintJobsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Printer Archived Print Jobs Collection Request Builder.
 */
public class ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ArchivedPrintJob, ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder, ReportRootGetPrinterArchivedPrintJobsCollectionResponse, ReportRootGetPrinterArchivedPrintJobsCollectionPage, ReportRootGetPrinterArchivedPrintJobsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder.class, ReportRootGetPrinterArchivedPrintJobsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetPrinterArchivedPrintJobsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder.class, ReportRootGetPrinterArchivedPrintJobsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetPrinterArchivedPrintJobsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetPrinterArchivedPrintJobsCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
