package com.microsoft.graph.contacts.item.getmembergroups;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetMemberGroupsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The securityEnabledOnly property
     */
    private Boolean securityEnabledOnly;
    /**
     * Instantiates a new getMemberGroupsPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GetMemberGroupsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getMemberGroupsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetMemberGroupsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMemberGroupsPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("securityEnabledOnly", (n) -> { this.setSecurityEnabledOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityEnabledOnly property value. The securityEnabledOnly property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityEnabledOnly() {
        return this.securityEnabledOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("securityEnabledOnly", this.getSecurityEnabledOnly());
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
     * Sets the securityEnabledOnly property value. The securityEnabledOnly property
     * @param value Value to set for the securityEnabledOnly property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecurityEnabledOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.securityEnabledOnly = value;
    }
}
