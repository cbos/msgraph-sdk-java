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
 * The class for the Workbook Functions Days360Body.
 */
public class WorkbookFunctionsDays360Body {
    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startDate;

    /**
     * The end Date.
     * 
     */
    @SerializedName(value = "endDate", alternate = {"EndDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement endDate;

    /**
     * The method.
     * 
     */
    @SerializedName(value = "method", alternate = {"Method"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement method;


    private WorkbookFunctionsDays360Body(@Nonnull final WorkbookFunctionsDays360BodyBuilder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.method = builder.method;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDays360BodyBuilder newBuilder() {
        return new WorkbookFunctionsDays360BodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDays360Body
     */
    public static final class WorkbookFunctionsDays360BodyBuilder {
        private com.google.gson.JsonElement startDate;
        /**
         * Sets the name StartDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDays360BodyBuilder withStartDate(@Nullable final com.google.gson.JsonElement val) {
            this.startDate = val;
            return this;
        }
        private com.google.gson.JsonElement endDate;
        /**
         * Sets the name EndDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDays360BodyBuilder withEndDate(@Nullable final com.google.gson.JsonElement val) {
            this.endDate = val;
            return this;
        }
        private com.google.gson.JsonElement method;
        /**
         * Sets the name Method
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDays360BodyBuilder withMethod(@Nullable final com.google.gson.JsonElement val) {
            this.method = val;
            return this;
        }
        private WorkbookFunctionsDays360BodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDays360Body build() {
            return new WorkbookFunctionsDays360Body(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDate", startDate));
        }
        if(this.endDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDate", endDate));
        }
        if(this.method != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("method", method));
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
