package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentApprovalSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If false, then approval is not required for new requests in this policy. */
    private Boolean _isApprovalRequiredForAdd;
    /** If false, then approval is not required for updates to requests in this policy. */
    private Boolean _isApprovalRequiredForUpdate;
    /** The OdataType property */
    private String _odataType;
    /** If approval is required, the one, two or three elements of this collection define each of the stages of approval. An empty array is present if no approval is required. */
    private java.util.List<AccessPackageApprovalStage> _stages;
    /**
     * Instantiates a new accessPackageAssignmentApprovalSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentApprovalSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentApprovalSettings
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentApprovalSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentApprovalSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("isApprovalRequiredForAdd", (n) -> { this.setIsApprovalRequiredForAdd(n.getBooleanValue()); });
        deserializerMap.put("isApprovalRequiredForUpdate", (n) -> { this.setIsApprovalRequiredForUpdate(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("stages", (n) -> { this.setStages(n.getCollectionOfObjectValues(AccessPackageApprovalStage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApprovalRequiredForAdd property value. If false, then approval is not required for new requests in this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForAdd() {
        return this._isApprovalRequiredForAdd;
    }
    /**
     * Gets the isApprovalRequiredForUpdate property value. If false, then approval is not required for updates to requests in this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForUpdate() {
        return this._isApprovalRequiredForUpdate;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the stages property value. If approval is required, the one, two or three elements of this collection define each of the stages of approval. An empty array is present if no approval is required.
     * @return a accessPackageApprovalStage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageApprovalStage> getStages() {
        return this._stages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isApprovalRequiredForAdd", this.getIsApprovalRequiredForAdd());
        writer.writeBooleanValue("isApprovalRequiredForUpdate", this.getIsApprovalRequiredForUpdate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("stages", this.getStages());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isApprovalRequiredForAdd property value. If false, then approval is not required for new requests in this policy.
     * @param value Value to set for the isApprovalRequiredForAdd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApprovalRequiredForAdd(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForAdd = value;
    }
    /**
     * Sets the isApprovalRequiredForUpdate property value. If false, then approval is not required for updates to requests in this policy.
     * @param value Value to set for the isApprovalRequiredForUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsApprovalRequiredForUpdate(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForUpdate = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the stages property value. If approval is required, the one, two or three elements of this collection define each of the stages of approval. An empty array is present if no approval is required.
     * @param value Value to set for the stages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStages(@javax.annotation.Nullable final java.util.List<AccessPackageApprovalStage> value) {
        this._stages = value;
    }
}
