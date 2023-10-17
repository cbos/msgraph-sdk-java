package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifiedDomain implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * For example, Email, OfficeCommunicationsOnline.
     */
    private String capabilities;
    /**
     * true if this is the default domain associated with the tenant; otherwise, false.
     */
    private Boolean isDefault;
    /**
     * true if this is the initial domain associated with the tenant; otherwise, false.
     */
    private Boolean isInitial;
    /**
     * The domain name; for example, contoso.onmicrosoft.com.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * For example, Managed.
     */
    private String type;
    /**
     * Instantiates a new VerifiedDomain and sets the default values.
     */
    public VerifiedDomain() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VerifiedDomain
     */
    @jakarta.annotation.Nonnull
    public static VerifiedDomain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedDomain();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the capabilities property value. For example, Email, OfficeCommunicationsOnline.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCapabilities() {
        return this.capabilities;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isInitial", (n) -> { this.setIsInitial(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. true if this is the default domain associated with the tenant; otherwise, false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isInitial property value. true if this is the initial domain associated with the tenant; otherwise, false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInitial() {
        return this.isInitial;
    }
    /**
     * Gets the name property value. The domain name; for example, contoso.onmicrosoft.com.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. For example, Managed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("capabilities", this.getCapabilities());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isInitial", this.getIsInitial());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the capabilities property value. For example, Email, OfficeCommunicationsOnline.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final String value) {
        this.capabilities = value;
    }
    /**
     * Sets the isDefault property value. true if this is the default domain associated with the tenant; otherwise, false.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isInitial property value. true if this is the initial domain associated with the tenant; otherwise, false.
     * @param value Value to set for the isInitial property.
     */
    public void setIsInitial(@jakarta.annotation.Nullable final Boolean value) {
        this.isInitial = value;
    }
    /**
     * Sets the name property value. The domain name; for example, contoso.onmicrosoft.com.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. For example, Managed.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
