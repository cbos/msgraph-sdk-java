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
import com.microsoft.graph.security.requests.HostPairCollectionPage;
import com.microsoft.graph.security.requests.HostCollectionPage;
import com.microsoft.graph.security.requests.HostSslCertificateCollectionPage;
import com.microsoft.graph.security.requests.HostTrackerCollectionPage;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionPage;
import com.microsoft.graph.security.requests.IntelligenceProfileCollectionPage;
import com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage;
import com.microsoft.graph.security.requests.SslCertificateCollectionPage;
import com.microsoft.graph.security.requests.SubdomainCollectionPage;
import com.microsoft.graph.security.requests.VulnerabilityCollectionPage;
import com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage;
import com.microsoft.graph.security.requests.WhoisRecordCollectionPage;


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
     * Refers to indicators of threat or compromise highlighted in an article.Note: List retrieval is not yet supported.
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
     * Retrieve details about hostComponent objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostComponents", alternate = {"HostComponents"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostComponentCollectionPage hostComponents;

    /**
     * The Host Cookies.
     * Retrieve details about hostCookie objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostCookies", alternate = {"HostCookies"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostCookieCollectionPage hostCookies;

    /**
     * The Host Pairs.
     * Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostPairs", alternate = {"HostPairs"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostPairCollectionPage hostPairs;

    /**
     * The Hosts.
     * Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hosts", alternate = {"Hosts"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostCollectionPage hosts;

    /**
     * The Host Ssl Certificates.
     * Retrieve details about hostSslCertificate objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "hostSslCertificates", alternate = {"HostSslCertificates"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.HostSslCertificateCollectionPage hostSslCertificates;

    /**
     * The Host Trackers.
     * Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
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
     * Retrieve details about passiveDnsRecord objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "passiveDnsRecords", alternate = {"PassiveDnsRecords"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage passiveDnsRecords;

    /**
     * The Ssl Certificates.
     * Retrieve details about sslCertificate objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "sslCertificates", alternate = {"SslCertificates"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.SslCertificateCollectionPage sslCertificates;

    /**
     * The Subdomains.
     * Retrieve details about the subdomain.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "subdomains", alternate = {"Subdomains"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.SubdomainCollectionPage subdomains;

    /**
     * The Vulnerabilities.
     * Retrieve details about vulnerabilities.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "vulnerabilities", alternate = {"Vulnerabilities"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.VulnerabilityCollectionPage vulnerabilities;

    /**
     * The Whois History Records.
     * Retrieve details about whoisHistoryRecord objects.Note: List retrieval is not yet supported.
     */
    @SerializedName(value = "whoisHistoryRecords", alternate = {"WhoisHistoryRecords"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage whoisHistoryRecords;

    /**
     * The Whois Records.
     * A list of whoisRecord objects.
     */
    @SerializedName(value = "whoisRecords", alternate = {"WhoisRecords"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.WhoisRecordCollectionPage whoisRecords;


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

        if (json.has("hostPairs")) {
            hostPairs = serializer.deserializeObject(json.get("hostPairs"), com.microsoft.graph.security.requests.HostPairCollectionPage.class);
        }

        if (json.has("hosts")) {
            hosts = serializer.deserializeObject(json.get("hosts"), com.microsoft.graph.security.requests.HostCollectionPage.class);
        }

        if (json.has("hostSslCertificates")) {
            hostSslCertificates = serializer.deserializeObject(json.get("hostSslCertificates"), com.microsoft.graph.security.requests.HostSslCertificateCollectionPage.class);
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

        if (json.has("sslCertificates")) {
            sslCertificates = serializer.deserializeObject(json.get("sslCertificates"), com.microsoft.graph.security.requests.SslCertificateCollectionPage.class);
        }

        if (json.has("subdomains")) {
            subdomains = serializer.deserializeObject(json.get("subdomains"), com.microsoft.graph.security.requests.SubdomainCollectionPage.class);
        }

        if (json.has("vulnerabilities")) {
            vulnerabilities = serializer.deserializeObject(json.get("vulnerabilities"), com.microsoft.graph.security.requests.VulnerabilityCollectionPage.class);
        }

        if (json.has("whoisHistoryRecords")) {
            whoisHistoryRecords = serializer.deserializeObject(json.get("whoisHistoryRecords"), com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionPage.class);
        }

        if (json.has("whoisRecords")) {
            whoisRecords = serializer.deserializeObject(json.get("whoisRecords"), com.microsoft.graph.security.requests.WhoisRecordCollectionPage.class);
        }
    }
}
