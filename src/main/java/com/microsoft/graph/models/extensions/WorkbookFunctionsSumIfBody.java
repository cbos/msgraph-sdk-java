// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sum If Body.
 */
public class WorkbookFunctionsSumIfBody {
    /**
     * The range.
     * 
     */
    @SerializedName(value = "range", alternate = {"Range"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement range;

    /**
     * The criteria.
     * 
     */
    @SerializedName(value = "criteria", alternate = {"Criteria"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement criteria;

    /**
     * The sum Range.
     * 
     */
    @SerializedName(value = "sumRange", alternate = {"SumRange"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement sumRange;


    private WorkbookFunctionsSumIfBody(@Nonnull final WorkbookFunctionsSumIfBodyBuilder builder) {
        this.range = builder.range;
        this.criteria = builder.criteria;
        this.sumRange = builder.sumRange;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSumIfBodyBuilder newBuilder() {
        return new WorkbookFunctionsSumIfBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSumIfBody
     */
    public static final class WorkbookFunctionsSumIfBodyBuilder {
        private com.google.gson.JsonElement range;
        /**
         * Sets the name Range
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSumIfBodyBuilder withRange(@Nullable final com.google.gson.JsonElement val) {
            this.range = val;
            return this;
        }
        private com.google.gson.JsonElement criteria;
        /**
         * Sets the name Criteria
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSumIfBodyBuilder withCriteria(@Nullable final com.google.gson.JsonElement val) {
            this.criteria = val;
            return this;
        }
        private com.google.gson.JsonElement sumRange;
        /**
         * Sets the name SumRange
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSumIfBodyBuilder withSumRange(@Nullable final com.google.gson.JsonElement val) {
            this.sumRange = val;
            return this;
        }
        private WorkbookFunctionsSumIfBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSumIfBody build() {
            return new WorkbookFunctionsSumIfBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.range != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("range", range));
        }
        if(this.criteria != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria", criteria));
        }
        if(this.sumRange != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sumRange", sumRange));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
