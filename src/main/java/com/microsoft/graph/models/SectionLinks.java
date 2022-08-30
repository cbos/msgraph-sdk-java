package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SectionLinks implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Opens the section in the OneNote native client if it's installed. */
    private ExternalLink _oneNoteClientUrl;
    /** Opens the section in OneNote on the web. */
    private ExternalLink _oneNoteWebUrl;
    /**
     * Instantiates a new sectionLinks and sets the default values.
     * @return a void
     */
    public SectionLinks() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sectionLinks");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sectionLinks
     */
    @javax.annotation.Nonnull
    public static SectionLinks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SectionLinks();
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
        final SectionLinks currentObject = this;
        return new HashMap<>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("oneNoteClientUrl", (n) -> { currentObject.setOneNoteClientUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
            this.put("oneNoteWebUrl", (n) -> { currentObject.setOneNoteWebUrl(n.getObjectValue(ExternalLink::createFromDiscriminatorValue)); });
        }};
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
     * Gets the oneNoteClientUrl property value. Opens the section in the OneNote native client if it's installed.
     * @return a externalLink
     */
    @javax.annotation.Nullable
    public ExternalLink getOneNoteClientUrl() {
        return this._oneNoteClientUrl;
    }
    /**
     * Gets the oneNoteWebUrl property value. Opens the section in OneNote on the web.
     * @return a externalLink
     */
    @javax.annotation.Nullable
    public ExternalLink getOneNoteWebUrl() {
        return this._oneNoteWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("oneNoteClientUrl", this.getOneNoteClientUrl());
        writer.writeObjectValue("oneNoteWebUrl", this.getOneNoteWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the oneNoteClientUrl property value. Opens the section in the OneNote native client if it's installed.
     * @param value Value to set for the oneNoteClientUrl property.
     * @return a void
     */
    public void setOneNoteClientUrl(@javax.annotation.Nullable final ExternalLink value) {
        this._oneNoteClientUrl = value;
    }
    /**
     * Sets the oneNoteWebUrl property value. Opens the section in OneNote on the web.
     * @param value Value to set for the oneNoteWebUrl property.
     * @return a void
     */
    public void setOneNoteWebUrl(@javax.annotation.Nullable final ExternalLink value) {
        this._oneNoteWebUrl = value;
    }
}
