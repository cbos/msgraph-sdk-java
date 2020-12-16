// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Single Value Legacy Extended Property Collection Page.
 */
public class SingleValueLegacyExtendedPropertyCollectionPage extends BaseCollectionPage<SingleValueLegacyExtendedProperty, SingleValueLegacyExtendedPropertyCollectionRequestBuilder> {

    /**
     * A collection page for SingleValueLegacyExtendedProperty
     *
     * @param response the serialized SingleValueLegacyExtendedPropertyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SingleValueLegacyExtendedPropertyCollectionPage(@Nonnull final SingleValueLegacyExtendedPropertyCollectionResponse response, @Nonnull final SingleValueLegacyExtendedPropertyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SingleValueLegacyExtendedProperty
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SingleValueLegacyExtendedPropertyCollectionPage(@Nonnull final java.util.List<SingleValueLegacyExtendedProperty> pageContents, @Nullable final SingleValueLegacyExtendedPropertyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
