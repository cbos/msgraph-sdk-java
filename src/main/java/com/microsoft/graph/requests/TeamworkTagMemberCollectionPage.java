// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.TeamworkTagMember;
import com.microsoft.graph.requests.TeamworkTagMemberCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.TeamworkTagMemberCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Tag Member Collection Page.
 */
public class TeamworkTagMemberCollectionPage extends BaseCollectionPage<TeamworkTagMember, TeamworkTagMemberCollectionRequestBuilder> {

    /**
     * A collection page for TeamworkTagMember
     *
     * @param response the serialized TeamworkTagMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamworkTagMemberCollectionPage(@Nonnull final TeamworkTagMemberCollectionResponse response, @Nonnull final TeamworkTagMemberCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TeamworkTagMember
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TeamworkTagMemberCollectionPage(@Nonnull final java.util.List<TeamworkTagMember> pageContents, @Nullable final TeamworkTagMemberCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
