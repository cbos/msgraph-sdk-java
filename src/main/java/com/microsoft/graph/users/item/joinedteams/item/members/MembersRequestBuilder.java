package com.microsoft.graph.users.item.joinedteams.item.members;

import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ConversationMemberCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.joinedteams.item.members.add.AddRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.members.count.CountRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.members.item.ConversationMemberItemRequestBuilder;
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
 * Provides operations to manage the members property of the microsoft.graph.team entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the add method.
     */
    @jakarta.annotation.Nonnull
    public AddRequestBuilder add() {
        return new AddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.team entity.
     * @param conversationMemberId The unique identifier of conversationMember
     * @return a ConversationMemberItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConversationMemberItemRequestBuilder byConversationMemberId(@jakarta.annotation.Nonnull final String conversationMemberId) {
        Objects.requireNonNull(conversationMemberId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("conversationMember%2Did", conversationMemberId);
        return new ConversationMemberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MembersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/members{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MembersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/joinedTeams/{team%2Did}/members{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of ConversationMemberCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/team-list-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConversationMemberCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ConversationMemberCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/team-list-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConversationMemberCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ConversationMemberCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Add a new conversationMember to a team. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CompletableFuture of ConversationMember
     * @see <a href="https://learn.microsoft.com/graph/api/team-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConversationMember> post(@jakarta.annotation.Nonnull final ConversationMember body) {
        return post(body, null);
    }
    /**
     * Add a new conversationMember to a team. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ConversationMember
     * @see <a href="https://learn.microsoft.com/graph/api/team-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConversationMember> post(@jakarta.annotation.Nonnull final ConversationMember body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ConversationMember::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant. This API is available in the following national cloud deployments.
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Add a new conversationMember to a team. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConversationMember body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a new conversationMember to a team. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConversationMember body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MembersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the conversationMember collection of a team. The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make assumptions about these resource IDs. In the future, membership results may include users from various tenants, as indicated in the response. Clients should avoid assuming that all members exclusively belong to the current tenant. This API is available in the following national cloud deployments.
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
