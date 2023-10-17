package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SectionLinks implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Opens the section in the OneNote native client if it's installed.
     */
    private ExternalLink oneNoteClientUrl;
    /**
     * Opens the section in OneNote on the web.
     */
    private ExternalLink oneNoteWebUrl;
    /**
     * Instantiates a new SectionLinks and sets the default values.
     */
    public SectionLinks() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SectionLinks
     */
    @jakarta.annotation.Nonnull
    public static SectionLinks createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SectionLinks();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oneNoteClientUrl", (n) -> { this.setOneNoteClientUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
        deserializerMap.put("oneNoteWebUrl", (n) -> { this.setOneNoteWebUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the oneNoteClientUrl property value. Opens the section in the OneNote native client if it's installed.
     * @return a ExternalLink
     */
    @jakarta.annotation.Nullable
    public ExternalLink getOneNoteClientUrl() {
        return this.oneNoteClientUrl;
    }
    /**
     * Gets the oneNoteWebUrl property value. Opens the section in OneNote on the web.
     * @return a ExternalLink
     */
    @jakarta.annotation.Nullable
    public ExternalLink getOneNoteWebUrl() {
        return this.oneNoteWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("oneNoteClientUrl", this.getOneNoteClientUrl());
        writer.writeObjectValue("oneNoteWebUrl", this.getOneNoteWebUrl());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the oneNoteClientUrl property value. Opens the section in the OneNote native client if it's installed.
     * @param value Value to set for the oneNoteClientUrl property.
     */
    public void setOneNoteClientUrl(@jakarta.annotation.Nullable final ExternalLink value) {
        this.oneNoteClientUrl = value;
    }
    /**
     * Sets the oneNoteWebUrl property value. Opens the section in OneNote on the web.
     * @param value Value to set for the oneNoteWebUrl property.
     */
    public void setOneNoteWebUrl(@jakarta.annotation.Nullable final ExternalLink value) {
        this.oneNoteWebUrl = value;
    }
}
