// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
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
 * The class for the Device Detail.
 */
public class DeviceDetail implements IJsonBackedObject {

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
     * The Browser.
     * Indicates the browser information of the used for signing in.
     */
    @SerializedName(value = "browser", alternate = {"Browser"})
    @Expose
	@Nullable
    public String browser;

    /**
     * The Device Id.
     * Refers to the UniqueID of the device used for signing in.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Display Name.
     * Refers to the name of the device used for signing in.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Compliant.
     * Indicates whether the device is compliant.
     */
    @SerializedName(value = "isCompliant", alternate = {"IsCompliant"})
    @Expose
	@Nullable
    public Boolean isCompliant;

    /**
     * The Is Managed.
     * Indicates whether the device is managed.
     */
    @SerializedName(value = "isManaged", alternate = {"IsManaged"})
    @Expose
	@Nullable
    public Boolean isManaged;

    /**
     * The Operating System.
     * Indicates the operating system name and version used for signing in.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
	@Nullable
    public String operatingSystem;

    /**
     * The Trust Type.
     * Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     */
    @SerializedName(value = "trustType", alternate = {"TrustType"})
    @Expose
	@Nullable
    public String trustType;


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
