package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailboxSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Folder ID of an archive folder for the user. */
    private String archiveFolder;
    /** Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user. */
    private AutomaticRepliesSetting automaticRepliesSetting;
    /** The date format for the user's mailbox. */
    private String dateFormat;
    /** If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly. */
    private DelegateMeetingMessageDeliveryOptions delegateMeetingMessageDeliveryOptions;
    /** The locale information for the user, including the preferred language and country/region. */
    private LocaleInfo language;
    /** The OdataType property */
    private String odataType;
    /** The time format for the user's mailbox. */
    private String timeFormat;
    /** The default time zone for the user's mailbox. */
    private String timeZone;
    /** The purpose of the mailbox. Differentiates a mailbox for a single user from a shared mailbox and equipment mailbox in Exchange Online. Possible values are: user, linked, shared, room, equipment, others, unknownFutureValue. Read-only. */
    private UserPurpose userPurpose;
    /** The days of the week and hours in a specific time zone that the user works. */
    private WorkingHours workingHours;
    /**
     * Instantiates a new mailboxSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailboxSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailboxSettings
     */
    @javax.annotation.Nonnull
    public static MailboxSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxSettings();
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
     * Gets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getArchiveFolder() {
        return this.archiveFolder;
    }
    /**
     * Gets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @return a automaticRepliesSetting
     */
    @javax.annotation.Nullable
    public AutomaticRepliesSetting getAutomaticRepliesSetting() {
        return this.automaticRepliesSetting;
    }
    /**
     * Gets the dateFormat property value. The date format for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDateFormat() {
        return this.dateFormat;
    }
    /**
     * Gets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @return a delegateMeetingMessageDeliveryOptions
     */
    @javax.annotation.Nullable
    public DelegateMeetingMessageDeliveryOptions getDelegateMeetingMessageDeliveryOptions() {
        return this.delegateMeetingMessageDeliveryOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("archiveFolder", (n) -> { this.setArchiveFolder(n.getStringValue()); });
        deserializerMap.put("automaticRepliesSetting", (n) -> { this.setAutomaticRepliesSetting(n.getObjectValue(AutomaticRepliesSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("dateFormat", (n) -> { this.setDateFormat(n.getStringValue()); });
        deserializerMap.put("delegateMeetingMessageDeliveryOptions", (n) -> { this.setDelegateMeetingMessageDeliveryOptions(n.getEnumValue(DelegateMeetingMessageDeliveryOptions.class)); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeFormat", (n) -> { this.setTimeFormat(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("userPurpose", (n) -> { this.setUserPurpose(n.getEnumValue(UserPurpose.class)); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getObjectValue(WorkingHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. The locale information for the user, including the preferred language and country/region.
     * @return a localeInfo
     */
    @javax.annotation.Nullable
    public LocaleInfo getLanguage() {
        return this.language;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the timeFormat property value. The time format for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeFormat() {
        return this.timeFormat;
    }
    /**
     * Gets the timeZone property value. The default time zone for the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Gets the userPurpose property value. The purpose of the mailbox. Differentiates a mailbox for a single user from a shared mailbox and equipment mailbox in Exchange Online. Possible values are: user, linked, shared, room, equipment, others, unknownFutureValue. Read-only.
     * @return a userPurpose
     */
    @javax.annotation.Nullable
    public UserPurpose getUserPurpose() {
        return this.userPurpose;
    }
    /**
     * Gets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @return a workingHours
     */
    @javax.annotation.Nullable
    public WorkingHours getWorkingHours() {
        return this.workingHours;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("archiveFolder", this.getArchiveFolder());
        writer.writeObjectValue("automaticRepliesSetting", this.getAutomaticRepliesSetting());
        writer.writeStringValue("dateFormat", this.getDateFormat());
        writer.writeEnumValue("delegateMeetingMessageDeliveryOptions", this.getDelegateMeetingMessageDeliveryOptions());
        writer.writeObjectValue("language", this.getLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("timeFormat", this.getTimeFormat());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeEnumValue("userPurpose", this.getUserPurpose());
        writer.writeObjectValue("workingHours", this.getWorkingHours());
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
     * Sets the archiveFolder property value. Folder ID of an archive folder for the user.
     * @param value Value to set for the archiveFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArchiveFolder(@javax.annotation.Nullable final String value) {
        this.archiveFolder = value;
    }
    /**
     * Sets the automaticRepliesSetting property value. Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
     * @param value Value to set for the automaticRepliesSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticRepliesSetting(@javax.annotation.Nullable final AutomaticRepliesSetting value) {
        this.automaticRepliesSetting = value;
    }
    /**
     * Sets the dateFormat property value. The date format for the user's mailbox.
     * @param value Value to set for the dateFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateFormat(@javax.annotation.Nullable final String value) {
        this.dateFormat = value;
    }
    /**
     * Sets the delegateMeetingMessageDeliveryOptions property value. If the user has a calendar delegate, this specifies whether the delegate, mailbox owner, or both receive meeting messages and meeting responses. Possible values are: sendToDelegateAndInformationToPrincipal, sendToDelegateAndPrincipal, sendToDelegateOnly.
     * @param value Value to set for the delegateMeetingMessageDeliveryOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelegateMeetingMessageDeliveryOptions(@javax.annotation.Nullable final DelegateMeetingMessageDeliveryOptions value) {
        this.delegateMeetingMessageDeliveryOptions = value;
    }
    /**
     * Sets the language property value. The locale information for the user, including the preferred language and country/region.
     * @param value Value to set for the language property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguage(@javax.annotation.Nullable final LocaleInfo value) {
        this.language = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the timeFormat property value. The time format for the user's mailbox.
     * @param value Value to set for the timeFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeFormat(@javax.annotation.Nullable final String value) {
        this.timeFormat = value;
    }
    /**
     * Sets the timeZone property value. The default time zone for the user's mailbox.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this.timeZone = value;
    }
    /**
     * Sets the userPurpose property value. The purpose of the mailbox. Differentiates a mailbox for a single user from a shared mailbox and equipment mailbox in Exchange Online. Possible values are: user, linked, shared, room, equipment, others, unknownFutureValue. Read-only.
     * @param value Value to set for the userPurpose property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPurpose(@javax.annotation.Nullable final UserPurpose value) {
        this.userPurpose = value;
    }
    /**
     * Sets the workingHours property value. The days of the week and hours in a specific time zone that the user works.
     * @param value Value to set for the workingHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkingHours(@javax.annotation.Nullable final WorkingHours value) {
        this.workingHours = value;
    }
}
