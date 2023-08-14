package com.microsoft.graph.users.item.joinedteams.item.permissiongrants;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.ResourceSpecificPermissionGrantCollectionResponse;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.count.CountRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.delta.DeltaRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.getavailableextensionproperties.GetAvailableExtensionPropertiesRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.getbyids.GetByIdsRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.item.ResourceSpecificPermissionGrantItemRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.permissiongrants.validateproperties.ValidatePropertiesRequestBuilder;
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
 * Provides operations to manage the permissionGrants property of the microsoft.graph.team entity.
 */
public class PermissionGrantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAvailableExtensionProperties method.
     */
    @jakarta.annotation.Nonnull
    public GetAvailableExtensionPropertiesRequestBuilder getAvailableExtensionProperties() {
        return new GetAvailableExtensionPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getByIds method.
     */
    @jakarta.annotation.Nonnull
    public GetByIdsRequestBuilder getByIds() {
        return new GetByIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateProperties method.
     */
    @jakarta.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.team entity.
     * @param resourceSpecificPermissionGrantId The unique identifier of resourceSpecificPermissionGrant
     * @return a ResourceSpecificPermissionGrantItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ResourceSpecificPermissionGrantItemRequestBuilder byResourceSpecificPermissionGrantId(@jakarta.annotation.Nonnull final String resourceSpecificPermissionGrantId) {
        Objects.requireNonNull(resourceSpecificPermissionGrantId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceSpecificPermissionGrant%2Did", resourceSpecificPermissionGrantId);
        return new ResourceSpecificPermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PermissionGrantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/permissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PermissionGrantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PermissionGrantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/permissionGrants{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get permissionGrants from users
     * @return a CompletableFuture of resourceSpecificPermissionGrantCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrantCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get permissionGrants from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of resourceSpecificPermissionGrantCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrantCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrantCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to permissionGrants for users
     * @param body The request body
     * @return a CompletableFuture of resourceSpecificPermissionGrant
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> post(@jakarta.annotation.Nonnull final ResourceSpecificPermissionGrant body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Create new navigation property to permissionGrants for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of resourceSpecificPermissionGrant
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> post(@jakarta.annotation.Nonnull final ResourceSpecificPermissionGrant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ResourceSpecificPermissionGrant::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant> executionException = new java.util.concurrent.CompletableFuture<ResourceSpecificPermissionGrant>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get permissionGrants from users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get permissionGrants from users
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
     * Create new navigation property to permissionGrants for users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResourceSpecificPermissionGrant body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to permissionGrants for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ResourceSpecificPermissionGrant body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get permissionGrants from users
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
