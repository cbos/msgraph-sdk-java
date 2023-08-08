package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppConsentApprovalRoute extends Entity implements Parsable {
    /**
     * A collection of appConsentRequest objects representing apps for which admin consent has been requested by one or more users.
     */
    private java.util.List<AppConsentRequest> appConsentRequests;
    /**
     * Instantiates a new appConsentApprovalRoute and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AppConsentApprovalRoute() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public static AppConsentApprovalRoute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConsentApprovalRoute();
    }
    /**
     * Gets the appConsentRequests property value. A collection of appConsentRequest objects representing apps for which admin consent has been requested by one or more users.
     * @return a appConsentRequest
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppConsentRequest> getAppConsentRequests() {
        return this.appConsentRequests;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appConsentRequests", (n) -> { this.setAppConsentRequests(n.getCollectionOfObjectValues(AppConsentRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appConsentRequests", this.getAppConsentRequests());
    }
    /**
     * Sets the appConsentRequests property value. A collection of appConsentRequest objects representing apps for which admin consent has been requested by one or more users.
     * @param value Value to set for the appConsentRequests property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppConsentRequests(@jakarta.annotation.Nullable final java.util.List<AppConsentRequest> value) {
        this.appConsentRequests = value;
    }
}
