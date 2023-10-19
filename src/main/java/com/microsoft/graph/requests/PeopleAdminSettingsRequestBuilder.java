// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PeopleAdminSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the People Admin Settings Request Builder.
 */
public class PeopleAdminSettingsRequestBuilder extends BaseRequestBuilder<PeopleAdminSettings> {

    /**
     * The request builder for the PeopleAdminSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PeopleAdminSettingsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PeopleAdminSettingsRequest instance
     */
    @Nonnull
    public PeopleAdminSettingsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PeopleAdminSettingsRequest instance
     */
    @Nonnull
    public PeopleAdminSettingsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PeopleAdminSettingsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ProfileCardProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ProfileCardPropertyCollectionRequestBuilder profileCardProperties() {
        return new com.microsoft.graph.requests.ProfileCardPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("profileCardProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the ProfileCardProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ProfileCardPropertyRequestBuilder profileCardProperties(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ProfileCardPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("profileCardProperties") + "/" + id, getClient(), null);
    }
}
