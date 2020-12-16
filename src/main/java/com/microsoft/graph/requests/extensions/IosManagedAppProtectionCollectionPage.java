// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Collection Page.
 */
public class IosManagedAppProtectionCollectionPage extends BaseCollectionPage<IosManagedAppProtection, IosManagedAppProtectionCollectionRequestBuilder> {

    /**
     * A collection page for IosManagedAppProtection
     *
     * @param response the serialized IosManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosManagedAppProtectionCollectionPage(@Nonnull final IosManagedAppProtectionCollectionResponse response, @Nonnull final IosManagedAppProtectionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IosManagedAppProtection
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IosManagedAppProtectionCollectionPage(@Nonnull final java.util.List<IosManagedAppProtection> pageContents, @Nullable final IosManagedAppProtectionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
