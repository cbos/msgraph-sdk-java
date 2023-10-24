package com.microsoft.graph.identitygovernance;

import com.microsoft.graph.identitygovernance.accessreviews.AccessReviewsRequestBuilder;
import com.microsoft.graph.identitygovernance.appconsent.AppConsentRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.EntitlementManagementRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.LifecycleWorkflowsRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.identitygovernance.termsofuse.TermsOfUseRequestBuilder;
import com.microsoft.graph.models.IdentityGovernance;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the identityGovernance singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityGovernanceRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the accessReviews property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public AccessReviewsRequestBuilder accessReviews() {
        return new AccessReviewsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appConsent property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public AppConsentRequestBuilder appConsent() {
        return new AppConsentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the entitlementManagement property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public EntitlementManagementRequestBuilder entitlementManagement() {
        return new EntitlementManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lifecycleWorkflows property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public LifecycleWorkflowsRequestBuilder lifecycleWorkflows() {
        return new LifecycleWorkflowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the privilegedAccess property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess() {
        return new PrivilegedAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termsOfUse property of the microsoft.graph.identityGovernance entity.
     */
    @jakarta.annotation.Nonnull
    public TermsOfUseRequestBuilder termsOfUse() {
        return new TermsOfUseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new IdentityGovernanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityGovernanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new IdentityGovernanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IdentityGovernanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get identityGovernance
     * @return a CompletableFuture of IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> get() {
        return get(null);
    }
    /**
     * Get identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, IdentityGovernance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @return a CompletableFuture of IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> patch(@jakarta.annotation.Nonnull final IdentityGovernance body) {
        return patch(body, null);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IdentityGovernance> patch(@jakarta.annotation.Nonnull final IdentityGovernance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, IdentityGovernance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get identityGovernance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityGovernance body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IdentityGovernance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a IdentityGovernanceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IdentityGovernanceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IdentityGovernanceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get identityGovernance
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
