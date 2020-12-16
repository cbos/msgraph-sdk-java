// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceWindowsDefenderUpdateSignaturesRequest;
import com.microsoft.graph.models.extensions.ManagedDevice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Windows Defender Update Signatures Request Builder.
 */
public class ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    /**
     * The request builder for this ManagedDeviceWindowsDefenderUpdateSignatures
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ManagedDeviceWindowsDefenderUpdateSignaturesRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceWindowsDefenderUpdateSignaturesRequest instance
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderUpdateSignaturesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceWindowsDefenderUpdateSignaturesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceWindowsDefenderUpdateSignaturesRequest instance
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderUpdateSignaturesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceWindowsDefenderUpdateSignaturesRequest request = new ManagedDeviceWindowsDefenderUpdateSignaturesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
