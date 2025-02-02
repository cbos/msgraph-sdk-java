// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.externalconnectors.models.Acl;
import com.microsoft.graph.externalconnectors.models.ExternalItemContent;
import com.microsoft.graph.externalconnectors.models.Properties;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.externalconnectors.requests.ExternalActivityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Item.
 */
public class ExternalItem extends Entity implements IJsonBackedObject {


    /**
     * The Acl.
     * An array of access control entries. Each entry specifies the access granted to a user or group. Required.
     */
    @SerializedName(value = "acl", alternate = {"Acl"})
    @Expose
	@Nullable
    public java.util.List<Acl> acl;

    /**
     * The Content.
     * A plain-text  representation of the contents of the item. The text in this property is full-text indexed. Optional.
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
	@Nullable
    public ExternalItemContent content;

    /**
     * The Properties.
     * A property bag with the properties of the item. The properties MUST conform to the schema defined for the externalConnection. Required.
     */
    @SerializedName(value = "properties", alternate = {"Properties"})
    @Expose
	@Nullable
    public Properties properties;

    /**
     * The Activities.
     * Returns a list of activities performed on the item. Write-only.
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
	@Nullable
    public com.microsoft.graph.externalconnectors.requests.ExternalActivityCollectionPage activities;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities"), com.microsoft.graph.externalconnectors.requests.ExternalActivityCollectionPage.class);
        }
    }
}
