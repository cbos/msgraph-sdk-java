// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.VolumeType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bitlocker Recovery Key.
 */
public class BitlockerRecoveryKey extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time when the key was originally backed up to Azure Active Directory.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Device Id.
     * ID of the device the BitLocker key is originally backed up from.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Key.
     * The BitLocker recovery key.
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
	@Nullable
    public String key;

    /**
     * The Volume Type.
     * Indicates the type of volume the BitLocker key is associated with. Possible values are: operatingSystemVolume, fixedDataVolume, removableDataVolume, unknownFutureValue.
     */
    @SerializedName(value = "volumeType", alternate = {"VolumeType"})
    @Expose
	@Nullable
    public VolumeType volumeType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
