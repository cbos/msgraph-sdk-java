package com.microsoft.graph.drives.item.items.item.workbook.functions.vdb;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VdbPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cost property
     */
    private Json cost;
    /**
     * The endPeriod property
     */
    private Json endPeriod;
    /**
     * The factor property
     */
    private Json factor;
    /**
     * The life property
     */
    private Json life;
    /**
     * The noSwitch property
     */
    private Json noSwitch;
    /**
     * The salvage property
     */
    private Json salvage;
    /**
     * The startPeriod property
     */
    private Json startPeriod;
    /**
     * Instantiates a new VdbPostRequestBody and sets the default values.
     */
    public VdbPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VdbPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VdbPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VdbPostRequestBody();
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
     * Gets the cost property value. The cost property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCost() {
        return this.cost;
    }
    /**
     * Gets the endPeriod property value. The endPeriod property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getEndPeriod() {
        return this.endPeriod;
    }
    /**
     * Gets the factor property value. The factor property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFactor() {
        return this.factor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("cost", (n) -> { this.setCost(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("endPeriod", (n) -> { this.setEndPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("factor", (n) -> { this.setFactor(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("life", (n) -> { this.setLife(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("noSwitch", (n) -> { this.setNoSwitch(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("salvage", (n) -> { this.setSalvage(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startPeriod", (n) -> { this.setStartPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the life property value. The life property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLife() {
        return this.life;
    }
    /**
     * Gets the noSwitch property value. The noSwitch property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNoSwitch() {
        return this.noSwitch;
    }
    /**
     * Gets the salvage property value. The salvage property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSalvage() {
        return this.salvage;
    }
    /**
     * Gets the startPeriod property value. The startPeriod property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getStartPeriod() {
        return this.startPeriod;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cost", this.getCost());
        writer.writeObjectValue("endPeriod", this.getEndPeriod());
        writer.writeObjectValue("factor", this.getFactor());
        writer.writeObjectValue("life", this.getLife());
        writer.writeObjectValue("noSwitch", this.getNoSwitch());
        writer.writeObjectValue("salvage", this.getSalvage());
        writer.writeObjectValue("startPeriod", this.getStartPeriod());
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
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     */
    public void setCost(@jakarta.annotation.Nullable final Json value) {
        this.cost = value;
    }
    /**
     * Sets the endPeriod property value. The endPeriod property
     * @param value Value to set for the endPeriod property.
     */
    public void setEndPeriod(@jakarta.annotation.Nullable final Json value) {
        this.endPeriod = value;
    }
    /**
     * Sets the factor property value. The factor property
     * @param value Value to set for the factor property.
     */
    public void setFactor(@jakarta.annotation.Nullable final Json value) {
        this.factor = value;
    }
    /**
     * Sets the life property value. The life property
     * @param value Value to set for the life property.
     */
    public void setLife(@jakarta.annotation.Nullable final Json value) {
        this.life = value;
    }
    /**
     * Sets the noSwitch property value. The noSwitch property
     * @param value Value to set for the noSwitch property.
     */
    public void setNoSwitch(@jakarta.annotation.Nullable final Json value) {
        this.noSwitch = value;
    }
    /**
     * Sets the salvage property value. The salvage property
     * @param value Value to set for the salvage property.
     */
    public void setSalvage(@jakarta.annotation.Nullable final Json value) {
        this.salvage = value;
    }
    /**
     * Sets the startPeriod property value. The startPeriod property
     * @param value Value to set for the startPeriod property.
     */
    public void setStartPeriod(@jakarta.annotation.Nullable final Json value) {
        this.startPeriod = value;
    }
}
