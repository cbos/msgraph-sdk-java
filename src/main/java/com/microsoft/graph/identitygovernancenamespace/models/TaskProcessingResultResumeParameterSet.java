// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;

import com.microsoft.graph.identitygovernance.models.CustomTaskExtensionCallbackData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Processing Result Resume Parameter Set.
 */
public class TaskProcessingResultResumeParameterSet {
    /**
     * The source.
     * 
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public String source;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The data.
     * 
     */
    @SerializedName(value = "data", alternate = {"Data"})
    @Expose
	@Nullable
    public CustomTaskExtensionCallbackData data;


    /**
     * Instiaciates a new TaskProcessingResultResumeParameterSet
     */
    public TaskProcessingResultResumeParameterSet() {}
    /**
     * Instiaciates a new TaskProcessingResultResumeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TaskProcessingResultResumeParameterSet(@Nonnull final TaskProcessingResultResumeParameterSetBuilder builder) {
        this.source = builder.source;
        this.type = builder.type;
        this.data = builder.data;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TaskProcessingResultResumeParameterSetBuilder newBuilder() {
        return new TaskProcessingResultResumeParameterSetBuilder();
    }
    /**
     * Fluent builder for the TaskProcessingResultResumeParameterSet
     */
    public static final class TaskProcessingResultResumeParameterSetBuilder {
        /**
         * The source parameter value
         */
        @Nullable
        protected String source;
        /**
         * Sets the Source
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TaskProcessingResultResumeParameterSetBuilder withSource(@Nullable final String val) {
            this.source = val;
            return this;
        }
        /**
         * The type parameter value
         */
        @Nullable
        protected String type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TaskProcessingResultResumeParameterSetBuilder withType(@Nullable final String val) {
            this.type = val;
            return this;
        }
        /**
         * The data parameter value
         */
        @Nullable
        protected CustomTaskExtensionCallbackData data;
        /**
         * Sets the Data
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TaskProcessingResultResumeParameterSetBuilder withData(@Nullable final CustomTaskExtensionCallbackData val) {
            this.data = val;
            return this;
        }
        /**
         * Instanciates a new TaskProcessingResultResumeParameterSetBuilder
         */
        @Nullable
        protected TaskProcessingResultResumeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TaskProcessingResultResumeParameterSet build() {
            return new TaskProcessingResultResumeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.source != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("source", source));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
        }
        if(this.data != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("data", data));
        }
        return result;
    }
}
