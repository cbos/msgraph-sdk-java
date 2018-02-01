// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Entity Hierarchy Model Request.
 */
public class BaseOnenoteEntityHierarchyModelRequest extends BaseRequest implements IBaseOnenoteEntityHierarchyModelRequest {

    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl The request URL
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the response
     */
    public BaseOnenoteEntityHierarchyModelRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends OnenoteEntityHierarchyModel> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getOnenoteEntityHierarchyModel(final ICallback<OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     * @return The OnenoteEntityHierarchyModel from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityHierarchyModel getOnenoteEntityHierarchyModel() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     * @param sourceOnenoteEntityHierarchyModel The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel, final ICallback<OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     * @param sourceOnenoteEntityHierarchyModel The source object with updates
     * @return The updated OnenoteEntityHierarchyModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityHierarchyModel patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     * @param newOnenoteEntityHierarchyModel The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final ICallback<OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.POST, callback, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     * @param newOnenoteEntityHierarchyModel The new object to create
     * @return The created OnenoteEntityHierarchyModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteEntityHierarchyModel post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntityHierarchyModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOnenoteEntityHierarchyModelRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OnenoteEntityHierarchyModelRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOnenoteEntityHierarchyModelRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OnenoteEntityHierarchyModelRequest)this;
     }

}

