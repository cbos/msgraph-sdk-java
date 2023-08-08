package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy for Windows information protection without MDM
 */
public class WindowsInformationProtectionPolicy extends WindowsInformationProtection implements Parsable {
    /**
     * Offline interval before app data is wiped (days)
     */
    private Integer daysWithoutContactBeforeUnenroll;
    /**
     * Enrollment url for the MDM
     */
    private String mdmEnrollmentUrl;
    /**
     * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.
     */
    private Integer minutesOfInactivityBeforeDeviceLock;
    /**
     * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     */
    private Integer numberOfPastPinsRemembered;
    /**
     * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.
     */
    private Integer passwordMaximumAttemptCount;
    /**
     * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     */
    private Integer pinExpirationDays;
    /**
     * Pin Character Requirements
     */
    private WindowsInformationProtectionPinCharacterRequirements pinLowercaseLetters;
    /**
     * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     */
    private Integer pinMinimumLength;
    /**
     * Pin Character Requirements
     */
    private WindowsInformationProtectionPinCharacterRequirements pinSpecialCharacters;
    /**
     * Pin Character Requirements
     */
    private WindowsInformationProtectionPinCharacterRequirements pinUppercaseLetters;
    /**
     * New property in RS2, pending documentation
     */
    private Boolean revokeOnMdmHandoffDisabled;
    /**
     * Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     */
    private Boolean windowsHelloForBusinessBlocked;
    /**
     * Instantiates a new windowsInformationProtectionPolicy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionPolicy
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionPolicy();
    }
    /**
     * Gets the daysWithoutContactBeforeUnenroll property value. Offline interval before app data is wiped (days)
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDaysWithoutContactBeforeUnenroll() {
        return this.daysWithoutContactBeforeUnenroll;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("daysWithoutContactBeforeUnenroll", (n) -> { this.setDaysWithoutContactBeforeUnenroll(n.getIntegerValue()); });
        deserializerMap.put("mdmEnrollmentUrl", (n) -> { this.setMdmEnrollmentUrl(n.getStringValue()); });
        deserializerMap.put("minutesOfInactivityBeforeDeviceLock", (n) -> { this.setMinutesOfInactivityBeforeDeviceLock(n.getIntegerValue()); });
        deserializerMap.put("numberOfPastPinsRemembered", (n) -> { this.setNumberOfPastPinsRemembered(n.getIntegerValue()); });
        deserializerMap.put("passwordMaximumAttemptCount", (n) -> { this.setPasswordMaximumAttemptCount(n.getIntegerValue()); });
        deserializerMap.put("pinExpirationDays", (n) -> { this.setPinExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("pinLowercaseLetters", (n) -> { this.setPinLowercaseLetters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
        deserializerMap.put("pinMinimumLength", (n) -> { this.setPinMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("pinSpecialCharacters", (n) -> { this.setPinSpecialCharacters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
        deserializerMap.put("pinUppercaseLetters", (n) -> { this.setPinUppercaseLetters(n.getEnumValue(WindowsInformationProtectionPinCharacterRequirements.class)); });
        deserializerMap.put("revokeOnMdmHandoffDisabled", (n) -> { this.setRevokeOnMdmHandoffDisabled(n.getBooleanValue()); });
        deserializerMap.put("windowsHelloForBusinessBlocked", (n) -> { this.setWindowsHelloForBusinessBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mdmEnrollmentUrl property value. Enrollment url for the MDM
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMdmEnrollmentUrl() {
        return this.mdmEnrollmentUrl;
    }
    /**
     * Gets the minutesOfInactivityBeforeDeviceLock property value. Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinutesOfInactivityBeforeDeviceLock() {
        return this.minutesOfInactivityBeforeDeviceLock;
    }
    /**
     * Gets the numberOfPastPinsRemembered property value. Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfPastPinsRemembered() {
        return this.numberOfPastPinsRemembered;
    }
    /**
     * Gets the passwordMaximumAttemptCount property value. The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMaximumAttemptCount() {
        return this.passwordMaximumAttemptCount;
    }
    /**
     * Gets the pinExpirationDays property value. Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinExpirationDays() {
        return this.pinExpirationDays;
    }
    /**
     * Gets the pinLowercaseLetters property value. Pin Character Requirements
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinLowercaseLetters() {
        return this.pinLowercaseLetters;
    }
    /**
     * Gets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this.pinMinimumLength;
    }
    /**
     * Gets the pinSpecialCharacters property value. Pin Character Requirements
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinSpecialCharacters() {
        return this.pinSpecialCharacters;
    }
    /**
     * Gets the pinUppercaseLetters property value. Pin Character Requirements
     * @return a windowsInformationProtectionPinCharacterRequirements
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionPinCharacterRequirements getPinUppercaseLetters() {
        return this.pinUppercaseLetters;
    }
    /**
     * Gets the revokeOnMdmHandoffDisabled property value. New property in RS2, pending documentation
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRevokeOnMdmHandoffDisabled() {
        return this.revokeOnMdmHandoffDisabled;
    }
    /**
     * Gets the windowsHelloForBusinessBlocked property value. Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsHelloForBusinessBlocked() {
        return this.windowsHelloForBusinessBlocked;
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
        writer.writeIntegerValue("daysWithoutContactBeforeUnenroll", this.getDaysWithoutContactBeforeUnenroll());
        writer.writeStringValue("mdmEnrollmentUrl", this.getMdmEnrollmentUrl());
        writer.writeIntegerValue("minutesOfInactivityBeforeDeviceLock", this.getMinutesOfInactivityBeforeDeviceLock());
        writer.writeIntegerValue("numberOfPastPinsRemembered", this.getNumberOfPastPinsRemembered());
        writer.writeIntegerValue("passwordMaximumAttemptCount", this.getPasswordMaximumAttemptCount());
        writer.writeIntegerValue("pinExpirationDays", this.getPinExpirationDays());
        writer.writeEnumValue("pinLowercaseLetters", this.getPinLowercaseLetters());
        writer.writeIntegerValue("pinMinimumLength", this.getPinMinimumLength());
        writer.writeEnumValue("pinSpecialCharacters", this.getPinSpecialCharacters());
        writer.writeEnumValue("pinUppercaseLetters", this.getPinUppercaseLetters());
        writer.writeBooleanValue("revokeOnMdmHandoffDisabled", this.getRevokeOnMdmHandoffDisabled());
        writer.writeBooleanValue("windowsHelloForBusinessBlocked", this.getWindowsHelloForBusinessBlocked());
    }
    /**
     * Sets the daysWithoutContactBeforeUnenroll property value. Offline interval before app data is wiped (days)
     * @param value Value to set for the daysWithoutContactBeforeUnenroll property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDaysWithoutContactBeforeUnenroll(@jakarta.annotation.Nullable final Integer value) {
        this.daysWithoutContactBeforeUnenroll = value;
    }
    /**
     * Sets the mdmEnrollmentUrl property value. Enrollment url for the MDM
     * @param value Value to set for the mdmEnrollmentUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMdmEnrollmentUrl(@jakarta.annotation.Nullable final String value) {
        this.mdmEnrollmentUrl = value;
    }
    /**
     * Sets the minutesOfInactivityBeforeDeviceLock property value. Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become PIN or password locked.   Range is an integer X where 0 <= X <= 999.
     * @param value Value to set for the minutesOfInactivityBeforeDeviceLock property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinutesOfInactivityBeforeDeviceLock(@jakarta.annotation.Nullable final Integer value) {
        this.minutesOfInactivityBeforeDeviceLock = value;
    }
    /**
     * Sets the numberOfPastPinsRemembered property value. Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows 10, version 1511. Default is 0.
     * @param value Value to set for the numberOfPastPinsRemembered property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNumberOfPastPinsRemembered(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfPastPinsRemembered = value;
    }
    /**
     * Sets the passwordMaximumAttemptCount property value. The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe functionality. Range is an integer X where 4 <= X <= 16 for desktop and 0 <= X <= 999 for mobile devices.
     * @param value Value to set for the passwordMaximumAttemptCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPasswordMaximumAttemptCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMaximumAttemptCount = value;
    }
    /**
     * Sets the pinExpirationDays property value. Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in Windows 10, version 1511. Default is 0.
     * @param value Value to set for the pinExpirationDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.pinExpirationDays = value;
    }
    /**
     * Sets the pinLowercaseLetters property value. Pin Character Requirements
     * @param value Value to set for the pinLowercaseLetters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinLowercaseLetters(@jakarta.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this.pinLowercaseLetters = value;
    }
    /**
     * Sets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number you can configure for this policy setting is 4. The largest number you can configure must be less than the number configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
     * @param value Value to set for the pinMinimumLength property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.pinMinimumLength = value;
    }
    /**
     * Sets the pinSpecialCharacters property value. Pin Character Requirements
     * @param value Value to set for the pinSpecialCharacters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinSpecialCharacters(@jakarta.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this.pinSpecialCharacters = value;
    }
    /**
     * Sets the pinUppercaseLetters property value. Pin Character Requirements
     * @param value Value to set for the pinUppercaseLetters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinUppercaseLetters(@jakarta.annotation.Nullable final WindowsInformationProtectionPinCharacterRequirements value) {
        this.pinUppercaseLetters = value;
    }
    /**
     * Sets the revokeOnMdmHandoffDisabled property value. New property in RS2, pending documentation
     * @param value Value to set for the revokeOnMdmHandoffDisabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRevokeOnMdmHandoffDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.revokeOnMdmHandoffDisabled = value;
    }
    /**
     * Sets the windowsHelloForBusinessBlocked property value. Boolean value that sets Windows Hello for Business as a method for signing into Windows.
     * @param value Value to set for the windowsHelloForBusinessBlocked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsHelloForBusinessBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.windowsHelloForBusinessBlocked = value;
    }
}
