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
 * The class for the Workbook Functions Number Value Body.
 */
public class WorkbookFunctionsNumberValueBody {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The decimal Separator.
     * 
     */
    @SerializedName(value = "decimalSeparator", alternate = {"DecimalSeparator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement decimalSeparator;

    /**
     * The group Separator.
     * 
     */
    @SerializedName(value = "groupSeparator", alternate = {"GroupSeparator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement groupSeparator;


    private WorkbookFunctionsNumberValueBody(@Nonnull final WorkbookFunctionsNumberValueBodyBuilder builder) {
        this.text = builder.text;
        this.decimalSeparator = builder.decimalSeparator;
        this.groupSeparator = builder.groupSeparator;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNumberValueBodyBuilder newBuilder() {
        return new WorkbookFunctionsNumberValueBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNumberValueBody
     */
    public static final class WorkbookFunctionsNumberValueBodyBuilder {
        private com.google.gson.JsonElement text;
        /**
         * Sets the name Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueBodyBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        private com.google.gson.JsonElement decimalSeparator;
        /**
         * Sets the name DecimalSeparator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueBodyBuilder withDecimalSeparator(@Nullable final com.google.gson.JsonElement val) {
            this.decimalSeparator = val;
            return this;
        }
        private com.google.gson.JsonElement groupSeparator;
        /**
         * Sets the name GroupSeparator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueBodyBuilder withGroupSeparator(@Nullable final com.google.gson.JsonElement val) {
            this.groupSeparator = val;
            return this;
        }
        private WorkbookFunctionsNumberValueBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNumberValueBody build() {
            return new WorkbookFunctionsNumberValueBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.decimalSeparator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decimalSeparator", decimalSeparator));
        }
        if(this.groupSeparator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupSeparator", groupSeparator));
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
