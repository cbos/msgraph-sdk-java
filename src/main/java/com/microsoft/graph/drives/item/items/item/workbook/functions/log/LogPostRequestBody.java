package com.microsoft.graph.drives.item.items.item.workbook.functions.log;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The base property
     */
    private Json base;
    /**
     * The number property
     */
    private Json number;
    /**
     * Instantiates a new logPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LogPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LogPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogPostRequestBody();
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
     * Gets the base property value. The base property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getBase() {
        return this.base;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("base", (n) -> { this.setBase(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumber() {
        return this.number;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("base", this.getBase());
        writer.writeObjectValue("number", this.getNumber());
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
     * Sets the base property value. The base property
     * @param value Value to set for the base property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBase(@jakarta.annotation.Nullable final Json value) {
        this.base = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNumber(@jakarta.annotation.Nullable final Json value) {
        this.number = value;
    }
}
