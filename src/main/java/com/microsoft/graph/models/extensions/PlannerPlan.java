// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan.
 */
public class PlannerPlan extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * Read-only. The user who created the plan.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Owner.
     * ID of the Group that owns the plan. A valid group must exist before this field can be set. After it is set, this property can’t be updated.
     */
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
	@Nullable
    public String owner;

    /**
     * The Title.
     * Required. Title of the plan.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Buckets.
     * Read-only. Nullable. Collection of buckets in the plan.
     */
    @SerializedName(value = "buckets", alternate = {"Buckets"})
    @Expose
	@Nullable
    public PlannerBucketCollectionPage buckets;

    /**
     * The Details.
     * Read-only. Nullable. Additional details about the plan.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
	@Nullable
    public PlannerPlanDetails details;

    /**
     * The Tasks.
     * Read-only. Nullable. Collection of tasks in the plan.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public PlannerTaskCollectionPage tasks;


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


        if (json.has("buckets")) {
            buckets = serializer.deserializeObject(json.get("buckets").toString(), PlannerBucketCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks").toString(), PlannerTaskCollectionPage.class);
        }
    }
}
