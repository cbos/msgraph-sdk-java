// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DiskType;
import com.microsoft.graph.models.UserExperienceAnalyticsHealthState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance.
 */
public class UserExperienceAnalyticsDevicePerformance extends Entity implements IJsonBackedObject {


    /**
     * The Average Blue Screens.
     * Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     */
    @SerializedName(value = "averageBlueScreens", alternate = {"AverageBlueScreens"})
    @Expose
	@Nullable
    public Double averageBlueScreens;

    /**
     * The Average Restarts.
     * Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     */
    @SerializedName(value = "averageRestarts", alternate = {"AverageRestarts"})
    @Expose
	@Nullable
    public Double averageRestarts;

    /**
     * The Blue Screen Count.
     * Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     */
    @SerializedName(value = "blueScreenCount", alternate = {"BlueScreenCount"})
    @Expose
	@Nullable
    public Integer blueScreenCount;

    /**
     * The Boot Score.
     * The user experience analytics device boot score.
     */
    @SerializedName(value = "bootScore", alternate = {"BootScore"})
    @Expose
	@Nullable
    public Integer bootScore;

    /**
     * The Core Boot Time In Ms.
     * The user experience analytics device core boot time in milliseconds.
     */
    @SerializedName(value = "coreBootTimeInMs", alternate = {"CoreBootTimeInMs"})
    @Expose
	@Nullable
    public Integer coreBootTimeInMs;

    /**
     * The Core Login Time In Ms.
     * The user experience analytics device core login time in milliseconds.
     */
    @SerializedName(value = "coreLoginTimeInMs", alternate = {"CoreLoginTimeInMs"})
    @Expose
	@Nullable
    public Integer coreLoginTimeInMs;

    /**
     * The Device Count.
     * User experience analytics summarized device count.
     */
    @SerializedName(value = "deviceCount", alternate = {"DeviceCount"})
    @Expose
	@Nullable
    public Long deviceCount;

    /**
     * The Device Name.
     * The user experience analytics device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Disk Type.
     * The user experience analytics device disk type.
     */
    @SerializedName(value = "diskType", alternate = {"DiskType"})
    @Expose
	@Nullable
    public DiskType diskType;

    /**
     * The Group Policy Boot Time In Ms.
     * The user experience analytics device group policy boot time in milliseconds.
     */
    @SerializedName(value = "groupPolicyBootTimeInMs", alternate = {"GroupPolicyBootTimeInMs"})
    @Expose
	@Nullable
    public Integer groupPolicyBootTimeInMs;

    /**
     * The Group Policy Login Time In Ms.
     * The user experience analytics device group policy login time in milliseconds.
     */
    @SerializedName(value = "groupPolicyLoginTimeInMs", alternate = {"GroupPolicyLoginTimeInMs"})
    @Expose
	@Nullable
    public Integer groupPolicyLoginTimeInMs;

    /**
     * The Health Status.
     * The health state of the user experience analytics device.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsHealthState healthStatus;

    /**
     * The Login Score.
     * The user experience analytics device login score.
     */
    @SerializedName(value = "loginScore", alternate = {"LoginScore"})
    @Expose
	@Nullable
    public Integer loginScore;

    /**
     * The Manufacturer.
     * The user experience analytics device manufacturer.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * The user experience analytics device model.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Model Startup Performance Score.
     * The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "modelStartupPerformanceScore", alternate = {"ModelStartupPerformanceScore"})
    @Expose
	@Nullable
    public Double modelStartupPerformanceScore;

    /**
     * The Operating System Version.
     * The user experience analytics device Operating System version.
     */
    @SerializedName(value = "operatingSystemVersion", alternate = {"OperatingSystemVersion"})
    @Expose
	@Nullable
    public String operatingSystemVersion;

    /**
     * The Responsive Desktop Time In Ms.
     * The user experience analytics responsive desktop time in milliseconds.
     */
    @SerializedName(value = "responsiveDesktopTimeInMs", alternate = {"ResponsiveDesktopTimeInMs"})
    @Expose
	@Nullable
    public Integer responsiveDesktopTimeInMs;

    /**
     * The Restart Count.
     * Number of Restarts in the last 30 days. Valid values 0 to 9999999
     */
    @SerializedName(value = "restartCount", alternate = {"RestartCount"})
    @Expose
	@Nullable
    public Integer restartCount;

    /**
     * The Startup Performance Score.
     * The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "startupPerformanceScore", alternate = {"StartupPerformanceScore"})
    @Expose
	@Nullable
    public Double startupPerformanceScore;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
