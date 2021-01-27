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
 * The class for the Directory Object Get Member Objects Parameter Set.
 */
public class DirectoryObjectGetMemberObjectsParameterSet {
    /**
     * The security Enabled Only.
     * 
     */
    @SerializedName(value = "securityEnabledOnly", alternate = {"SecurityEnabledOnly"})
    @Expose
	@Nullable
    public Boolean securityEnabledOnly;


    /**
     * Instiaciates a new DirectoryObjectGetMemberObjectsParameterSet
     */
    public DirectoryObjectGetMemberObjectsParameterSet() {}
    /**
     * Instiaciates a new DirectoryObjectGetMemberObjectsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DirectoryObjectGetMemberObjectsParameterSet(@Nonnull final DirectoryObjectGetMemberObjectsParameterSetBuilder builder) {
        this.securityEnabledOnly = builder.securityEnabledOnly;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DirectoryObjectGetMemberObjectsParameterSetBuilder newBuilder() {
        return new DirectoryObjectGetMemberObjectsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DirectoryObjectGetMemberObjectsParameterSet
     */
    public static final class DirectoryObjectGetMemberObjectsParameterSetBuilder {
        /**
         * The securityEnabledOnly parameter value
         */
        @Nullable
        protected Boolean securityEnabledOnly;
        /**
         * Sets the SecurityEnabledOnly
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectGetMemberObjectsParameterSetBuilder withSecurityEnabledOnly(@Nullable final Boolean val) {
            this.securityEnabledOnly = val;
            return this;
        }
        /**
         * Instanciates a new DirectoryObjectGetMemberObjectsParameterSetBuilder
         */
        @Nullable
        protected DirectoryObjectGetMemberObjectsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DirectoryObjectGetMemberObjectsParameterSet build() {
            return new DirectoryObjectGetMemberObjectsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.securityEnabledOnly != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("securityEnabledOnly", securityEnabledOnly));
        }
        return result;
    }
}
