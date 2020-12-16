// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationAssignRequest;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfigurationAssignBody;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Assign Request Builder.
 */
public class DeviceEnrollmentConfigurationAssignRequestBuilder extends BaseActionRequestBuilder<DeviceEnrollmentConfiguration> {

    private DeviceEnrollmentConfigurationAssignBody body;
    /**
     * The request builder for this DeviceEnrollmentConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceEnrollmentConfigurationAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceEnrollmentConfigurationAssignBody parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceEnrollmentConfigurationAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceEnrollmentConfigurationAssignRequest instance
     */
    @Nonnull
    public DeviceEnrollmentConfigurationAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceEnrollmentConfigurationAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceEnrollmentConfigurationAssignRequest instance
     */
    @Nonnull
    public DeviceEnrollmentConfigurationAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceEnrollmentConfigurationAssignRequest request = new DeviceEnrollmentConfigurationAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
