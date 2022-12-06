package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertHistoryState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appId property */
    private String _appId;
    /** The assignedTo property */
    private String _assignedTo;
    /** The comments property */
    private java.util.List<String> _comments;
    /** The feedback property */
    private AlertFeedback _feedback;
    /** The OdataType property */
    private String _odataType;
    /** The status property */
    private AlertStatus _status;
    /** The updatedDateTime property */
    private OffsetDateTime _updatedDateTime;
    /** The user property */
    private String _user;
    /**
     * Instantiates a new alertHistoryState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlertHistoryState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertHistoryState
     */
    @javax.annotation.Nonnull
    public static AlertHistoryState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertHistoryState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the appId property value. The appId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the comments property value. The comments property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getComments() {
        return this._comments;
    }
    /**
     * Gets the feedback property value. The feedback property
     * @return a alertFeedback
     */
    @javax.annotation.Nullable
    public AlertFeedback getFeedback() {
        return this._feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getEnumValue(AlertFeedback.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatus.class)); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the status property value. The status property
     * @return a alertStatus
     */
    @javax.annotation.Nullable
    public AlertStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the updatedDateTime property value. The updatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this._updatedDateTime;
    }
    /**
     * Gets the user property value. The user property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUser() {
        return this._user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeCollectionOfPrimitiveValues("comments", this.getComments());
        writer.writeEnumValue("feedback", this.getFeedback());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
        writer.writeStringValue("user", this.getUser());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComments(@javax.annotation.Nullable final java.util.List<String> value) {
        this._comments = value;
    }
    /**
     * Sets the feedback property value. The feedback property
     * @param value Value to set for the feedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedback(@javax.annotation.Nullable final AlertFeedback value) {
        this._feedback = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AlertStatus value) {
        this._status = value;
    }
    /**
     * Sets the updatedDateTime property value. The updatedDateTime property
     * @param value Value to set for the updatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._updatedDateTime = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final String value) {
        this._user = value;
    }
}
