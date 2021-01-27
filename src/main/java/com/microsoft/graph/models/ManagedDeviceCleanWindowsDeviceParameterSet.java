// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Clean Windows Device Parameter Set.
 */
public class ManagedDeviceCleanWindowsDeviceParameterSet {
    /**
     * The keep User Data.
     * 
     */
    @SerializedName(value = "keepUserData", alternate = {"KeepUserData"})
    @Expose
	@Nullable
    public Boolean keepUserData;


    /**
     * Instiaciates a new ManagedDeviceCleanWindowsDeviceParameterSet
     */
    public ManagedDeviceCleanWindowsDeviceParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceCleanWindowsDeviceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceCleanWindowsDeviceParameterSet(@Nonnull final ManagedDeviceCleanWindowsDeviceParameterSetBuilder builder) {
        this.keepUserData = builder.keepUserData;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceCleanWindowsDeviceParameterSetBuilder newBuilder() {
        return new ManagedDeviceCleanWindowsDeviceParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceCleanWindowsDeviceParameterSet
     */
    public static final class ManagedDeviceCleanWindowsDeviceParameterSetBuilder {
        /**
         * The keepUserData parameter value
         */
        @Nullable
        protected Boolean keepUserData;
        /**
         * Sets the KeepUserData
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceCleanWindowsDeviceParameterSetBuilder withKeepUserData(@Nullable final Boolean val) {
            this.keepUserData = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceCleanWindowsDeviceParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceCleanWindowsDeviceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceCleanWindowsDeviceParameterSet build() {
            return new ManagedDeviceCleanWindowsDeviceParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.keepUserData != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keepUserData", keepUserData));
        }
        return result;
    }
}
