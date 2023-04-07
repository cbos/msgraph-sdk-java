package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Fido2KeyRestrictions implements AdditionalDataHolder, Parsable {
    /** A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers. */
    private java.util.List<String> aaGuids;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Enforcement type. Possible values are: allow, block. */
    private Fido2RestrictionEnforcementType enforcementType;
    /** Determines if the configured key enforcement is enabled. */
    private Boolean isEnforced;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new fido2KeyRestrictions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Fido2KeyRestrictions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fido2KeyRestrictions
     */
    @javax.annotation.Nonnull
    public static Fido2KeyRestrictions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2KeyRestrictions();
    }
    /**
     * Gets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAaGuids() {
        return this.aaGuids;
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
     * Gets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @return a fido2RestrictionEnforcementType
     */
    @javax.annotation.Nullable
    public Fido2RestrictionEnforcementType getEnforcementType() {
        return this.enforcementType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("aaGuids", (n) -> { this.setAaGuids(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enforcementType", (n) -> { this.setEnforcementType(n.getEnumValue(Fido2RestrictionEnforcementType.class)); });
        deserializerMap.put("isEnforced", (n) -> { this.setIsEnforced(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnforced() {
        return this.isEnforced;
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
        writer.writeCollectionOfPrimitiveValues("aaGuids", this.getAaGuids());
        writer.writeEnumValue("enforcementType", this.getEnforcementType());
        writer.writeBooleanValue("isEnforced", this.getIsEnforced());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @param value Value to set for the aaGuids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAaGuids(@javax.annotation.Nullable final java.util.List<String> value) {
        this.aaGuids = value;
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
     * Sets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @param value Value to set for the enforcementType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcementType(@javax.annotation.Nullable final Fido2RestrictionEnforcementType value) {
        this.enforcementType = value;
    }
    /**
     * Sets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @param value Value to set for the isEnforced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnforced(@javax.annotation.Nullable final Boolean value) {
        this.isEnforced = value;
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
