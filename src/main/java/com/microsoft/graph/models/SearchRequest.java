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
import com.microsoft.graph.models.EntityType;
import com.microsoft.graph.models.SearchQuery;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Request.
 */
public class SearchRequest implements IJsonBackedObject {

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
     * The Content Sources.
     * 
     */
    @SerializedName(value = "contentSources", alternate = {"ContentSources"})
    @Expose
	@Nullable
    public java.util.List<String> contentSources;

    /**
     * The Enable Top Results.
     * 
     */
    @SerializedName(value = "enableTopResults", alternate = {"EnableTopResults"})
    @Expose
	@Nullable
    public Boolean enableTopResults;

    /**
     * The Entity Types.
     * 
     */
    @SerializedName(value = "entityTypes", alternate = {"EntityTypes"})
    @Expose
	@Nullable
    public java.util.List<EntityType> entityTypes;

    /**
     * The Fields.
     * 
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
	@Nullable
    public java.util.List<String> fields;

    /**
     * The From.
     * 
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public Integer from;

    /**
     * The Query.
     * 
     */
    @SerializedName(value = "query", alternate = {"Query"})
    @Expose
	@Nullable
    public SearchQuery query;

    /**
     * The Size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Integer size;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
