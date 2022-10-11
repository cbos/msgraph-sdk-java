// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthenticationContextClassReference;
import com.microsoft.graph.requests.AuthenticationContextClassReferenceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthenticationContextClassReferenceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Context Class Reference Collection Page.
 */
public class AuthenticationContextClassReferenceCollectionPage extends BaseCollectionPage<AuthenticationContextClassReference, AuthenticationContextClassReferenceCollectionRequestBuilder> {

    /**
     * A collection page for AuthenticationContextClassReference
     *
     * @param response the serialized AuthenticationContextClassReferenceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationContextClassReferenceCollectionPage(@Nonnull final AuthenticationContextClassReferenceCollectionResponse response, @Nonnull final AuthenticationContextClassReferenceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthenticationContextClassReference
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthenticationContextClassReferenceCollectionPage(@Nonnull final java.util.List<AuthenticationContextClassReference> pageContents, @Nullable final AuthenticationContextClassReferenceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
