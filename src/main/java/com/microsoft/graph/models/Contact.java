package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Contact extends OutlookItem implements Parsable {
    /**
     * The name of the contact's assistant.
     */
    private String assistantName;
    /**
     * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime birthday;
    /**
     * The contact's business address.
     */
    private PhysicalAddress businessAddress;
    /**
     * The business home page of the contact.
     */
    private String businessHomePage;
    /**
     * The contact's business phone numbers.
     */
    private java.util.List<String> businessPhones;
    /**
     * The names of the contact's children.
     */
    private java.util.List<String> children;
    /**
     * The name of the contact's company.
     */
    private String companyName;
    /**
     * The contact's department.
     */
    private String department;
    /**
     * The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     */
    private String displayName;
    /**
     * The contact's email addresses.
     */
    private java.util.List<EmailAddress> emailAddresses;
    /**
     * The collection of open extensions defined for the contact. Read-only. Nullable.
     */
    private java.util.List<Extension> extensions;
    /**
     * The name the contact is filed under.
     */
    private String fileAs;
    /**
     * The contact's generation.
     */
    private String generation;
    /**
     * The contact's given name.
     */
    private String givenName;
    /**
     * The contact's home address.
     */
    private PhysicalAddress homeAddress;
    /**
     * The contact's home phone numbers.
     */
    private java.util.List<String> homePhones;
    /**
     * The imAddresses property
     */
    private java.util.List<String> imAddresses;
    /**
     * The initials property
     */
    private String initials;
    /**
     * The jobTitle property
     */
    private String jobTitle;
    /**
     * The manager property
     */
    private String manager;
    /**
     * The middleName property
     */
    private String middleName;
    /**
     * The mobilePhone property
     */
    private String mobilePhone;
    /**
     * The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The nickName property
     */
    private String nickName;
    /**
     * The officeLocation property
     */
    private String officeLocation;
    /**
     * The otherAddress property
     */
    private PhysicalAddress otherAddress;
    /**
     * The parentFolderId property
     */
    private String parentFolderId;
    /**
     * The personalNotes property
     */
    private String personalNotes;
    /**
     * Optional contact picture. You can get or set a photo for a contact.
     */
    private ProfilePhoto photo;
    /**
     * The profession property
     */
    private String profession;
    /**
     * The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * The spouseName property
     */
    private String spouseName;
    /**
     * The surname property
     */
    private String surname;
    /**
     * The title property
     */
    private String title;
    /**
     * The yomiCompanyName property
     */
    private String yomiCompanyName;
    /**
     * The yomiGivenName property
     */
    private String yomiGivenName;
    /**
     * The yomiSurname property
     */
    private String yomiSurname;
    /**
     * Instantiates a new contact and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Contact() {
        super();
        this.setOdataType("#microsoft.graph.contact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contact
     */
    @jakarta.annotation.Nonnull
    public static Contact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contact();
    }
    /**
     * Gets the assistantName property value. The name of the contact's assistant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssistantName() {
        return this.assistantName;
    }
    /**
     * Gets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBirthday() {
        return this.birthday;
    }
    /**
     * Gets the businessAddress property value. The contact's business address.
     * @return a physicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getBusinessAddress() {
        return this.businessAddress;
    }
    /**
     * Gets the businessHomePage property value. The business home page of the contact.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBusinessHomePage() {
        return this.businessHomePage;
    }
    /**
     * Gets the businessPhones property value. The contact's business phone numbers.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this.businessPhones;
    }
    /**
     * Gets the children property value. The names of the contact's children.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildren() {
        return this.children;
    }
    /**
     * Gets the companyName property value. The name of the contact's company.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the department property value. The contact's department.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.department;
    }
    /**
     * Gets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the emailAddresses property value. The contact's email addresses.
     * @return a emailAddress
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAddress> getEmailAddresses() {
        return this.emailAddresses;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @return a extension
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assistantName", (n) -> { this.setAssistantName(n.getStringValue()); });
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessAddress", (n) -> { this.setBusinessAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("businessHomePage", (n) -> { this.setBusinessHomePage(n.getStringValue()); });
        deserializerMap.put("businessPhones", (n) -> { this.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfObjectValues(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("fileAs", (n) -> { this.setFileAs(n.getStringValue()); });
        deserializerMap.put("generation", (n) -> { this.setGeneration(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("homeAddress", (n) -> { this.setHomeAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("homePhones", (n) -> { this.setHomePhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("imAddresses", (n) -> { this.setImAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("initials", (n) -> { this.setInitials(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getStringValue()); });
        deserializerMap.put("middleName", (n) -> { this.setMiddleName(n.getStringValue()); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("nickName", (n) -> { this.setNickName(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("otherAddress", (n) -> { this.setOtherAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("personalNotes", (n) -> { this.setPersonalNotes(n.getStringValue()); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("profession", (n) -> { this.setProfession(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("spouseName", (n) -> { this.setSpouseName(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("yomiCompanyName", (n) -> { this.setYomiCompanyName(n.getStringValue()); });
        deserializerMap.put("yomiGivenName", (n) -> { this.setYomiGivenName(n.getStringValue()); });
        deserializerMap.put("yomiSurname", (n) -> { this.setYomiSurname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileAs property value. The name the contact is filed under.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileAs() {
        return this.fileAs;
    }
    /**
     * Gets the generation property value. The contact's generation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGeneration() {
        return this.generation;
    }
    /**
     * Gets the givenName property value. The contact's given name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the homeAddress property value. The contact's home address.
     * @return a physicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getHomeAddress() {
        return this.homeAddress;
    }
    /**
     * Gets the homePhones property value. The contact's home phone numbers.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHomePhones() {
        return this.homePhones;
    }
    /**
     * Gets the imAddresses property value. The imAddresses property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getImAddresses() {
        return this.imAddresses;
    }
    /**
     * Gets the initials property value. The initials property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInitials() {
        return this.initials;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the manager property value. The manager property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManager() {
        return this.manager;
    }
    /**
     * Gets the middleName property value. The middleName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Gets the mobilePhone property value. The mobilePhone property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the nickName property value. The nickName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNickName() {
        return this.nickName;
    }
    /**
     * Gets the officeLocation property value. The officeLocation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.officeLocation;
    }
    /**
     * Gets the otherAddress property value. The otherAddress property
     * @return a physicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getOtherAddress() {
        return this.otherAddress;
    }
    /**
     * Gets the parentFolderId property value. The parentFolderId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    /**
     * Gets the personalNotes property value. The personalNotes property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPersonalNotes() {
        return this.personalNotes;
    }
    /**
     * Gets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @return a profilePhoto
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this.photo;
    }
    /**
     * Gets the profession property value. The profession property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProfession() {
        return this.profession;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the spouseName property value. The spouseName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSpouseName() {
        return this.spouseName;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the yomiCompanyName property value. The yomiCompanyName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getYomiCompanyName() {
        return this.yomiCompanyName;
    }
    /**
     * Gets the yomiGivenName property value. The yomiGivenName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getYomiGivenName() {
        return this.yomiGivenName;
    }
    /**
     * Gets the yomiSurname property value. The yomiSurname property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getYomiSurname() {
        return this.yomiSurname;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assistantName", this.getAssistantName());
        writer.writeOffsetDateTimeValue("birthday", this.getBirthday());
        writer.writeObjectValue("businessAddress", this.getBusinessAddress());
        writer.writeStringValue("businessHomePage", this.getBusinessHomePage());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeCollectionOfPrimitiveValues("children", this.getChildren());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("emailAddresses", this.getEmailAddresses());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeStringValue("fileAs", this.getFileAs());
        writer.writeStringValue("generation", this.getGeneration());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeObjectValue("homeAddress", this.getHomeAddress());
        writer.writeCollectionOfPrimitiveValues("homePhones", this.getHomePhones());
        writer.writeCollectionOfPrimitiveValues("imAddresses", this.getImAddresses());
        writer.writeStringValue("initials", this.getInitials());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("manager", this.getManager());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("nickName", this.getNickName());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeObjectValue("otherAddress", this.getOtherAddress());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeStringValue("personalNotes", this.getPersonalNotes());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeStringValue("profession", this.getProfession());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeStringValue("spouseName", this.getSpouseName());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("yomiCompanyName", this.getYomiCompanyName());
        writer.writeStringValue("yomiGivenName", this.getYomiGivenName());
        writer.writeStringValue("yomiSurname", this.getYomiSurname());
    }
    /**
     * Sets the assistantName property value. The name of the contact's assistant.
     * @param value Value to set for the assistantName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssistantName(@jakarta.annotation.Nullable final String value) {
        this.assistantName = value;
    }
    /**
     * Sets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the birthday property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBirthday(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.birthday = value;
    }
    /**
     * Sets the businessAddress property value. The contact's business address.
     * @param value Value to set for the businessAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBusinessAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.businessAddress = value;
    }
    /**
     * Sets the businessHomePage property value. The business home page of the contact.
     * @param value Value to set for the businessHomePage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBusinessHomePage(@jakarta.annotation.Nullable final String value) {
        this.businessHomePage = value;
    }
    /**
     * Sets the businessPhones property value. The contact's business phone numbers.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBusinessPhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.businessPhones = value;
    }
    /**
     * Sets the children property value. The names of the contact's children.
     * @param value Value to set for the children property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.children = value;
    }
    /**
     * Sets the companyName property value. The name of the contact's company.
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the department property value. The contact's department.
     * @param value Value to set for the department property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.department = value;
    }
    /**
     * Sets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the emailAddresses property value. The contact's email addresses.
     * @param value Value to set for the emailAddresses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<EmailAddress> value) {
        this.emailAddresses = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the contact. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the fileAs property value. The name the contact is filed under.
     * @param value Value to set for the fileAs property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileAs(@jakarta.annotation.Nullable final String value) {
        this.fileAs = value;
    }
    /**
     * Sets the generation property value. The contact's generation.
     * @param value Value to set for the generation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGeneration(@jakarta.annotation.Nullable final String value) {
        this.generation = value;
    }
    /**
     * Sets the givenName property value. The contact's given name.
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the homeAddress property value. The contact's home address.
     * @param value Value to set for the homeAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHomeAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.homeAddress = value;
    }
    /**
     * Sets the homePhones property value. The contact's home phone numbers.
     * @param value Value to set for the homePhones property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHomePhones(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.homePhones = value;
    }
    /**
     * Sets the imAddresses property value. The imAddresses property
     * @param value Value to set for the imAddresses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setImAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.imAddresses = value;
    }
    /**
     * Sets the initials property value. The initials property
     * @param value Value to set for the initials property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInitials(@jakarta.annotation.Nullable final String value) {
        this.initials = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManager(@jakarta.annotation.Nullable final String value) {
        this.manager = value;
    }
    /**
     * Sets the middleName property value. The middleName property
     * @param value Value to set for the middleName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMiddleName(@jakarta.annotation.Nullable final String value) {
        this.middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The mobilePhone property
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMobilePhone(@jakarta.annotation.Nullable final String value) {
        this.mobilePhone = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the nickName property value. The nickName property
     * @param value Value to set for the nickName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNickName(@jakarta.annotation.Nullable final String value) {
        this.nickName = value;
    }
    /**
     * Sets the officeLocation property value. The officeLocation property
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.officeLocation = value;
    }
    /**
     * Sets the otherAddress property value. The otherAddress property
     * @param value Value to set for the otherAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOtherAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.otherAddress = value;
    }
    /**
     * Sets the parentFolderId property value. The parentFolderId property
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.parentFolderId = value;
    }
    /**
     * Sets the personalNotes property value. The personalNotes property
     * @param value Value to set for the personalNotes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPersonalNotes(@jakarta.annotation.Nullable final String value) {
        this.personalNotes = value;
    }
    /**
     * Sets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @param value Value to set for the photo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPhoto(@jakarta.annotation.Nullable final ProfilePhoto value) {
        this.photo = value;
    }
    /**
     * Sets the profession property value. The profession property
     * @param value Value to set for the profession property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProfession(@jakarta.annotation.Nullable final String value) {
        this.profession = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the spouseName property value. The spouseName property
     * @param value Value to set for the spouseName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSpouseName(@jakarta.annotation.Nullable final String value) {
        this.spouseName = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the yomiCompanyName property value. The yomiCompanyName property
     * @param value Value to set for the yomiCompanyName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setYomiCompanyName(@jakarta.annotation.Nullable final String value) {
        this.yomiCompanyName = value;
    }
    /**
     * Sets the yomiGivenName property value. The yomiGivenName property
     * @param value Value to set for the yomiGivenName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setYomiGivenName(@jakarta.annotation.Nullable final String value) {
        this.yomiGivenName = value;
    }
    /**
     * Sets the yomiSurname property value. The yomiSurname property
     * @param value Value to set for the yomiSurname property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setYomiSurname(@jakarta.annotation.Nullable final String value) {
        this.yomiSurname = value;
    }
}
