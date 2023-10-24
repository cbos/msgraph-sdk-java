package com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.customworkflowextensions;

import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.customworkflowextensions.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.entitlementmanagement.catalogs.item.customworkflowextensions.item.CustomCalloutExtensionItemRequestBuilder;
import com.microsoft.graph.models.CustomCalloutExtension;
import com.microsoft.graph.models.CustomCalloutExtensionCollectionResponse;
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
 * Provides operations to manage the customWorkflowExtensions property of the microsoft.graph.accessPackageCatalog entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomWorkflowExtensionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customWorkflowExtensions property of the microsoft.graph.accessPackageCatalog entity.
     * @param customCalloutExtensionId The unique identifier of customCalloutExtension
     * @return a CustomCalloutExtensionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CustomCalloutExtensionItemRequestBuilder byCustomCalloutExtensionId(@jakarta.annotation.Nonnull final String customCalloutExtensionId) {
        Objects.requireNonNull(customCalloutExtensionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customCalloutExtension%2Did", customCalloutExtensionId);
        return new CustomCalloutExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CustomWorkflowExtensionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomWorkflowExtensionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/catalogs/{accessPackageCatalog%2Did}/customWorkflowExtensions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CustomWorkflowExtensionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomWorkflowExtensionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/catalogs/{accessPackageCatalog%2Did}/customWorkflowExtensions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of the accessPackageAssignmentRequestWorkflowExtension and accessPackageAssignmentWorkflowExtension objects and their properties. The resulting list includes all the customAccessPackageWorkflowExtension objects for the catalog that the caller has access to read. Each object includes an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of CustomCalloutExtensionCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackagecatalog-list-accesspackagecustomworkflowextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtensionCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get a list of the accessPackageAssignmentRequestWorkflowExtension and accessPackageAssignmentWorkflowExtension objects and their properties. The resulting list includes all the customAccessPackageWorkflowExtension objects for the catalog that the caller has access to read. Each object includes an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CustomCalloutExtensionCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackagecatalog-list-accesspackagecustomworkflowextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtensionCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CustomCalloutExtensionCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create a new accessPackageAssignmentRequestWorkflowExtension or accessPackageAssignmentWorkflowExtension object and add it to an existing accessPackageCatalog object. You must explicitly provide an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CompletableFuture of CustomCalloutExtension
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackagecatalog-post-accesspackagecustomworkflowextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> post(@jakarta.annotation.Nonnull final CustomCalloutExtension body) {
        return post(body, null);
    }
    /**
     * Create a new accessPackageAssignmentRequestWorkflowExtension or accessPackageAssignmentWorkflowExtension object and add it to an existing accessPackageCatalog object. You must explicitly provide an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CustomCalloutExtension
     * @see <a href="https://learn.microsoft.com/graph/api/accesspackagecatalog-post-accesspackagecustomworkflowextensions?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> post(@jakarta.annotation.Nonnull final CustomCalloutExtension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CustomCalloutExtension::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a list of the accessPackageAssignmentRequestWorkflowExtension and accessPackageAssignmentWorkflowExtension objects and their properties. The resulting list includes all the customAccessPackageWorkflowExtension objects for the catalog that the caller has access to read. Each object includes an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the accessPackageAssignmentRequestWorkflowExtension and accessPackageAssignmentWorkflowExtension objects and their properties. The resulting list includes all the customAccessPackageWorkflowExtension objects for the catalog that the caller has access to read. Each object includes an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
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
     * Create a new accessPackageAssignmentRequestWorkflowExtension or accessPackageAssignmentWorkflowExtension object and add it to an existing accessPackageCatalog object. You must explicitly provide an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomCalloutExtension body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new accessPackageAssignmentRequestWorkflowExtension or accessPackageAssignmentWorkflowExtension object and add it to an existing accessPackageCatalog object. You must explicitly provide an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomCalloutExtension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CustomWorkflowExtensionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CustomWorkflowExtensionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustomWorkflowExtensionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the accessPackageAssignmentRequestWorkflowExtension and accessPackageAssignmentWorkflowExtension objects and their properties. The resulting list includes all the customAccessPackageWorkflowExtension objects for the catalog that the caller has access to read. Each object includes an @odata.type property that indicates whether the object is an  accessPackageAssignmentRequestWorkflowExtension or an accessPackageAssignmentWorkflowExtension. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
