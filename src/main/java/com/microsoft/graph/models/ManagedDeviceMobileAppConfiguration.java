package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract class for Mobile app configuration for enrolled devices.
 */
public class ManagedDeviceMobileAppConfiguration extends Entity implements Parsable {
    /**
     * The list of group assignemenets for app configration.
     */
    private java.util.List<ManagedDeviceMobileAppConfigurationAssignment> assignments;
    /**
     * DateTime the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Admin provided description of the Device Configuration.
     */
    private String description;
    /**
     * List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     */
    private java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> deviceStatuses;
    /**
     * App configuration device status summary.
     */
    private ManagedDeviceMobileAppConfigurationDeviceSummary deviceStatusSummary;
    /**
     * Admin provided name of the device configuration.
     */
    private String displayName;
    /**
     * DateTime the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * the associated app.
     */
    private java.util.List<String> targetedMobileApps;
    /**
     * List of ManagedDeviceMobileAppConfigurationUserStatus.
     */
    private java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> userStatuses;
    /**
     * App configuration user status summary.
     */
    private ManagedDeviceMobileAppConfigurationUserSummary userStatusSummary;
    /**
     * Version of the device configuration.
     */
    private Integer version;
    /**
     * Instantiates a new managedDeviceMobileAppConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceMobileAppConfiguration
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceMobileAppConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosMobileAppConfiguration": return new IosMobileAppConfiguration();
            }
        }
        return new ManagedDeviceMobileAppConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignemenets for app configration.
     * @return a managedDeviceMobileAppConfigurationAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceStatuses property value. List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     * @return a managedDeviceMobileAppConfigurationDeviceStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the deviceStatusSummary property value. App configuration device status summary.
     * @return a managedDeviceMobileAppConfigurationDeviceSummary
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationDeviceSummary getDeviceStatusSummary() {
        return this.deviceStatusSummary;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatusSummary", (n) -> { this.setDeviceStatusSummary(n.getObjectValue(ManagedDeviceMobileAppConfigurationDeviceSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("targetedMobileApps", (n) -> { this.setTargetedMobileApps(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userStatuses", (n) -> { this.setUserStatuses(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatusSummary", (n) -> { this.setUserStatusSummary(n.getObjectValue(ManagedDeviceMobileAppConfigurationUserSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the targetedMobileApps property value. the associated app.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetedMobileApps() {
        return this.targetedMobileApps;
    }
    /**
     * Gets the userStatuses property value. List of ManagedDeviceMobileAppConfigurationUserStatus.
     * @return a managedDeviceMobileAppConfigurationUserStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> getUserStatuses() {
        return this.userStatuses;
    }
    /**
     * Gets the userStatusSummary property value. App configuration user status summary.
     * @return a managedDeviceMobileAppConfigurationUserSummary
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary getUserStatusSummary() {
        return this.userStatusSummary;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusSummary", this.getDeviceStatusSummary());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("targetedMobileApps", this.getTargetedMobileApps());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusSummary", this.getUserStatusSummary());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignemenets for app configration.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceStatuses property value. List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusSummary property value. App configuration device status summary.
     * @param value Value to set for the deviceStatusSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStatusSummary(@jakarta.annotation.Nullable final ManagedDeviceMobileAppConfigurationDeviceSummary value) {
        this.deviceStatusSummary = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the targetedMobileApps property value. the associated app.
     * @param value Value to set for the targetedMobileApps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetedMobileApps(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.targetedMobileApps = value;
    }
    /**
     * Sets the userStatuses property value. List of ManagedDeviceMobileAppConfigurationUserStatus.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserStatuses(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> value) {
        this.userStatuses = value;
    }
    /**
     * Sets the userStatusSummary property value. App configuration user status summary.
     * @param value Value to set for the userStatusSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserStatusSummary(@jakarta.annotation.Nullable final ManagedDeviceMobileAppConfigurationUserSummary value) {
        this.userStatusSummary = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
