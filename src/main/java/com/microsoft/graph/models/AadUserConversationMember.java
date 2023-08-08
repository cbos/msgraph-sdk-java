package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AadUserConversationMember extends ConversationMember implements Parsable {
    /**
     * The email address of the user.
     */
    private String email;
    /**
     * TenantId which the Azure AD user belongs to.
     */
    private String tenantId;
    /**
     * The user property
     */
    private User user;
    /**
     * The guid of the user.
     */
    private String userId;
    /**
     * Instantiates a new aadUserConversationMember and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AadUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.aadUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a aadUserConversationMember
     */
    @jakarta.annotation.Nonnull
    public static AadUserConversationMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AadUserConversationMember();
    }
    /**
     * Gets the email property value. The email address of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. TenantId which the Azure AD user belongs to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the user property value. The user property
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getUser() {
        return this.user;
    }
    /**
     * Gets the userId property value. The guid of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the email property value. The email address of the user.
     * @param value Value to set for the email property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the tenantId property value. TenantId which the Azure AD user belongs to.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUser(@jakarta.annotation.Nullable final User value) {
        this.user = value;
    }
    /**
     * Sets the userId property value. The guid of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
