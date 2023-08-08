package com.microsoft.graph.drives.item.items.item.workbook.functions.t_inv_2t;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TInv2TPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The degFreedom property
     */
    private Json degFreedom;
    /**
     * The probability property
     */
    private Json probability;
    /**
     * Instantiates a new TInv2TPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TInv2TPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TInv2TPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TInv2TPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TInv2TPostRequestBody();
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
     * Gets the degFreedom property value. The degFreedom property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDegFreedom() {
        return this.degFreedom;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("degFreedom", (n) -> { this.setDegFreedom(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probability", (n) -> { this.setProbability(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the probability property value. The probability property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProbability() {
        return this.probability;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("degFreedom", this.getDegFreedom());
        writer.writeObjectValue("probability", this.getProbability());
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
     * Sets the degFreedom property value. The degFreedom property
     * @param value Value to set for the degFreedom property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDegFreedom(@jakarta.annotation.Nullable final Json value) {
        this.degFreedom = value;
    }
    /**
     * Sets the probability property value. The probability property
     * @param value Value to set for the probability property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProbability(@jakarta.annotation.Nullable final Json value) {
        this.probability = value;
    }
}
