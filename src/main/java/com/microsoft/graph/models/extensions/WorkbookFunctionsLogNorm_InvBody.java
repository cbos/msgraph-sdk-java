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
 * The class for the Workbook Functions Log Norm_Inv Body.
 */
public class WorkbookFunctionsLogNorm_InvBody {
    /**
     * The probability.
     * 
     */
    @SerializedName(value = "probability", alternate = {"Probability"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement probability;

    /**
     * The mean.
     * 
     */
    @SerializedName(value = "mean", alternate = {"Mean"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement mean;

    /**
     * The standard Dev.
     * 
     */
    @SerializedName(value = "standardDev", alternate = {"StandardDev"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement standardDev;


    private WorkbookFunctionsLogNorm_InvBody(@Nonnull final WorkbookFunctionsLogNorm_InvBodyBuilder builder) {
        this.probability = builder.probability;
        this.mean = builder.mean;
        this.standardDev = builder.standardDev;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsLogNorm_InvBodyBuilder newBuilder() {
        return new WorkbookFunctionsLogNorm_InvBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsLogNorm_InvBody
     */
    public static final class WorkbookFunctionsLogNorm_InvBodyBuilder {
        private com.google.gson.JsonElement probability;
        /**
         * Sets the name Probability
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLogNorm_InvBodyBuilder withProbability(@Nullable final com.google.gson.JsonElement val) {
            this.probability = val;
            return this;
        }
        private com.google.gson.JsonElement mean;
        /**
         * Sets the name Mean
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLogNorm_InvBodyBuilder withMean(@Nullable final com.google.gson.JsonElement val) {
            this.mean = val;
            return this;
        }
        private com.google.gson.JsonElement standardDev;
        /**
         * Sets the name StandardDev
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLogNorm_InvBodyBuilder withStandardDev(@Nullable final com.google.gson.JsonElement val) {
            this.standardDev = val;
            return this;
        }
        private WorkbookFunctionsLogNorm_InvBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsLogNorm_InvBody build() {
            return new WorkbookFunctionsLogNorm_InvBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.probability != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("probability", probability));
        }
        if(this.mean != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mean", mean));
        }
        if(this.standardDev != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("standardDev", standardDev));
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
