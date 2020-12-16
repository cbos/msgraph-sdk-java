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
 * The class for the Workbook Functions Norm_S_Dist Body.
 */
public class WorkbookFunctionsNorm_S_DistBody {
    /**
     * The z.
     * 
     */
    @SerializedName(value = "z", alternate = {"Z"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement z;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;


    private WorkbookFunctionsNorm_S_DistBody(@Nonnull final WorkbookFunctionsNorm_S_DistBodyBuilder builder) {
        this.z = builder.z;
        this.cumulative = builder.cumulative;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNorm_S_DistBodyBuilder newBuilder() {
        return new WorkbookFunctionsNorm_S_DistBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNorm_S_DistBody
     */
    public static final class WorkbookFunctionsNorm_S_DistBodyBuilder {
        private com.google.gson.JsonElement z;
        /**
         * Sets the name Z
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistBodyBuilder withZ(@Nullable final com.google.gson.JsonElement val) {
            this.z = val;
            return this;
        }
        private com.google.gson.JsonElement cumulative;
        /**
         * Sets the name Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistBodyBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        private WorkbookFunctionsNorm_S_DistBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNorm_S_DistBody build() {
            return new WorkbookFunctionsNorm_S_DistBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.z != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("z", z));
        }
        if(this.cumulative != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cumulative", cumulative));
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
