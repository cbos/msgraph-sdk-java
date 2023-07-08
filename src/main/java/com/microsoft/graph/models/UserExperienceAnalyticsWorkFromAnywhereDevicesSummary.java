// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsAutopilotDevicesSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsCloudIdentityDevicesSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsCloudManagementDevicesSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsWindows10DevicesSummary;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Work From Anywhere Devices Summary.
 */
public class UserExperienceAnalyticsWorkFromAnywhereDevicesSummary implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Autopilot Devices Summary.
     * The user experience analytics work from anywhere Autopilot devices summary. Read-only.
     */
    @SerializedName(value = "autopilotDevicesSummary", alternate = {"AutopilotDevicesSummary"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsAutopilotDevicesSummary autopilotDevicesSummary;

    /**
     * The Cloud Identity Devices Summary.
     * The user experience analytics work from anywhere Cloud Identity devices summary. Read-only.
     */
    @SerializedName(value = "cloudIdentityDevicesSummary", alternate = {"CloudIdentityDevicesSummary"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsCloudIdentityDevicesSummary cloudIdentityDevicesSummary;

    /**
     * The Cloud Management Devices Summary.
     * The user experience analytics work from anywhere Cloud management devices summary. Read-only.
     */
    @SerializedName(value = "cloudManagementDevicesSummary", alternate = {"CloudManagementDevicesSummary"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsCloudManagementDevicesSummary cloudManagementDevicesSummary;

    /**
     * The Co Managed Devices.
     * Total number of co-managed devices. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "coManagedDevices", alternate = {"CoManagedDevices"})
    @Expose
	@Nullable
    public Integer coManagedDevices;

    /**
     * The Devices Not Autopilot Registered.
     * The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "devicesNotAutopilotRegistered", alternate = {"DevicesNotAutopilotRegistered"})
    @Expose
	@Nullable
    public Integer devicesNotAutopilotRegistered;

    /**
     * The Devices Without Autopilot Profile Assigned.
     * The count of intune devices not autopilot profile assigned. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "devicesWithoutAutopilotProfileAssigned", alternate = {"DevicesWithoutAutopilotProfileAssigned"})
    @Expose
	@Nullable
    public Integer devicesWithoutAutopilotProfileAssigned;

    /**
     * The Devices Without Cloud Identity.
     * The count of devices that are not cloud identity. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "devicesWithoutCloudIdentity", alternate = {"DevicesWithoutCloudIdentity"})
    @Expose
	@Nullable
    public Integer devicesWithoutCloudIdentity;

    /**
     * The Intune Devices.
     * The count of intune devices that are not autopilot registerd. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "intuneDevices", alternate = {"IntuneDevices"})
    @Expose
	@Nullable
    public Integer intuneDevices;

    /**
     * The Tenant Attach Devices.
     * Total count of tenant attach devices. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "tenantAttachDevices", alternate = {"TenantAttachDevices"})
    @Expose
	@Nullable
    public Integer tenantAttachDevices;

    /**
     * The Total Devices.
     * The total count of devices. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "totalDevices", alternate = {"TotalDevices"})
    @Expose
	@Nullable
    public Integer totalDevices;

    /**
     * The Unsupported OSversion Devices.
     * The count of Windows 10 devices that have unsupported OS versions. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "unsupportedOSversionDevices", alternate = {"UnsupportedOSversionDevices"})
    @Expose
	@Nullable
    public Integer unsupportedOSversionDevices;

    /**
     * The Windows10Devices.
     * The count of windows 10 devices. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "windows10Devices", alternate = {"Windows10Devices"})
    @Expose
	@Nullable
    public Integer windows10Devices;

    /**
     * The Windows10Devices Summary.
     * The user experience analytics work from anywhere Windows 10 devices summary. Read-only.
     */
    @SerializedName(value = "windows10DevicesSummary", alternate = {"Windows10DevicesSummary"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsWindows10DevicesSummary windows10DevicesSummary;

    /**
     * The Windows10Devices Without Tenant Attach.
     * The count of windows 10 devices that are Intune and co-managed. Read-only. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "windows10DevicesWithoutTenantAttach", alternate = {"Windows10DevicesWithoutTenantAttach"})
    @Expose
	@Nullable
    public Integer windows10DevicesWithoutTenantAttach;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
