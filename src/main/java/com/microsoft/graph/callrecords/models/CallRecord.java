// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.models.Modality;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.callrecords.models.CallType;
import com.microsoft.graph.callrecords.models.Session;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.callrecords.requests.SessionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record.
 */
public class CallRecord extends Entity implements IJsonBackedObject {


    /**
     * The End Date Time.
     * UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Join Web Url.
     * Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     */
    @SerializedName(value = "joinWebUrl", alternate = {"JoinWebUrl"})
    @Expose
	@Nullable
    public String joinWebUrl;

    /**
     * The Last Modified Date Time.
     * UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Modalities.
     * List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     */
    @SerializedName(value = "modalities", alternate = {"Modalities"})
    @Expose
	@Nullable
    public java.util.List<Modality> modalities;

    /**
     * The Organizer.
     * The organizing party's identity.
     */
    @SerializedName(value = "organizer", alternate = {"Organizer"})
    @Expose
	@Nullable
    public IdentitySet organizer;

    /**
     * The Participants.
     * List of distinct identities involved in the call.
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public java.util.List<IdentitySet> participants;

    /**
     * The Start Date Time.
     * UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Type.
     * Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public CallType type;

    /**
     * The Version.
     * Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Long version;

    /**
     * The Sessions.
     * List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     */
    @SerializedName(value = "sessions", alternate = {"Sessions"})
    @Expose
	@Nullable
    public SessionCollectionPage sessions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("sessions")) {
            sessions = serializer.deserializeObject(json.get("sessions").toString(), SessionCollectionPage.class);
        }
    }
}
