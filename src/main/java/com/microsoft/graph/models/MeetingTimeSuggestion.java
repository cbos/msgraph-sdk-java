package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingTimeSuggestion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array that shows the availability status of each attendee for this meeting suggestion.
     */
    private java.util.List<AttendeeAvailability> attendeeAvailability;
    /**
     * A percentage that represents the likelhood of all the attendees attending.
     */
    private Double confidence;
    /**
     * An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     */
    private java.util.List<Location> locations;
    /**
     * A time period suggested for the meeting.
     */
    private TimeSlot meetingTimeSlot;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     */
    private Integer order;
    /**
     * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    private FreeBusyStatus organizerAvailability;
    /**
     * Reason for suggesting the meeting time.
     */
    private String suggestionReason;
    /**
     * Instantiates a new meetingTimeSuggestion and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MeetingTimeSuggestion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingTimeSuggestion
     */
    @jakarta.annotation.Nonnull
    public static MeetingTimeSuggestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingTimeSuggestion();
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
     * Gets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @return a attendeeAvailability
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendeeAvailability> getAttendeeAvailability() {
        return this.attendeeAvailability;
    }
    /**
     * Gets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getConfidence() {
        return this.confidence;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("attendeeAvailability", (n) -> { this.setAttendeeAvailability(n.getCollectionOfObjectValues(AttendeeAvailability::createFromDiscriminatorValue)); });
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getDoubleValue()); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingTimeSlot", (n) -> { this.setMeetingTimeSlot(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("organizerAvailability", (n) -> { this.setOrganizerAvailability(n.getEnumValue(FreeBusyStatus.class)); });
        deserializerMap.put("suggestionReason", (n) -> { this.setSuggestionReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this.locations;
    }
    /**
     * Gets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @return a timeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getMeetingTimeSlot() {
        return this.meetingTimeSlot;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.order;
    }
    /**
     * Gets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a freeBusyStatus
     */
    @jakarta.annotation.Nullable
    public FreeBusyStatus getOrganizerAvailability() {
        return this.organizerAvailability;
    }
    /**
     * Gets the suggestionReason property value. Reason for suggesting the meeting time.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSuggestionReason() {
        return this.suggestionReason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendeeAvailability", this.getAttendeeAvailability());
        writer.writeDoubleValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeObjectValue("meetingTimeSlot", this.getMeetingTimeSlot());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeEnumValue("organizerAvailability", this.getOrganizerAvailability());
        writer.writeStringValue("suggestionReason", this.getSuggestionReason());
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
     * Sets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @param value Value to set for the attendeeAvailability property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttendeeAvailability(@jakarta.annotation.Nullable final java.util.List<AttendeeAvailability> value) {
        this.attendeeAvailability = value;
    }
    /**
     * Sets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @param value Value to set for the confidence property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConfidence(@jakarta.annotation.Nullable final Double value) {
        this.confidence = value;
    }
    /**
     * Sets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @param value Value to set for the locations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<Location> value) {
        this.locations = value;
    }
    /**
     * Sets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @param value Value to set for the meetingTimeSlot property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeetingTimeSlot(@jakarta.annotation.Nullable final TimeSlot value) {
        this.meetingTimeSlot = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @param value Value to set for the order property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.order = value;
    }
    /**
     * Sets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the organizerAvailability property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOrganizerAvailability(@jakarta.annotation.Nullable final FreeBusyStatus value) {
        this.organizerAvailability = value;
    }
    /**
     * Sets the suggestionReason property value. Reason for suggesting the meeting time.
     * @param value Value to set for the suggestionReason property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSuggestionReason(@jakarta.annotation.Nullable final String value) {
        this.suggestionReason = value;
    }
}
