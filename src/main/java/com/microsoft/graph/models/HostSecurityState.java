// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Security State.
 */
public class HostSecurityState implements IJsonBackedObject {

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
     * The Fqdn.
     * Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     */
    @SerializedName(value = "fqdn", alternate = {"Fqdn"})
    @Expose
	@Nullable
    public String fqdn;

    /**
     * The Is Azure Ad Joined.
     * 
     */
    @SerializedName(value = "isAzureAdJoined", alternate = {"IsAzureAdJoined"})
    @Expose
	@Nullable
    public Boolean isAzureAdJoined;

    /**
     * The Is Azure Ad Registered.
     * 
     */
    @SerializedName(value = "isAzureAdRegistered", alternate = {"IsAzureAdRegistered"})
    @Expose
	@Nullable
    public Boolean isAzureAdRegistered;

    /**
     * The Is Hybrid Azure Domain Joined.
     * True if the host is domain joined to an on-premises Active Directory domain.
     */
    @SerializedName(value = "isHybridAzureDomainJoined", alternate = {"IsHybridAzureDomainJoined"})
    @Expose
	@Nullable
    public Boolean isHybridAzureDomainJoined;

    /**
     * The Net Bios Name.
     * The local host name, without the DNS domain name.
     */
    @SerializedName(value = "netBiosName", alternate = {"NetBiosName"})
    @Expose
	@Nullable
    public String netBiosName;

    /**
     * The Os.
     * Host Operating System. (For example, Windows 10, macOS, RHEL, etc.).
     */
    @SerializedName(value = "os", alternate = {"Os"})
    @Expose
	@Nullable
    public String os;

    /**
     * The Private Ip Address.
     * Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     */
    @SerializedName(value = "privateIpAddress", alternate = {"PrivateIpAddress"})
    @Expose
	@Nullable
    public String privateIpAddress;

    /**
     * The Public Ip Address.
     * Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     */
    @SerializedName(value = "publicIpAddress", alternate = {"PublicIpAddress"})
    @Expose
	@Nullable
    public String publicIpAddress;

    /**
     * The Risk Score.
     * Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
	@Nullable
    public String riskScore;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
