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
import com.microsoft.graph.models.extensions.ComplianceManagementPartnerAssignment;
import com.microsoft.graph.models.generated.DeviceManagementPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner.
 */
public class ComplianceManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The Android Enrollment Assignments.
     * User groups which enroll Android devices through partner.
     */
    @SerializedName(value = "androidEnrollmentAssignments", alternate = {"AndroidEnrollmentAssignments"})
    @Expose
	@Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> androidEnrollmentAssignments;

    /**
     * The Android Onboarded.
     * Partner onboarded for Android devices.
     */
    @SerializedName(value = "androidOnboarded", alternate = {"AndroidOnboarded"})
    @Expose
	@Nullable
    public Boolean androidOnboarded;

    /**
     * The Display Name.
     * Partner display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Ios Enrollment Assignments.
     * User groups which enroll ios devices through partner.
     */
    @SerializedName(value = "iosEnrollmentAssignments", alternate = {"IosEnrollmentAssignments"})
    @Expose
	@Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> iosEnrollmentAssignments;

    /**
     * The Ios Onboarded.
     * Partner onboarded for ios devices.
     */
    @SerializedName(value = "iosOnboarded", alternate = {"IosOnboarded"})
    @Expose
	@Nullable
    public Boolean iosOnboarded;

    /**
     * The Last Heartbeat Date Time.
     * Timestamp of last heartbeat after admin onboarded to the compliance management partner
     */
    @SerializedName(value = "lastHeartbeatDateTime", alternate = {"LastHeartbeatDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Mac Os Enrollment Assignments.
     * User groups which enroll Mac devices through partner.
     */
    @SerializedName(value = "macOsEnrollmentAssignments", alternate = {"MacOsEnrollmentAssignments"})
    @Expose
	@Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> macOsEnrollmentAssignments;

    /**
     * The Mac Os Onboarded.
     * Partner onboarded for Mac devices.
     */
    @SerializedName(value = "macOsOnboarded", alternate = {"MacOsOnboarded"})
    @Expose
	@Nullable
    public Boolean macOsOnboarded;

    /**
     * The Partner State.
     * Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     */
    @SerializedName(value = "partnerState", alternate = {"PartnerState"})
    @Expose
	@Nullable
    public DeviceManagementPartnerTenantState partnerState;


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

    }
}
