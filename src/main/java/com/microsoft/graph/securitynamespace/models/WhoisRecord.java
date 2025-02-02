// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.WhoisBaseRecord;
import com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Whois Record.
 */
public class WhoisRecord extends WhoisBaseRecord implements IJsonBackedObject {


    /**
     * The History.
     * The collection of historical records associated to this WHOIS object.
     */
	@Nullable
    public com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage history;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("history")) {
            history = serializer.deserializeObject(json.get("history"), com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage.class);
        }
    }
}
