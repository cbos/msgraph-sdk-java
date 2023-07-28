// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.ContainerPortProtocol;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Kubernetes Service Port.
 */
public class KubernetesServicePort implements IJsonBackedObject {

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
     * The App Protocol.
     * 
     */
    @SerializedName(value = "appProtocol", alternate = {"AppProtocol"})
    @Expose
	@Nullable
    public String appProtocol;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Node Port.
     * 
     */
    @SerializedName(value = "nodePort", alternate = {"NodePort"})
    @Expose
	@Nullable
    public Integer nodePort;

    /**
     * The Port.
     * 
     */
    @SerializedName(value = "port", alternate = {"Port"})
    @Expose
	@Nullable
    public Integer port;

    /**
     * The Protocol.
     * 
     */
    @SerializedName(value = "protocol", alternate = {"Protocol"})
    @Expose
	@Nullable
    public ContainerPortProtocol protocol;

    /**
     * The Target Port.
     * 
     */
    @SerializedName(value = "targetPort", alternate = {"TargetPort"})
    @Expose
	@Nullable
    public String targetPort;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
