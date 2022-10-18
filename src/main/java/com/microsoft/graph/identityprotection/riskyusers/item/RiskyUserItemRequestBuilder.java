package com.microsoft.graph.identityprotection.riskyusers.item;

import com.microsoft.graph.identityprotection.riskyusers.item.history.HistoryRequestBuilder;
import com.microsoft.graph.identityprotection.riskyusers.item.history.item.RiskyUserHistoryItemItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.RiskyUser;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the riskyUsers property of the microsoft.graph.identityProtectionRoot entity. */
public class RiskyUserItemRequestBuilder {
    /** The history property */
    @javax.annotation.Nonnull
    public HistoryRequestBuilder history() {
        return new HistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new RiskyUserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RiskyUserItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityProtection/riskyUsers/{riskyUser%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new RiskyUserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RiskyUserItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityProtection/riskyUsers/{riskyUser%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property riskyUsers for identityProtection
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property riskyUsers for identityProtection
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final RiskyUserItemRequestBuilderDeleteRequestConfiguration requestConfig = new RiskyUserItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Users that are flagged as at-risk by Azure AD Identity Protection.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Users that are flagged as at-risk by Azure AD Identity Protection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final RiskyUserItemRequestBuilderGetRequestConfiguration requestConfig = new RiskyUserItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property riskyUsers in identityProtection
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RiskyUser body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property riskyUsers in identityProtection
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RiskyUser body, @javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final RiskyUserItemRequestBuilderPatchRequestConfiguration requestConfig = new RiskyUserItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property riskyUsers for identityProtection
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property riskyUsers for identityProtection
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Users that are flagged as at-risk by Azure AD Identity Protection.
     * @return a CompletableFuture of riskyUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyUser> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RiskyUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RiskyUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Users that are flagged as at-risk by Azure AD Identity Protection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of riskyUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyUser> get(@javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RiskyUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RiskyUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityProtection.riskyUsers.item.history.item collection
     * @param id Unique identifier of the item
     * @return a RiskyUserHistoryItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RiskyUserHistoryItemItemRequestBuilder history(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("riskyUserHistoryItem%2Did", id);
        return new RiskyUserHistoryItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property riskyUsers in identityProtection
     * @param body 
     * @return a CompletableFuture of riskyUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyUser> patch(@javax.annotation.Nonnull final RiskyUser body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RiskyUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RiskyUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property riskyUsers in identityProtection
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of riskyUser
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RiskyUser> patch(@javax.annotation.Nonnull final RiskyUser body, @javax.annotation.Nullable final java.util.function.Consumer<RiskyUserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RiskyUser::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RiskyUser>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RiskyUserItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new RiskyUserItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RiskyUserItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Users that are flagged as at-risk by Azure AD Identity Protection. */
    public class RiskyUserItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RiskyUserItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public RiskyUserItemRequestBuilderGetQueryParameters queryParameters = new RiskyUserItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new RiskyUserItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RiskyUserItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RiskyUserItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new RiskyUserItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RiskyUserItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
