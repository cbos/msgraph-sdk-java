package com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries;

import com.microsoft.graph.devicemanagement.devicecompliancepolicysettingstatesummaries.count.CountRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummaryCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
/** Provides operations to manage the deviceCompliancePolicySettingStateSummaries property of the microsoft.graph.deviceManagement entity. */
public class DeviceCompliancePolicySettingStateSummariesRequestBuilder {
    /** The Count property */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new DeviceCompliancePolicySettingStateSummariesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicySettingStateSummaries{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceCompliancePolicySettingStateSummariesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicySettingStateSummariesRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicySettingStateSummaries{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * The summary states of compliance policy settings for this account.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The summary states of compliance policy settings for this account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration requestConfig = new DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to deviceCompliancePolicySettingStateSummaries for deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to deviceCompliancePolicySettingStateSummaries for deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration requestConfig = new DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The summary states of compliance policy settings for this account.
     * @return a CompletableFuture of DeviceCompliancePolicySettingStateSummaryCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummaryCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicySettingStateSummaryCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummaryCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The summary states of compliance policy settings for this account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceCompliancePolicySettingStateSummaryCollectionResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummaryCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicySettingStateSummaryCollectionResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummaryCollectionResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Create new navigation property to deviceCompliancePolicySettingStateSummaries for deviceManagement
     * @param body 
     * @return a CompletableFuture of deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> post(@javax.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Create new navigation property to deviceCompliancePolicySettingStateSummaries for deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> post(@javax.annotation.Nonnull final DeviceCompliancePolicySettingStateSummary body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** The summary states of compliance policy settings for this account. */
    public class DeviceCompliancePolicySettingStateSummariesRequestBuilderGetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceCompliancePolicySettingStateSummariesRequestBuilderGetQueryParameters queryParameters = new DeviceCompliancePolicySettingStateSummariesRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new deviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceCompliancePolicySettingStateSummariesRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new deviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceCompliancePolicySettingStateSummariesRequestBuilderPostRequestConfiguration() {
        }
    }
}
