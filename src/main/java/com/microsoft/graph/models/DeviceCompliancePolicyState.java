// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.PolicyPlatformType;
import com.microsoft.graph.models.DeviceCompliancePolicySettingState;
import com.microsoft.graph.models.ComplianceStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy State.
 */
public class DeviceCompliancePolicyState extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The name of the policy for this policyBase
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Platform Type.
     * Platform type that the policy applies to
     */
    @SerializedName(value = "platformType", alternate = {"PlatformType"})
    @Expose
	@Nullable
    public PolicyPlatformType platformType;

    /**
     * The Setting Count.
     * Count of how many setting a policy holds
     */
    @SerializedName(value = "settingCount", alternate = {"SettingCount"})
    @Expose
	@Nullable
    public Integer settingCount;

    /**
     * The Setting States.
     * 
     */
    @SerializedName(value = "settingStates", alternate = {"SettingStates"})
    @Expose
	@Nullable
    public java.util.List<DeviceCompliancePolicySettingState> settingStates;

    /**
     * The State.
     * The compliance state of the policy
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ComplianceStatus state;

    /**
     * The Version.
     * The version of the policy
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
