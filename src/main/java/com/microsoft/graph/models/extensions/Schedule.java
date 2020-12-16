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
import com.microsoft.graph.models.generated.OperationStatus;
import com.microsoft.graph.models.extensions.OfferShiftRequest;
import com.microsoft.graph.models.extensions.OpenShiftChangeRequest;
import com.microsoft.graph.models.extensions.OpenShift;
import com.microsoft.graph.models.extensions.SchedulingGroup;
import com.microsoft.graph.models.extensions.Shift;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import com.microsoft.graph.models.extensions.TimeOffReason;
import com.microsoft.graph.models.extensions.TimeOffRequest;
import com.microsoft.graph.models.extensions.TimeOff;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionPage;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionPage;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionPage;
import com.microsoft.graph.requests.extensions.SchedulingGroupCollectionPage;
import com.microsoft.graph.requests.extensions.ShiftCollectionPage;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule.
 */
public class Schedule extends Entity implements IJsonBackedObject {


    /**
     * The Enabled.
     * Indicates whether the schedule is enabled for the team. Required.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Offer Shift Requests Enabled.
     * Indicates whether offer shift requests are enabled for the schedule.
     */
    @SerializedName(value = "offerShiftRequestsEnabled", alternate = {"OfferShiftRequestsEnabled"})
    @Expose
	@Nullable
    public Boolean offerShiftRequestsEnabled;

    /**
     * The Open Shifts Enabled.
     * Indicates whether open shifts are enabled for the schedule.
     */
    @SerializedName(value = "openShiftsEnabled", alternate = {"OpenShiftsEnabled"})
    @Expose
	@Nullable
    public Boolean openShiftsEnabled;

    /**
     * The Provision Status.
     * The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     */
    @SerializedName(value = "provisionStatus", alternate = {"ProvisionStatus"})
    @Expose
	@Nullable
    public OperationStatus provisionStatus;

    /**
     * The Provision Status Code.
     * Additional information about why schedule provisioning failed.
     */
    @SerializedName(value = "provisionStatusCode", alternate = {"ProvisionStatusCode"})
    @Expose
	@Nullable
    public String provisionStatusCode;

    /**
     * The Swap Shifts Requests Enabled.
     * Indicates whether swap shifts requests are enabled for the schedule.
     */
    @SerializedName(value = "swapShiftsRequestsEnabled", alternate = {"SwapShiftsRequestsEnabled"})
    @Expose
	@Nullable
    public Boolean swapShiftsRequestsEnabled;

    /**
     * The Time Clock Enabled.
     * Indicates whether time clock is enabled for the schedule.
     */
    @SerializedName(value = "timeClockEnabled", alternate = {"TimeClockEnabled"})
    @Expose
	@Nullable
    public Boolean timeClockEnabled;

    /**
     * The Time Off Requests Enabled.
     * Indicates whether time off requests are enabled for the schedule.
     */
    @SerializedName(value = "timeOffRequestsEnabled", alternate = {"TimeOffRequestsEnabled"})
    @Expose
	@Nullable
    public Boolean timeOffRequestsEnabled;

    /**
     * The Time Zone.
     * Indicates the time zone of the schedule team using tz database format. Required.
     */
    @SerializedName(value = "timeZone", alternate = {"TimeZone"})
    @Expose
	@Nullable
    public String timeZone;

    /**
     * The Workforce Integration Ids.
     * 
     */
    @SerializedName(value = "workforceIntegrationIds", alternate = {"WorkforceIntegrationIds"})
    @Expose
	@Nullable
    public java.util.List<String> workforceIntegrationIds;

    /**
     * The Offer Shift Requests.
     * 
     */
    @SerializedName(value = "offerShiftRequests", alternate = {"OfferShiftRequests"})
    @Expose
	@Nullable
    public OfferShiftRequestCollectionPage offerShiftRequests;

    /**
     * The Open Shift Change Requests.
     * 
     */
    @SerializedName(value = "openShiftChangeRequests", alternate = {"OpenShiftChangeRequests"})
    @Expose
	@Nullable
    public OpenShiftChangeRequestCollectionPage openShiftChangeRequests;

    /**
     * The Open Shifts.
     * 
     */
    @SerializedName(value = "openShifts", alternate = {"OpenShifts"})
    @Expose
	@Nullable
    public OpenShiftCollectionPage openShifts;

    /**
     * The Scheduling Groups.
     * The logical grouping of users in the schedule (usually by role).
     */
    @SerializedName(value = "schedulingGroups", alternate = {"SchedulingGroups"})
    @Expose
	@Nullable
    public SchedulingGroupCollectionPage schedulingGroups;

    /**
     * The Shifts.
     * The shifts in the schedule.
     */
    @SerializedName(value = "shifts", alternate = {"Shifts"})
    @Expose
	@Nullable
    public ShiftCollectionPage shifts;

    /**
     * The Swap Shifts Change Requests.
     * 
     */
    @SerializedName(value = "swapShiftsChangeRequests", alternate = {"SwapShiftsChangeRequests"})
    @Expose
	@Nullable
    public SwapShiftsChangeRequestCollectionPage swapShiftsChangeRequests;

    /**
     * The Time Off Reasons.
     * The set of reasons for a time off in the schedule.
     */
    @SerializedName(value = "timeOffReasons", alternate = {"TimeOffReasons"})
    @Expose
	@Nullable
    public TimeOffReasonCollectionPage timeOffReasons;

    /**
     * The Time Off Requests.
     * 
     */
    @SerializedName(value = "timeOffRequests", alternate = {"TimeOffRequests"})
    @Expose
	@Nullable
    public TimeOffRequestCollectionPage timeOffRequests;

    /**
     * The Times Off.
     * The instances of times off in the schedule.
     */
    @SerializedName(value = "timesOff", alternate = {"TimesOff"})
    @Expose
	@Nullable
    public TimeOffCollectionPage timesOff;


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


        if (json.has("offerShiftRequests")) {
            offerShiftRequests = serializer.deserializeObject(json.get("offerShiftRequests").toString(), OfferShiftRequestCollectionPage.class);
        }

        if (json.has("openShiftChangeRequests")) {
            openShiftChangeRequests = serializer.deserializeObject(json.get("openShiftChangeRequests").toString(), OpenShiftChangeRequestCollectionPage.class);
        }

        if (json.has("openShifts")) {
            openShifts = serializer.deserializeObject(json.get("openShifts").toString(), OpenShiftCollectionPage.class);
        }

        if (json.has("schedulingGroups")) {
            schedulingGroups = serializer.deserializeObject(json.get("schedulingGroups").toString(), SchedulingGroupCollectionPage.class);
        }

        if (json.has("shifts")) {
            shifts = serializer.deserializeObject(json.get("shifts").toString(), ShiftCollectionPage.class);
        }

        if (json.has("swapShiftsChangeRequests")) {
            swapShiftsChangeRequests = serializer.deserializeObject(json.get("swapShiftsChangeRequests").toString(), SwapShiftsChangeRequestCollectionPage.class);
        }

        if (json.has("timeOffReasons")) {
            timeOffReasons = serializer.deserializeObject(json.get("timeOffReasons").toString(), TimeOffReasonCollectionPage.class);
        }

        if (json.has("timeOffRequests")) {
            timeOffRequests = serializer.deserializeObject(json.get("timeOffRequests").toString(), TimeOffRequestCollectionPage.class);
        }

        if (json.has("timesOff")) {
            timesOff = serializer.deserializeObject(json.get("timesOff").toString(), TimeOffCollectionPage.class);
        }
    }
}
