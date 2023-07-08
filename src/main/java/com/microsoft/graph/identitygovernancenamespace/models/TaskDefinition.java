// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.identitygovernance.models.LifecycleTaskCategory;
import com.microsoft.graph.identitygovernance.models.Parameter;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Definition.
 */
public class TaskDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Category.
     * The category of the HR function that the tasks created using this definition can be used with. The possible values are: joiner, mover, leaver, unknownFutureValue. This is a multi-valued enumeration whose allowed combinations are joiner, joiner,leaver, or leaver.Supports $filter(eq, ne, has) and $orderby.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public EnumSet<LifecycleTaskCategory> category;

    /**
     * The Continue On Error.
     * 
     */
    @SerializedName(value = "continueOnError", alternate = {"ContinueOnError"})
    @Expose
	@Nullable
    public Boolean continueOnError;

    /**
     * The Description.
     * The description of the taskDefinition.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the taskDefinition.Supports $filter(eq, ne) and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Parameters.
     * The parameters that must be supplied when creating a workflow task object.Supports $filter(any).
     */
    @SerializedName(value = "parameters", alternate = {"Parameters"})
    @Expose
	@Nullable
    public java.util.List<Parameter> parameters;

    /**
     * The Version.
     * The version number of the taskDefinition. New records are pushed when we add support for new parameters.Supports $filter(ge, gt, le, lt, eq, ne) and $orderby.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
