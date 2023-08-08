package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemAzureRoleResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * Details of the scope this role is associated with.
     */
    private AccessReviewInstanceDecisionItemResource scope;
    /**
     * Instantiates a new accessReviewInstanceDecisionItemAzureRoleResource and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemAzureRoleResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemAzureRoleResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewInstanceDecisionItemAzureRoleResource
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemAzureRoleResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemAzureRoleResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(AccessReviewInstanceDecisionItemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scope property value. Details of the scope this role is associated with.
     * @return a accessReviewInstanceDecisionItemResource
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemResource getScope() {
        return this.scope;
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
        writer.writeObjectValue("scope", this.getScope());
    }
    /**
     * Sets the scope property value. Details of the scope this role is associated with.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScope(@jakarta.annotation.Nullable final AccessReviewInstanceDecisionItemResource value) {
        this.scope = value;
    }
}
