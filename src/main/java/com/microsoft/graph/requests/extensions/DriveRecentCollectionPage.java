// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionPage;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Recent Collection Page.
 */
public class DriveRecentCollectionPage extends BaseCollectionPage<DriveItem, DriveRecentCollectionRequestBuilder> {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized DriveRecentCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveRecentCollectionPage(@Nonnull final DriveRecentCollectionResponse response, @Nonnull final DriveRecentCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DriveRecent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DriveRecentCollectionPage(@Nonnull final java.util.List<DriveItem> pageContents, @Nullable final DriveRecentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
