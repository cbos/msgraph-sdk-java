// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.Case;
import com.microsoft.graph.ediscovery.requests.CustodianCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CustodianRequestBuilder;
import com.microsoft.graph.ediscovery.requests.LegalHoldCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.LegalHoldRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CaseOperationCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CaseOperationRequestBuilder;
import com.microsoft.graph.ediscovery.requests.ReviewSetCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.ReviewSetRequestBuilder;
import com.microsoft.graph.ediscovery.requests.CaseSettingsRequestBuilder;
import com.microsoft.graph.ediscovery.requests.SourceCollectionCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.SourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.TagCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.TagRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Request Builder.
 */
public class CaseRequestBuilder extends BaseRequestBuilder<Case> {

    /**
     * The request builder for the Case
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CaseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CaseRequest instance
     */
    @Nonnull
    public CaseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CaseRequest instance
     */
    @Nonnull
    public CaseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.CaseRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Custodian collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CustodianCollectionRequestBuilder custodians() {
        return new CustodianCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("custodians"), getClient(), null);
    }

    /**
     * Gets a request builder for the Custodian item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CustodianRequestBuilder custodians(@Nonnull final String id) {
        return new CustodianRequestBuilder(getRequestUrlWithAdditionalSegment("custodians") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the LegalHold collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public LegalHoldCollectionRequestBuilder legalHolds() {
        return new LegalHoldCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("legalHolds"), getClient(), null);
    }

    /**
     * Gets a request builder for the LegalHold item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public LegalHoldRequestBuilder legalHolds(@Nonnull final String id) {
        return new LegalHoldRequestBuilder(getRequestUrlWithAdditionalSegment("legalHolds") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the NoncustodialDataSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public NoncustodialDataSourceCollectionRequestBuilder noncustodialDataSources() {
        return new NoncustodialDataSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialDataSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the NoncustodialDataSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public NoncustodialDataSourceRequestBuilder noncustodialDataSources(@Nonnull final String id) {
        return new NoncustodialDataSourceRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialDataSources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CaseOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CaseOperationCollectionRequestBuilder operations() {
        return new CaseOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the CaseOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CaseOperationRequestBuilder operations(@Nonnull final String id) {
        return new CaseOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ReviewSet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ReviewSetCollectionRequestBuilder reviewSets() {
        return new ReviewSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets"), getClient(), null);
    }

    /**
     * Gets a request builder for the ReviewSet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ReviewSetRequestBuilder reviewSets(@Nonnull final String id) {
        return new ReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for CaseSettings
     *
     * @return the CaseSettingsRequestBuilder instance
     */
    @Nonnull
    public CaseSettingsRequestBuilder settings() {
        return new CaseSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the SourceCollection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SourceCollectionCollectionRequestBuilder sourceCollections() {
        return new SourceCollectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sourceCollections"), getClient(), null);
    }

    /**
     * Gets a request builder for the SourceCollection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SourceCollectionRequestBuilder sourceCollections(@Nonnull final String id) {
        return new SourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sourceCollections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Tag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TagCollectionRequestBuilder tags() {
        return new TagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tags"), getClient(), null);
    }

    /**
     * Gets a request builder for the Tag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TagRequestBuilder tags(@Nonnull final String id) {
        return new TagRequestBuilder(getRequestUrlWithAdditionalSegment("tags") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CaseCloseRequestBuilder close() {
        return new CaseCloseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.close"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CaseReopenRequestBuilder reopen() {
        return new CaseReopenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.reopen"), getClient(), null);
    }
}
