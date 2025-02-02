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
import com.microsoft.graph.models.PersonType;
import com.microsoft.graph.models.Phone;
import com.microsoft.graph.models.Location;
import com.microsoft.graph.models.ScoredEmailAddress;
import com.microsoft.graph.models.Website;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person.
 */
public class Person extends Entity implements IJsonBackedObject {


    /**
     * The Birthday.
     * The person's birthday.
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
	@Nullable
    public String birthday;

    /**
     * The Company Name.
     * The name of the person's company.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Department.
     * The person's department.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Display Name.
     * The person's display name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Given Name.
     * The person's given name.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Im Address.
     * The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
     */
    @SerializedName(value = "imAddress", alternate = {"ImAddress"})
    @Expose
	@Nullable
    public String imAddress;

    /**
     * The Is Favorite.
     * True if the user has flagged this person as a favorite.
     */
    @SerializedName(value = "isFavorite", alternate = {"IsFavorite"})
    @Expose
	@Nullable
    public Boolean isFavorite;

    /**
     * The Job Title.
     * The person's job title.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Office Location.
     * The location of the person's office.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The Person Notes.
     * Free-form notes that the user has taken about this person.
     */
    @SerializedName(value = "personNotes", alternate = {"PersonNotes"})
    @Expose
	@Nullable
    public String personNotes;

    /**
     * The Person Type.
     * The type of person.
     */
    @SerializedName(value = "personType", alternate = {"PersonType"})
    @Expose
	@Nullable
    public PersonType personType;

    /**
     * The Phones.
     * The person's phone numbers.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
	@Nullable
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * The person's addresses.
     */
    @SerializedName(value = "postalAddresses", alternate = {"PostalAddresses"})
    @Expose
	@Nullable
    public java.util.List<Location> postalAddresses;

    /**
     * The Profession.
     * The person's profession.
     */
    @SerializedName(value = "profession", alternate = {"Profession"})
    @Expose
	@Nullable
    public String profession;

    /**
     * The Scored Email Addresses.
     * The person's email addresses.
     */
    @SerializedName(value = "scoredEmailAddresses", alternate = {"ScoredEmailAddresses"})
    @Expose
	@Nullable
    public java.util.List<ScoredEmailAddress> scoredEmailAddresses;

    /**
     * The Surname.
     * The person's surname.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Websites.
     * The person's websites.
     */
    @SerializedName(value = "websites", alternate = {"Websites"})
    @Expose
	@Nullable
    public java.util.List<Website> websites;

    /**
     * The Yomi Company.
     * The phonetic Japanese name of the person's company.
     */
    @SerializedName(value = "yomiCompany", alternate = {"YomiCompany"})
    @Expose
	@Nullable
    public String yomiCompany;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
