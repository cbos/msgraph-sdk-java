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
import com.microsoft.graph.models.WorkbookWorksheetProtection;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WorkbookChartCollectionPage;
import com.microsoft.graph.requests.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.WorkbookPivotTableCollectionPage;
import com.microsoft.graph.requests.WorkbookTableCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet.
 */
public class WorkbookWorksheet extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * The display name of the worksheet.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Position.
     * The zero-based position of the worksheet within the workbook.
     */
    @SerializedName(value = "position", alternate = {"Position"})
    @Expose
	@Nullable
    public Integer position;

    /**
     * The Visibility.
     * The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public String visibility;

    /**
     * The Charts.
     * Returns collection of charts that are part of the worksheet. Read-only.
     */
    @SerializedName(value = "charts", alternate = {"Charts"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookChartCollectionPage charts;

    /**
     * The Names.
     * Returns collection of names that are associated with the worksheet. Read-only.
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookNamedItemCollectionPage names;

    /**
     * The Pivot Tables.
     * Collection of PivotTables that are part of the worksheet.
     */
    @SerializedName(value = "pivotTables", alternate = {"PivotTables"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookPivotTableCollectionPage pivotTables;

    /**
     * The Protection.
     * Returns sheet protection object for a worksheet. Read-only.
     */
    @SerializedName(value = "protection", alternate = {"Protection"})
    @Expose
	@Nullable
    public WorkbookWorksheetProtection protection;

    /**
     * The Tables.
     * Collection of tables that are part of the worksheet. Read-only.
     */
    @SerializedName(value = "tables", alternate = {"Tables"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookTableCollectionPage tables;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("charts")) {
            charts = serializer.deserializeObject(json.get("charts"), com.microsoft.graph.requests.WorkbookChartCollectionPage.class);
        }

        if (json.has("names")) {
            names = serializer.deserializeObject(json.get("names"), com.microsoft.graph.requests.WorkbookNamedItemCollectionPage.class);
        }

        if (json.has("pivotTables")) {
            pivotTables = serializer.deserializeObject(json.get("pivotTables"), com.microsoft.graph.requests.WorkbookPivotTableCollectionPage.class);
        }

        if (json.has("tables")) {
            tables = serializer.deserializeObject(json.get("tables"), com.microsoft.graph.requests.WorkbookTableCollectionPage.class);
        }
    }
}
