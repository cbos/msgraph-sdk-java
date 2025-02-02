// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationUser;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Request Builder.
 */
public class EducationUserRequestBuilder extends BaseRequestBuilder<EducationUser> {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationUserRequest instance
     */
    @Nonnull
    public EducationUserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationUserRequest instance
     */
    @Nonnull
    public EducationUserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EducationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationRubric collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationRubricCollectionRequestBuilder rubrics() {
        return new com.microsoft.graph.requests.EducationRubricCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rubrics"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationRubric item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationRubricRequestBuilder rubrics(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationRubricRequestBuilder(getRequestUrlWithAdditionalSegment("rubrics") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationClass collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder classes() {
        return new com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationClass item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder classes(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationSchool collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationSchool item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder schools(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationClass collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder taughtClasses() {
        return new com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("taughtClasses"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationClass item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder taughtClasses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("taughtClasses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder user() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("user"), getClient(), null);
    }
}
