package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemServicePrincipalResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * The globally unique identifier of the application to which access has been granted.
     */
    private String appId;
    /**
     * Instantiates a new accessReviewInstanceDecisionItemServicePrincipalResource and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemServicePrincipalResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemServicePrincipalResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewInstanceDecisionItemServicePrincipalResource
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemServicePrincipalResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemServicePrincipalResource();
    }
    /**
     * Gets the appId property value. The globally unique identifier of the application to which access has been granted.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
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
        writer.writeStringValue("appId", this.getAppId());
    }
    /**
     * Sets the appId property value. The globally unique identifier of the application to which access has been granted.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
}
