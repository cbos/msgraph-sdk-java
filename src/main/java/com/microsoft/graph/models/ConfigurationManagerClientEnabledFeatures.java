// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Configuration Manager Client Enabled Features.
 */
public class ConfigurationManagerClientEnabledFeatures implements IJsonBackedObject {

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
     * The Compliance Policy.
     * Whether compliance policy is managed by Intune
     */
    @SerializedName(value = "compliancePolicy", alternate = {"CompliancePolicy"})
    @Expose
	@Nullable
    public Boolean compliancePolicy;

    /**
     * The Device Configuration.
     * Whether device configuration is managed by Intune
     */
    @SerializedName(value = "deviceConfiguration", alternate = {"DeviceConfiguration"})
    @Expose
	@Nullable
    public Boolean deviceConfiguration;

    /**
     * The Inventory.
     * Whether inventory is managed by Intune
     */
    @SerializedName(value = "inventory", alternate = {"Inventory"})
    @Expose
	@Nullable
    public Boolean inventory;

    /**
     * The Modern Apps.
     * Whether modern application is managed by Intune
     */
    @SerializedName(value = "modernApps", alternate = {"ModernApps"})
    @Expose
	@Nullable
    public Boolean modernApps;

    /**
     * The Resource Access.
     * Whether resource access is managed by Intune
     */
    @SerializedName(value = "resourceAccess", alternate = {"ResourceAccess"})
    @Expose
	@Nullable
    public Boolean resourceAccess;

    /**
     * The Windows Update For Business.
     * Whether Windows Update for Business is managed by Intune
     */
    @SerializedName(value = "windowsUpdateForBusiness", alternate = {"WindowsUpdateForBusiness"})
    @Expose
	@Nullable
    public Boolean windowsUpdateForBusiness;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
