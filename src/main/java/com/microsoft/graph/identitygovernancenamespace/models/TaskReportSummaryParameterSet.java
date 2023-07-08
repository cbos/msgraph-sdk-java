// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;

import com.microsoft.graph.identitygovernance.models.TaskReportSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Report Summary Parameter Set.
 */
public class TaskReportSummaryParameterSet {
    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;


    /**
     * Instiaciates a new TaskReportSummaryParameterSet
     */
    public TaskReportSummaryParameterSet() {}
    /**
     * Instiaciates a new TaskReportSummaryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TaskReportSummaryParameterSet(@Nonnull final TaskReportSummaryParameterSetBuilder builder) {
        this.startDateTime = builder.startDateTime;
        this.endDateTime = builder.endDateTime;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TaskReportSummaryParameterSetBuilder newBuilder() {
        return new TaskReportSummaryParameterSetBuilder();
    }
    /**
     * Fluent builder for the TaskReportSummaryParameterSet
     */
    public static final class TaskReportSummaryParameterSetBuilder {
        /**
         * The startDateTime parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime startDateTime;
        /**
         * Sets the StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TaskReportSummaryParameterSetBuilder withStartDateTime(@Nullable final java.time.OffsetDateTime val) {
            this.startDateTime = val;
            return this;
        }
        /**
         * The endDateTime parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime endDateTime;
        /**
         * Sets the EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TaskReportSummaryParameterSetBuilder withEndDateTime(@Nullable final java.time.OffsetDateTime val) {
            this.endDateTime = val;
            return this;
        }
        /**
         * Instanciates a new TaskReportSummaryParameterSetBuilder
         */
        @Nullable
        protected TaskReportSummaryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TaskReportSummaryParameterSet build() {
            return new TaskReportSummaryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        return result;
    }
}
