package com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentpolicies.item.customextensionstagesettings;

import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentpolicies.item.customextensionstagesettings.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.assignmentpolicies.item.customextensionstagesettings.item.CustomExtensionStageSettingItemRequestBuilder;
import com.microsoft.graph.models.CustomExtensionStageSetting;
import com.microsoft.graph.models.CustomExtensionStageSettingCollectionResponse;
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
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the customExtensionStageSettings property of the microsoft.graph.accessPackageAssignmentPolicy entity.
 */
public class CustomExtensionStageSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customExtensionStageSettings property of the microsoft.graph.accessPackageAssignmentPolicy entity.
     * @param customExtensionStageSettingId The unique identifier of customExtensionStageSetting
     * @return a CustomExtensionStageSettingItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CustomExtensionStageSettingItemRequestBuilder byCustomExtensionStageSettingId(@jakarta.annotation.Nonnull final String customExtensionStageSettingId) {
        Objects.requireNonNull(customExtensionStageSettingId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customExtensionStageSetting%2Did", customExtensionStageSettingId);
        return new CustomExtensionStageSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CustomExtensionStageSettingsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CustomExtensionStageSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentPolicies/{accessPackageAssignmentPolicy%2Did}/customExtensionStageSettings{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CustomExtensionStageSettingsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CustomExtensionStageSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/assignmentPolicies/{accessPackageAssignmentPolicy%2Did}/customExtensionStageSettings{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a CompletableFuture of customExtensionStageSettingCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CustomExtensionStageSettingCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of customExtensionStageSettingCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CustomExtensionStageSettingCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<CustomExtensionStageSettingCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to customExtensionStageSettings for identityGovernance
     * @param body The request body
     * @return a CompletableFuture of customExtensionStageSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomExtensionStageSetting> post(@jakarta.annotation.Nonnull final CustomExtensionStageSetting body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CustomExtensionStageSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CustomExtensionStageSetting> executionException = new java.util.concurrent.CompletableFuture<CustomExtensionStageSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to customExtensionStageSettings for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of customExtensionStageSetting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomExtensionStageSetting> post(@jakarta.annotation.Nonnull final CustomExtensionStageSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CustomExtensionStageSetting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CustomExtensionStageSetting> executionException = new java.util.concurrent.CompletableFuture<CustomExtensionStageSetting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to customExtensionStageSettings for identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomExtensionStageSetting body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to customExtensionStageSettings for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomExtensionStageSetting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     */
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
