package com.microsoft.graph.users.item.exportdeviceandappmanagementdatawithskipwithtop;

import com.microsoft.graph.models.DeviceAndAppManagementData;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the exportDeviceAndAppManagementData method.
 */
public class ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param skip Usage: skip={skip}
     * @param top Usage: top={top}
     * @return a void
     */
    @javax.annotation.Nullable
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final Integer skip, @javax.annotation.Nullable final Integer top) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/exportDeviceAndAppManagementData(skip={skip},top={top})", pathParameters);
        this.pathParameters.put("skip", skip);
        this.pathParameters.put("top", top);
    }
    /**
     * Instantiates a new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/exportDeviceAndAppManagementData(skip={skip},top={top})", rawUrl);
    }
    /**
     * Invoke function exportDeviceAndAppManagementData
     * @return a CompletableFuture of deviceAndAppManagementData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementData> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAndAppManagementData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAndAppManagementData> executionException = new java.util.concurrent.CompletableFuture<DeviceAndAppManagementData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function exportDeviceAndAppManagementData
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceAndAppManagementData
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAndAppManagementData> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DeviceAndAppManagementData::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DeviceAndAppManagementData> executionException = new java.util.concurrent.CompletableFuture<DeviceAndAppManagementData>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function exportDeviceAndAppManagementData
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function exportDeviceAndAppManagementData
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
