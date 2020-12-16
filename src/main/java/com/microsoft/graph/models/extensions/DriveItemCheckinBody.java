// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


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
 * The class for the Drive Item Checkin Body.
 */
public class DriveItemCheckinBody {
    /**
     * The check In As.
     * 
     */
    @SerializedName(value = "checkInAs", alternate = {"CheckInAs"})
    @Expose
	@Nullable
    public String checkInAs;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    private DriveItemCheckinBody(@Nonnull final DriveItemCheckinBodyBuilder builder) {
        this.checkInAs = builder.checkInAs;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemCheckinBodyBuilder newBuilder() {
        return new DriveItemCheckinBodyBuilder();
    }
    /**
     * Fluent builder for the DriveItemCheckinBody
     */
    public static final class DriveItemCheckinBodyBuilder {
        private String checkInAs;
        /**
         * Sets the name CheckInAs
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCheckinBodyBuilder withCheckInAs(@Nullable final String val) {
            this.checkInAs = val;
            return this;
        }
        private String comment;
        /**
         * Sets the name Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCheckinBodyBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        private DriveItemCheckinBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemCheckinBody build() {
            return new DriveItemCheckinBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.checkInAs != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("checkInAs", checkInAs));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
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
