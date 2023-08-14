package com.microsoft.graph.drives.item.items.item.permissions.item.grant;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GrantPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The recipients property
     */
    private java.util.List<DriveRecipient> recipients;
    /**
     * The roles property
     */
    private java.util.List<String> roles;
    /**
     * Instantiates a new grantPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GrantPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a grantPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GrantPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GrantPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a driveRecipient
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this.recipients;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.roles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
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
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this.recipients = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roles = value;
    }
}
