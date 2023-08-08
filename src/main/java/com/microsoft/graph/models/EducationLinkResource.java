package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationLinkResource extends EducationResource implements Parsable {
    /**
     * URL to the resource.
     */
    private String link;
    /**
     * Instantiates a new educationLinkResource and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EducationLinkResource() {
        super();
        this.setOdataType("#microsoft.graph.educationLinkResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationLinkResource
     */
    @jakarta.annotation.Nonnull
    public static EducationLinkResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationLinkResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("link", (n) -> { this.setLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the link property value. URL to the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLink() {
        return this.link;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("link", this.getLink());
    }
    /**
     * Sets the link property value. URL to the resource.
     * @param value Value to set for the link property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLink(@jakarta.annotation.Nullable final String value) {
        this.link = value;
    }
}
