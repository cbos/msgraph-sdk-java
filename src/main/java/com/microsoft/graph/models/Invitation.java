package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Invitation extends Entity implements Parsable {
    /** The user created as part of the invitation creation. Read-Only */
    private User invitedUser;
    /** The display name of the user being invited. */
    private String invitedUserDisplayName;
    /** The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon (;)Colon (:)Quotation marks (')Angle brackets (< >)Question mark (?)Comma (,)However, the following exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name. */
    private String invitedUserEmailAddress;
    /** Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list. */
    private InvitedUserMessageInfo invitedUserMessageInfo;
    /** The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company administrator. */
    private String invitedUserType;
    /** The URL the user can use to redeem their invitation. Read-only. */
    private String inviteRedeemUrl;
    /** The URL the user should be redirected to once the invitation is redeemed. Required. */
    private String inviteRedirectUrl;
    /** Reset the user's redemption status and reinvite a user while retaining their user identifier, group memberships, and app assignments. This property allows you to enable a user to sign-in using a different email address from the one in the previous invitation. For more information about using this property, see Reset redemption status for a guest user. */
    private Boolean resetRedemption;
    /** Indicates whether an email should be sent to the user being invited. The default is false. */
    private Boolean sendInvitationMessage;
    /** The status of the invitation. Possible values are: PendingAcceptance, Completed, InProgress, and Error. */
    private String status;
    /**
     * Instantiates a new Invitation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Invitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Invitation
     */
    @javax.annotation.Nonnull
    public static Invitation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invitation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("invitedUser", (n) -> { this.setInvitedUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedUserDisplayName", (n) -> { this.setInvitedUserDisplayName(n.getStringValue()); });
        deserializerMap.put("invitedUserEmailAddress", (n) -> { this.setInvitedUserEmailAddress(n.getStringValue()); });
        deserializerMap.put("invitedUserMessageInfo", (n) -> { this.setInvitedUserMessageInfo(n.getObjectValue(InvitedUserMessageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedUserType", (n) -> { this.setInvitedUserType(n.getStringValue()); });
        deserializerMap.put("inviteRedeemUrl", (n) -> { this.setInviteRedeemUrl(n.getStringValue()); });
        deserializerMap.put("inviteRedirectUrl", (n) -> { this.setInviteRedirectUrl(n.getStringValue()); });
        deserializerMap.put("resetRedemption", (n) -> { this.setResetRedemption(n.getBooleanValue()); });
        deserializerMap.put("sendInvitationMessage", (n) -> { this.setSendInvitationMessage(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @return a user
     */
    @javax.annotation.Nullable
    public User getInvitedUser() {
        return this.invitedUser;
    }
    /**
     * Gets the invitedUserDisplayName property value. The display name of the user being invited.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserDisplayName() {
        return this.invitedUserDisplayName;
    }
    /**
     * Gets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon (;)Colon (:)Quotation marks (')Angle brackets (< >)Question mark (?)Comma (,)However, the following exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserEmailAddress() {
        return this.invitedUserEmailAddress;
    }
    /**
     * Gets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @return a invitedUserMessageInfo
     */
    @javax.annotation.Nullable
    public InvitedUserMessageInfo getInvitedUserMessageInfo() {
        return this.invitedUserMessageInfo;
    }
    /**
     * Gets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company administrator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserType() {
        return this.invitedUserType;
    }
    /**
     * Gets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteRedeemUrl() {
        return this.inviteRedeemUrl;
    }
    /**
     * Gets the inviteRedirectUrl property value. The URL the user should be redirected to once the invitation is redeemed. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteRedirectUrl() {
        return this.inviteRedirectUrl;
    }
    /**
     * Gets the resetRedemption property value. Reset the user's redemption status and reinvite a user while retaining their user identifier, group memberships, and app assignments. This property allows you to enable a user to sign-in using a different email address from the one in the previous invitation. For more information about using this property, see Reset redemption status for a guest user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResetRedemption() {
        return this.resetRedemption;
    }
    /**
     * Gets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendInvitationMessage() {
        return this.sendInvitationMessage;
    }
    /**
     * Gets the status property value. The status of the invitation. Possible values are: PendingAcceptance, Completed, InProgress, and Error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("invitedUser", this.getInvitedUser());
        writer.writeStringValue("invitedUserDisplayName", this.getInvitedUserDisplayName());
        writer.writeStringValue("invitedUserEmailAddress", this.getInvitedUserEmailAddress());
        writer.writeObjectValue("invitedUserMessageInfo", this.getInvitedUserMessageInfo());
        writer.writeStringValue("invitedUserType", this.getInvitedUserType());
        writer.writeStringValue("inviteRedeemUrl", this.getInviteRedeemUrl());
        writer.writeStringValue("inviteRedirectUrl", this.getInviteRedirectUrl());
        writer.writeBooleanValue("resetRedemption", this.getResetRedemption());
        writer.writeBooleanValue("sendInvitationMessage", this.getSendInvitationMessage());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @param value Value to set for the invitedUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUser(@javax.annotation.Nullable final User value) {
        this.invitedUser = value;
    }
    /**
     * Sets the invitedUserDisplayName property value. The display name of the user being invited.
     * @param value Value to set for the invitedUserDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUserDisplayName(@javax.annotation.Nullable final String value) {
        this.invitedUserDisplayName = value;
    }
    /**
     * Sets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon (;)Colon (:)Quotation marks (')Angle brackets (< >)Question mark (?)Comma (,)However, the following exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
     * @param value Value to set for the invitedUserEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUserEmailAddress(@javax.annotation.Nullable final String value) {
        this.invitedUserEmailAddress = value;
    }
    /**
     * Sets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @param value Value to set for the invitedUserMessageInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUserMessageInfo(@javax.annotation.Nullable final InvitedUserMessageInfo value) {
        this.invitedUserMessageInfo = value;
    }
    /**
     * Sets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company administrator.
     * @param value Value to set for the invitedUserType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvitedUserType(@javax.annotation.Nullable final String value) {
        this.invitedUserType = value;
    }
    /**
     * Sets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @param value Value to set for the inviteRedeemUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInviteRedeemUrl(@javax.annotation.Nullable final String value) {
        this.inviteRedeemUrl = value;
    }
    /**
     * Sets the inviteRedirectUrl property value. The URL the user should be redirected to once the invitation is redeemed. Required.
     * @param value Value to set for the inviteRedirectUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInviteRedirectUrl(@javax.annotation.Nullable final String value) {
        this.inviteRedirectUrl = value;
    }
    /**
     * Sets the resetRedemption property value. Reset the user's redemption status and reinvite a user while retaining their user identifier, group memberships, and app assignments. This property allows you to enable a user to sign-in using a different email address from the one in the previous invitation. For more information about using this property, see Reset redemption status for a guest user.
     * @param value Value to set for the resetRedemption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResetRedemption(@javax.annotation.Nullable final Boolean value) {
        this.resetRedemption = value;
    }
    /**
     * Sets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @param value Value to set for the sendInvitationMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSendInvitationMessage(@javax.annotation.Nullable final Boolean value) {
        this.sendInvitationMessage = value;
    }
    /**
     * Sets the status property value. The status of the invitation. Possible values are: PendingAcceptance, Completed, InProgress, and Error.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
