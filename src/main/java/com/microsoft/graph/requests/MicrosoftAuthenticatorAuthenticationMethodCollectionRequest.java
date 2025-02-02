// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Authentication;
import com.microsoft.graph.models.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.PasswordResetResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.MicrosoftAuthenticatorAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.MicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftAuthenticatorAuthenticationMethodCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Authenticator Authentication Method Collection Request.
 */
public class MicrosoftAuthenticatorAuthenticationMethodCollectionRequest extends BaseEntityCollectionRequest<MicrosoftAuthenticatorAuthenticationMethod, MicrosoftAuthenticatorAuthenticationMethodCollectionResponse, MicrosoftAuthenticatorAuthenticationMethodCollectionPage> {

    /**
     * The request builder for this collection of MicrosoftAuthenticatorAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MicrosoftAuthenticatorAuthenticationMethodCollectionResponse.class, MicrosoftAuthenticatorAuthenticationMethodCollectionPage.class, MicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder.class);
    }

    /**
     * Creates a new MicrosoftAuthenticatorAuthenticationMethod
     * @param newMicrosoftAuthenticatorAuthenticationMethod the MicrosoftAuthenticatorAuthenticationMethod to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MicrosoftAuthenticatorAuthenticationMethod> postAsync(@Nonnull final MicrosoftAuthenticatorAuthenticationMethod newMicrosoftAuthenticatorAuthenticationMethod) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MicrosoftAuthenticatorAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Creates a new MicrosoftAuthenticatorAuthenticationMethod
     * @param newMicrosoftAuthenticatorAuthenticationMethod the MicrosoftAuthenticatorAuthenticationMethod to create
     * @return the newly created object
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethod post(@Nonnull final MicrosoftAuthenticatorAuthenticationMethod newMicrosoftAuthenticatorAuthenticationMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MicrosoftAuthenticatorAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMicrosoftAuthenticatorAuthenticationMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public MicrosoftAuthenticatorAuthenticationMethodCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

