// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookRangeFormat;
import com.microsoft.graph.models.WorkbookRangeSort;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range.
 */
public class WorkbookRange extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * Represents the range reference in A1-style. Address value contains the Sheet reference (for example, Sheet1!A1:B4). Read-only.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
	@Nullable
    public String address;

    /**
     * The Address Local.
     * Represents range reference for the specified range in the language of the user. Read-only.
     */
    @SerializedName(value = "addressLocal", alternate = {"AddressLocal"})
    @Expose
	@Nullable
    public String addressLocal;

    /**
     * The Cell Count.
     * Number of cells in the range. Read-only.
     */
    @SerializedName(value = "cellCount", alternate = {"CellCount"})
    @Expose
	@Nullable
    public Integer cellCount;

    /**
     * The Column Count.
     * Represents the total number of columns in the range. Read-only.
     */
    @SerializedName(value = "columnCount", alternate = {"ColumnCount"})
    @Expose
	@Nullable
    public Integer columnCount;

    /**
     * The Column Hidden.
     * Represents if all columns of the current range are hidden.
     */
    @SerializedName(value = "columnHidden", alternate = {"ColumnHidden"})
    @Expose
	@Nullable
    public Boolean columnHidden;

    /**
     * The Column Index.
     * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     */
    @SerializedName(value = "columnIndex", alternate = {"ColumnIndex"})
    @Expose
	@Nullable
    public Integer columnIndex;

    /**
     * The Formulas.
     * Represents the formula in A1-style notation.
     */
    @SerializedName(value = "formulas", alternate = {"Formulas"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulas;

    /**
     * The Formulas Local.
     * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     */
    @SerializedName(value = "formulasLocal", alternate = {"FormulasLocal"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulasLocal;

    /**
     * The Formulas R1C1.
     * Represents the formula in R1C1-style notation.
     */
    @SerializedName(value = "formulasR1C1", alternate = {"FormulasR1C1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement formulasR1C1;

    /**
     * The Hidden.
     * Represents if all cells of the current range are hidden. Read-only.
     */
    @SerializedName(value = "hidden", alternate = {"Hidden"})
    @Expose
	@Nullable
    public Boolean hidden;

    /**
     * The Number Format.
     * Represents Excel's number format code for the given cell.
     */
    @SerializedName(value = "numberFormat", alternate = {"NumberFormat"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numberFormat;

    /**
     * The Row Count.
     * Returns the total number of rows in the range. Read-only.
     */
    @SerializedName(value = "rowCount", alternate = {"RowCount"})
    @Expose
	@Nullable
    public Integer rowCount;

    /**
     * The Row Hidden.
     * Represents if all rows of the current range are hidden.
     */
    @SerializedName(value = "rowHidden", alternate = {"RowHidden"})
    @Expose
	@Nullable
    public Boolean rowHidden;

    /**
     * The Row Index.
     * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     */
    @SerializedName(value = "rowIndex", alternate = {"RowIndex"})
    @Expose
	@Nullable
    public Integer rowIndex;

    /**
     * The Text.
     * Text values of the specified range. The Text value doesn't depend on the cell width. The # sign substitution that happens in Excel UI doesn't affect the text value returned by the API. Read-only.
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The Values.
     * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contains an error returns the error string.
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;

    /**
     * The Value Types.
     * Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     */
    @SerializedName(value = "valueTypes", alternate = {"ValueTypes"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement valueTypes;

    /**
     * The Format.
     * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public WorkbookRangeFormat format;

    /**
     * The Sort.
     * The worksheet containing the current range. Read-only.
     */
    @SerializedName(value = "sort", alternate = {"Sort"})
    @Expose
	@Nullable
    public WorkbookRangeSort sort;

    /**
     * The Worksheet.
     * The worksheet containing the current range. Read-only.
     */
    @SerializedName(value = "worksheet", alternate = {"Worksheet"})
    @Expose
	@Nullable
    public WorkbookWorksheet worksheet;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
