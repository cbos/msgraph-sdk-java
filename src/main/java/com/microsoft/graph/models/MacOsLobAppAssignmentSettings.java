package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign a macOS LOB app to a group.
 */
public class MacOsLobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune.
     */
    private Boolean uninstallOnDeviceRemoval;
    /**
     * Instantiates a new macOsLobAppAssignmentSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOsLobAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.macOsLobAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOsLobAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static MacOsLobAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsLobAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uninstallOnDeviceRemoval", (n) -> { this.setUninstallOnDeviceRemoval(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uninstallOnDeviceRemoval property value. When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUninstallOnDeviceRemoval() {
        return this.uninstallOnDeviceRemoval;
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
        writer.writeBooleanValue("uninstallOnDeviceRemoval", this.getUninstallOnDeviceRemoval());
    }
    /**
     * Sets the uninstallOnDeviceRemoval property value. When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune.
     * @param value Value to set for the uninstallOnDeviceRemoval property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUninstallOnDeviceRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.uninstallOnDeviceRemoval = value;
    }
}
