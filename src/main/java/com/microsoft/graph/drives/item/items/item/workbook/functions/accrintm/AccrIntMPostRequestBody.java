package com.microsoft.graph.drives.item.items.item.workbook.functions.accrintm;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccrIntMPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The basis property */
    private Json basis;
    /** The issue property */
    private Json issue;
    /** The par property */
    private Json par;
    /** The rate property */
    private Json rate;
    /** The settlement property */
    private Json settlement;
    /**
     * Instantiates a new accrIntMPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccrIntMPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accrIntMPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AccrIntMPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccrIntMPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("issue", (n) -> { this.setIssue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("par", (n) -> { this.setPar(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the issue property value. The issue property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getIssue() {
        return this.issue;
    }
    /**
     * Gets the par property value. The par property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPar() {
        return this.par;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRate() {
        return this.rate;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("issue", this.getIssue());
        writer.writeObjectValue("par", this.getPar());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("settlement", this.getSettlement());
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
     * Sets the issue property value. The issue property
     * @param value Value to set for the issue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssue(@javax.annotation.Nullable final Json value) {
        this.issue = value;
    }
    /**
     * Sets the par property value. The par property
     * @param value Value to set for the par property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPar(@javax.annotation.Nullable final Json value) {
        this.par = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRate(@javax.annotation.Nullable final Json value) {
        this.rate = value;
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
}
