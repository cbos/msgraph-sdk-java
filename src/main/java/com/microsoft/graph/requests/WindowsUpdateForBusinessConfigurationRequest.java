// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsUpdateForBusinessConfiguration;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration Request.
 */
public class WindowsUpdateForBusinessConfigurationRequest extends BaseRequest<WindowsUpdateForBusinessConfiguration> {
	
    /**
     * The request for the WindowsUpdateForBusinessConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUpdateForBusinessConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUpdateForBusinessConfiguration.class);
    }

    /**
     * Gets the WindowsUpdateForBusinessConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUpdateForBusinessConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsUpdateForBusinessConfiguration from the service
     *
     * @return the WindowsUpdateForBusinessConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUpdateForBusinessConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUpdateForBusinessConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsUpdateForBusinessConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsUpdateForBusinessConfiguration with a source
     *
     * @param sourceWindowsUpdateForBusinessConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUpdateForBusinessConfiguration> patchAsync(@Nonnull final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Patches this WindowsUpdateForBusinessConfiguration with a source
     *
     * @param sourceWindowsUpdateForBusinessConfiguration the source object with updates
     * @return the updated WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUpdateForBusinessConfiguration patch(@Nonnull final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUpdateForBusinessConfiguration> postAsync(@Nonnull final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) {
        return sendAsync(HttpMethod.POST, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the new object to create
     * @return the created WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUpdateForBusinessConfiguration post(@Nonnull final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUpdateForBusinessConfiguration> putAsync(@Nonnull final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the object to create/update
     * @return the created WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUpdateForBusinessConfiguration put(@Nonnull final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsUpdateForBusinessConfigurationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WindowsUpdateForBusinessConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

