package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains return code properties for a Win32 App
 */
public class Win32LobAppReturnCode implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Return code.
     */
    private Integer returnCode;
    /**
     * Indicates the type of return code.
     */
    private Win32LobAppReturnCodeType type;
    /**
     * Instantiates a new win32LobAppReturnCode and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Win32LobAppReturnCode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppReturnCode
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppReturnCode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppReturnCode();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("returnCode", (n) -> { this.setReturnCode(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(Win32LobAppReturnCodeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the returnCode property value. Return code.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getReturnCode() {
        return this.returnCode;
    }
    /**
     * Gets the type property value. Indicates the type of return code.
     * @return a win32LobAppReturnCodeType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppReturnCodeType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("returnCode", this.getReturnCode());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the returnCode property value. Return code.
     * @param value Value to set for the returnCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReturnCode(@jakarta.annotation.Nullable final Integer value) {
        this.returnCode = value;
    }
    /**
     * Sets the type property value. Indicates the type of return code.
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final Win32LobAppReturnCodeType value) {
        this.type = value;
    }
}
