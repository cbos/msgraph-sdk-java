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
 * The class for the Workbook Functions Bessel JParameter Set.
 */
public class WorkbookFunctionsBesselJParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The n.
     * 
     */
    @SerializedName(value = "n", alternate = {"N"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement n;


    /**
     * Instiaciates a new WorkbookFunctionsBesselJParameterSet
     */
    public WorkbookFunctionsBesselJParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsBesselJParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsBesselJParameterSet(@Nonnull final WorkbookFunctionsBesselJParameterSetBuilder builder) {
        this.x = builder.x;
        this.n = builder.n;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBesselJParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsBesselJParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBesselJParameterSet
     */
    public static final class WorkbookFunctionsBesselJParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBesselJParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The n parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement n;
        /**
         * Sets the N
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBesselJParameterSetBuilder withN(@Nullable final com.google.gson.JsonElement val) {
            this.n = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsBesselJParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsBesselJParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBesselJParameterSet build() {
            return new WorkbookFunctionsBesselJParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.n != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("n", n));
        }
        return result;
    }
}
