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
 * The class for the File Encryption Info.
 */
public class FileEncryptionInfo implements IJsonBackedObject {

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
     * The Encryption Key.
     * The key used to encrypt the file content.
     */
    @SerializedName(value = "encryptionKey", alternate = {"EncryptionKey"})
    @Expose
	@Nullable
    public byte[] encryptionKey;

    /**
     * The File Digest.
     * The file digest prior to encryption. ProfileVersion1 requires a non-null FileDigest.
     */
    @SerializedName(value = "fileDigest", alternate = {"FileDigest"})
    @Expose
	@Nullable
    public byte[] fileDigest;

    /**
     * The File Digest Algorithm.
     * The file digest algorithm. ProfileVersion1 currently only supports SHA256 for the FileDigestAlgorithm.
     */
    @SerializedName(value = "fileDigestAlgorithm", alternate = {"FileDigestAlgorithm"})
    @Expose
	@Nullable
    public String fileDigestAlgorithm;

    /**
     * The Initialization Vector.
     * The initialization vector (IV) used for the encryption algorithm. Must be 16 bytes.
     */
    @SerializedName(value = "initializationVector", alternate = {"InitializationVector"})
    @Expose
	@Nullable
    public byte[] initializationVector;

    /**
     * The Mac.
     * The hash of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     */
    @SerializedName(value = "mac", alternate = {"Mac"})
    @Expose
	@Nullable
    public byte[] mac;

    /**
     * The Mac Key.
     * The key used to compute the message authentication code of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     */
    @SerializedName(value = "macKey", alternate = {"MacKey"})
    @Expose
	@Nullable
    public byte[] macKey;

    /**
     * The Profile Identifier.
     * The profile identifier. Maps to the strategy used to encrypt the file. Currently, only ProfileVersion1 is supported.
     */
    @SerializedName(value = "profileIdentifier", alternate = {"ProfileIdentifier"})
    @Expose
	@Nullable
    public String profileIdentifier;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
