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
 * The class for the Workbook Functions Sln Parameter Set.
 */
public class WorkbookFunctionsSlnParameterSet {
    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cost;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement salvage;

    /**
     * The life.
     * 
     */
    @SerializedName(value = "life", alternate = {"Life"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement life;


    /**
     * Instiaciates a new WorkbookFunctionsSlnParameterSet
     */
    public WorkbookFunctionsSlnParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsSlnParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsSlnParameterSet(@Nonnull final WorkbookFunctionsSlnParameterSetBuilder builder) {
        this.cost = builder.cost;
        this.salvage = builder.salvage;
        this.life = builder.life;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSlnParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsSlnParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSlnParameterSet
     */
    public static final class WorkbookFunctionsSlnParameterSetBuilder {
        /**
         * The cost parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cost;
        /**
         * Sets the Cost
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSlnParameterSetBuilder withCost(@Nullable final com.google.gson.JsonElement val) {
            this.cost = val;
            return this;
        }
        /**
         * The salvage parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement salvage;
        /**
         * Sets the Salvage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSlnParameterSetBuilder withSalvage(@Nullable final com.google.gson.JsonElement val) {
            this.salvage = val;
            return this;
        }
        /**
         * The life parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement life;
        /**
         * Sets the Life
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSlnParameterSetBuilder withLife(@Nullable final com.google.gson.JsonElement val) {
            this.life = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsSlnParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsSlnParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSlnParameterSet build() {
            return new WorkbookFunctionsSlnParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cost != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cost", cost));
        }
        if(this.salvage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("salvage", salvage));
        }
        if(this.life != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("life", life));
        }
        return result;
    }
}
