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
 * The class for the Mac OSMinimum Operating System.
 */
public class MacOSMinimumOperatingSystem implements IJsonBackedObject {

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
     * The V10_10.
     * When TRUE, indicates OS X 10.10 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_10", alternate = {"V10_10"})
    @Expose
	@Nullable
    public Boolean v10_10;

    /**
     * The V10_11.
     * When TRUE, indicates OS X 10.11 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_11", alternate = {"V10_11"})
    @Expose
	@Nullable
    public Boolean v10_11;

    /**
     * The V10_12.
     * When TRUE, indicates macOS 10.12 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_12", alternate = {"V10_12"})
    @Expose
	@Nullable
    public Boolean v10_12;

    /**
     * The V10_13.
     * When TRUE, indicates macOS 10.13 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_13", alternate = {"V10_13"})
    @Expose
	@Nullable
    public Boolean v10_13;

    /**
     * The V10_14.
     * When TRUE, indicates macOS 10.14 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_14", alternate = {"V10_14"})
    @Expose
	@Nullable
    public Boolean v10_14;

    /**
     * The V10_15.
     * When TRUE, indicates macOS 10.15 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_15", alternate = {"V10_15"})
    @Expose
	@Nullable
    public Boolean v10_15;

    /**
     * The V10_7.
     * When TRUE, indicates Mac OS X 10.7 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_7", alternate = {"V10_7"})
    @Expose
	@Nullable
    public Boolean v10_7;

    /**
     * The V10_8.
     * When TRUE, indicates OS X 10.8 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_8", alternate = {"V10_8"})
    @Expose
	@Nullable
    public Boolean v10_8;

    /**
     * The V10_9.
     * When TRUE, indicates OS X 10.9 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v10_9", alternate = {"V10_9"})
    @Expose
	@Nullable
    public Boolean v10_9;

    /**
     * The V11_0.
     * When TRUE, indicates macOS 11.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v11_0", alternate = {"V11_0"})
    @Expose
	@Nullable
    public Boolean v11_0;

    /**
     * The V12_0.
     * When TRUE, indicates macOS 12.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v12_0", alternate = {"V12_0"})
    @Expose
	@Nullable
    public Boolean v12_0;

    /**
     * The V13_0.
     * When TRUE, indicates macOS 13.0 or later is required to install the app. When FALSE, indicates some other OS version is the minimum OS to install the app. Default value is FALSE.
     */
    @SerializedName(value = "v13_0", alternate = {"V13_0"})
    @Expose
	@Nullable
    public Boolean v13_0;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
