package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TargetedManagedAppPolicyAssignmentCollectionResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * The value property
     */
    private java.util.List<TargetedManagedAppPolicyAssignment> value;
    /**
     * Instantiates a new targetedManagedAppPolicyAssignmentCollectionResponse and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TargetedManagedAppPolicyAssignmentCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetedManagedAppPolicyAssignmentCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public static TargetedManagedAppPolicyAssignmentCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedManagedAppPolicyAssignmentCollectionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a targetedManagedAppPolicyAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getValue() {
        return this.value;
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
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.value = value;
    }
}
