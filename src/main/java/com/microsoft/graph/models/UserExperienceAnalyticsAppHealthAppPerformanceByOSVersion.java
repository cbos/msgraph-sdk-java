// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By OSVersion.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion extends Entity implements IJsonBackedObject {


    /**
     * The Active Device Count.
     * The number of devices where the application has been active. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "activeDeviceCount", alternate = {"ActiveDeviceCount"})
    @Expose
	@Nullable
    public Integer activeDeviceCount;

    /**
     * The App Crash Count.
     * The number of crashes for the application. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appCrashCount", alternate = {"AppCrashCount"})
    @Expose
	@Nullable
    public Integer appCrashCount;

    /**
     * The App Display Name.
     * The friendly name of the application. Possible values are: Outlook, Excel. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Name.
     * The name of the application. Possible values are: outlook.exe, excel.exe. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "appName", alternate = {"AppName"})
    @Expose
	@Nullable
    public String appName;

    /**
     * The App Publisher.
     * The publisher of the application. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "appPublisher", alternate = {"AppPublisher"})
    @Expose
	@Nullable
    public String appPublisher;

    /**
     * The App Usage Duration.
     * The total usage time of the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appUsageDuration", alternate = {"AppUsageDuration"})
    @Expose
	@Nullable
    public Integer appUsageDuration;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
	@Nullable
    public Integer meanTimeToFailureInMinutes;

    /**
     * The Os Build Number.
     * The OS build number of the application. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "osBuildNumber", alternate = {"OsBuildNumber"})
    @Expose
	@Nullable
    public String osBuildNumber;

    /**
     * The Os Version.
     * The OS version of the application. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
