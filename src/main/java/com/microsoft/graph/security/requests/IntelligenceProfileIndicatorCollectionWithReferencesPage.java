// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.IntelligenceProfile;
import com.microsoft.graph.security.models.IntelligenceProfileIndicator;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionWithReferencesPage;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionResponse;
import com.microsoft.graph.security.models.IntelligenceProfileIndicator;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intelligence Profile Indicator Collection With References Page.
 */
public class IntelligenceProfileIndicatorCollectionWithReferencesPage extends BaseCollectionPage<IntelligenceProfileIndicator, IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for IntelligenceProfileIndicator
     *
     * @param response the serialized IntelligenceProfileIndicatorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IntelligenceProfileIndicatorCollectionWithReferencesPage(@Nonnull final IntelligenceProfileIndicatorCollectionResponse response, @Nullable final IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for IntelligenceProfileIndicator
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IntelligenceProfileIndicatorCollectionWithReferencesPage(@Nonnull final java.util.List<IntelligenceProfileIndicator> pageContents, @Nullable final IntelligenceProfileIndicatorCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
