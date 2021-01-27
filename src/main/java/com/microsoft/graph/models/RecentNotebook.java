// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RecentNotebookLinks;
import com.microsoft.graph.models.OnenoteSourceService;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recent Notebook.
 */
public class RecentNotebook implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Display Name.
     * The name of the notebook.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Accessed Time.
     * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "lastAccessedTime", alternate = {"LastAccessedTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastAccessedTime;

    /**
     * The Links.
     * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     */
    @SerializedName(value = "links", alternate = {"Links"})
    @Expose
	@Nullable
    public RecentNotebookLinks links;

    /**
     * The Source Service.
     * The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
     */
    @SerializedName(value = "sourceService", alternate = {"SourceService"})
    @Expose
	@Nullable
    public OnenoteSourceService sourceService;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
