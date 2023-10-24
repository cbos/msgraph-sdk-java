// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AccessPackageResourceEnvironment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.AccessPackageResourceScopeCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource.
 */
public class AccessPackageResource extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * A description for the resource.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the resource, such as the application name, group name or site name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Modified Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Origin Id.
     * The unique identifier of the resource in the origin system. In the case of a Microsoft Entra group, this is the identifier of the group.
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
	@Nullable
    public String originId;

    /**
     * The Origin System.
     * The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
	@Nullable
    public String originSystem;

    /**
     * The Environment.
     * Contains the environment information for the resource. This can be set using either the @odata.bind annotation or the environment's originId.Supports $expand.
     */
    @SerializedName(value = "environment", alternate = {"Environment"})
    @Expose
	@Nullable
    public AccessPackageResourceEnvironment environment;

    /**
     * The Roles.
     * Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "roles", alternate = {"Roles"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageResourceRoleCollectionPage roles;

    /**
     * The Scopes.
     * Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "scopes", alternate = {"Scopes"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageResourceScopeCollectionPage scopes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("roles")) {
            roles = serializer.deserializeObject(json.get("roles"), com.microsoft.graph.requests.AccessPackageResourceRoleCollectionPage.class);
        }

        if (json.has("scopes")) {
            scopes = serializer.deserializeObject(json.get("scopes"), com.microsoft.graph.requests.AccessPackageResourceScopeCollectionPage.class);
        }
    }
}
