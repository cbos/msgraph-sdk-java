package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DelegatedAdminRelationship extends Entity implements Parsable {
    /**
     * The access assignments associated with the delegated admin relationship.
     */
    private java.util.List<DelegatedAdminAccessAssignment> accessAssignments;
    /**
     * The accessDetails property
     */
    private DelegatedAdminAccessDetails accessDetails;
    /**
     * The date and time in ISO 8601 format and in UTC time when the relationship became active. Read-only.
     */
    private OffsetDateTime activatedDateTime;
    /**
     * The date and time in ISO 8601 format and in UTC time when the relationship was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The display name and unique identifier of the customer of the relationship. This is configured either by the partner at the time the relationship is created or by the system after the customer approves the relationship. Can't be changed by the customer.
     */
    private DelegatedAdminRelationshipCustomerParticipant customer;
    /**
     * The display name of the relationship used for ease of identification. Must be unique across all delegated admin relationships of the partner and is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     */
    private String displayName;
    /**
     * The duration of the relationship in ISO 8601 format. Must be a value between P1D and P2Y inclusive. This is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     */
    private PeriodAndDuration duration;
    /**
     * The date and time in ISO 8601 format and in UTC time when the status of relationship changes to either terminated or expired. Calculated as endDateTime = activatedDateTime + duration. Read-only.
     */
    private OffsetDateTime endDateTime;
    /**
     * The date and time in ISO 8601 format and in UTC time when the relationship was last modified. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The long running operations associated with the delegated admin relationship.
     */
    private java.util.List<DelegatedAdminRelationshipOperation> operations;
    /**
     * The requests associated with the delegated admin relationship.
     */
    private java.util.List<DelegatedAdminRelationshipRequest> requests;
    /**
     * The status of the relationship. Read Only. The possible values are: activating, active, approvalPending, approved, created, expired, expiring, terminated, terminating, terminationRequested, unknownFutureValue. Supports $orderby.
     */
    private DelegatedAdminRelationshipStatus status;
    /**
     * Instantiates a new DelegatedAdminRelationship and sets the default values.
     */
    public DelegatedAdminRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedAdminRelationship
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.resellerDelegatedAdminRelationship": return new ResellerDelegatedAdminRelationship();
            }
        }
        return new DelegatedAdminRelationship();
    }
    /**
     * Gets the accessAssignments property value. The access assignments associated with the delegated admin relationship.
     * @return a java.util.List<DelegatedAdminAccessAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminAccessAssignment> getAccessAssignments() {
        return this.accessAssignments;
    }
    /**
     * Gets the accessDetails property value. The accessDetails property
     * @return a DelegatedAdminAccessDetails
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessDetails getAccessDetails() {
        return this.accessDetails;
    }
    /**
     * Gets the activatedDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship became active. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivatedDateTime() {
        return this.activatedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customer property value. The display name and unique identifier of the customer of the relationship. This is configured either by the partner at the time the relationship is created or by the system after the customer approves the relationship. Can't be changed by the customer.
     * @return a DelegatedAdminRelationshipCustomerParticipant
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminRelationshipCustomerParticipant getCustomer() {
        return this.customer;
    }
    /**
     * Gets the displayName property value. The display name of the relationship used for ease of identification. Must be unique across all delegated admin relationships of the partner and is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the duration property value. The duration of the relationship in ISO 8601 format. Must be a value between P1D and P2Y inclusive. This is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * Gets the endDateTime property value. The date and time in ISO 8601 format and in UTC time when the status of relationship changes to either terminated or expired. Calculated as endDateTime = activatedDateTime + duration. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessAssignments", (n) -> { this.setAccessAssignments(n.getCollectionOfObjectValues(DelegatedAdminAccessAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("accessDetails", (n) -> { this.setAccessDetails(n.getObjectValue(DelegatedAdminAccessDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("activatedDateTime", (n) -> { this.setActivatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(DelegatedAdminRelationshipCustomerParticipant::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(DelegatedAdminRelationshipOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(DelegatedAdminRelationshipRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DelegatedAdminRelationshipStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the operations property value. The long running operations associated with the delegated admin relationship.
     * @return a java.util.List<DelegatedAdminRelationshipOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminRelationshipOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the requests property value. The requests associated with the delegated admin relationship.
     * @return a java.util.List<DelegatedAdminRelationshipRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedAdminRelationshipRequest> getRequests() {
        return this.requests;
    }
    /**
     * Gets the status property value. The status of the relationship. Read Only. The possible values are: activating, active, approvalPending, approved, created, expired, expiring, terminated, terminating, terminationRequested, unknownFutureValue. Supports $orderby.
     * @return a DelegatedAdminRelationshipStatus
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminRelationshipStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessAssignments", this.getAccessAssignments());
        writer.writeObjectValue("accessDetails", this.getAccessDetails());
        writer.writeOffsetDateTimeValue("activatedDateTime", this.getActivatedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writePeriodAndDurationValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the accessAssignments property value. The access assignments associated with the delegated admin relationship.
     * @param value Value to set for the accessAssignments property.
     */
    public void setAccessAssignments(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminAccessAssignment> value) {
        this.accessAssignments = value;
    }
    /**
     * Sets the accessDetails property value. The accessDetails property
     * @param value Value to set for the accessDetails property.
     */
    public void setAccessDetails(@jakarta.annotation.Nullable final DelegatedAdminAccessDetails value) {
        this.accessDetails = value;
    }
    /**
     * Sets the activatedDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship became active. Read-only.
     * @param value Value to set for the activatedDateTime property.
     */
    public void setActivatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.activatedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customer property value. The display name and unique identifier of the customer of the relationship. This is configured either by the partner at the time the relationship is created or by the system after the customer approves the relationship. Can't be changed by the customer.
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final DelegatedAdminRelationshipCustomerParticipant value) {
        this.customer = value;
    }
    /**
     * Sets the displayName property value. The display name of the relationship used for ease of identification. Must be unique across all delegated admin relationships of the partner and is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the duration property value. The duration of the relationship in ISO 8601 format. Must be a value between P1D and P2Y inclusive. This is set by the partner only when the relationship is in the created status and can't be changed by the customer.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the endDateTime property value. The date and time in ISO 8601 format and in UTC time when the status of relationship changes to either terminated or expired. Calculated as endDateTime = activatedDateTime + duration. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the operations property value. The long running operations associated with the delegated admin relationship.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminRelationshipOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the requests property value. The requests associated with the delegated admin relationship.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<DelegatedAdminRelationshipRequest> value) {
        this.requests = value;
    }
    /**
     * Sets the status property value. The status of the relationship. Read Only. The possible values are: activating, active, approvalPending, approved, created, expired, expiring, terminated, terminating, terminationRequested, unknownFutureValue. Supports $orderby.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DelegatedAdminRelationshipStatus value) {
        this.status = value;
    }
}
