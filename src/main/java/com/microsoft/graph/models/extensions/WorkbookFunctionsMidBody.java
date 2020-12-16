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
 * The class for the Workbook Functions Mid Body.
 */
public class WorkbookFunctionsMidBody {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The start Num.
     * 
     */
    @SerializedName(value = "startNum", alternate = {"StartNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startNum;

    /**
     * The num Chars.
     * 
     */
    @SerializedName(value = "numChars", alternate = {"NumChars"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numChars;


    private WorkbookFunctionsMidBody(@Nonnull final WorkbookFunctionsMidBodyBuilder builder) {
        this.text = builder.text;
        this.startNum = builder.startNum;
        this.numChars = builder.numChars;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsMidBodyBuilder newBuilder() {
        return new WorkbookFunctionsMidBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsMidBody
     */
    public static final class WorkbookFunctionsMidBodyBuilder {
        private com.google.gson.JsonElement text;
        /**
         * Sets the name Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidBodyBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        private com.google.gson.JsonElement startNum;
        /**
         * Sets the name StartNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidBodyBuilder withStartNum(@Nullable final com.google.gson.JsonElement val) {
            this.startNum = val;
            return this;
        }
        private com.google.gson.JsonElement numChars;
        /**
         * Sets the name NumChars
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidBodyBuilder withNumChars(@Nullable final com.google.gson.JsonElement val) {
            this.numChars = val;
            return this;
        }
        private WorkbookFunctionsMidBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsMidBody build() {
            return new WorkbookFunctionsMidBody(this);
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
        if(this.startNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startNum", startNum));
        }
        if(this.numChars != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numChars", numChars));
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
