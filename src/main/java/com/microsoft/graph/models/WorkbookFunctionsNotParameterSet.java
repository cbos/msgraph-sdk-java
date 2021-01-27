// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Not Parameter Set.
 */
public class WorkbookFunctionsNotParameterSet {
    /**
     * The logical.
     * 
     */
    @SerializedName(value = "logical", alternate = {"Logical"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement logical;


    /**
     * Instiaciates a new WorkbookFunctionsNotParameterSet
     */
    public WorkbookFunctionsNotParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsNotParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsNotParameterSet(@Nonnull final WorkbookFunctionsNotParameterSetBuilder builder) {
        this.logical = builder.logical;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNotParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsNotParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNotParameterSet
     */
    public static final class WorkbookFunctionsNotParameterSetBuilder {
        /**
         * The logical parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement logical;
        /**
         * Sets the Logical
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNotParameterSetBuilder withLogical(@Nullable final com.google.gson.JsonElement val) {
            this.logical = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsNotParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsNotParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNotParameterSet build() {
            return new WorkbookFunctionsNotParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.logical != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("logical", logical));
        }
        return result;
    }
}
