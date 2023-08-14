package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingTimeSuggestionsResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions.
     */
    private String emptySuggestionsReason;
    /**
     * An array of meeting suggestions.
     */
    private java.util.List<MeetingTimeSuggestion> meetingTimeSuggestions;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new meetingTimeSuggestionsResult and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MeetingTimeSuggestionsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingTimeSuggestionsResult
     */
    @jakarta.annotation.Nonnull
    public static MeetingTimeSuggestionsResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingTimeSuggestionsResult();
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
     * Gets the emptySuggestionsReason property value. A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmptySuggestionsReason() {
        return this.emptySuggestionsReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("emptySuggestionsReason", (n) -> { this.setEmptySuggestionsReason(n.getStringValue()); });
        deserializerMap.put("meetingTimeSuggestions", (n) -> { this.setMeetingTimeSuggestions(n.getCollectionOfObjectValues(MeetingTimeSuggestion::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingTimeSuggestions property value. An array of meeting suggestions.
     * @return a meetingTimeSuggestion
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingTimeSuggestion> getMeetingTimeSuggestions() {
        return this.meetingTimeSuggestions;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("emptySuggestionsReason", this.getEmptySuggestionsReason());
        writer.writeCollectionOfObjectValues("meetingTimeSuggestions", this.getMeetingTimeSuggestions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the emptySuggestionsReason property value. A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions.
     * @param value Value to set for the emptySuggestionsReason property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmptySuggestionsReason(@jakarta.annotation.Nullable final String value) {
        this.emptySuggestionsReason = value;
    }
    /**
     * Sets the meetingTimeSuggestions property value. An array of meeting suggestions.
     * @param value Value to set for the meetingTimeSuggestions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeetingTimeSuggestions(@jakarta.annotation.Nullable final java.util.List<MeetingTimeSuggestion> value) {
        this.meetingTimeSuggestions = value;
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
}
