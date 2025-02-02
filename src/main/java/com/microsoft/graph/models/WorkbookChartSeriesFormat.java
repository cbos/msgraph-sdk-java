// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookChartFill;
import com.microsoft.graph.models.WorkbookChartLineFormat;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Format.
 */
public class WorkbookChartSeriesFormat extends Entity implements IJsonBackedObject {


    /**
     * The Fill.
     * Represents the fill format of a chart series, which includes background formatting information. Read-only.
     */
    @SerializedName(value = "fill", alternate = {"Fill"})
    @Expose
	@Nullable
    public WorkbookChartFill fill;

    /**
     * The Line.
     * Represents line formatting. Read-only.
     */
    @SerializedName(value = "line", alternate = {"Line"})
    @Expose
	@Nullable
    public WorkbookChartLineFormat line;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
