package com.microsoft.graph.drives.item.items.item.workbook.functions.mduration;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MdurationPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The basis property */
    private Json basis;
    /** The coupon property */
    private Json coupon;
    /** The frequency property */
    private Json frequency;
    /** The maturity property */
    private Json maturity;
    /** The settlement property */
    private Json settlement;
    /** The yld property */
    private Json yld;
    /**
     * Instantiates a new mdurationPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MdurationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mdurationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MdurationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MdurationPostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getBasis() {
        return this.basis;
    }
    /**
     * Gets the coupon property value. The coupon property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCoupon() {
        return this.coupon;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("coupon", (n) -> { this.setCoupon(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("yld", (n) -> { this.setYld(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the frequency property value. The frequency property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFrequency() {
        return this.frequency;
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMaturity() {
        return this.maturity;
    }
    /**
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSettlement() {
        return this.settlement;
    }
    /**
     * Gets the yld property value. The yld property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getYld() {
        return this.yld;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("coupon", this.getCoupon());
        writer.writeObjectValue("frequency", this.getFrequency());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("settlement", this.getSettlement());
        writer.writeObjectValue("yld", this.getYld());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBasis(@javax.annotation.Nullable final Json value) {
        this.basis = value;
    }
    /**
     * Sets the coupon property value. The coupon property
     * @param value Value to set for the coupon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoupon(@javax.annotation.Nullable final Json value) {
        this.coupon = value;
    }
    /**
     * Sets the frequency property value. The frequency property
     * @param value Value to set for the frequency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrequency(@javax.annotation.Nullable final Json value) {
        this.frequency = value;
    }
    /**
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaturity(@javax.annotation.Nullable final Json value) {
        this.maturity = value;
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettlement(@javax.annotation.Nullable final Json value) {
        this.settlement = value;
    }
    /**
     * Sets the yld property value. The yld property
     * @param value Value to set for the yld property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYld(@javax.annotation.Nullable final Json value) {
        this.yld = value;
    }
}
