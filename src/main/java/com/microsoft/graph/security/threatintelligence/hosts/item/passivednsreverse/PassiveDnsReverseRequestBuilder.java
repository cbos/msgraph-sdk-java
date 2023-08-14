package com.microsoft.graph.security.threatintelligence.hosts.item.passivednsreverse;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.PassiveDnsRecordCollectionResponse;
import com.microsoft.graph.security.threatintelligence.hosts.item.passivednsreverse.count.CountRequestBuilder;
import com.microsoft.graph.security.threatintelligence.hosts.item.passivednsreverse.item.PassiveDnsRecordItemRequestBuilder;
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
 * Provides operations to manage the passiveDnsReverse property of the microsoft.graph.security.host entity.
 */
public class PassiveDnsReverseRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the passiveDnsReverse property of the microsoft.graph.security.host entity.
     * @param passiveDnsRecordId The unique identifier of passiveDnsRecord
     * @return a PassiveDnsRecordItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PassiveDnsRecordItemRequestBuilder byPassiveDnsRecordId(@jakarta.annotation.Nonnull final String passiveDnsRecordId) {
        Objects.requireNonNull(passiveDnsRecordId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("passiveDnsRecord%2Did", passiveDnsRecordId);
        return new PassiveDnsRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PassiveDnsReverseRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PassiveDnsReverseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence/hosts/{host%2Did}/passiveDnsReverse{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PassiveDnsReverseRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PassiveDnsReverseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/threatIntelligence/hosts/{host%2Did}/passiveDnsReverse{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of passiveDnsRecord resources.
     * @return a CompletableFuture of passiveDnsRecordCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-host-list-passivednsreverse?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PassiveDnsRecordCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of passiveDnsRecord resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of passiveDnsRecordCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/security-host-list-passivednsreverse?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, PassiveDnsRecordCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse> executionException = new java.util.concurrent.CompletableFuture<PassiveDnsRecordCollectionResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get a list of passiveDnsRecord resources.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of passiveDnsRecord resources.
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
     * Get a list of passiveDnsRecord resources.
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
}
