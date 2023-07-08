// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.identitygovernance.models.LifecycleWorkflowsContainer;
import com.microsoft.graph.models.AccessReviewSet;
import com.microsoft.graph.models.AppConsentApprovalRoute;
import com.microsoft.graph.models.TermsOfUseContainer;
import com.microsoft.graph.models.EntitlementManagement;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Governance.
 */
public class IdentityGovernance implements IJsonBackedObject {

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
     * The Lifecycle Workflows.
     * 
     */
    @SerializedName(value = "lifecycleWorkflows", alternate = {"LifecycleWorkflows"})
    @Expose
	@Nullable
    public LifecycleWorkflowsContainer lifecycleWorkflows;

    /**
     * The Access Reviews.
     * 
     */
    @SerializedName(value = "accessReviews", alternate = {"AccessReviews"})
    @Expose
	@Nullable
    public AccessReviewSet accessReviews;

    /**
     * The App Consent.
     * 
     */
    @SerializedName(value = "appConsent", alternate = {"AppConsent"})
    @Expose
	@Nullable
    public AppConsentApprovalRoute appConsent;

    /**
     * The Terms Of Use.
     * 
     */
    @SerializedName(value = "termsOfUse", alternate = {"TermsOfUse"})
    @Expose
	@Nullable
    public TermsOfUseContainer termsOfUse;

    /**
     * The Entitlement Management.
     * 
     */
    @SerializedName(value = "entitlementManagement", alternate = {"EntitlementManagement"})
    @Expose
	@Nullable
    public EntitlementManagement entitlementManagement;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
