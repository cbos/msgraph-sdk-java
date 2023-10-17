package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LandingPageDetail extends Entity implements Parsable {
    /**
     * The content property
     */
    private String content;
    /**
     * The isDefaultLangauge property
     */
    private Boolean isDefaultLangauge;
    /**
     * The language property
     */
    private String language;
    /**
     * Instantiates a new LandingPageDetail and sets the default values.
     */
    public LandingPageDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LandingPageDetail
     */
    @jakarta.annotation.Nonnull
    public static LandingPageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LandingPageDetail();
    }
    /**
     * Gets the content property value. The content property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("isDefaultLangauge", (n) -> { this.setIsDefaultLangauge(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultLangauge property value. The isDefaultLangauge property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultLangauge() {
        return this.isDefaultLangauge;
    }
    /**
     * Gets the language property value. The language property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeBooleanValue("isDefaultLangauge", this.getIsDefaultLangauge());
        writer.writeStringValue("language", this.getLanguage());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the isDefaultLangauge property value. The isDefaultLangauge property
     * @param value Value to set for the isDefaultLangauge property.
     */
    public void setIsDefaultLangauge(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefaultLangauge = value;
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
    }
}
