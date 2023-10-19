// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PublicError;
import com.microsoft.graph.models.SubjectRightsRequestStage;
import com.microsoft.graph.models.SubjectRightsRequestStageStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subject Rights Request Stage Detail.
 */
public class SubjectRightsRequestStageDetail implements IJsonBackedObject {

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
     * The Error.
     * Describes the error, if any, for the current stage.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public PublicError error;

    /**
     * The Stage.
     * The stage of the subject rights request. Possible values are: contentRetrieval, contentReview, generateReport, contentDeletion, caseResolved, unknownFutureValue, approval. You must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: approval.
     */
    @SerializedName(value = "stage", alternate = {"Stage"})
    @Expose
	@Nullable
    public SubjectRightsRequestStage stage;

    /**
     * The Status.
     * Status of the current stage. Possible values are: notStarted, current, completed, failed, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SubjectRightsRequestStageStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
