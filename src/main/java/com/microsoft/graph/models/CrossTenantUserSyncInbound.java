package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantUserSyncInbound implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Defines whether user objects should be synchronized from the partner tenant. false causes any current user synchronization from the source tenant to the target tenant to stop. This property has no impact on existing users who have already been synchronized. */
    private Boolean isSyncAllowed;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new crossTenantUserSyncInbound and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantUserSyncInbound() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantUserSyncInbound
     */
    @javax.annotation.Nonnull
    public static CrossTenantUserSyncInbound createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantUserSyncInbound();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("isSyncAllowed", (n) -> { this.setIsSyncAllowed(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSyncAllowed property value. Defines whether user objects should be synchronized from the partner tenant. false causes any current user synchronization from the source tenant to the target tenant to stop. This property has no impact on existing users who have already been synchronized.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncAllowed() {
        return this.isSyncAllowed;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isSyncAllowed", this.getIsSyncAllowed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isSyncAllowed property value. Defines whether user objects should be synchronized from the partner tenant. false causes any current user synchronization from the source tenant to the target tenant to stop. This property has no impact on existing users who have already been synchronized.
     * @param value Value to set for the isSyncAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSyncAllowed(@javax.annotation.Nullable final Boolean value) {
        this.isSyncAllowed = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
