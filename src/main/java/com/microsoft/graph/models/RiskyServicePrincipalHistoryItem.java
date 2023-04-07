package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskyServicePrincipalHistoryItem extends RiskyServicePrincipal implements Parsable {
    /** The activity related to service principal risk level change. */
    private RiskServicePrincipalActivity activity;
    /** The identifier of the actor of the operation. */
    private String initiatedBy;
    /**
     * Instantiates a new riskyServicePrincipalHistoryItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RiskyServicePrincipalHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskyServicePrincipalHistoryItem
     */
    @javax.annotation.Nonnull
    public static RiskyServicePrincipalHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyServicePrincipalHistoryItem();
    }
    /**
     * Gets the activity property value. The activity related to service principal risk level change.
     * @return a riskServicePrincipalActivity
     */
    @javax.annotation.Nullable
    public RiskServicePrincipalActivity getActivity() {
        return this.activity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(RiskServicePrincipalActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The identifier of the actor of the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeStringValue("initiatedBy", this.getInitiatedBy());
    }
    /**
     * Sets the activity property value. The activity related to service principal risk level change.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final RiskServicePrincipalActivity value) {
        this.activity = value;
    }
    /**
     * Sets the initiatedBy property value. The identifier of the actor of the operation.
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiatedBy(@javax.annotation.Nullable final String value) {
        this.initiatedBy = value;
    }
}
