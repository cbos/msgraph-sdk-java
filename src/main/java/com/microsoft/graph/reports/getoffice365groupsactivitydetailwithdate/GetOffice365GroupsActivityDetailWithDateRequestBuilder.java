package com.microsoft.graph.reports.getoffice365groupsactivitydetailwithdate;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getOffice365GroupsActivityDetail method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetOffice365GroupsActivityDetailWithDateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetOffice365GroupsActivityDetailWithDateRequestBuilder and sets the default values.
     * @param date Usage: date={date}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final LocalDate date) {
        super(requestAdapter, "{+baseurl}/reports/getOffice365GroupsActivityDetail(date={date})", pathParameters);
        this.pathParameters.put("date", date);
    }
    /**
     * Instantiates a new GetOffice365GroupsActivityDetailWithDateRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getOffice365GroupsActivityDetail(date={date})", rawUrl);
    }
    /**
     * Invoke function getOffice365GroupsActivityDetail
     * @return a CompletableFuture of InputStream
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> get() {
        return get(null);
    }
    /**
     * Invoke function getOffice365GroupsActivityDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
    }
    /**
     * Invoke function getOffice365GroupsActivityDetail
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getOffice365GroupsActivityDetail
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetOffice365GroupsActivityDetailWithDateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetOffice365GroupsActivityDetailWithDateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetOffice365GroupsActivityDetailWithDateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
