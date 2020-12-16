// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.PageLinks;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.OnenoteEntitySchemaObjectModel;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page.
 */
public class OnenotePage extends OnenoteEntitySchemaObjectModel implements IJsonBackedObject {


    /**
     * The Content Url.
     * The URL for the page's HTML content.  Read-only.
     */
    @SerializedName(value = "contentUrl", alternate = {"ContentUrl"})
    @Expose
	@Nullable
    public String contentUrl;

    /**
     * The Created By App Id.
     * The unique identifier of the application that created the page. Read-only.
     */
    @SerializedName(value = "createdByAppId", alternate = {"CreatedByAppId"})
    @Expose
	@Nullable
    public String createdByAppId;

    /**
     * The Last Modified Date Time.
     * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Level.
     * The indentation level of the page. Read-only.
     */
    @SerializedName(value = "level", alternate = {"Level"})
    @Expose
	@Nullable
    public Integer level;

    /**
     * The Links.
     * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     */
    @SerializedName(value = "links", alternate = {"Links"})
    @Expose
	@Nullable
    public PageLinks links;

    /**
     * The Order.
     * The order of the page within its parent section. Read-only.
     */
    @SerializedName(value = "order", alternate = {"Order"})
    @Expose
	@Nullable
    public Integer order;

    /**
     * The Title.
     * The title of the page.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The User Tags.
     * 
     */
    @SerializedName(value = "userTags", alternate = {"UserTags"})
    @Expose
	@Nullable
    public java.util.List<String> userTags;

    /**
     * The Parent Notebook.
     * The notebook that contains the page.  Read-only.
     */
    @SerializedName(value = "parentNotebook", alternate = {"ParentNotebook"})
    @Expose
	@Nullable
    public Notebook parentNotebook;

    /**
     * The Parent Section.
     * The section that contains the page. Read-only.
     */
    @SerializedName(value = "parentSection", alternate = {"ParentSection"})
    @Expose
	@Nullable
    public OnenoteSection parentSection;


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
	@Override
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
