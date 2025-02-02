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
import com.microsoft.graph.models.Status;
import com.microsoft.graph.models.VisualInfo;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ActivityHistoryItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity.
 */
public class UserActivity extends Entity implements IJsonBackedObject {


    /**
     * The Activation Url.
     * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     */
    @SerializedName(value = "activationUrl", alternate = {"ActivationUrl"})
    @Expose
	@Nullable
    public String activationUrl;

    /**
     * The Activity Source Host.
     * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     */
    @SerializedName(value = "activitySourceHost", alternate = {"ActivitySourceHost"})
    @Expose
	@Nullable
    public String activitySourceHost;

    /**
     * The App Activity Id.
     * Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     */
    @SerializedName(value = "appActivityId", alternate = {"AppActivityId"})
    @Expose
	@Nullable
    public String appActivityId;

    /**
     * The App Display Name.
     * Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the user’s local device.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The Content Info.
     * Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     */
    @SerializedName(value = "contentInfo", alternate = {"ContentInfo"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement contentInfo;

    /**
     * The Content Url.
     * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     */
    @SerializedName(value = "contentUrl", alternate = {"ContentUrl"})
    @Expose
	@Nullable
    public String contentUrl;

    /**
     * The Created Date Time.
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Expiration Date Time.
     * Set by the server. DateTime in UTC when the object expired on the server.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Fallback Url.
     * Optional. URL used to launch the activity in a web-based app, if available.
     */
    @SerializedName(value = "fallbackUrl", alternate = {"FallbackUrl"})
    @Expose
	@Nullable
    public String fallbackUrl;

    /**
     * The Last Modified Date Time.
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Status.
     * Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public Status status;

    /**
     * The User Timezone.
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     */
    @SerializedName(value = "userTimezone", alternate = {"UserTimezone"})
    @Expose
	@Nullable
    public String userTimezone;

    /**
     * The Visual Elements.
     * Required. The object containing information to render the activity in the UX.
     */
    @SerializedName(value = "visualElements", alternate = {"VisualElements"})
    @Expose
	@Nullable
    public VisualInfo visualElements;

    /**
     * The History Items.
     * Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     */
    @SerializedName(value = "historyItems", alternate = {"HistoryItems"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ActivityHistoryItemCollectionPage historyItems;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("historyItems")) {
            historyItems = serializer.deserializeObject(json.get("historyItems"), com.microsoft.graph.requests.ActivityHistoryItemCollectionPage.class);
        }
    }
}
