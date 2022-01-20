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
import com.microsoft.graph.models.DisplayNameLocalization;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Validation.
 */
public class ColumnValidation implements IJsonBackedObject {

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
     * The Default Language.
     * Default BCP 47 language tag for the description.
     */
    @SerializedName(value = "defaultLanguage", alternate = {"DefaultLanguage"})
    @Expose
	@Nullable
    public String defaultLanguage;

    /**
     * The Descriptions.
     * Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     */
    @SerializedName(value = "descriptions", alternate = {"Descriptions"})
    @Expose
	@Nullable
    public java.util.List<DisplayNameLocalization> descriptions;

    /**
     * The Formula.
     * The formula to validate column value. For examples, see Examples of common formulas in lists
     */
    @SerializedName(value = "formula", alternate = {"Formula"})
    @Expose
	@Nullable
    public String formula;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
