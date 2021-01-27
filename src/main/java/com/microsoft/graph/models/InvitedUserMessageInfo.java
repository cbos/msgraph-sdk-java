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
import com.microsoft.graph.models.Recipient;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invited User Message Info.
 */
public class InvitedUserMessageInfo implements IJsonBackedObject {

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
     * The Cc Recipients.
     * Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
     */
    @SerializedName(value = "ccRecipients", alternate = {"CcRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Customized Message Body.
     * Customized message body you want to send if you don't want the default message.
     */
    @SerializedName(value = "customizedMessageBody", alternate = {"CustomizedMessageBody"})
    @Expose
	@Nullable
    public String customizedMessageBody;

    /**
     * The Message Language.
     * The language you want to send the default message in. If the customizedMessageBody is specified, this property is ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default is en-US.
     */
    @SerializedName(value = "messageLanguage", alternate = {"MessageLanguage"})
    @Expose
	@Nullable
    public String messageLanguage;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
