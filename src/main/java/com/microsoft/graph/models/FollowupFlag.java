// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.FollowupFlagStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Followup Flag.
 */
public class FollowupFlag implements IJsonBackedObject {

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
     * The Completed Date Time.
     * The date and time that the follow-up was finished.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone completedDateTime;

    /**
     * The Due Date Time.
     * The date and time that the follow-up is to be finished. Note: To set the due date, you must also specify the startDateTime; otherwise, you get a 400 Bad Request response.
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone dueDateTime;

    /**
     * The Flag Status.
     * The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
     */
    @SerializedName(value = "flagStatus", alternate = {"FlagStatus"})
    @Expose
	@Nullable
    public FollowupFlagStatus flagStatus;

    /**
     * The Start Date Time.
     * The date and time that the follow-up is to begin.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone startDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
