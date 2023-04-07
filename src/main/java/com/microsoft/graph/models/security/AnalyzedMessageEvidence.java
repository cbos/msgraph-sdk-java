package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AnalyzedMessageEvidence extends AlertEvidence implements Parsable {
    /** Direction of the email relative to your network. The possible values are: inbound, outbound or intraorg. */
    private String antiSpamDirection;
    /** Number of attachments in the email. */
    private Long attachmentsCount;
    /** Delivery action of the email. The possible values are: delivered, deliveredAsSpam, junked, blocked, or replaced. */
    private String deliveryAction;
    /** Location where the email was delivered. The possible values are: inbox, external, junkFolder, quarantine, failed, dropped, deletedFolder or forwarded. */
    private String deliveryLocation;
    /** Public-facing identifier for the email that is set by the sending email system. */
    private String internetMessageId;
    /** Detected language of the email content. */
    private String language;
    /** Unique identifier for the email, generated by Microsoft 365. */
    private String networkMessageId;
    /** The P1 sender. */
    private EmailSender p1Sender;
    /** The P2 sender. */
    private EmailSender p2Sender;
    /** Date and time when the email was received. */
    private OffsetDateTime receivedDateTime;
    /** Email address of the recipient, or email address of the recipient after distribution list expansion. */
    private String recipientEmailAddress;
    /** IP address of the last detected mail server that relayed the message. */
    private String senderIp;
    /** Subject of the email. */
    private String subject;
    /** Collection of methods used to detect malware, phishing, or other threats found in the email. */
    private java.util.List<String> threatDetectionMethods;
    /** Collection of detection names for malware or other threats found. */
    private java.util.List<String> threats;
    /** Number of embedded URLs in the email. */
    private Long urlCount;
    /** Collection of the URLs contained in this email. */
    private java.util.List<String> urls;
    /** Uniform resource name (URN) of the automated investigation where the cluster was identified. */
    private String urn;
    /**
     * Instantiates a new AnalyzedMessageEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AnalyzedMessageEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AnalyzedMessageEvidence
     */
    @javax.annotation.Nonnull
    public static AnalyzedMessageEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedMessageEvidence();
    }
    /**
     * Gets the antiSpamDirection property value. Direction of the email relative to your network. The possible values are: inbound, outbound or intraorg.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAntiSpamDirection() {
        return this.antiSpamDirection;
    }
    /**
     * Gets the attachmentsCount property value. Number of attachments in the email.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getAttachmentsCount() {
        return this.attachmentsCount;
    }
    /**
     * Gets the deliveryAction property value. Delivery action of the email. The possible values are: delivered, deliveredAsSpam, junked, blocked, or replaced.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryAction() {
        return this.deliveryAction;
    }
    /**
     * Gets the deliveryLocation property value. Location where the email was delivered. The possible values are: inbox, external, junkFolder, quarantine, failed, dropped, deletedFolder or forwarded.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("antiSpamDirection", (n) -> { this.setAntiSpamDirection(n.getStringValue()); });
        deserializerMap.put("attachmentsCount", (n) -> { this.setAttachmentsCount(n.getLongValue()); });
        deserializerMap.put("deliveryAction", (n) -> { this.setDeliveryAction(n.getStringValue()); });
        deserializerMap.put("deliveryLocation", (n) -> { this.setDeliveryLocation(n.getStringValue()); });
        deserializerMap.put("internetMessageId", (n) -> { this.setInternetMessageId(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("networkMessageId", (n) -> { this.setNetworkMessageId(n.getStringValue()); });
        deserializerMap.put("p1Sender", (n) -> { this.setP1Sender(n.getObjectValue(EmailSender::createFromDiscriminatorValue)); });
        deserializerMap.put("p2Sender", (n) -> { this.setP2Sender(n.getObjectValue(EmailSender::createFromDiscriminatorValue)); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipientEmailAddress", (n) -> { this.setRecipientEmailAddress(n.getStringValue()); });
        deserializerMap.put("senderIp", (n) -> { this.setSenderIp(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("threatDetectionMethods", (n) -> { this.setThreatDetectionMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("threats", (n) -> { this.setThreats(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("urlCount", (n) -> { this.setUrlCount(n.getLongValue()); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("urn", (n) -> { this.setUrn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internetMessageId property value. Public-facing identifier for the email that is set by the sending email system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternetMessageId() {
        return this.internetMessageId;
    }
    /**
     * Gets the language property value. Detected language of the email content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Gets the networkMessageId property value. Unique identifier for the email, generated by Microsoft 365.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkMessageId() {
        return this.networkMessageId;
    }
    /**
     * Gets the p1Sender property value. The P1 sender.
     * @return a emailSender
     */
    @javax.annotation.Nullable
    public EmailSender getP1Sender() {
        return this.p1Sender;
    }
    /**
     * Gets the p2Sender property value. The P2 sender.
     * @return a emailSender
     */
    @javax.annotation.Nullable
    public EmailSender getP2Sender() {
        return this.p2Sender;
    }
    /**
     * Gets the receivedDateTime property value. Date and time when the email was received.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.receivedDateTime;
    }
    /**
     * Gets the recipientEmailAddress property value. Email address of the recipient, or email address of the recipient after distribution list expansion.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmailAddress() {
        return this.recipientEmailAddress;
    }
    /**
     * Gets the senderIp property value. IP address of the last detected mail server that relayed the message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderIp() {
        return this.senderIp;
    }
    /**
     * Gets the subject property value. Subject of the email.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the threatDetectionMethods property value. Collection of methods used to detect malware, phishing, or other threats found in the email.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreatDetectionMethods() {
        return this.threatDetectionMethods;
    }
    /**
     * Gets the threats property value. Collection of detection names for malware or other threats found.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this.threats;
    }
    /**
     * Gets the urlCount property value. Number of embedded URLs in the email.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUrlCount() {
        return this.urlCount;
    }
    /**
     * Gets the urls property value. Collection of the URLs contained in this email.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUrls() {
        return this.urls;
    }
    /**
     * Gets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrn() {
        return this.urn;
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
        writer.writeStringValue("antiSpamDirection", this.getAntiSpamDirection());
        writer.writeLongValue("attachmentsCount", this.getAttachmentsCount());
        writer.writeStringValue("deliveryAction", this.getDeliveryAction());
        writer.writeStringValue("deliveryLocation", this.getDeliveryLocation());
        writer.writeStringValue("internetMessageId", this.getInternetMessageId());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("networkMessageId", this.getNetworkMessageId());
        writer.writeObjectValue("p1Sender", this.getP1Sender());
        writer.writeObjectValue("p2Sender", this.getP2Sender());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeStringValue("recipientEmailAddress", this.getRecipientEmailAddress());
        writer.writeStringValue("senderIp", this.getSenderIp());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfPrimitiveValues("threatDetectionMethods", this.getThreatDetectionMethods());
        writer.writeCollectionOfPrimitiveValues("threats", this.getThreats());
        writer.writeLongValue("urlCount", this.getUrlCount());
        writer.writeCollectionOfPrimitiveValues("urls", this.getUrls());
        writer.writeStringValue("urn", this.getUrn());
    }
    /**
     * Sets the antiSpamDirection property value. Direction of the email relative to your network. The possible values are: inbound, outbound or intraorg.
     * @param value Value to set for the antiSpamDirection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiSpamDirection(@javax.annotation.Nullable final String value) {
        this.antiSpamDirection = value;
    }
    /**
     * Sets the attachmentsCount property value. Number of attachments in the email.
     * @param value Value to set for the attachmentsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachmentsCount(@javax.annotation.Nullable final Long value) {
        this.attachmentsCount = value;
    }
    /**
     * Sets the deliveryAction property value. Delivery action of the email. The possible values are: delivered, deliveredAsSpam, junked, blocked, or replaced.
     * @param value Value to set for the deliveryAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryAction(@javax.annotation.Nullable final String value) {
        this.deliveryAction = value;
    }
    /**
     * Sets the deliveryLocation property value. Location where the email was delivered. The possible values are: inbox, external, junkFolder, quarantine, failed, dropped, deletedFolder or forwarded.
     * @param value Value to set for the deliveryLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryLocation(@javax.annotation.Nullable final String value) {
        this.deliveryLocation = value;
    }
    /**
     * Sets the internetMessageId property value. Public-facing identifier for the email that is set by the sending email system.
     * @param value Value to set for the internetMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetMessageId(@javax.annotation.Nullable final String value) {
        this.internetMessageId = value;
    }
    /**
     * Sets the language property value. Detected language of the email content.
     * @param value Value to set for the language property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this.language = value;
    }
    /**
     * Sets the networkMessageId property value. Unique identifier for the email, generated by Microsoft 365.
     * @param value Value to set for the networkMessageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkMessageId(@javax.annotation.Nullable final String value) {
        this.networkMessageId = value;
    }
    /**
     * Sets the p1Sender property value. The P1 sender.
     * @param value Value to set for the p1Sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setP1Sender(@javax.annotation.Nullable final EmailSender value) {
        this.p1Sender = value;
    }
    /**
     * Sets the p2Sender property value. The P2 sender.
     * @param value Value to set for the p2Sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setP2Sender(@javax.annotation.Nullable final EmailSender value) {
        this.p2Sender = value;
    }
    /**
     * Sets the receivedDateTime property value. Date and time when the email was received.
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTime = value;
    }
    /**
     * Sets the recipientEmailAddress property value. Email address of the recipient, or email address of the recipient after distribution list expansion.
     * @param value Value to set for the recipientEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientEmailAddress(@javax.annotation.Nullable final String value) {
        this.recipientEmailAddress = value;
    }
    /**
     * Sets the senderIp property value. IP address of the last detected mail server that relayed the message.
     * @param value Value to set for the senderIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderIp(@javax.annotation.Nullable final String value) {
        this.senderIp = value;
    }
    /**
     * Sets the subject property value. Subject of the email.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the threatDetectionMethods property value. Collection of methods used to detect malware, phishing, or other threats found in the email.
     * @param value Value to set for the threatDetectionMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatDetectionMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this.threatDetectionMethods = value;
    }
    /**
     * Sets the threats property value. Collection of detection names for malware or other threats found.
     * @param value Value to set for the threats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreats(@javax.annotation.Nullable final java.util.List<String> value) {
        this.threats = value;
    }
    /**
     * Sets the urlCount property value. Number of embedded URLs in the email.
     * @param value Value to set for the urlCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrlCount(@javax.annotation.Nullable final Long value) {
        this.urlCount = value;
    }
    /**
     * Sets the urls property value. Collection of the URLs contained in this email.
     * @param value Value to set for the urls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.urls = value;
    }
    /**
     * Sets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @param value Value to set for the urn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrn(@javax.annotation.Nullable final String value) {
        this.urn = value;
    }
}
