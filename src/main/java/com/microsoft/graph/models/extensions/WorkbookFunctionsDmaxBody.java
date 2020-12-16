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
 * The class for the Workbook Functions Dmax Body.
 */
public class WorkbookFunctionsDmaxBody {
    /**
     * The database.
     * 
     */
    @SerializedName(value = "database", alternate = {"Database"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement database;

    /**
     * The field.
     * 
     */
    @SerializedName(value = "field", alternate = {"Field"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement field;

    /**
     * The criteria.
     * 
     */
    @SerializedName(value = "criteria", alternate = {"Criteria"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement criteria;


    private WorkbookFunctionsDmaxBody(@Nonnull final WorkbookFunctionsDmaxBodyBuilder builder) {
        this.database = builder.database;
        this.field = builder.field;
        this.criteria = builder.criteria;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDmaxBodyBuilder newBuilder() {
        return new WorkbookFunctionsDmaxBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDmaxBody
     */
    public static final class WorkbookFunctionsDmaxBodyBuilder {
        private com.google.gson.JsonElement database;
        /**
         * Sets the name Database
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDmaxBodyBuilder withDatabase(@Nullable final com.google.gson.JsonElement val) {
            this.database = val;
            return this;
        }
        private com.google.gson.JsonElement field;
        /**
         * Sets the name Field
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDmaxBodyBuilder withField(@Nullable final com.google.gson.JsonElement val) {
            this.field = val;
            return this;
        }
        private com.google.gson.JsonElement criteria;
        /**
         * Sets the name Criteria
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDmaxBodyBuilder withCriteria(@Nullable final com.google.gson.JsonElement val) {
            this.criteria = val;
            return this;
        }
        private WorkbookFunctionsDmaxBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDmaxBody build() {
            return new WorkbookFunctionsDmaxBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.database != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("database", database));
        }
        if(this.field != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("field", field));
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
