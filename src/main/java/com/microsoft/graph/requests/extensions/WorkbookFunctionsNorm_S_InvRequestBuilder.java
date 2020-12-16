// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNorm_S_InvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNorm_S_InvBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Norm_S_Inv Request Builder.
 */
public class WorkbookFunctionsNorm_S_InvRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    private WorkbookFunctionsNorm_S_InvBody body;
    /**
     * The request builder for this WorkbookFunctionsNorm_S_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsNorm_S_InvRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsNorm_S_InvBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsNorm_S_InvRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNorm_S_InvRequest instance
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_InvRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsNorm_S_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNorm_S_InvRequest instance
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_InvRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNorm_S_InvRequest request = new WorkbookFunctionsNorm_S_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
