// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookChartPoint;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Item At Parameter Set.
 */
public class WorkbookChartPointItemAtParameterSet {
    /**
     * The index.
     * 
     */
    @SerializedName(value = "index", alternate = {"Index"})
    @Expose
	@Nullable
    public Integer index;


    /**
     * Instiaciates a new WorkbookChartPointItemAtParameterSet
     */
    public WorkbookChartPointItemAtParameterSet() {}
    /**
     * Instiaciates a new WorkbookChartPointItemAtParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookChartPointItemAtParameterSet(@Nonnull final WorkbookChartPointItemAtParameterSetBuilder builder) {
        this.index = builder.index;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookChartPointItemAtParameterSetBuilder newBuilder() {
        return new WorkbookChartPointItemAtParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookChartPointItemAtParameterSet
     */
    public static final class WorkbookChartPointItemAtParameterSetBuilder {
        /**
         * The index parameter value
         */
        @Nullable
        protected Integer index;
        /**
         * Sets the Index
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookChartPointItemAtParameterSetBuilder withIndex(@Nullable final Integer val) {
            this.index = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookChartPointItemAtParameterSetBuilder
         */
        @Nullable
        protected WorkbookChartPointItemAtParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookChartPointItemAtParameterSet build() {
            return new WorkbookChartPointItemAtParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.index != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("index", index));
        }
        return result;
    }
}
