// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.OnPremisesDirectorySynchronization;
import com.microsoft.graph.requests.OnPremisesDirectorySynchronizationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.OnPremisesDirectorySynchronizationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Directory Synchronization Collection Page.
 */
public class OnPremisesDirectorySynchronizationCollectionPage extends BaseCollectionPage<OnPremisesDirectorySynchronization, OnPremisesDirectorySynchronizationCollectionRequestBuilder> {

    /**
     * A collection page for OnPremisesDirectorySynchronization
     *
     * @param response the serialized OnPremisesDirectorySynchronizationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnPremisesDirectorySynchronizationCollectionPage(@Nonnull final OnPremisesDirectorySynchronizationCollectionResponse response, @Nonnull final OnPremisesDirectorySynchronizationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OnPremisesDirectorySynchronization
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OnPremisesDirectorySynchronizationCollectionPage(@Nonnull final java.util.List<OnPremisesDirectorySynchronization> pageContents, @Nullable final OnPremisesDirectorySynchronizationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
