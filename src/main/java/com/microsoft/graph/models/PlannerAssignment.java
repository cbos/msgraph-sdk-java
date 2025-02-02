// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Assignment.
 */
public class PlannerAssignment implements IJsonBackedObject {

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
     * The Assigned By.
     * The identity of the user that performed the assignment of the task, that is, the assignor.
     */
    @SerializedName(value = "assignedBy", alternate = {"AssignedBy"})
    @Expose
	@Nullable
    public IdentitySet assignedBy;

    /**
     * The Assigned Date Time.
     * The time when the task was assigned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "assignedDateTime", alternate = {"AssignedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime assignedDateTime;

    /**
     * The Order Hint.
     * Hint used to order assignees in a task. The format is defined as outlined here.
     */
    @SerializedName(value = "orderHint", alternate = {"OrderHint"})
    @Expose
	@Nullable
    public String orderHint;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
