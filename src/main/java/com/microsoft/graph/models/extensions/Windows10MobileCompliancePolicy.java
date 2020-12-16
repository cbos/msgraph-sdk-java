// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Mobile Compliance Policy.
 */
public class Windows10MobileCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Bit Locker Enabled.
     * Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     */
    @SerializedName(value = "bitLockerEnabled", alternate = {"BitLockerEnabled"})
    @Expose
	@Nullable
    public Boolean bitLockerEnabled;

    /**
     * The Code Integrity Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation.
     */
    @SerializedName(value = "codeIntegrityEnabled", alternate = {"CodeIntegrityEnabled"})
    @Expose
	@Nullable
    public Boolean codeIntegrityEnabled;

    /**
     * The Early Launch Anti Malware Driver Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     */
    @SerializedName(value = "earlyLaunchAntiMalwareDriverEnabled", alternate = {"EarlyLaunchAntiMalwareDriverEnabled"})
    @Expose
	@Nullable
    public Boolean earlyLaunchAntiMalwareDriverEnabled;

    /**
     * The Os Maximum Version.
     * Maximum Windows Phone version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Windows Phone version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Whether or not to block syncing the calendar.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
	@Nullable
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before password expiration. Valid values 1 to 255
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum password length. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * The number of previous passwords to prevent re-use of.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Require a password to unlock Windows Phone device.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Password Require To Unlock From Idle.
     * Require a password to unlock an idle device.
     */
    @SerializedName(value = "passwordRequireToUnlockFromIdle", alternate = {"PasswordRequireToUnlockFromIdle"})
    @Expose
	@Nullable
    public Boolean passwordRequireToUnlockFromIdle;

    /**
     * The Secure Boot Enabled.
     * Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     */
    @SerializedName(value = "secureBootEnabled", alternate = {"SecureBootEnabled"})
    @Expose
	@Nullable
    public Boolean secureBootEnabled;

    /**
     * The Storage Require Encryption.
     * Require encryption on windows devices.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireEncryption;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
