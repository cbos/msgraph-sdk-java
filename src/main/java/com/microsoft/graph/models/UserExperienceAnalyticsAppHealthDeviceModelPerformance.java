// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsHealthState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Model Performance.
 */
public class UserExperienceAnalyticsAppHealthDeviceModelPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Active Device Count.
     * The number of active devices for the model. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "activeDeviceCount", alternate = {"ActiveDeviceCount"})
    @Expose
	@Nullable
    public Integer activeDeviceCount;

    /**
     * The Device Manufacturer.
     * The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "deviceManufacturer", alternate = {"DeviceManufacturer"})
    @Expose
	@Nullable
    public String deviceManufacturer;

    /**
     * The Device Model.
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "deviceModel", alternate = {"DeviceModel"})
    @Expose
	@Nullable
    public String deviceModel;

    /**
     * The Health Status.
     * The health state of the user experience analytics model. Possible values are: unknown, insufficientData, needsAttention, meetingGoals. Unknown by default. Supports: $filter, $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsHealthState healthStatus;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
	@Nullable
    public Integer meanTimeToFailureInMinutes;

    /**
     * The Model App Health Score.
     * The application health score of the device model. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "modelAppHealthScore", alternate = {"ModelAppHealthScore"})
    @Expose
	@Nullable
    public Double modelAppHealthScore;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
