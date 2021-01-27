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
 * The class for the Workbook Functions Im Sub Parameter Set.
 */
public class WorkbookFunctionsImSubParameterSet {
    /**
     * The inumber1.
     * 
     */
    @SerializedName(value = "inumber1", alternate = {"Inumber1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber1;

    /**
     * The inumber2.
     * 
     */
    @SerializedName(value = "inumber2", alternate = {"Inumber2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber2;


    /**
     * Instiaciates a new WorkbookFunctionsImSubParameterSet
     */
    public WorkbookFunctionsImSubParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsImSubParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsImSubParameterSet(@Nonnull final WorkbookFunctionsImSubParameterSetBuilder builder) {
        this.inumber1 = builder.inumber1;
        this.inumber2 = builder.inumber2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsImSubParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsImSubParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsImSubParameterSet
     */
    public static final class WorkbookFunctionsImSubParameterSetBuilder {
        /**
         * The inumber1 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement inumber1;
        /**
         * Sets the Inumber1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImSubParameterSetBuilder withInumber1(@Nullable final com.google.gson.JsonElement val) {
            this.inumber1 = val;
            return this;
        }
        /**
         * The inumber2 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement inumber2;
        /**
         * Sets the Inumber2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImSubParameterSetBuilder withInumber2(@Nullable final com.google.gson.JsonElement val) {
            this.inumber2 = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsImSubParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsImSubParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsImSubParameterSet build() {
            return new WorkbookFunctionsImSubParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.inumber1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber1", inumber1));
        }
        if(this.inumber2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber2", inumber2));
        }
        return result;
    }
}
