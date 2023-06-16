package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatAssessmentRequest extends Entity implements Parsable {
    /** The category property */
    private ThreatCategory category;
    /** The content type of threat assessment. Possible values are: mail, url, file. */
    private ThreatAssessmentContentType contentType;
    /** The threat assessment request creator. */
    private IdentitySet createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime createdDateTime;
    /** The expectedAssessment property */
    private ThreatExpectedAssessment expectedAssessment;
    /** The source of the threat assessment request. Possible values are: administrator. */
    private ThreatAssessmentRequestSource requestSource;
    /** A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it. */
    private java.util.List<ThreatAssessmentResult> results;
    /** The assessment process status. Possible values are: pending, completed. */
    private ThreatAssessmentStatus status;
    /**
     * Instantiates a new ThreatAssessmentRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatAssessmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ThreatAssessmentRequest
     */
    @javax.annotation.Nonnull
    public static ThreatAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emailFileAssessmentRequest": return new EmailFileAssessmentRequest();
                case "#microsoft.graph.fileAssessmentRequest": return new FileAssessmentRequest();
                case "#microsoft.graph.mailAssessmentRequest": return new MailAssessmentRequest();
                case "#microsoft.graph.urlAssessmentRequest": return new UrlAssessmentRequest();
            }
        }
        return new ThreatAssessmentRequest();
    }
    /**
     * Gets the category property value. The category property
     * @return a threatCategory
     */
    @javax.annotation.Nullable
    public ThreatCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @return a threatAssessmentContentType
     */
    @javax.annotation.Nullable
    public ThreatAssessmentContentType getContentType() {
        return this.contentType;
    }
    /**
     * Gets the createdBy property value. The threat assessment request creator.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the expectedAssessment property value. The expectedAssessment property
     * @return a threatExpectedAssessment
     */
    @javax.annotation.Nullable
    public ThreatExpectedAssessment getExpectedAssessment() {
        return this.expectedAssessment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ThreatCategory.class)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getEnumValue(ThreatAssessmentContentType.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expectedAssessment", (n) -> { this.setExpectedAssessment(n.getEnumValue(ThreatExpectedAssessment.class)); });
        deserializerMap.put("requestSource", (n) -> { this.setRequestSource(n.getEnumValue(ThreatAssessmentRequestSource.class)); });
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(ThreatAssessmentResult::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ThreatAssessmentStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the requestSource property value. The source of the threat assessment request. Possible values are: administrator.
     * @return a threatAssessmentRequestSource
     */
    @javax.annotation.Nullable
    public ThreatAssessmentRequestSource getRequestSource() {
        return this.requestSource;
    }
    /**
     * Gets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @return a threatAssessmentResult
     */
    @javax.annotation.Nullable
    public java.util.List<ThreatAssessmentResult> getResults() {
        return this.results;
    }
    /**
     * Gets the status property value. The assessment process status. Possible values are: pending, completed.
     * @return a threatAssessmentStatus
     */
    @javax.annotation.Nullable
    public ThreatAssessmentStatus getStatus() {
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
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("contentType", this.getContentType());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("expectedAssessment", this.getExpectedAssessment());
        writer.writeEnumValue("requestSource", this.getRequestSource());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final ThreatCategory value) {
        this.category = value;
    }
    /**
     * Sets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final ThreatAssessmentContentType value) {
        this.contentType = value;
    }
    /**
     * Sets the createdBy property value. The threat assessment request creator.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the expectedAssessment property value. The expectedAssessment property
     * @param value Value to set for the expectedAssessment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpectedAssessment(@javax.annotation.Nullable final ThreatExpectedAssessment value) {
        this.expectedAssessment = value;
    }
    /**
     * Sets the requestSource property value. The source of the threat assessment request. Possible values are: administrator.
     * @param value Value to set for the requestSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestSource(@javax.annotation.Nullable final ThreatAssessmentRequestSource value) {
        this.requestSource = value;
    }
    /**
     * Sets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @param value Value to set for the results property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResults(@javax.annotation.Nullable final java.util.List<ThreatAssessmentResult> value) {
        this.results = value;
    }
    /**
     * Sets the status property value. The assessment process status. Possible values are: pending, completed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ThreatAssessmentStatus value) {
        this.status = value;
    }
}
