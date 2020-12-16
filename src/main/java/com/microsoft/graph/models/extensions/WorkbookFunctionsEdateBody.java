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
 * The class for the Workbook Functions Edate Body.
 */
public class WorkbookFunctionsEdateBody {
    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startDate;

    /**
     * The months.
     * 
     */
    @SerializedName(value = "months", alternate = {"Months"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement months;


    private WorkbookFunctionsEdateBody(@Nonnull final WorkbookFunctionsEdateBodyBuilder builder) {
        this.startDate = builder.startDate;
        this.months = builder.months;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsEdateBodyBuilder newBuilder() {
        return new WorkbookFunctionsEdateBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsEdateBody
     */
    public static final class WorkbookFunctionsEdateBodyBuilder {
        private com.google.gson.JsonElement startDate;
        /**
         * Sets the name StartDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsEdateBodyBuilder withStartDate(@Nullable final com.google.gson.JsonElement val) {
            this.startDate = val;
            return this;
        }
        private com.google.gson.JsonElement months;
        /**
         * Sets the name Months
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsEdateBodyBuilder withMonths(@Nullable final com.google.gson.JsonElement val) {
            this.months = val;
            return this;
        }
        private WorkbookFunctionsEdateBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsEdateBody build() {
            return new WorkbookFunctionsEdateBody(this);
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
        if(this.months != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("months", months));
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
