package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the macOS LOB App.
 */
public class MacOSLobApp extends MobileLobApp implements Parsable {
    /**
     * The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
     */
    private String buildNumber;
    /**
     * The primary bundleId of the package.
     */
    private String bundleId;
    /**
     * List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
     */
    private java.util.List<MacOSLobChildApp> childApps;
    /**
     * When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature.
     */
    private Boolean ignoreVersionDetection;
    /**
     * When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package restrictions). When FALSE, indicates that the app will be installed as unmanaged.
     */
    private Boolean installAsManaged;
    /**
     * The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     */
    private java.util.List<String> md5Hash;
    /**
     * The chunk size for MD5 hash. This is '0' or empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     */
    private Integer md5HashChunkSize;
    /**
     * ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     */
    private MacOSMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
     */
    private String versionNumber;
    /**
     * Instantiates a new macOSLobApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSLobApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSLobApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSLobApp();
    }
    /**
     * Gets the buildNumber property value. The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBuildNumber() {
        return this.buildNumber;
    }
    /**
     * Gets the bundleId property value. The primary bundleId of the package.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * Gets the childApps property value. List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
     * @return a macOSLobChildApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSLobChildApp> getChildApps() {
        return this.childApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("childApps", (n) -> { this.setChildApps(n.getCollectionOfObjectValues(MacOSLobChildApp::createFromDiscriminatorValue)); });
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("installAsManaged", (n) -> { this.setInstallAsManaged(n.getBooleanValue()); });
        deserializerMap.put("md5Hash", (n) -> { this.setMd5Hash(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("md5HashChunkSize", (n) -> { this.setMd5HashChunkSize(n.getIntegerValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(MacOSMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.ignoreVersionDetection;
    }
    /**
     * Gets the installAsManaged property value. When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package restrictions). When FALSE, indicates that the app will be installed as unmanaged.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallAsManaged() {
        return this.installAsManaged;
    }
    /**
     * Gets the md5Hash property value. The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMd5Hash() {
        return this.md5Hash;
    }
    /**
     * Gets the md5HashChunkSize property value. The chunk size for MD5 hash. This is '0' or empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMd5HashChunkSize() {
        return this.md5HashChunkSize;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @return a macOSMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public MacOSMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the versionNumber property value. The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersionNumber() {
        return this.versionNumber;
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
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeCollectionOfObjectValues("childApps", this.getChildApps());
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeBooleanValue("installAsManaged", this.getInstallAsManaged());
        writer.writeCollectionOfPrimitiveValues("md5Hash", this.getMd5Hash());
        writer.writeIntegerValue("md5HashChunkSize", this.getMd5HashChunkSize());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the buildNumber property value. The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
     * @param value Value to set for the buildNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.buildNumber = value;
    }
    /**
     * Sets the bundleId property value. The primary bundleId of the package.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.bundleId = value;
    }
    /**
     * Sets the childApps property value. List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
     * @param value Value to set for the childApps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setChildApps(@jakarta.annotation.Nullable final java.util.List<MacOSLobChildApp> value) {
        this.childApps = value;
    }
    /**
     * Sets the ignoreVersionDetection property value. When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature.
     * @param value Value to set for the ignoreVersionDetection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreVersionDetection = value;
    }
    /**
     * Sets the installAsManaged property value. When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package restrictions). When FALSE, indicates that the app will be installed as unmanaged.
     * @param value Value to set for the installAsManaged property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstallAsManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.installAsManaged = value;
    }
    /**
     * Sets the md5Hash property value. The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @param value Value to set for the md5Hash property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMd5Hash(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.md5Hash = value;
    }
    /**
     * Sets the md5HashChunkSize property value. The chunk size for MD5 hash. This is '0' or empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to create a .intunemac, this value can be found inside the Detection.xml file.
     * @param value Value to set for the md5HashChunkSize property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMd5HashChunkSize(@jakarta.annotation.Nullable final Integer value) {
        this.md5HashChunkSize = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final MacOSMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the versionNumber property value. The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersionNumber(@jakarta.annotation.Nullable final String value) {
        this.versionNumber = value;
    }
}
