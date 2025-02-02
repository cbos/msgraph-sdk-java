// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AttackSimulationOperationType;
import com.microsoft.graph.models.LongRunningOperation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attack Simulation Operation.
 */
public class AttackSimulationOperation extends LongRunningOperation implements IJsonBackedObject {


    /**
     * The Percentage Completed.
     * 
     */
    @SerializedName(value = "percentageCompleted", alternate = {"PercentageCompleted"})
    @Expose
	@Nullable
    public Integer percentageCompleted;

    /**
     * The Tenant Id.
     * 
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public AttackSimulationOperationType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
