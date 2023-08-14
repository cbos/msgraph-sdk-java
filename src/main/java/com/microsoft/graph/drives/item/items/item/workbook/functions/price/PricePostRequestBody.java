package com.microsoft.graph.drives.item.items.item.workbook.functions.price;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PricePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The basis property
     */
    private Json basis;
    /**
     * The frequency property
     */
    private Json frequency;
    /**
     * The maturity property
     */
    private Json maturity;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The redemption property
     */
    private Json redemption;
    /**
     * The settlement property
     */
    private Json settlement;
    /**
     * The yld property
     */
    private Json yld;
    /**
     * Instantiates a new pricePostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PricePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pricePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PricePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PricePostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getBasis() {
        return this.basis;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("redemption", (n) -> { this.setRedemption(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("yld", (n) -> { this.setYld(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the frequency property value. The frequency property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFrequency() {
        return this.frequency;
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMaturity() {
        return this.maturity;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRate() {
        return this.rate;
    }
    /**
     * Gets the redemption property value. The redemption property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRedemption() {
        return this.redemption;
    }
    /**
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSettlement() {
        return this.settlement;
    }
    /**
     * Gets the yld property value. The yld property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getYld() {
        return this.yld;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("frequency", this.getFrequency());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("redemption", this.getRedemption());
        writer.writeObjectValue("settlement", this.getSettlement());
        writer.writeObjectValue("yld", this.getYld());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBasis(@jakarta.annotation.Nullable final Json value) {
        this.basis = value;
    }
    /**
     * Sets the frequency property value. The frequency property
     * @param value Value to set for the frequency property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFrequency(@jakarta.annotation.Nullable final Json value) {
        this.frequency = value;
    }
    /**
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMaturity(@jakarta.annotation.Nullable final Json value) {
        this.maturity = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the redemption property value. The redemption property
     * @param value Value to set for the redemption property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRedemption(@jakarta.annotation.Nullable final Json value) {
        this.redemption = value;
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettlement(@jakarta.annotation.Nullable final Json value) {
        this.settlement = value;
    }
    /**
     * Sets the yld property value. The yld property
     * @param value Value to set for the yld property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setYld(@jakarta.annotation.Nullable final Json value) {
        this.yld = value;
    }
}
