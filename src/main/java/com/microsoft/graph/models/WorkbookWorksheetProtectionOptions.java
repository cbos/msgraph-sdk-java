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
 * The class for the Workbook Worksheet Protection Options.
 */
public class WorkbookWorksheetProtectionOptions implements IJsonBackedObject {

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
     * The Allow Auto Filter.
     * Represents the worksheet protection option of allowing using auto filter feature.
     */
    @SerializedName(value = "allowAutoFilter", alternate = {"AllowAutoFilter"})
    @Expose
	@Nullable
    public Boolean allowAutoFilter;

    /**
     * The Allow Delete Columns.
     * Represents the worksheet protection option of allowing deleting columns.
     */
    @SerializedName(value = "allowDeleteColumns", alternate = {"AllowDeleteColumns"})
    @Expose
	@Nullable
    public Boolean allowDeleteColumns;

    /**
     * The Allow Delete Rows.
     * Represents the worksheet protection option of allowing deleting rows.
     */
    @SerializedName(value = "allowDeleteRows", alternate = {"AllowDeleteRows"})
    @Expose
	@Nullable
    public Boolean allowDeleteRows;

    /**
     * The Allow Format Cells.
     * Represents the worksheet protection option of allowing formatting cells.
     */
    @SerializedName(value = "allowFormatCells", alternate = {"AllowFormatCells"})
    @Expose
	@Nullable
    public Boolean allowFormatCells;

    /**
     * The Allow Format Columns.
     * Represents the worksheet protection option of allowing formatting columns.
     */
    @SerializedName(value = "allowFormatColumns", alternate = {"AllowFormatColumns"})
    @Expose
	@Nullable
    public Boolean allowFormatColumns;

    /**
     * The Allow Format Rows.
     * Represents the worksheet protection option of allowing formatting rows.
     */
    @SerializedName(value = "allowFormatRows", alternate = {"AllowFormatRows"})
    @Expose
	@Nullable
    public Boolean allowFormatRows;

    /**
     * The Allow Insert Columns.
     * Represents the worksheet protection option of allowing inserting columns.
     */
    @SerializedName(value = "allowInsertColumns", alternate = {"AllowInsertColumns"})
    @Expose
	@Nullable
    public Boolean allowInsertColumns;

    /**
     * The Allow Insert Hyperlinks.
     * Represents the worksheet protection option of allowing inserting hyperlinks.
     */
    @SerializedName(value = "allowInsertHyperlinks", alternate = {"AllowInsertHyperlinks"})
    @Expose
	@Nullable
    public Boolean allowInsertHyperlinks;

    /**
     * The Allow Insert Rows.
     * Represents the worksheet protection option of allowing inserting rows.
     */
    @SerializedName(value = "allowInsertRows", alternate = {"AllowInsertRows"})
    @Expose
	@Nullable
    public Boolean allowInsertRows;

    /**
     * The Allow Pivot Tables.
     * Represents the worksheet protection option of allowing using pivot table feature.
     */
    @SerializedName(value = "allowPivotTables", alternate = {"AllowPivotTables"})
    @Expose
	@Nullable
    public Boolean allowPivotTables;

    /**
     * The Allow Sort.
     * Represents the worksheet protection option of allowing using sort feature.
     */
    @SerializedName(value = "allowSort", alternate = {"AllowSort"})
    @Expose
	@Nullable
    public Boolean allowSort;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
