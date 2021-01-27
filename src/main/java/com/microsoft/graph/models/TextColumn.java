// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Text Column.
 */
public class TextColumn implements IJsonBackedObject {

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
     * The Allow Multiple Lines.
     * Whether to allow multiple lines of text.
     */
    @SerializedName(value = "allowMultipleLines", alternate = {"AllowMultipleLines"})
    @Expose
	@Nullable
    public Boolean allowMultipleLines;

    /**
     * The Append Changes To Existing Text.
     * Whether updates to this column should replace existing text, or append to it.
     */
    @SerializedName(value = "appendChangesToExistingText", alternate = {"AppendChangesToExistingText"})
    @Expose
	@Nullable
    public Boolean appendChangesToExistingText;

    /**
     * The Lines For Editing.
     * The size of the text box.
     */
    @SerializedName(value = "linesForEditing", alternate = {"LinesForEditing"})
    @Expose
	@Nullable
    public Integer linesForEditing;

    /**
     * The Max Length.
     * The maximum number of characters for the value.
     */
    @SerializedName(value = "maxLength", alternate = {"MaxLength"})
    @Expose
	@Nullable
    public Integer maxLength;

    /**
     * The Text Type.
     * The type of text being stored. Must be one of plain or richText
     */
    @SerializedName(value = "textType", alternate = {"TextType"})
    @Expose
	@Nullable
    public String textType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
