// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSechRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSechBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sech Request Builder.
 */
public class WorkbookFunctionsSechRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    private WorkbookFunctionsSechBody body;
    /**
     * The request builder for this WorkbookFunctionsSech
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsSechRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsSechBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsSechRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsSechRequest instance
     */
    @Nonnull
    public WorkbookFunctionsSechRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsSechRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsSechRequest instance
     */
    @Nonnull
    public WorkbookFunctionsSechRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSechRequest request = new WorkbookFunctionsSechRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
