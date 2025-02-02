// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.Incident;
import com.microsoft.graph.security.models.Alert;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.AlertCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.security.requests.AlertCollectionWithReferencesPage;
import com.microsoft.graph.security.requests.AlertCollectionResponse;
import com.microsoft.graph.security.models.Alert;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Collection With References Page.
 */
public class AlertCollectionWithReferencesPage extends BaseCollectionPage<Alert, AlertCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for Alert
     *
     * @param response the serialized AlertCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AlertCollectionWithReferencesPage(@Nonnull final AlertCollectionResponse response, @Nullable final AlertCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for Alert
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AlertCollectionWithReferencesPage(@Nonnull final java.util.List<Alert> pageContents, @Nullable final AlertCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
