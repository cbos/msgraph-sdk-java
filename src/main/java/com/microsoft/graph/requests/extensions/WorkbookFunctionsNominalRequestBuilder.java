// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNominalRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNominalBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Nominal Request Builder.
 */
public class WorkbookFunctionsNominalRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    private WorkbookFunctionsNominalBody body;
    /**
     * The request builder for this WorkbookFunctionsNominal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsNominalRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsNominalBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsNominalRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNominalRequest instance
     */
    @Nonnull
    public WorkbookFunctionsNominalRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsNominalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNominalRequest instance
     */
    @Nonnull
    public WorkbookFunctionsNominalRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNominalRequest request = new WorkbookFunctionsNominalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
