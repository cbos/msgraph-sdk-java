// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedAccessGroup;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Request Builder.
 */
public class PrivilegedAccessGroupRequestBuilder extends BaseRequestBuilder<PrivilegedAccessGroup> {

    /**
     * The request builder for the PrivilegedAccessGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedAccessGroupRequest instance
     */
    @Nonnull
    public PrivilegedAccessGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedAccessGroupRequest instance
     */
    @Nonnull
    public PrivilegedAccessGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Approval collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ApprovalCollectionRequestBuilder assignmentApprovals() {
        return new com.microsoft.graph.requests.ApprovalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentApprovals"), getClient(), null);
    }

    /**
     * Gets a request builder for the Approval item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ApprovalRequestBuilder assignmentApprovals(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ApprovalRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentApprovals") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupAssignmentScheduleInstance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleInstanceCollectionRequestBuilder assignmentScheduleInstances() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentScheduleInstances"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupAssignmentScheduleInstance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleInstanceRequestBuilder assignmentScheduleInstances(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentScheduleInstances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupAssignmentScheduleRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder assignmentScheduleRequests() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentScheduleRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupAssignmentScheduleRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestRequestBuilder assignmentScheduleRequests(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentScheduleRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupAssignmentSchedule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleCollectionRequestBuilder assignmentSchedules() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentSchedules"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupAssignmentSchedule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestBuilder assignmentSchedules(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentSchedules") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupEligibilityScheduleInstance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder eligibilityScheduleInstances() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilityScheduleInstances"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupEligibilityScheduleInstance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceRequestBuilder eligibilityScheduleInstances(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilityScheduleInstances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupEligibilityScheduleRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestCollectionRequestBuilder eligibilityScheduleRequests() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilityScheduleRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupEligibilityScheduleRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestRequestBuilder eligibilityScheduleRequests(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilityScheduleRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrivilegedAccessGroupEligibilitySchedule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleCollectionRequestBuilder eligibilitySchedules() {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilitySchedules"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrivilegedAccessGroupEligibilitySchedule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestBuilder eligibilitySchedules(@Nonnull final String id) {
        return new com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("eligibilitySchedules") + "/" + id, getClient(), null);
    }
}
