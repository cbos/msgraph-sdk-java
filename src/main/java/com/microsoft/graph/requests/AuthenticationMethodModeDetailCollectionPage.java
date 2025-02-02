// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthenticationMethodModeDetail;
import com.microsoft.graph.requests.AuthenticationMethodModeDetailCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthenticationMethodModeDetailCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Mode Detail Collection Page.
 */
public class AuthenticationMethodModeDetailCollectionPage extends BaseCollectionPage<AuthenticationMethodModeDetail, AuthenticationMethodModeDetailCollectionRequestBuilder> {

    /**
     * A collection page for AuthenticationMethodModeDetail
     *
     * @param response the serialized AuthenticationMethodModeDetailCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationMethodModeDetailCollectionPage(@Nonnull final AuthenticationMethodModeDetailCollectionResponse response, @Nonnull final AuthenticationMethodModeDetailCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthenticationMethodModeDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthenticationMethodModeDetailCollectionPage(@Nonnull final java.util.List<AuthenticationMethodModeDetail> pageContents, @Nullable final AuthenticationMethodModeDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
