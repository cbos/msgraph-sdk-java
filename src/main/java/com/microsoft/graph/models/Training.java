// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.TrainingAvailabilityStatus;
import com.microsoft.graph.models.EmailIdentity;
import com.microsoft.graph.models.SimulationContentSource;
import com.microsoft.graph.models.TrainingType;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.TrainingLanguageDetailCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Training.
 */
public class Training extends Entity implements IJsonBackedObject {


    /**
     * The Availability Status.
     * 
     */
    @SerializedName(value = "availabilityStatus", alternate = {"AvailabilityStatus"})
    @Expose
	@Nullable
    public TrainingAvailabilityStatus availabilityStatus;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public EmailIdentity createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Duration In Minutes.
     * 
     */
    @SerializedName(value = "durationInMinutes", alternate = {"DurationInMinutes"})
    @Expose
	@Nullable
    public Integer durationInMinutes;

    /**
     * The Has Evaluation.
     * 
     */
    @SerializedName(value = "hasEvaluation", alternate = {"HasEvaluation"})
    @Expose
	@Nullable
    public Boolean hasEvaluation;

    /**
     * The Last Modified By.
     * 
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public EmailIdentity lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Source.
     * 
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public SimulationContentSource source;

    /**
     * The Supported Locales.
     * 
     */
    @SerializedName(value = "supportedLocales", alternate = {"SupportedLocales"})
    @Expose
	@Nullable
    public java.util.List<String> supportedLocales;

    /**
     * The Tags.
     * 
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public TrainingType type;

    /**
     * The Language Details.
     * 
     */
    @SerializedName(value = "languageDetails", alternate = {"LanguageDetails"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TrainingLanguageDetailCollectionPage languageDetails;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("languageDetails")) {
            languageDetails = serializer.deserializeObject(json.get("languageDetails"), com.microsoft.graph.requests.TrainingLanguageDetailCollectionPage.class);
        }
    }
}
