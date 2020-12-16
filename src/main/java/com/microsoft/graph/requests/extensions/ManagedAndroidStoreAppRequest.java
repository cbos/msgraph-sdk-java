// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAndroidStoreApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Android Store App Request.
 */
public class ManagedAndroidStoreAppRequest extends BaseRequest<ManagedAndroidStoreApp> {
	
    /**
     * The request for the ManagedAndroidStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAndroidStoreAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAndroidStoreApp.class);
    }

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedAndroidStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAndroidStoreApp from the service
     *
     * @return the ManagedAndroidStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedAndroidStoreApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedAndroidStoreApp sourceManagedAndroidStoreApp, @Nonnull final ICallback<? super ManagedAndroidStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAndroidStoreApp);
    }

    /**
     * Patches this ManagedAndroidStoreApp with a source
     *
     * @param sourceManagedAndroidStoreApp the source object with updates
     * @return the updated ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp patch(@Nonnull final ManagedAndroidStoreApp sourceManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp, @Nonnull final ICallback<? super ManagedAndroidStoreApp> callback) {
        send(HttpMethod.POST, callback, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the new object to create
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp post(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.POST, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp, @Nonnull final ICallback<? super ManagedAndroidStoreApp> callback) {
        send(HttpMethod.PUT, callback, newManagedAndroidStoreApp);
    }

    /**
     * Creates a ManagedAndroidStoreApp with a new object
     *
     * @param newManagedAndroidStoreApp the object to create/update
     * @return the created ManagedAndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidStoreApp put(@Nonnull final ManagedAndroidStoreApp newManagedAndroidStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedAndroidStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAndroidStoreAppRequest select(@Nonnull final String value) {
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
     public ManagedAndroidStoreAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

