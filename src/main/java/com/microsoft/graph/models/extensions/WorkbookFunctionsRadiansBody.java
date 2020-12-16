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
 * The class for the Workbook Functions Radians Body.
 */
public class WorkbookFunctionsRadiansBody {
    /**
     * The angle.
     * 
     */
    @SerializedName(value = "angle", alternate = {"Angle"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement angle;


    private WorkbookFunctionsRadiansBody(@Nonnull final WorkbookFunctionsRadiansBodyBuilder builder) {
        this.angle = builder.angle;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRadiansBodyBuilder newBuilder() {
        return new WorkbookFunctionsRadiansBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRadiansBody
     */
    public static final class WorkbookFunctionsRadiansBodyBuilder {
        private com.google.gson.JsonElement angle;
        /**
         * Sets the name Angle
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRadiansBodyBuilder withAngle(@Nullable final com.google.gson.JsonElement val) {
            this.angle = val;
            return this;
        }
        private WorkbookFunctionsRadiansBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRadiansBody build() {
            return new WorkbookFunctionsRadiansBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.angle != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("angle", angle));
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
