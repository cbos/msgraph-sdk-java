package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParticipantLeftNotification extends Entity implements Parsable {
    /**
     * The call property
     */
    private Call call;
    /**
     * ID of the participant under the policy who has left the meeting.
     */
    private String participantId;
    /**
     * Instantiates a new participantLeftNotification and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ParticipantLeftNotification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a participantLeftNotification
     */
    @jakarta.annotation.Nonnull
    public static ParticipantLeftNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParticipantLeftNotification();
    }
    /**
     * Gets the call property value. The call property
     * @return a call
     */
    @jakarta.annotation.Nullable
    public Call getCall() {
        return this.call;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("call", (n) -> { this.setCall(n.getObjectValue(Call::createFromDiscriminatorValue)); });
        deserializerMap.put("participantId", (n) -> { this.setParticipantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the participantId property value. ID of the participant under the policy who has left the meeting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParticipantId() {
        return this.participantId;
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
        writer.writeObjectValue("call", this.getCall());
        writer.writeStringValue("participantId", this.getParticipantId());
    }
    /**
     * Sets the call property value. The call property
     * @param value Value to set for the call property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCall(@jakarta.annotation.Nullable final Call value) {
        this.call = value;
    }
    /**
     * Sets the participantId property value. ID of the participant under the policy who has left the meeting.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParticipantId(@jakarta.annotation.Nullable final String value) {
        this.participantId = value;
    }
}
