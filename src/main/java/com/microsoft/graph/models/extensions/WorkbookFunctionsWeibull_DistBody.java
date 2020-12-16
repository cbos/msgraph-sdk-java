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
 * The class for the Workbook Functions Weibull_Dist Body.
 */
public class WorkbookFunctionsWeibull_DistBody {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The alpha.
     * 
     */
    @SerializedName(value = "alpha", alternate = {"Alpha"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement alpha;

    /**
     * The beta.
     * 
     */
    @SerializedName(value = "beta", alternate = {"Beta"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement beta;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;


    private WorkbookFunctionsWeibull_DistBody(@Nonnull final WorkbookFunctionsWeibull_DistBodyBuilder builder) {
        this.x = builder.x;
        this.alpha = builder.alpha;
        this.beta = builder.beta;
        this.cumulative = builder.cumulative;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsWeibull_DistBodyBuilder newBuilder() {
        return new WorkbookFunctionsWeibull_DistBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsWeibull_DistBody
     */
    public static final class WorkbookFunctionsWeibull_DistBodyBuilder {
        private com.google.gson.JsonElement x;
        /**
         * Sets the name X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeibull_DistBodyBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        private com.google.gson.JsonElement alpha;
        /**
         * Sets the name Alpha
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeibull_DistBodyBuilder withAlpha(@Nullable final com.google.gson.JsonElement val) {
            this.alpha = val;
            return this;
        }
        private com.google.gson.JsonElement beta;
        /**
         * Sets the name Beta
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeibull_DistBodyBuilder withBeta(@Nullable final com.google.gson.JsonElement val) {
            this.beta = val;
            return this;
        }
        private com.google.gson.JsonElement cumulative;
        /**
         * Sets the name Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeibull_DistBodyBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        private WorkbookFunctionsWeibull_DistBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsWeibull_DistBody build() {
            return new WorkbookFunctionsWeibull_DistBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.alpha != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("alpha", alpha));
        }
        if(this.beta != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("beta", beta));
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
