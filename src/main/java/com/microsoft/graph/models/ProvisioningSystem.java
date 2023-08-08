package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningSystem extends Identity implements Parsable {
    /**
     * Details of the system.
     */
    private DetailsInfo details;
    /**
     * Instantiates a new provisioningSystem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ProvisioningSystem() {
        super();
        this.setOdataType("#microsoft.graph.provisioningSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningSystem
     */
    @jakarta.annotation.Nonnull
    public static ProvisioningSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningSystem();
    }
    /**
     * Gets the details property value. Details of the system.
     * @return a detailsInfo
     */
    @jakarta.annotation.Nullable
    public DetailsInfo getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("details", this.getDetails());
    }
    /**
     * Sets the details property value. Details of the system.
     * @param value Value to set for the details property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetails(@jakarta.annotation.Nullable final DetailsInfo value) {
        this.details = value;
    }
}
