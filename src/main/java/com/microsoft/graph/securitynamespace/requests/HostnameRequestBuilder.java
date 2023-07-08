// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.Hostname;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hostname Request Builder.
 */
public class HostnameRequestBuilder extends BaseRequestBuilder<Hostname> {

    /**
     * The request builder for the Hostname
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostnameRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the HostnameRequest instance
     */
    @Nonnull
    public HostnameRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the HostnameRequest instance
     */
    @Nonnull
    public HostnameRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.HostnameRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the HostComponent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostComponentCollectionWithReferencesRequestBuilder components() {
        return new com.microsoft.graph.security.requests.HostComponentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("components"), getClient(), null);
    }

    /**
     * Gets a request builder for the HostComponent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostComponentWithReferenceRequestBuilder components(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.HostComponentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("components") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HostCookie collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostCookieCollectionWithReferencesRequestBuilder cookies() {
        return new com.microsoft.graph.security.requests.HostCookieCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("cookies"), getClient(), null);
    }

    /**
     * Gets a request builder for the HostCookie item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostCookieWithReferenceRequestBuilder cookies(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.HostCookieWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("cookies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PassiveDnsRecord collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionWithReferencesRequestBuilder passiveDns() {
        return new com.microsoft.graph.security.requests.PassiveDnsRecordCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("passiveDns"), getClient(), null);
    }

    /**
     * Gets a request builder for the PassiveDnsRecord item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.PassiveDnsRecordWithReferenceRequestBuilder passiveDns(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.PassiveDnsRecordWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("passiveDns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PassiveDnsRecord collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionWithReferencesRequestBuilder passiveDnsReverse() {
        return new com.microsoft.graph.security.requests.PassiveDnsRecordCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("passiveDnsReverse"), getClient(), null);
    }

    /**
     * Gets a request builder for the PassiveDnsRecord item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.PassiveDnsRecordWithReferenceRequestBuilder passiveDnsReverse(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.PassiveDnsRecordWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("passiveDnsReverse") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for HostReputation
     *
     * @return the HostReputationRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostReputationRequestBuilder reputation() {
        return new com.microsoft.graph.security.requests.HostReputationRequestBuilder(getRequestUrlWithAdditionalSegment("reputation"), getClient(), null);
    }
    /**
     *  Gets a request builder for the HostTracker collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostTrackerCollectionWithReferencesRequestBuilder trackers() {
        return new com.microsoft.graph.security.requests.HostTrackerCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("trackers"), getClient(), null);
    }

    /**
     * Gets a request builder for the HostTracker item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostTrackerWithReferenceRequestBuilder trackers(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.HostTrackerWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("trackers") + "/" + id, getClient(), null);
    }
}
