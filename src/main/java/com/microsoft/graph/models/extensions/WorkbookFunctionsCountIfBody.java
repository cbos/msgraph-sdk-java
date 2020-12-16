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
 * The class for the Workbook Functions Count If Body.
 */
public class WorkbookFunctionsCountIfBody {
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


    private WorkbookFunctionsCountIfBody(@Nonnull final WorkbookFunctionsCountIfBodyBuilder builder) {
        this.range = builder.range;
        this.criteria = builder.criteria;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsCountIfBodyBuilder newBuilder() {
        return new WorkbookFunctionsCountIfBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsCountIfBody
     */
    public static final class WorkbookFunctionsCountIfBodyBuilder {
        private com.google.gson.JsonElement range;
        /**
         * Sets the name Range
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCountIfBodyBuilder withRange(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsCountIfBodyBuilder withCriteria(@Nullable final com.google.gson.JsonElement val) {
            this.criteria = val;
            return this;
        }
        private WorkbookFunctionsCountIfBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsCountIfBody build() {
            return new WorkbookFunctionsCountIfBody(this);
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
