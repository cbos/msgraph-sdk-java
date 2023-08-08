package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingPolicyUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Represents whether the meeting chat is enabled or not.
     */
    private Boolean meetingChatEnabled;
    /**
     * Unique identifier of the meeting chat.
     */
    private String meetingChatId;
    /**
     * Instantiates a new meetingPolicyUpdatedEventMessageDetail and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MeetingPolicyUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.meetingPolicyUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingPolicyUpdatedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static MeetingPolicyUpdatedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingPolicyUpdatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingChatEnabled", (n) -> { this.setMeetingChatEnabled(n.getBooleanValue()); });
        deserializerMap.put("meetingChatId", (n) -> { this.setMeetingChatId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the meetingChatEnabled property value. Represents whether the meeting chat is enabled or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMeetingChatEnabled() {
        return this.meetingChatEnabled;
    }
    /**
     * Gets the meetingChatId property value. Unique identifier of the meeting chat.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMeetingChatId() {
        return this.meetingChatId;
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
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeBooleanValue("meetingChatEnabled", this.getMeetingChatEnabled());
        writer.writeStringValue("meetingChatId", this.getMeetingChatId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the meetingChatEnabled property value. Represents whether the meeting chat is enabled or not.
     * @param value Value to set for the meetingChatEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeetingChatEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.meetingChatEnabled = value;
    }
    /**
     * Sets the meetingChatId property value. Unique identifier of the meeting chat.
     * @param value Value to set for the meetingChatId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeetingChatId(@jakarta.annotation.Nullable final String value) {
        this.meetingChatId = value;
    }
}
