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
 * The class for the Hashes.
 */
public class Hashes implements IJsonBackedObject {

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
     * The Crc32Hash.
     * The CRC32 value of the file in little endian (if available). Read-only.
     */
    @SerializedName(value = "crc32Hash", alternate = {"Crc32Hash"})
    @Expose
	@Nullable
    public String crc32Hash;

    /**
     * The Quick Xor Hash.
     * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available). Read-only.
     */
    @SerializedName(value = "quickXorHash", alternate = {"QuickXorHash"})
    @Expose
	@Nullable
    public String quickXorHash;

    /**
     * The Sha1Hash.
     * SHA1 hash for the contents of the file (if available). Read-only.
     */
    @SerializedName(value = "sha1Hash", alternate = {"Sha1Hash"})
    @Expose
	@Nullable
    public String sha1Hash;

    /**
     * The Sha256Hash.
     * SHA256 hash for the contents of the file (if available). Read-only.
     */
    @SerializedName(value = "sha256Hash", alternate = {"Sha256Hash"})
    @Expose
	@Nullable
    public String sha256Hash;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
