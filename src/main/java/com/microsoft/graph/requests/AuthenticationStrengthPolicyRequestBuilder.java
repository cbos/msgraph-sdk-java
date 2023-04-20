// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthenticationStrengthPolicy;
import com.microsoft.graph.models.AuthenticationMethodModes;
import com.microsoft.graph.models.UpdateAllowedCombinationsResult;
import java.util.EnumSet;
import com.microsoft.graph.models.AuthenticationStrengthUsage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.AuthenticationStrengthPolicyUpdateAllowedCombinationsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Strength Policy Request Builder.
 */
public class AuthenticationStrengthPolicyRequestBuilder extends BaseRequestBuilder<AuthenticationStrengthPolicy> {

    /**
     * The request builder for the AuthenticationStrengthPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationStrengthPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AuthenticationStrengthPolicyRequest instance
     */
    @Nonnull
    public AuthenticationStrengthPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AuthenticationStrengthPolicyRequest instance
     */
    @Nonnull
    public AuthenticationStrengthPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AuthenticationStrengthPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AuthenticationCombinationConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AuthenticationCombinationConfigurationCollectionRequestBuilder combinationConfigurations() {
        return new com.microsoft.graph.requests.AuthenticationCombinationConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("combinationConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the AuthenticationCombinationConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AuthenticationCombinationConfigurationRequestBuilder combinationConfigurations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AuthenticationCombinationConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("combinationConfigurations") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AuthenticationStrengthPolicyUpdateAllowedCombinationsRequestBuilder updateAllowedCombinations(@Nonnull final AuthenticationStrengthPolicyUpdateAllowedCombinationsParameterSet parameters) {
        return new AuthenticationStrengthPolicyUpdateAllowedCombinationsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateAllowedCombinations"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AuthenticationStrengthPolicyUsageRequestBuilder usage() {
        return new AuthenticationStrengthPolicyUsageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usage"), getClient(), null);
    }
}
