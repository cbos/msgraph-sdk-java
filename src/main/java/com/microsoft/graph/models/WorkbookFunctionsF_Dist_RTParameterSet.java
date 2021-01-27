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
 * The class for the Workbook Functions F_Dist_RTParameter Set.
 */
public class WorkbookFunctionsF_Dist_RTParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The deg Freedom1.
     * 
     */
    @SerializedName(value = "degFreedom1", alternate = {"DegFreedom1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom1;

    /**
     * The deg Freedom2.
     * 
     */
    @SerializedName(value = "degFreedom2", alternate = {"DegFreedom2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom2;


    /**
     * Instiaciates a new WorkbookFunctionsF_Dist_RTParameterSet
     */
    public WorkbookFunctionsF_Dist_RTParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsF_Dist_RTParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsF_Dist_RTParameterSet(@Nonnull final WorkbookFunctionsF_Dist_RTParameterSetBuilder builder) {
        this.x = builder.x;
        this.degFreedom1 = builder.degFreedom1;
        this.degFreedom2 = builder.degFreedom2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsF_Dist_RTParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsF_Dist_RTParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsF_Dist_RTParameterSet
     */
    public static final class WorkbookFunctionsF_Dist_RTParameterSetBuilder {
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
        public WorkbookFunctionsF_Dist_RTParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The degFreedom1 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement degFreedom1;
        /**
         * Sets the DegFreedom1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsF_Dist_RTParameterSetBuilder withDegFreedom1(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom1 = val;
            return this;
        }
        /**
         * The degFreedom2 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement degFreedom2;
        /**
         * Sets the DegFreedom2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsF_Dist_RTParameterSetBuilder withDegFreedom2(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom2 = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsF_Dist_RTParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsF_Dist_RTParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsF_Dist_RTParameterSet build() {
            return new WorkbookFunctionsF_Dist_RTParameterSet(this);
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
        if(this.degFreedom1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom1", degFreedom1));
        }
        if(this.degFreedom2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom2", degFreedom2));
        }
        return result;
    }
}
