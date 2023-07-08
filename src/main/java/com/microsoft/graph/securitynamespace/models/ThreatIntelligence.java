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
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage;
import com.microsoft.graph.security.requests.ArticleCollectionPage;
import com.microsoft.graph.security.requests.HostComponentCollectionPage;
import com.microsoft.graph.security.requests.HostCookieCollectionPage;
import com.microsoft.graph.security.requests.HostCollectionPage;
import com.microsoft.graph.security.requests.HostTrackerCollectionPage;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionPage;
import com.microsoft.graph.security.requests.IntelligenceProfileCollectionPage;
import com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage;
import com.microsoft.graph.security.requests.VulnerabilityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Intelligence.
 */
public class ThreatIntelligence extends Entity implements IJsonBackedObject {


    /**
     * The Article Indicators.
     * Refers to indicators of threat or compromise highlighted in an microsoft.graph.security.article.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "articleIndicators", alternate = {"ArticleIndicators"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage articleIndicators;

    /**
     * The Articles.
     * A list of article objects.
     */
    @SerializedName(value = "articles", alternate = {"Articles"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.ArticleCollectionPage articles;

    /**
     * The Host Components.
     * Retrieve details about microsoft.graph.security.hostComponent objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostComponents", alternate = {"HostComponents"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostComponentCollectionPage hostComponents;

    /**
     * The Host Cookies.
     * Retrieve details about microsoft.graph.security.hostCookie objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostCookies", alternate = {"HostCookies"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostCookieCollectionPage hostCookies;

    /**
     * The Hosts.
     * Refers to microsoft.graph.security.host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hosts", alternate = {"Hosts"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostCollectionPage hosts;

    /**
     * The Host Trackers.
     * Retrieve details about microsoft.graph.security.hostTracker objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostTrackers", alternate = {"HostTrackers"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostTrackerCollectionPage hostTrackers;

    /**
     * The Intelligence Profile Indicators.
     * 
     */
    @SerializedName(value = "intelligenceProfileIndicators", alternate = {"IntelligenceProfileIndicators"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionPage intelligenceProfileIndicators;

    /**
     * The Intel Profiles.
     * A list of intelligenceProfile objects.
     */
    @SerializedName(value = "intelProfiles", alternate = {"IntelProfiles"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.IntelligenceProfileCollectionPage intelProfiles;

    /**
     * The Passive Dns Records.
     * Retrieve details about microsoft.graph.security.passiveDnsRecord objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "passiveDnsRecords", alternate = {"PassiveDnsRecords"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage passiveDnsRecords;

    /**
     * The Vulnerabilities.
     * Retrieve details about microsoft.graph.security.vulnerabilities.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "vulnerabilities", alternate = {"Vulnerabilities"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.VulnerabilityCollectionPage vulnerabilities;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("articleIndicators")) {
            articleIndicators = serializer.deserializeObject(json.get("articleIndicators"), com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage.class);
        }

        if (json.has("articles")) {
            articles = serializer.deserializeObject(json.get("articles"), com.microsoft.graph.security.requests.ArticleCollectionPage.class);
        }

        if (json.has("hostComponents")) {
            hostComponents = serializer.deserializeObject(json.get("hostComponents"), com.microsoft.graph.security.requests.HostComponentCollectionPage.class);
        }

        if (json.has("hostCookies")) {
            hostCookies = serializer.deserializeObject(json.get("hostCookies"), com.microsoft.graph.security.requests.HostCookieCollectionPage.class);
        }

        if (json.has("hosts")) {
            hosts = serializer.deserializeObject(json.get("hosts"), com.microsoft.graph.security.requests.HostCollectionPage.class);
        }

        if (json.has("hostTrackers")) {
            hostTrackers = serializer.deserializeObject(json.get("hostTrackers"), com.microsoft.graph.security.requests.HostTrackerCollectionPage.class);
        }

        if (json.has("intelligenceProfileIndicators")) {
            intelligenceProfileIndicators = serializer.deserializeObject(json.get("intelligenceProfileIndicators"), com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionPage.class);
        }

        if (json.has("intelProfiles")) {
            intelProfiles = serializer.deserializeObject(json.get("intelProfiles"), com.microsoft.graph.security.requests.IntelligenceProfileCollectionPage.class);
        }

        if (json.has("passiveDnsRecords")) {
            passiveDnsRecords = serializer.deserializeObject(json.get("passiveDnsRecords"), com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage.class);
        }

        if (json.has("vulnerabilities")) {
            vulnerabilities = serializer.deserializeObject(json.get("vulnerabilities"), com.microsoft.graph.security.requests.VulnerabilityCollectionPage.class);
        }
    }
}
