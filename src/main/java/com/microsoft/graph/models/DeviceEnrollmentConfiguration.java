package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceEnrollmentLimitConfiguration;
import com.microsoft.graph.models.DeviceEnrollmentPlatformRestrictionsConfiguration;
import com.microsoft.graph.models.DeviceEnrollmentWindowsHelloForBusinessConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Base Class of Device Enrollment Configuration */
public class DeviceEnrollmentConfiguration extends Entity implements Parsable {
    /** The list of group assignments for the device configuration profile */
    private java.util.List<EnrollmentConfigurationAssignment> _assignments;
    /** Created date time in UTC of the device enrollment configuration */
    private OffsetDateTime _createdDateTime;
    /** The description of the device enrollment configuration */
    private String _description;
    /** The display name of the device enrollment configuration */
    private String _displayName;
    /** Last modified date time in UTC of the device enrollment configuration */
    private OffsetDateTime _lastModifiedDateTime;
    /** Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. */
    private Integer _priority;
    /** The version of the device enrollment configuration */
    private Integer _version;
    /**
     * Instantiates a new deviceEnrollmentConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceEnrollmentConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceEnrollmentLimitConfiguration": return new DeviceEnrollmentLimitConfiguration();
                case "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration": return new DeviceEnrollmentPlatformRestrictionsConfiguration();
                case "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration": return new DeviceEnrollmentWindowsHelloForBusinessConfiguration();
            }
        }
        return new DeviceEnrollmentConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device configuration profile
     * @return a enrollmentConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EnrollmentConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. Created date time in UTC of the device enrollment configuration
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device enrollment configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the device enrollment configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(EnrollmentConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date time in UTC of the device enrollment configuration
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the priority property value. Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the version property value. The version of the device enrollment configuration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device configuration profile
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EnrollmentConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Created date time in UTC of the device enrollment configuration
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device enrollment configuration
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the device enrollment configuration
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date time in UTC of the device enrollment configuration
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the priority property value. Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the version property value. The version of the device enrollment configuration
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
