package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class User extends DirectoryObject implements Parsable {
    /** A freeform text entry field for the user to describe themselves. Returned only on $select. */
    private String _aboutMe;
    /** true if the account is enabled; otherwise, false. This property is required when a user is created. Returned only on $select. Supports $filter (eq, ne, not, and in). */
    private Boolean _accountEnabled;
    /** The user's activities across devices. Read-only. Nullable. */
    private java.util.List<UserActivity> _activities;
    /** Sets the age group of the user. Allowed values: null, Minor, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in). */
    private String _ageGroup;
    /** The user's terms of use acceptance statuses. Read-only. Nullable. */
    private java.util.List<AgreementAcceptance> _agreementAcceptances;
    /** Represents the app roles a user has been granted for an application. Supports $expand. */
    private java.util.List<AppRoleAssignment> _appRoleAssignments;
    /** The licenses that are assigned to the user, including inherited (group-based) licenses. This property doesn't differentiate directly-assigned and inherited licenses. Use the licenseAssignmentStates property to identify the directly-assigned and inherited licenses.  Not nullable. Returned only on $select. Supports $filter (eq, not, /$count eq 0, /$count ne 0). */
    private java.util.List<AssignedLicense> _assignedLicenses;
    /** The plans that are assigned to the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq and not). */
    private java.util.List<AssignedPlan> _assignedPlans;
    /** The authentication methods that are supported for the user. */
    private Authentication _authentication;
    /** The authorizationInfo property */
    private AuthorizationInfo _authorizationInfo;
    /** The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select. */
    private OffsetDateTime _birthday;
    /** The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this property. Read-only for users synced from on-premises directory. Returned by default. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _businessPhones;
    /** The user's primary calendar. Read-only. */
    private Calendar _calendar;
    /** The user's calendar groups. Read-only. Nullable. */
    private java.util.List<CalendarGroup> _calendarGroups;
    /** The user's calendars. Read-only. Nullable. */
    private java.util.List<Calendar> _calendars;
    /** The calendar view for the calendar. Read-only. Nullable. */
    private java.util.List<Event> _calendarView;
    /** The chats property */
    private java.util.List<Chat> _chats;
    /** The city in which the user is located. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _city;
    /** The company name which the user is associated. This property can be useful for describing the company that an external user comes from. The maximum length is 64 characters.Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _companyName;
    /** Sets whether consent has been obtained for minors. Allowed values: null, Granted, Denied and NotRequired. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in). */
    private String _consentProvidedForMinor;
    /** The user's contacts folders. Read-only. Nullable. */
    private java.util.List<ContactFolder> _contactFolders;
    /** The user's contacts. Read-only. Nullable. */
    private java.util.List<Contact> _contacts;
    /** The country/region in which the user is located; for example, US or UK. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _country;
    /** The date and time the user was created, in ISO 8601 format and in UTC time. The value cannot be modified and is automatically populated when the entity is created. Nullable. For on-premises users, the value represents when they were first created in Azure AD. Property is null for some users created before June 2018 and on-premises users that were synced to Azure AD before June 2018. Read-only.  Read-only. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in). */
    private OffsetDateTime _createdDateTime;
    /** Directory objects that were created by the user. Read-only. Nullable. */
    private java.util.List<DirectoryObject> _createdObjects;
    /** Indicates whether the user account was created through one of the following methods:  As a regular school or work account (null). As an external account (Invitation). As a local account for an Azure Active Directory B2C tenant (LocalAccount). Through self-service sign-up by an internal user using email verification (EmailVerified). Through self-service sign-up by an external user signing up through a link that is part of a user flow (SelfServiceSignUp). Read-only.Returned only on $select. Supports $filter (eq, ne, not, in). */
    private String _creationType;
    /** The name for the department in which the user works. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, and eq on null values). */
    private String _department;
    /** The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000. */
    private Integer _deviceEnrollmentLimit;
    /** The list of troubleshooting events for this user. */
    private java.util.List<DeviceManagementTroubleshootingEvent> _deviceManagementTroubleshootingEvents;
    /** The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _directReports;
    /** The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial and last name. This property is required when a user is created and it cannot be cleared during updates. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values), $orderBy, and $search. */
    private String _displayName;
    /** The user's OneDrive. Read-only. */
    private Drive _drive;
    /** A collection of drives available for this user. Read-only. */
    private java.util.List<Drive> _drives;
    /** The date and time when the user was hired or will start work in case of a future hire. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in). */
    private OffsetDateTime _employeeHireDate;
    /** The employee identifier assigned to the user by the organization. The maximum length is 16 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values). */
    private String _employeeId;
    /** Represents organization data (e.g. division and costCenter) associated with a user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in). */
    private EmployeeOrgData _employeeOrgData;
    /** Captures enterprise worker type. For example, Employee, Contractor, Consultant, or Vendor. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith). */
    private String _employeeType;
    /** The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable. */
    private java.util.List<Event> _events;
    /** The collection of open extensions defined for the user. Read-only. Supports $expand. Nullable. */
    private java.util.List<Extension> _extensions;
    /** For an external user invited to the tenant using the invitation API, this property represents the invited user's invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users. Returned only on $select. Supports $filter (eq, ne, not , in). */
    private String _externalUserState;
    /** Shows the timestamp for the latest change to the externalUserState property. Returned only on $select. Supports $filter (eq, ne, not , in). */
    private OffsetDateTime _externalUserStateChangeDateTime;
    /** The fax number of the user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values). */
    private String _faxNumber;
    /** The followedSites property */
    private java.util.List<Site> _followedSites;
    /** The given name (first name) of the user. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values). */
    private String _givenName;
    /** The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.  Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property to set and update hire date values using Microsoft Graph APIs. */
    private OffsetDateTime _hireDate;
    /** Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Returned only on $select. Supports $filter (eq) including on null values, only where the signInType is not userPrincipalName. */
    private java.util.List<ObjectIdentity> _identities;
    /** The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _imAddresses;
    /** Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance. */
    private InferenceClassification _inferenceClassification;
    /** The insights property */
    private OfficeGraphInsights _insights;
    /** A list for the user to describe their interests. Returned only on $select. */
    private java.util.List<String> _interests;
    /** Do not use  reserved for future use. */
    private Boolean _isResourceAccount;
    /** The user's job title. Maximum length is 128 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values). */
    private String _jobTitle;
    /** The joinedTeams property */
    private java.util.List<Team> _joinedTeams;
    /** The time when this Azure AD user last changed their password or when their password was created, whichever date the latest action was performed. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select. */
    private OffsetDateTime _lastPasswordChangeDateTime;
    /** Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated based on ageGroup and consentProvidedForMinor properties. Allowed values: null, MinorWithOutParentalConsent, MinorWithParentalConsent, MinorNoParentalConsentRequired, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select. */
    private String _legalAgeGroupClassification;
    /** State of license assignments for this user. Also indicates licenses that are directly-assigned and those that the user has inherited through group memberships. Read-only. Returned only on $select. */
    private java.util.List<LicenseAssignmentState> _licenseAssignmentStates;
    /** A collection of this user's license details. Read-only. */
    private java.util.List<LicenseDetails> _licenseDetails;
    /** The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Changes to this property will also update the user's proxyAddresses collection to include the value as an SMTP address. This property cannot contain accent characters.  NOTE: We do not recommend updating this property for Azure AD B2C user profiles. Use the otherMails property instead. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith, and eq on null values). */
    private String _mail;
    /** Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale and time zone. Returned only on $select. */
    private MailboxSettings _mailboxSettings;
    /** The user's mail folders. Read-only. Nullable. */
    private java.util.List<MailFolder> _mailFolders;
    /** The mail alias for the user. This property must be specified when a user is created. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _mailNickname;
    /** Zero or more managed app registrations that belong to the user. */
    private java.util.List<ManagedAppRegistration> _managedAppRegistrations;
    /** The managed devices associated with the user. */
    private java.util.List<ManagedDevice> _managedDevices;
    /** The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.). Supports $expand. */
    private DirectoryObject _manager;
    /** The groups and directory roles that the user is a member of. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _memberOf;
    /** The messages in a mailbox or folder. Read-only. Nullable. */
    private java.util.List<Message> _messages;
    /** The primary cellular telephone number for the user. Read-only for users synced from on-premises directory. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _mobilePhone;
    /** The URL for the user's personal site. Returned only on $select. */
    private String _mySite;
    /** The oauth2PermissionGrants property */
    private java.util.List<OAuth2PermissionGrant> _oauth2PermissionGrants;
    /** The office location in the user's place of business. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _officeLocation;
    /** The onenote property */
    private Onenote _onenote;
    /** The onlineMeetings property */
    private java.util.List<OnlineMeeting> _onlineMeetings;
    /** Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. */
    private String _onPremisesDistinguishedName;
    /** Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. */
    private String _onPremisesDomainName;
    /** Contains extensionAttributes1-15 for the user. These extension attributes are also known as Exchange custom attributes 1-15. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties can be set during creation or update of a user object.  For a cloud-only user previously synced from on-premises Active Directory, these properties are read-only in Microsoft Graph but can be fully managed through the Exchange Admin Center or the Exchange Online V2 module in PowerShell. Returned only on $select. Supports $filter (eq, ne, not, in). */
    private OnPremisesExtensionAttributes _onPremisesExtensionAttributes;
    /** This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user's userPrincipalName (UPN) property. NOTE: The $ and _ characters cannot be used when specifying this property. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in).. */
    private String _onPremisesImmutableId;
    /** Indicates the last time at which the object was synced with the on-premises directory; for example: 2013-02-16T03:04:54Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in). */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** Errors when using Microsoft synchronization product during provisioning. Returned only on $select. Supports $filter (eq, not, ge, le). */
    private java.util.List<OnPremisesProvisioningError> _onPremisesProvisioningErrors;
    /** Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith). */
    private String _onPremisesSamAccountName;
    /** Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only. Returned only on $select.  Supports $filter (eq including on null values). */
    private String _onPremisesSecurityIdentifier;
    /** true if this user object is currently being synced from an on-premises Active Directory (AD); otherwise the user isn't being synced and can be managed in Azure Active Directory (Azure AD). Read-only. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values). */
    private Boolean _onPremisesSyncEnabled;
    /** Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith). */
    private String _onPremisesUserPrincipalName;
    /** A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. NOTE: This property cannot contain accent characters. Returned only on $select. Supports $filter (eq, not, ge, le, in, startsWith, endsWith, /$count eq 0, /$count ne 0). */
    private java.util.List<String> _otherMails;
    /** The outlook property */
    private OutlookUser _outlook;
    /** Devices that are owned by the user. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1). */
    private java.util.List<DirectoryObject> _ownedDevices;
    /** Directory objects that are owned by the user. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _ownedObjects;
    /** Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two may be specified together; for example: DisablePasswordExpiration, DisableStrongPassword. Returned only on $select. For more information on the default password policies, see Azure AD pasword policies. Supports $filter (ne, not, and eq on null values). */
    private String _passwordPolicies;
    /** Specifies the password profile for the user. The profile contains the users password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required. NOTE: For Azure B2C tenants, the forceChangePasswordNextSignIn property should be set to false and instead use custom policies and user flows to force password reset at first logon. See Force password reset at first logon.Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values). */
    private PasswordProfile _passwordProfile;
    /** A list for the user to enumerate their past projects. Returned only on $select. */
    private java.util.List<String> _pastProjects;
    /** People that are relevant to the user. Read-only. Nullable. */
    private java.util.List<Person> _people;
    /** The user's profile photo. Read-only. */
    private ProfilePhoto _photo;
    /** The photos property */
    private java.util.List<ProfilePhoto> _photos;
    /** Entry-point to the Planner resource that might exist for a user. Read-only. */
    private PlannerUser _planner;
    /** The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code. Maximum length is 40 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _postalCode;
    /** The preferred data location for the user. For more information, see OneDrive Online Multi-Geo. */
    private String _preferredDataLocation;
    /** The preferred language for the user. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values) */
    private String _preferredLanguage;
    /** The preferred name for the user. Not Supported. This attribute returns an empty string.Returned only on $select. */
    private String _preferredName;
    /** The presence property */
    private Presence _presence;
    /** The plans that are provisioned for the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le). */
    private java.util.List<ProvisionedPlan> _provisionedPlans;
    /** For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. Changes to the mail property will also update this collection to include the value as an SMTP address. For more information, see mail and proxyAddresses properties. The proxy address prefixed with SMTP (capitalized) is the primary proxy address while those prefixed with smtp are the secondary proxy addresses. For Azure AD B2C accounts, this property has a limit of ten unique addresses. Read-only in Microsoft Graph; you can update this property only through the Microsoft 365 admin center. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith, endsWith, /$count eq 0, /$count ne 0). */
    private java.util.List<String> _proxyAddresses;
    /** Devices that are registered for the user. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _registeredDevices;
    /** A list for the user to enumerate their responsibilities. Returned only on $select. */
    private java.util.List<String> _responsibilities;
    /** A list for the user to enumerate the schools they have attended. Returned only on $select. */
    private java.util.List<String> _schools;
    /** The scopedRoleMemberOf property */
    private java.util.List<ScopedRoleMembership> _scopedRoleMemberOf;
    /** Security identifier (SID) of the user, used in Windows scenarios. Read-only. Returned by default. Supports $select and $filter (eq, not, ge, le, startsWith). */
    private String _securityIdentifier;
    /** The settings property */
    private UserSettings _settings;
    /** Do not use in Microsoft Graph. Manage this property through the Microsoft 365 admin center instead. Represents whether the user should be included in the Outlook global address list. See Known issue. */
    private Boolean _showInAddressList;
    /** Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use revokeSignInSessions to reset. Returned only on $select. */
    private OffsetDateTime _signInSessionsValidFromDateTime;
    /** A list for the user to enumerate their skills. Returned only on $select. */
    private java.util.List<String> _skills;
    /** The state or province in the user's address. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _state;
    /** The street address of the user's place of business. Maximum length is 1024 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _streetAddress;
    /** The user's surname (family name or last name). Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _surname;
    /** The teamwork property */
    private UserTeamwork _teamwork;
    /** Represents the To Do services available to a user. */
    private Todo _todo;
    /** The groups, including nested groups, and directory roles that a user is a member of. Nullable. */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /** A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: US, JP, and GB. Not nullable. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _usageLocation;
    /** The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.NOTE: This property cannot contain accent characters. Only the following characters are allowed A - Z, a - z, 0 - 9, ' . - _ ! # ^ ~. For the complete list of allowed characters, see username policies. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith) and $orderBy. */
    private String _userPrincipalName;
    /** A string value that can be used to classify user types in your directory, such as Member and Guest. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values). NOTE: For more information about the permissions for member and guest users, see What are the default user permissions in Azure Active Directory? */
    private String _userType;
    /**
     * Instantiates a new User and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public User() {
        super();
        this.setOdataType("#microsoft.graph.user");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a User
     */
    @javax.annotation.Nonnull
    public static User createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new User();
    }
    /**
     * Gets the aboutMe property value. A freeform text entry field for the user to describe themselves. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAboutMe() {
        return this._aboutMe;
    }
    /**
     * Gets the accountEnabled property value. true if the account is enabled; otherwise, false. This property is required when a user is created. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the activities property value. The user's activities across devices. Read-only. Nullable.
     * @return a userActivity
     */
    @javax.annotation.Nullable
    public java.util.List<UserActivity> getActivities() {
        return this._activities;
    }
    /**
     * Gets the ageGroup property value. Sets the age group of the user. Allowed values: null, Minor, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAgeGroup() {
        return this._ageGroup;
    }
    /**
     * Gets the agreementAcceptances property value. The user's terms of use acceptance statuses. Read-only. Nullable.
     * @return a agreementAcceptance
     */
    @javax.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAgreementAcceptances() {
        return this._agreementAcceptances;
    }
    /**
     * Gets the appRoleAssignments property value. Represents the app roles a user has been granted for an application. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this._appRoleAssignments;
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the user, including inherited (group-based) licenses. This property doesn't differentiate directly-assigned and inherited licenses. Use the licenseAssignmentStates property to identify the directly-assigned and inherited licenses.  Not nullable. Returned only on $select. Supports $filter (eq, not, /$count eq 0, /$count ne 0).
     * @return a assignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this._assignedLicenses;
    }
    /**
     * Gets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq and not).
     * @return a assignedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this._assignedPlans;
    }
    /**
     * Gets the authentication property value. The authentication methods that are supported for the user.
     * @return a authentication
     */
    @javax.annotation.Nullable
    public Authentication getAuthentication() {
        return this._authentication;
    }
    /**
     * Gets the authorizationInfo property value. The authorizationInfo property
     * @return a authorizationInfo
     */
    @javax.annotation.Nullable
    public AuthorizationInfo getAuthorizationInfo() {
        return this._authorizationInfo;
    }
    /**
     * Gets the birthday property value. The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBirthday() {
        return this._birthday;
    }
    /**
     * Gets the businessPhones property value. The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this property. Read-only for users synced from on-premises directory. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this._businessPhones;
    }
    /**
     * Gets the calendar property value. The user's primary calendar. Read-only.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public Calendar getCalendar() {
        return this._calendar;
    }
    /**
     * Gets the calendarGroups property value. The user's calendar groups. Read-only. Nullable.
     * @return a calendarGroup
     */
    @javax.annotation.Nullable
    public java.util.List<CalendarGroup> getCalendarGroups() {
        return this._calendarGroups;
    }
    /**
     * Gets the calendars property value. The user's calendars. Read-only. Nullable.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public java.util.List<Calendar> getCalendars() {
        return this._calendars;
    }
    /**
     * Gets the calendarView property value. The calendar view for the calendar. Read-only. Nullable.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getCalendarView() {
        return this._calendarView;
    }
    /**
     * Gets the chats property value. The chats property
     * @return a chat
     */
    @javax.annotation.Nullable
    public java.util.List<Chat> getChats() {
        return this._chats;
    }
    /**
     * Gets the city property value. The city in which the user is located. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the companyName property value. The company name which the user is associated. This property can be useful for describing the company that an external user comes from. The maximum length is 64 characters.Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return this._companyName;
    }
    /**
     * Gets the consentProvidedForMinor property value. Sets whether consent has been obtained for minors. Allowed values: null, Granted, Denied and NotRequired. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsentProvidedForMinor() {
        return this._consentProvidedForMinor;
    }
    /**
     * Gets the contactFolders property value. The user's contacts folders. Read-only. Nullable.
     * @return a contactFolder
     */
    @javax.annotation.Nullable
    public java.util.List<ContactFolder> getContactFolders() {
        return this._contactFolders;
    }
    /**
     * Gets the contacts property value. The user's contacts. Read-only. Nullable.
     * @return a contact
     */
    @javax.annotation.Nullable
    public java.util.List<Contact> getContacts() {
        return this._contacts;
    }
    /**
     * Gets the country property value. The country/region in which the user is located; for example, US or UK. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return this._country;
    }
    /**
     * Gets the createdDateTime property value. The date and time the user was created, in ISO 8601 format and in UTC time. The value cannot be modified and is automatically populated when the entity is created. Nullable. For on-premises users, the value represents when they were first created in Azure AD. Property is null for some users created before June 2018 and on-premises users that were synced to Azure AD before June 2018. Read-only.  Read-only. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the createdObjects property value. Directory objects that were created by the user. Read-only. Nullable.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this._createdObjects;
    }
    /**
     * Gets the creationType property value. Indicates whether the user account was created through one of the following methods:  As a regular school or work account (null). As an external account (Invitation). As a local account for an Azure Active Directory B2C tenant (LocalAccount). Through self-service sign-up by an internal user using email verification (EmailVerified). Through self-service sign-up by an external user signing up through a link that is part of a user flow (SelfServiceSignUp). Read-only.Returned only on $select. Supports $filter (eq, ne, not, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreationType() {
        return this._creationType;
    }
    /**
     * Gets the department property value. The name for the department in which the user works. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepartment() {
        return this._department;
    }
    /**
     * Gets the deviceEnrollmentLimit property value. The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceEnrollmentLimit() {
        return this._deviceEnrollmentLimit;
    }
    /**
     * Gets the deviceManagementTroubleshootingEvents property value. The list of troubleshooting events for this user.
     * @return a deviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getDeviceManagementTroubleshootingEvents() {
        return this._deviceManagementTroubleshootingEvents;
    }
    /**
     * Gets the directReports property value. The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDirectReports() {
        return this._directReports;
    }
    /**
     * Gets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial and last name. This property is required when a user is created and it cannot be cleared during updates. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values), $orderBy, and $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the drive property value. The user's OneDrive. Read-only.
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this._drive;
    }
    /**
     * Gets the drives property value. A collection of drives available for this user. Read-only.
     * @return a drive
     */
    @javax.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this._drives;
    }
    /**
     * Gets the employeeHireDate property value. The date and time when the user was hired or will start work in case of a future hire. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEmployeeHireDate() {
        return this._employeeHireDate;
    }
    /**
     * Gets the employeeId property value. The employee identifier assigned to the user by the organization. The maximum length is 16 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmployeeId() {
        return this._employeeId;
    }
    /**
     * Gets the employeeOrgData property value. Represents organization data (e.g. division and costCenter) associated with a user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @return a employeeOrgData
     */
    @javax.annotation.Nullable
    public EmployeeOrgData getEmployeeOrgData() {
        return this._employeeOrgData;
    }
    /**
     * Gets the employeeType property value. Captures enterprise worker type. For example, Employee, Contractor, Consultant, or Vendor. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmployeeType() {
        return this._employeeType;
    }
    /**
     * Gets the events property value. The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getEvents() {
        return this._events;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the user. Read-only. Supports $expand. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * Gets the externalUserState property value. For an external user invited to the tenant using the invitation API, this property represents the invited user's invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users. Returned only on $select. Supports $filter (eq, ne, not , in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUserState() {
        return this._externalUserState;
    }
    /**
     * Gets the externalUserStateChangeDateTime property value. Shows the timestamp for the latest change to the externalUserState property. Returned only on $select. Supports $filter (eq, ne, not , in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExternalUserStateChangeDateTime() {
        return this._externalUserStateChangeDateTime;
    }
    /**
     * Gets the faxNumber property value. The fax number of the user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFaxNumber() {
        return this._faxNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aboutMe", (n) -> { this.setAboutMe(n.getStringValue()); });
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(UserActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("ageGroup", (n) -> { this.setAgeGroup(n.getStringValue()); });
        deserializerMap.put("agreementAcceptances", (n) -> { this.setAgreementAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoleAssignments", (n) -> { this.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedLicenses", (n) -> { this.setAssignedLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedPlans", (n) -> { this.setAssignedPlans(n.getCollectionOfObjectValues(AssignedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("authentication", (n) -> { this.setAuthentication(n.getObjectValue(Authentication::createFromDiscriminatorValue)); });
        deserializerMap.put("authorizationInfo", (n) -> { this.setAuthorizationInfo(n.getObjectValue(AuthorizationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessPhones", (n) -> { this.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getObjectValue(Calendar::createFromDiscriminatorValue)); });
        deserializerMap.put("calendarGroups", (n) -> { this.setCalendarGroups(n.getCollectionOfObjectValues(CalendarGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("calendars", (n) -> { this.setCalendars(n.getCollectionOfObjectValues(Calendar::createFromDiscriminatorValue)); });
        deserializerMap.put("calendarView", (n) -> { this.setCalendarView(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("chats", (n) -> { this.setChats(n.getCollectionOfObjectValues(Chat::createFromDiscriminatorValue)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("consentProvidedForMinor", (n) -> { this.setConsentProvidedForMinor(n.getStringValue()); });
        deserializerMap.put("contactFolders", (n) -> { this.setContactFolders(n.getCollectionOfObjectValues(ContactFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("contacts", (n) -> { this.setContacts(n.getCollectionOfObjectValues(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdObjects", (n) -> { this.setCreatedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("creationType", (n) -> { this.setCreationType(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("deviceEnrollmentLimit", (n) -> { this.setDeviceEnrollmentLimit(n.getIntegerValue()); });
        deserializerMap.put("deviceManagementTroubleshootingEvents", (n) -> { this.setDeviceManagementTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("directReports", (n) -> { this.setDirectReports(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("employeeHireDate", (n) -> { this.setEmployeeHireDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("employeeId", (n) -> { this.setEmployeeId(n.getStringValue()); });
        deserializerMap.put("employeeOrgData", (n) -> { this.setEmployeeOrgData(n.getObjectValue(EmployeeOrgData::createFromDiscriminatorValue)); });
        deserializerMap.put("employeeType", (n) -> { this.setEmployeeType(n.getStringValue()); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUserState", (n) -> { this.setExternalUserState(n.getStringValue()); });
        deserializerMap.put("externalUserStateChangeDateTime", (n) -> { this.setExternalUserStateChangeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("faxNumber", (n) -> { this.setFaxNumber(n.getStringValue()); });
        deserializerMap.put("followedSites", (n) -> { this.setFollowedSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("hireDate", (n) -> { this.setHireDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("identities", (n) -> { this.setIdentities(n.getCollectionOfObjectValues(ObjectIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("imAddresses", (n) -> { this.setImAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("inferenceClassification", (n) -> { this.setInferenceClassification(n.getObjectValue(InferenceClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getObjectValue(OfficeGraphInsights::createFromDiscriminatorValue)); });
        deserializerMap.put("interests", (n) -> { this.setInterests(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isResourceAccount", (n) -> { this.setIsResourceAccount(n.getBooleanValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("joinedTeams", (n) -> { this.setJoinedTeams(n.getCollectionOfObjectValues(Team::createFromDiscriminatorValue)); });
        deserializerMap.put("lastPasswordChangeDateTime", (n) -> { this.setLastPasswordChangeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legalAgeGroupClassification", (n) -> { this.setLegalAgeGroupClassification(n.getStringValue()); });
        deserializerMap.put("licenseAssignmentStates", (n) -> { this.setLicenseAssignmentStates(n.getCollectionOfObjectValues(LicenseAssignmentState::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseDetails", (n) -> { this.setLicenseDetails(n.getCollectionOfObjectValues(LicenseDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mail", (n) -> { this.setMail(n.getStringValue()); });
        deserializerMap.put("mailboxSettings", (n) -> { this.setMailboxSettings(n.getObjectValue(MailboxSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("mailFolders", (n) -> { this.setMailFolders(n.getCollectionOfObjectValues(MailFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("managedAppRegistrations", (n) -> { this.setManagedAppRegistrations(n.getCollectionOfObjectValues(ManagedAppRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(Message::createFromDiscriminatorValue)); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("mySite", (n) -> { this.setMySite(n.getStringValue()); });
        deserializerMap.put("oauth2PermissionGrants", (n) -> { this.setOauth2PermissionGrants(n.getCollectionOfObjectValues(OAuth2PermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("onenote", (n) -> { this.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetings", (n) -> { this.setOnlineMeetings(n.getCollectionOfObjectValues(OnlineMeeting::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesDistinguishedName", (n) -> { this.setOnPremisesDistinguishedName(n.getStringValue()); });
        deserializerMap.put("onPremisesDomainName", (n) -> { this.setOnPremisesDomainName(n.getStringValue()); });
        deserializerMap.put("onPremisesExtensionAttributes", (n) -> { this.setOnPremisesExtensionAttributes(n.getObjectValue(OnPremisesExtensionAttributes::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesImmutableId", (n) -> { this.setOnPremisesImmutableId(n.getStringValue()); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesProvisioningErrors", (n) -> { this.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSamAccountName", (n) -> { this.setOnPremisesSamAccountName(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("onPremisesUserPrincipalName", (n) -> { this.setOnPremisesUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("otherMails", (n) -> { this.setOtherMails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("outlook", (n) -> { this.setOutlook(n.getObjectValue(OutlookUser::createFromDiscriminatorValue)); });
        deserializerMap.put("ownedDevices", (n) -> { this.setOwnedDevices(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("ownedObjects", (n) -> { this.setOwnedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordPolicies", (n) -> { this.setPasswordPolicies(n.getStringValue()); });
        deserializerMap.put("passwordProfile", (n) -> { this.setPasswordProfile(n.getObjectValue(PasswordProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("pastProjects", (n) -> { this.setPastProjects(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("people", (n) -> { this.setPeople(n.getCollectionOfObjectValues(Person::createFromDiscriminatorValue)); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("photos", (n) -> { this.setPhotos(n.getCollectionOfObjectValues(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("planner", (n) -> { this.setPlanner(n.getObjectValue(PlannerUser::createFromDiscriminatorValue)); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("preferredDataLocation", (n) -> { this.setPreferredDataLocation(n.getStringValue()); });
        deserializerMap.put("preferredLanguage", (n) -> { this.setPreferredLanguage(n.getStringValue()); });
        deserializerMap.put("preferredName", (n) -> { this.setPreferredName(n.getStringValue()); });
        deserializerMap.put("presence", (n) -> { this.setPresence(n.getObjectValue(Presence::createFromDiscriminatorValue)); });
        deserializerMap.put("provisionedPlans", (n) -> { this.setProvisionedPlans(n.getCollectionOfObjectValues(ProvisionedPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("proxyAddresses", (n) -> { this.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("registeredDevices", (n) -> { this.setRegisteredDevices(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("responsibilities", (n) -> { this.setResponsibilities(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("scopedRoleMemberOf", (n) -> { this.setScopedRoleMemberOf(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("securityIdentifier", (n) -> { this.setSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(UserSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("showInAddressList", (n) -> { this.setShowInAddressList(n.getBooleanValue()); });
        deserializerMap.put("signInSessionsValidFromDateTime", (n) -> { this.setSignInSessionsValidFromDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("skills", (n) -> { this.setSkills(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("streetAddress", (n) -> { this.setStreetAddress(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("teamwork", (n) -> { this.setTeamwork(n.getObjectValue(UserTeamwork::createFromDiscriminatorValue)); });
        deserializerMap.put("todo", (n) -> { this.setTodo(n.getObjectValue(Todo::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("usageLocation", (n) -> { this.setUsageLocation(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the followedSites property value. The followedSites property
     * @return a site
     */
    @javax.annotation.Nullable
    public java.util.List<Site> getFollowedSites() {
        return this._followedSites;
    }
    /**
     * Gets the givenName property value. The given name (first name) of the user. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
    }
    /**
     * Gets the hireDate property value. The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.  Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property to set and update hire date values using Microsoft Graph APIs.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getHireDate() {
        return this._hireDate;
    }
    /**
     * Gets the identities property value. Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Returned only on $select. Supports $filter (eq) including on null values, only where the signInType is not userPrincipalName.
     * @return a objectIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectIdentity> getIdentities() {
        return this._identities;
    }
    /**
     * Gets the imAddresses property value. The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getImAddresses() {
        return this._imAddresses;
    }
    /**
     * Gets the inferenceClassification property value. Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
     * @return a inferenceClassification
     */
    @javax.annotation.Nullable
    public InferenceClassification getInferenceClassification() {
        return this._inferenceClassification;
    }
    /**
     * Gets the insights property value. The insights property
     * @return a officeGraphInsights
     */
    @javax.annotation.Nullable
    public OfficeGraphInsights getInsights() {
        return this._insights;
    }
    /**
     * Gets the interests property value. A list for the user to describe their interests. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInterests() {
        return this._interests;
    }
    /**
     * Gets the isResourceAccount property value. Do not use  reserved for future use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsResourceAccount() {
        return this._isResourceAccount;
    }
    /**
     * Gets the jobTitle property value. The user's job title. Maximum length is 128 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this._jobTitle;
    }
    /**
     * Gets the joinedTeams property value. The joinedTeams property
     * @return a team
     */
    @javax.annotation.Nullable
    public java.util.List<Team> getJoinedTeams() {
        return this._joinedTeams;
    }
    /**
     * Gets the lastPasswordChangeDateTime property value. The time when this Azure AD user last changed their password or when their password was created, whichever date the latest action was performed. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastPasswordChangeDateTime() {
        return this._lastPasswordChangeDateTime;
    }
    /**
     * Gets the legalAgeGroupClassification property value. Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated based on ageGroup and consentProvidedForMinor properties. Allowed values: null, MinorWithOutParentalConsent, MinorWithParentalConsent, MinorNoParentalConsentRequired, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLegalAgeGroupClassification() {
        return this._legalAgeGroupClassification;
    }
    /**
     * Gets the licenseAssignmentStates property value. State of license assignments for this user. Also indicates licenses that are directly-assigned and those that the user has inherited through group memberships. Read-only. Returned only on $select.
     * @return a licenseAssignmentState
     */
    @javax.annotation.Nullable
    public java.util.List<LicenseAssignmentState> getLicenseAssignmentStates() {
        return this._licenseAssignmentStates;
    }
    /**
     * Gets the licenseDetails property value. A collection of this user's license details. Read-only.
     * @return a licenseDetails
     */
    @javax.annotation.Nullable
    public java.util.List<LicenseDetails> getLicenseDetails() {
        return this._licenseDetails;
    }
    /**
     * Gets the mail property value. The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Changes to this property will also update the user's proxyAddresses collection to include the value as an SMTP address. This property cannot contain accent characters.  NOTE: We do not recommend updating this property for Azure AD B2C user profiles. Use the otherMails property instead. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this._mail;
    }
    /**
     * Gets the mailboxSettings property value. Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale and time zone. Returned only on $select.
     * @return a mailboxSettings
     */
    @javax.annotation.Nullable
    public MailboxSettings getMailboxSettings() {
        return this._mailboxSettings;
    }
    /**
     * Gets the mailFolders property value. The user's mail folders. Read-only. Nullable.
     * @return a mailFolder
     */
    @javax.annotation.Nullable
    public java.util.List<MailFolder> getMailFolders() {
        return this._mailFolders;
    }
    /**
     * Gets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the managedAppRegistrations property value. Zero or more managed app registrations that belong to the user.
     * @return a managedAppRegistration
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppRegistration> getManagedAppRegistrations() {
        return this._managedAppRegistrations;
    }
    /**
     * Gets the managedDevices property value. The managed devices associated with the user.
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this._managedDevices;
    }
    /**
     * Gets the manager property value. The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.). Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getManager() {
        return this._manager;
    }
    /**
     * Gets the memberOf property value. The groups and directory roles that the user is a member of. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the messages property value. The messages in a mailbox or folder. Read-only. Nullable.
     * @return a message
     */
    @javax.annotation.Nullable
    public java.util.List<Message> getMessages() {
        return this._messages;
    }
    /**
     * Gets the mobilePhone property value. The primary cellular telephone number for the user. Read-only for users synced from on-premises directory. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this._mobilePhone;
    }
    /**
     * Gets the mySite property value. The URL for the user's personal site. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMySite() {
        return this._mySite;
    }
    /**
     * Gets the oauth2PermissionGrants property value. The oauth2PermissionGrants property
     * @return a oAuth2PermissionGrant
     */
    @javax.annotation.Nullable
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this._oauth2PermissionGrants;
    }
    /**
     * Gets the officeLocation property value. The office location in the user's place of business. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOfficeLocation() {
        return this._officeLocation;
    }
    /**
     * Gets the onenote property value. The onenote property
     * @return a onenote
     */
    @javax.annotation.Nullable
    public Onenote getOnenote() {
        return this._onenote;
    }
    /**
     * Gets the onlineMeetings property value. The onlineMeetings property
     * @return a onlineMeeting
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeeting> getOnlineMeetings() {
        return this._onlineMeetings;
    }
    /**
     * Gets the onPremisesDistinguishedName property value. Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesDistinguishedName() {
        return this._onPremisesDistinguishedName;
    }
    /**
     * Gets the onPremisesDomainName property value. Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesDomainName() {
        return this._onPremisesDomainName;
    }
    /**
     * Gets the onPremisesExtensionAttributes property value. Contains extensionAttributes1-15 for the user. These extension attributes are also known as Exchange custom attributes 1-15. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties can be set during creation or update of a user object.  For a cloud-only user previously synced from on-premises Active Directory, these properties are read-only in Microsoft Graph but can be fully managed through the Exchange Admin Center or the Exchange Online V2 module in PowerShell. Returned only on $select. Supports $filter (eq, ne, not, in).
     * @return a onPremisesExtensionAttributes
     */
    @javax.annotation.Nullable
    public OnPremisesExtensionAttributes getOnPremisesExtensionAttributes() {
        return this._onPremisesExtensionAttributes;
    }
    /**
     * Gets the onPremisesImmutableId property value. This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user's userPrincipalName (UPN) property. NOTE: The $ and _ characters cannot be used when specifying this property. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in)..
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesImmutableId() {
        return this._onPremisesImmutableId;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. Indicates the last time at which the object was synced with the on-premises directory; for example: 2013-02-16T03:04:54Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned only on $select. Supports $filter (eq, not, ge, le).
     * @return a onPremisesProvisioningError
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this._onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSamAccountName property value. Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSamAccountName() {
        return this._onPremisesSamAccountName;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only. Returned only on $select.  Supports $filter (eq including on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this._onPremisesSecurityIdentifier;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this user object is currently being synced from an on-premises Active Directory (AD); otherwise the user isn't being synced and can be managed in Azure Active Directory (Azure AD). Read-only. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the onPremisesUserPrincipalName property value. Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesUserPrincipalName() {
        return this._onPremisesUserPrincipalName;
    }
    /**
     * Gets the otherMails property value. A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. NOTE: This property cannot contain accent characters. Returned only on $select. Supports $filter (eq, not, ge, le, in, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOtherMails() {
        return this._otherMails;
    }
    /**
     * Gets the outlook property value. The outlook property
     * @return a outlookUser
     */
    @javax.annotation.Nullable
    public OutlookUser getOutlook() {
        return this._outlook;
    }
    /**
     * Gets the ownedDevices property value. Devices that are owned by the user. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedDevices() {
        return this._ownedDevices;
    }
    /**
     * Gets the ownedObjects property value. Directory objects that are owned by the user. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this._ownedObjects;
    }
    /**
     * Gets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two may be specified together; for example: DisablePasswordExpiration, DisableStrongPassword. Returned only on $select. For more information on the default password policies, see Azure AD pasword policies. Supports $filter (ne, not, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordPolicies() {
        return this._passwordPolicies;
    }
    /**
     * Gets the passwordProfile property value. Specifies the password profile for the user. The profile contains the users password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required. NOTE: For Azure B2C tenants, the forceChangePasswordNextSignIn property should be set to false and instead use custom policies and user flows to force password reset at first logon. See Force password reset at first logon.Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a passwordProfile
     */
    @javax.annotation.Nullable
    public PasswordProfile getPasswordProfile() {
        return this._passwordProfile;
    }
    /**
     * Gets the pastProjects property value. A list for the user to enumerate their past projects. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPastProjects() {
        return this._pastProjects;
    }
    /**
     * Gets the people property value. People that are relevant to the user. Read-only. Nullable.
     * @return a person
     */
    @javax.annotation.Nullable
    public java.util.List<Person> getPeople() {
        return this._people;
    }
    /**
     * Gets the photo property value. The user's profile photo. Read-only.
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this._photo;
    }
    /**
     * Gets the photos property value. The photos property
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public java.util.List<ProfilePhoto> getPhotos() {
        return this._photos;
    }
    /**
     * Gets the planner property value. Entry-point to the Planner resource that might exist for a user. Read-only.
     * @return a plannerUser
     */
    @javax.annotation.Nullable
    public PlannerUser getPlanner() {
        return this._planner;
    }
    /**
     * Gets the postalCode property value. The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code. Maximum length is 40 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this._postalCode;
    }
    /**
     * Gets the preferredDataLocation property value. The preferred data location for the user. For more information, see OneDrive Online Multi-Geo.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredDataLocation() {
        return this._preferredDataLocation;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the user. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this._preferredLanguage;
    }
    /**
     * Gets the preferredName property value. The preferred name for the user. Not Supported. This attribute returns an empty string.Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredName() {
        return this._preferredName;
    }
    /**
     * Gets the presence property value. The presence property
     * @return a presence
     */
    @javax.annotation.Nullable
    public Presence getPresence() {
        return this._presence;
    }
    /**
     * Gets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le).
     * @return a provisionedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this._provisionedPlans;
    }
    /**
     * Gets the proxyAddresses property value. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. Changes to the mail property will also update this collection to include the value as an SMTP address. For more information, see mail and proxyAddresses properties. The proxy address prefixed with SMTP (capitalized) is the primary proxy address while those prefixed with smtp are the secondary proxy addresses. For Azure AD B2C accounts, this property has a limit of ten unique addresses. Read-only in Microsoft Graph; you can update this property only through the Microsoft 365 admin center. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this._proxyAddresses;
    }
    /**
     * Gets the registeredDevices property value. Devices that are registered for the user. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRegisteredDevices() {
        return this._registeredDevices;
    }
    /**
     * Gets the responsibilities property value. A list for the user to enumerate their responsibilities. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResponsibilities() {
        return this._responsibilities;
    }
    /**
     * Gets the schools property value. A list for the user to enumerate the schools they have attended. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSchools() {
        return this._schools;
    }
    /**
     * Gets the scopedRoleMemberOf property value. The scopedRoleMemberOf property
     * @return a scopedRoleMembership
     */
    @javax.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedRoleMemberOf() {
        return this._scopedRoleMemberOf;
    }
    /**
     * Gets the securityIdentifier property value. Security identifier (SID) of the user, used in Windows scenarios. Read-only. Returned by default. Supports $select and $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityIdentifier() {
        return this._securityIdentifier;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a userSettings
     */
    @javax.annotation.Nullable
    public UserSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the showInAddressList property value. Do not use in Microsoft Graph. Manage this property through the Microsoft 365 admin center instead. Represents whether the user should be included in the Outlook global address list. See Known issue.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInAddressList() {
        return this._showInAddressList;
    }
    /**
     * Gets the signInSessionsValidFromDateTime property value. Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use revokeSignInSessions to reset. Returned only on $select.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSignInSessionsValidFromDateTime() {
        return this._signInSessionsValidFromDateTime;
    }
    /**
     * Gets the skills property value. A list for the user to enumerate their skills. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSkills() {
        return this._skills;
    }
    /**
     * Gets the state property value. The state or province in the user's address. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the streetAddress property value. The street address of the user's place of business. Maximum length is 1024 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreetAddress() {
        return this._streetAddress;
    }
    /**
     * Gets the surname property value. The user's surname (family name or last name). Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this._surname;
    }
    /**
     * Gets the teamwork property value. The teamwork property
     * @return a userTeamwork
     */
    @javax.annotation.Nullable
    public UserTeamwork getTeamwork() {
        return this._teamwork;
    }
    /**
     * Gets the todo property value. Represents the To Do services available to a user.
     * @return a todo
     */
    @javax.annotation.Nullable
    public Todo getTodo() {
        return this._todo;
    }
    /**
     * Gets the transitiveMemberOf property value. The groups, including nested groups, and directory roles that a user is a member of. Nullable.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
    }
    /**
     * Gets the usageLocation property value. A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: US, JP, and GB. Not nullable. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsageLocation() {
        return this._usageLocation;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.NOTE: This property cannot contain accent characters. Only the following characters are allowed A - Z, a - z, 0 - 9, ' . - _ ! # ^ ~. For the complete list of allowed characters, see username policies. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith) and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values). NOTE: For more information about the permissions for member and guest users, see What are the default user permissions in Azure Active Directory?
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserType() {
        return this._userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aboutMe", this.getAboutMe());
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeStringValue("ageGroup", this.getAgeGroup());
        writer.writeCollectionOfObjectValues("agreementAcceptances", this.getAgreementAcceptances());
        writer.writeCollectionOfObjectValues("appRoleAssignments", this.getAppRoleAssignments());
        writer.writeCollectionOfObjectValues("assignedLicenses", this.getAssignedLicenses());
        writer.writeCollectionOfObjectValues("assignedPlans", this.getAssignedPlans());
        writer.writeObjectValue("authentication", this.getAuthentication());
        writer.writeObjectValue("authorizationInfo", this.getAuthorizationInfo());
        writer.writeOffsetDateTimeValue("birthday", this.getBirthday());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeObjectValue("calendar", this.getCalendar());
        writer.writeCollectionOfObjectValues("calendarGroups", this.getCalendarGroups());
        writer.writeCollectionOfObjectValues("calendars", this.getCalendars());
        writer.writeCollectionOfObjectValues("calendarView", this.getCalendarView());
        writer.writeCollectionOfObjectValues("chats", this.getChats());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("consentProvidedForMinor", this.getConsentProvidedForMinor());
        writer.writeCollectionOfObjectValues("contactFolders", this.getContactFolders());
        writer.writeCollectionOfObjectValues("contacts", this.getContacts());
        writer.writeStringValue("country", this.getCountry());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("createdObjects", this.getCreatedObjects());
        writer.writeStringValue("creationType", this.getCreationType());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeIntegerValue("deviceEnrollmentLimit", this.getDeviceEnrollmentLimit());
        writer.writeCollectionOfObjectValues("deviceManagementTroubleshootingEvents", this.getDeviceManagementTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("directReports", this.getDirectReports());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeOffsetDateTimeValue("employeeHireDate", this.getEmployeeHireDate());
        writer.writeStringValue("employeeId", this.getEmployeeId());
        writer.writeObjectValue("employeeOrgData", this.getEmployeeOrgData());
        writer.writeStringValue("employeeType", this.getEmployeeType());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeStringValue("externalUserState", this.getExternalUserState());
        writer.writeOffsetDateTimeValue("externalUserStateChangeDateTime", this.getExternalUserStateChangeDateTime());
        writer.writeStringValue("faxNumber", this.getFaxNumber());
        writer.writeCollectionOfObjectValues("followedSites", this.getFollowedSites());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeOffsetDateTimeValue("hireDate", this.getHireDate());
        writer.writeCollectionOfObjectValues("identities", this.getIdentities());
        writer.writeCollectionOfPrimitiveValues("imAddresses", this.getImAddresses());
        writer.writeObjectValue("inferenceClassification", this.getInferenceClassification());
        writer.writeObjectValue("insights", this.getInsights());
        writer.writeCollectionOfPrimitiveValues("interests", this.getInterests());
        writer.writeBooleanValue("isResourceAccount", this.getIsResourceAccount());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeCollectionOfObjectValues("joinedTeams", this.getJoinedTeams());
        writer.writeOffsetDateTimeValue("lastPasswordChangeDateTime", this.getLastPasswordChangeDateTime());
        writer.writeStringValue("legalAgeGroupClassification", this.getLegalAgeGroupClassification());
        writer.writeCollectionOfObjectValues("licenseAssignmentStates", this.getLicenseAssignmentStates());
        writer.writeCollectionOfObjectValues("licenseDetails", this.getLicenseDetails());
        writer.writeStringValue("mail", this.getMail());
        writer.writeObjectValue("mailboxSettings", this.getMailboxSettings());
        writer.writeCollectionOfObjectValues("mailFolders", this.getMailFolders());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeCollectionOfObjectValues("managedAppRegistrations", this.getManagedAppRegistrations());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeStringValue("mySite", this.getMySite());
        writer.writeCollectionOfObjectValues("oauth2PermissionGrants", this.getOauth2PermissionGrants());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeCollectionOfObjectValues("onlineMeetings", this.getOnlineMeetings());
        writer.writeStringValue("onPremisesDistinguishedName", this.getOnPremisesDistinguishedName());
        writer.writeStringValue("onPremisesDomainName", this.getOnPremisesDomainName());
        writer.writeObjectValue("onPremisesExtensionAttributes", this.getOnPremisesExtensionAttributes());
        writer.writeStringValue("onPremisesImmutableId", this.getOnPremisesImmutableId());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeCollectionOfObjectValues("onPremisesProvisioningErrors", this.getOnPremisesProvisioningErrors());
        writer.writeStringValue("onPremisesSamAccountName", this.getOnPremisesSamAccountName());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("onPremisesUserPrincipalName", this.getOnPremisesUserPrincipalName());
        writer.writeCollectionOfPrimitiveValues("otherMails", this.getOtherMails());
        writer.writeObjectValue("outlook", this.getOutlook());
        writer.writeCollectionOfObjectValues("ownedDevices", this.getOwnedDevices());
        writer.writeCollectionOfObjectValues("ownedObjects", this.getOwnedObjects());
        writer.writeStringValue("passwordPolicies", this.getPasswordPolicies());
        writer.writeObjectValue("passwordProfile", this.getPasswordProfile());
        writer.writeCollectionOfPrimitiveValues("pastProjects", this.getPastProjects());
        writer.writeCollectionOfObjectValues("people", this.getPeople());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeCollectionOfObjectValues("photos", this.getPhotos());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("preferredDataLocation", this.getPreferredDataLocation());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeStringValue("preferredName", this.getPreferredName());
        writer.writeObjectValue("presence", this.getPresence());
        writer.writeCollectionOfObjectValues("provisionedPlans", this.getProvisionedPlans());
        writer.writeCollectionOfPrimitiveValues("proxyAddresses", this.getProxyAddresses());
        writer.writeCollectionOfObjectValues("registeredDevices", this.getRegisteredDevices());
        writer.writeCollectionOfPrimitiveValues("responsibilities", this.getResponsibilities());
        writer.writeCollectionOfPrimitiveValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("scopedRoleMemberOf", this.getScopedRoleMemberOf());
        writer.writeStringValue("securityIdentifier", this.getSecurityIdentifier());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeBooleanValue("showInAddressList", this.getShowInAddressList());
        writer.writeOffsetDateTimeValue("signInSessionsValidFromDateTime", this.getSignInSessionsValidFromDateTime());
        writer.writeCollectionOfPrimitiveValues("skills", this.getSkills());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("streetAddress", this.getStreetAddress());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeObjectValue("teamwork", this.getTeamwork());
        writer.writeObjectValue("todo", this.getTodo());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeStringValue("usageLocation", this.getUsageLocation());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("userType", this.getUserType());
    }
    /**
     * Sets the aboutMe property value. A freeform text entry field for the user to describe themselves. Returned only on $select.
     * @param value Value to set for the aboutMe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAboutMe(@javax.annotation.Nullable final String value) {
        this._aboutMe = value;
    }
    /**
     * Sets the accountEnabled property value. true if the account is enabled; otherwise, false. This property is required when a user is created. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the activities property value. The user's activities across devices. Read-only. Nullable.
     * @param value Value to set for the activities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivities(@javax.annotation.Nullable final java.util.List<UserActivity> value) {
        this._activities = value;
    }
    /**
     * Sets the ageGroup property value. Sets the age group of the user. Allowed values: null, Minor, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @param value Value to set for the ageGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgeGroup(@javax.annotation.Nullable final String value) {
        this._ageGroup = value;
    }
    /**
     * Sets the agreementAcceptances property value. The user's terms of use acceptance statuses. Read-only. Nullable.
     * @param value Value to set for the agreementAcceptances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgreementAcceptances(@javax.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this._agreementAcceptances = value;
    }
    /**
     * Sets the appRoleAssignments property value. Represents the app roles a user has been granted for an application. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoleAssignments(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this._appRoleAssignments = value;
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the user, including inherited (group-based) licenses. This property doesn't differentiate directly-assigned and inherited licenses. Use the licenseAssignmentStates property to identify the directly-assigned and inherited licenses.  Not nullable. Returned only on $select. Supports $filter (eq, not, /$count eq 0, /$count ne 0).
     * @param value Value to set for the assignedLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this._assignedLicenses = value;
    }
    /**
     * Sets the assignedPlans property value. The plans that are assigned to the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq and not).
     * @param value Value to set for the assignedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedPlans(@javax.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this._assignedPlans = value;
    }
    /**
     * Sets the authentication property value. The authentication methods that are supported for the user.
     * @param value Value to set for the authentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthentication(@javax.annotation.Nullable final Authentication value) {
        this._authentication = value;
    }
    /**
     * Sets the authorizationInfo property value. The authorizationInfo property
     * @param value Value to set for the authorizationInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthorizationInfo(@javax.annotation.Nullable final AuthorizationInfo value) {
        this._authorizationInfo = value;
    }
    /**
     * Sets the birthday property value. The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.
     * @param value Value to set for the birthday property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthday(@javax.annotation.Nullable final OffsetDateTime value) {
        this._birthday = value;
    }
    /**
     * Sets the businessPhones property value. The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this property. Read-only for users synced from on-premises directory. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._businessPhones = value;
    }
    /**
     * Sets the calendar property value. The user's primary calendar. Read-only.
     * @param value Value to set for the calendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendar(@javax.annotation.Nullable final Calendar value) {
        this._calendar = value;
    }
    /**
     * Sets the calendarGroups property value. The user's calendar groups. Read-only. Nullable.
     * @param value Value to set for the calendarGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendarGroups(@javax.annotation.Nullable final java.util.List<CalendarGroup> value) {
        this._calendarGroups = value;
    }
    /**
     * Sets the calendars property value. The user's calendars. Read-only. Nullable.
     * @param value Value to set for the calendars property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendars(@javax.annotation.Nullable final java.util.List<Calendar> value) {
        this._calendars = value;
    }
    /**
     * Sets the calendarView property value. The calendar view for the calendar. Read-only. Nullable.
     * @param value Value to set for the calendarView property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendarView(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._calendarView = value;
    }
    /**
     * Sets the chats property value. The chats property
     * @param value Value to set for the chats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChats(@javax.annotation.Nullable final java.util.List<Chat> value) {
        this._chats = value;
    }
    /**
     * Sets the city property value. The city in which the user is located. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the companyName property value. The company name which the user is associated. This property can be useful for describing the company that an external user comes from. The maximum length is 64 characters.Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the companyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyName(@javax.annotation.Nullable final String value) {
        this._companyName = value;
    }
    /**
     * Sets the consentProvidedForMinor property value. Sets whether consent has been obtained for minors. Allowed values: null, Granted, Denied and NotRequired. Refer to the legal age group property definitions for further information. Returned only on $select. Supports $filter (eq, ne, not, and in).
     * @param value Value to set for the consentProvidedForMinor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConsentProvidedForMinor(@javax.annotation.Nullable final String value) {
        this._consentProvidedForMinor = value;
    }
    /**
     * Sets the contactFolders property value. The user's contacts folders. Read-only. Nullable.
     * @param value Value to set for the contactFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactFolders(@javax.annotation.Nullable final java.util.List<ContactFolder> value) {
        this._contactFolders = value;
    }
    /**
     * Sets the contacts property value. The user's contacts. Read-only. Nullable.
     * @param value Value to set for the contacts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContacts(@javax.annotation.Nullable final java.util.List<Contact> value) {
        this._contacts = value;
    }
    /**
     * Sets the country property value. The country/region in which the user is located; for example, US or UK. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the country property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountry(@javax.annotation.Nullable final String value) {
        this._country = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the user was created, in ISO 8601 format and in UTC time. The value cannot be modified and is automatically populated when the entity is created. Nullable. For on-premises users, the value represents when they were first created in Azure AD. Property is null for some users created before June 2018 and on-premises users that were synced to Azure AD before June 2018. Read-only.  Read-only. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the createdObjects property value. Directory objects that were created by the user. Read-only. Nullable.
     * @param value Value to set for the createdObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._createdObjects = value;
    }
    /**
     * Sets the creationType property value. Indicates whether the user account was created through one of the following methods:  As a regular school or work account (null). As an external account (Invitation). As a local account for an Azure Active Directory B2C tenant (LocalAccount). Through self-service sign-up by an internal user using email verification (EmailVerified). Through self-service sign-up by an external user signing up through a link that is part of a user flow (SelfServiceSignUp). Read-only.Returned only on $select. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the creationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationType(@javax.annotation.Nullable final String value) {
        this._creationType = value;
    }
    /**
     * Sets the department property value. The name for the department in which the user works. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, and eq on null values).
     * @param value Value to set for the department property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDepartment(@javax.annotation.Nullable final String value) {
        this._department = value;
    }
    /**
     * Sets the deviceEnrollmentLimit property value. The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
     * @param value Value to set for the deviceEnrollmentLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentLimit(@javax.annotation.Nullable final Integer value) {
        this._deviceEnrollmentLimit = value;
    }
    /**
     * Sets the deviceManagementTroubleshootingEvents property value. The list of troubleshooting events for this user.
     * @param value Value to set for the deviceManagementTroubleshootingEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementTroubleshootingEvents(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this._deviceManagementTroubleshootingEvents = value;
    }
    /**
     * Sets the directReports property value. The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable. Supports $expand.
     * @param value Value to set for the directReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectReports(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._directReports = value;
    }
    /**
     * Sets the displayName property value. The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial and last name. This property is required when a user is created and it cannot be cleared during updates. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values), $orderBy, and $search.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the drive property value. The user's OneDrive. Read-only.
     * @param value Value to set for the drive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this._drive = value;
    }
    /**
     * Sets the drives property value. A collection of drives available for this user. Read-only.
     * @param value Value to set for the drives property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrives(@javax.annotation.Nullable final java.util.List<Drive> value) {
        this._drives = value;
    }
    /**
     * Sets the employeeHireDate property value. The date and time when the user was hired or will start work in case of a future hire. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @param value Value to set for the employeeHireDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployeeHireDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._employeeHireDate = value;
    }
    /**
     * Sets the employeeId property value. The employee identifier assigned to the user by the organization. The maximum length is 16 characters. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the employeeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployeeId(@javax.annotation.Nullable final String value) {
        this._employeeId = value;
    }
    /**
     * Sets the employeeOrgData property value. Represents organization data (e.g. division and costCenter) associated with a user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in).
     * @param value Value to set for the employeeOrgData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployeeOrgData(@javax.annotation.Nullable final EmployeeOrgData value) {
        this._employeeOrgData = value;
    }
    /**
     * Sets the employeeType property value. Captures enterprise worker type. For example, Employee, Contractor, Consultant, or Vendor. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith).
     * @param value Value to set for the employeeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmployeeType(@javax.annotation.Nullable final String value) {
        this._employeeType = value;
    }
    /**
     * Sets the events property value. The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
     * @param value Value to set for the events property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvents(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._events = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the user. Read-only. Supports $expand. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the externalUserState property value. For an external user invited to the tenant using the invitation API, this property represents the invited user's invitation status. For invited users, the state can be PendingAcceptance or Accepted, or null for all other users. Returned only on $select. Supports $filter (eq, ne, not , in).
     * @param value Value to set for the externalUserState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUserState(@javax.annotation.Nullable final String value) {
        this._externalUserState = value;
    }
    /**
     * Sets the externalUserStateChangeDateTime property value. Shows the timestamp for the latest change to the externalUserState property. Returned only on $select. Supports $filter (eq, ne, not , in).
     * @param value Value to set for the externalUserStateChangeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUserStateChangeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._externalUserStateChangeDateTime = value;
    }
    /**
     * Sets the faxNumber property value. The fax number of the user. Returned only on $select. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the faxNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFaxNumber(@javax.annotation.Nullable final String value) {
        this._faxNumber = value;
    }
    /**
     * Sets the followedSites property value. The followedSites property
     * @param value Value to set for the followedSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFollowedSites(@javax.annotation.Nullable final java.util.List<Site> value) {
        this._followedSites = value;
    }
    /**
     * Sets the givenName property value. The given name (first name) of the user. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
    }
    /**
     * Sets the hireDate property value. The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.  Note: This property is specific to SharePoint Online. We recommend using the native employeeHireDate property to set and update hire date values using Microsoft Graph APIs.
     * @param value Value to set for the hireDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHireDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._hireDate = value;
    }
    /**
     * Sets the identities property value. Represents the identities that can be used to sign in to this user account. An identity can be provided by Microsoft (also known as a local account), by organizations, or by social identity providers such as Facebook, Google, and Microsoft, and tied to a user account. May contain multiple items with the same signInType value. Returned only on $select. Supports $filter (eq) including on null values, only where the signInType is not userPrincipalName.
     * @param value Value to set for the identities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentities(@javax.annotation.Nullable final java.util.List<ObjectIdentity> value) {
        this._identities = value;
    }
    /**
     * Sets the imAddresses property value. The instant message voice over IP (VOIP) session initiation protocol (SIP) addresses for the user. Read-only. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the imAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._imAddresses = value;
    }
    /**
     * Sets the inferenceClassification property value. Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
     * @param value Value to set for the inferenceClassification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInferenceClassification(@javax.annotation.Nullable final InferenceClassification value) {
        this._inferenceClassification = value;
    }
    /**
     * Sets the insights property value. The insights property
     * @param value Value to set for the insights property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsights(@javax.annotation.Nullable final OfficeGraphInsights value) {
        this._insights = value;
    }
    /**
     * Sets the interests property value. A list for the user to describe their interests. Returned only on $select.
     * @param value Value to set for the interests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterests(@javax.annotation.Nullable final java.util.List<String> value) {
        this._interests = value;
    }
    /**
     * Sets the isResourceAccount property value. Do not use  reserved for future use.
     * @param value Value to set for the isResourceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsResourceAccount(@javax.annotation.Nullable final Boolean value) {
        this._isResourceAccount = value;
    }
    /**
     * Sets the jobTitle property value. The user's job title. Maximum length is 128 characters. Returned by default. Supports $filter (eq, ne, not , ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this._jobTitle = value;
    }
    /**
     * Sets the joinedTeams property value. The joinedTeams property
     * @param value Value to set for the joinedTeams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinedTeams(@javax.annotation.Nullable final java.util.List<Team> value) {
        this._joinedTeams = value;
    }
    /**
     * Sets the lastPasswordChangeDateTime property value. The time when this Azure AD user last changed their password or when their password was created, whichever date the latest action was performed. The date and time information uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned only on $select.
     * @param value Value to set for the lastPasswordChangeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastPasswordChangeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastPasswordChangeDateTime = value;
    }
    /**
     * Sets the legalAgeGroupClassification property value. Used by enterprise applications to determine the legal age group of the user. This property is read-only and calculated based on ageGroup and consentProvidedForMinor properties. Allowed values: null, MinorWithOutParentalConsent, MinorWithParentalConsent, MinorNoParentalConsentRequired, NotAdult and Adult. Refer to the legal age group property definitions for further information. Returned only on $select.
     * @param value Value to set for the legalAgeGroupClassification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLegalAgeGroupClassification(@javax.annotation.Nullable final String value) {
        this._legalAgeGroupClassification = value;
    }
    /**
     * Sets the licenseAssignmentStates property value. State of license assignments for this user. Also indicates licenses that are directly-assigned and those that the user has inherited through group memberships. Read-only. Returned only on $select.
     * @param value Value to set for the licenseAssignmentStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseAssignmentStates(@javax.annotation.Nullable final java.util.List<LicenseAssignmentState> value) {
        this._licenseAssignmentStates = value;
    }
    /**
     * Sets the licenseDetails property value. A collection of this user's license details. Read-only.
     * @param value Value to set for the licenseDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseDetails(@javax.annotation.Nullable final java.util.List<LicenseDetails> value) {
        this._licenseDetails = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Changes to this property will also update the user's proxyAddresses collection to include the value as an SMTP address. This property cannot contain accent characters.  NOTE: We do not recommend updating this property for Azure AD B2C user profiles. Use the otherMails property instead. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith, and eq on null values).
     * @param value Value to set for the mail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMail(@javax.annotation.Nullable final String value) {
        this._mail = value;
    }
    /**
     * Sets the mailboxSettings property value. Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale and time zone. Returned only on $select.
     * @param value Value to set for the mailboxSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailboxSettings(@javax.annotation.Nullable final MailboxSettings value) {
        this._mailboxSettings = value;
    }
    /**
     * Sets the mailFolders property value. The user's mail folders. Read-only. Nullable.
     * @param value Value to set for the mailFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailFolders(@javax.annotation.Nullable final java.util.List<MailFolder> value) {
        this._mailFolders = value;
    }
    /**
     * Sets the mailNickname property value. The mail alias for the user. This property must be specified when a user is created. Maximum length is 64 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the managedAppRegistrations property value. Zero or more managed app registrations that belong to the user.
     * @param value Value to set for the managedAppRegistrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppRegistrations(@javax.annotation.Nullable final java.util.List<ManagedAppRegistration> value) {
        this._managedAppRegistrations = value;
    }
    /**
     * Sets the managedDevices property value. The managed devices associated with the user.
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this._managedDevices = value;
    }
    /**
     * Sets the manager property value. The user or contact that is this user's manager. Read-only. (HTTP Methods: GET, PUT, DELETE.). Supports $expand.
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final DirectoryObject value) {
        this._manager = value;
    }
    /**
     * Sets the memberOf property value. The groups and directory roles that the user is a member of. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the messages property value. The messages in a mailbox or folder. Read-only. Nullable.
     * @param value Value to set for the messages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessages(@javax.annotation.Nullable final java.util.List<Message> value) {
        this._messages = value;
    }
    /**
     * Sets the mobilePhone property value. The primary cellular telephone number for the user. Read-only for users synced from on-premises directory. Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this._mobilePhone = value;
    }
    /**
     * Sets the mySite property value. The URL for the user's personal site. Returned only on $select.
     * @param value Value to set for the mySite property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMySite(@javax.annotation.Nullable final String value) {
        this._mySite = value;
    }
    /**
     * Sets the oauth2PermissionGrants property value. The oauth2PermissionGrants property
     * @param value Value to set for the oauth2PermissionGrants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOauth2PermissionGrants(@javax.annotation.Nullable final java.util.List<OAuth2PermissionGrant> value) {
        this._oauth2PermissionGrants = value;
    }
    /**
     * Sets the officeLocation property value. The office location in the user's place of business. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the officeLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeLocation(@javax.annotation.Nullable final String value) {
        this._officeLocation = value;
    }
    /**
     * Sets the onenote property value. The onenote property
     * @param value Value to set for the onenote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnenote(@javax.annotation.Nullable final Onenote value) {
        this._onenote = value;
    }
    /**
     * Sets the onlineMeetings property value. The onlineMeetings property
     * @param value Value to set for the onlineMeetings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetings(@javax.annotation.Nullable final java.util.List<OnlineMeeting> value) {
        this._onlineMeetings = value;
    }
    /**
     * Sets the onPremisesDistinguishedName property value. Contains the on-premises Active Directory distinguished name or DN. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select.
     * @param value Value to set for the onPremisesDistinguishedName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesDistinguishedName(@javax.annotation.Nullable final String value) {
        this._onPremisesDistinguishedName = value;
    }
    /**
     * Sets the onPremisesDomainName property value. Contains the on-premises domainFQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select.
     * @param value Value to set for the onPremisesDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesDomainName(@javax.annotation.Nullable final String value) {
        this._onPremisesDomainName = value;
    }
    /**
     * Sets the onPremisesExtensionAttributes property value. Contains extensionAttributes1-15 for the user. These extension attributes are also known as Exchange custom attributes 1-15. For an onPremisesSyncEnabled user, the source of authority for this set of properties is the on-premises and is read-only. For a cloud-only user (where onPremisesSyncEnabled is false), these properties can be set during creation or update of a user object.  For a cloud-only user previously synced from on-premises Active Directory, these properties are read-only in Microsoft Graph but can be fully managed through the Exchange Admin Center or the Exchange Online V2 module in PowerShell. Returned only on $select. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the onPremisesExtensionAttributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesExtensionAttributes(@javax.annotation.Nullable final OnPremisesExtensionAttributes value) {
        this._onPremisesExtensionAttributes = value;
    }
    /**
     * Sets the onPremisesImmutableId property value. This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user's userPrincipalName (UPN) property. NOTE: The $ and _ characters cannot be used when specifying this property. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in)..
     * @param value Value to set for the onPremisesImmutableId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesImmutableId(@javax.annotation.Nullable final String value) {
        this._onPremisesImmutableId = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. Indicates the last time at which the object was synced with the on-premises directory; for example: 2013-02-16T03:04:54Z. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned only on $select. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the onPremisesProvisioningErrors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesProvisioningErrors(@javax.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this._onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSamAccountName property value. Contains the on-premises samAccountName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @param value Value to set for the onPremisesSamAccountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSamAccountName(@javax.annotation.Nullable final String value) {
        this._onPremisesSamAccountName = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only. Returned only on $select.  Supports $filter (eq including on null values).
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this user object is currently being synced from an on-premises Active Directory (AD); otherwise the user isn't being synced and can be managed in Azure Active Directory (Azure AD). Read-only. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the onPremisesUserPrincipalName property value. Contains the on-premises userPrincipalName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect. Read-only. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @param value Value to set for the onPremisesUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._onPremisesUserPrincipalName = value;
    }
    /**
     * Sets the otherMails property value. A list of additional email addresses for the user; for example: ['bob@contoso.com', 'Robert@fabrikam.com']. NOTE: This property cannot contain accent characters. Returned only on $select. Supports $filter (eq, not, ge, le, in, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the otherMails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtherMails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._otherMails = value;
    }
    /**
     * Sets the outlook property value. The outlook property
     * @param value Value to set for the outlook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutlook(@javax.annotation.Nullable final OutlookUser value) {
        this._outlook = value;
    }
    /**
     * Sets the ownedDevices property value. Devices that are owned by the user. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the ownedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnedDevices(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._ownedDevices = value;
    }
    /**
     * Sets the ownedObjects property value. Directory objects that are owned by the user. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the ownedObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnedObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._ownedObjects = value;
    }
    /**
     * Sets the passwordPolicies property value. Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two may be specified together; for example: DisablePasswordExpiration, DisableStrongPassword. Returned only on $select. For more information on the default password policies, see Azure AD pasword policies. Supports $filter (ne, not, and eq on null values).
     * @param value Value to set for the passwordPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPolicies(@javax.annotation.Nullable final String value) {
        this._passwordPolicies = value;
    }
    /**
     * Sets the passwordProfile property value. Specifies the password profile for the user. The profile contains the users password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required. NOTE: For Azure B2C tenants, the forceChangePasswordNextSignIn property should be set to false and instead use custom policies and user flows to force password reset at first logon. See Force password reset at first logon.Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the passwordProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordProfile(@javax.annotation.Nullable final PasswordProfile value) {
        this._passwordProfile = value;
    }
    /**
     * Sets the pastProjects property value. A list for the user to enumerate their past projects. Returned only on $select.
     * @param value Value to set for the pastProjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPastProjects(@javax.annotation.Nullable final java.util.List<String> value) {
        this._pastProjects = value;
    }
    /**
     * Sets the people property value. People that are relevant to the user. Read-only. Nullable.
     * @param value Value to set for the people property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeople(@javax.annotation.Nullable final java.util.List<Person> value) {
        this._people = value;
    }
    /**
     * Sets the photo property value. The user's profile photo. Read-only.
     * @param value Value to set for the photo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoto(@javax.annotation.Nullable final ProfilePhoto value) {
        this._photo = value;
    }
    /**
     * Sets the photos property value. The photos property
     * @param value Value to set for the photos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhotos(@javax.annotation.Nullable final java.util.List<ProfilePhoto> value) {
        this._photos = value;
    }
    /**
     * Sets the planner property value. Entry-point to the Planner resource that might exist for a user. Read-only.
     * @param value Value to set for the planner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanner(@javax.annotation.Nullable final PlannerUser value) {
        this._planner = value;
    }
    /**
     * Sets the postalCode property value. The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code. Maximum length is 40 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this._postalCode = value;
    }
    /**
     * Sets the preferredDataLocation property value. The preferred data location for the user. For more information, see OneDrive Online Multi-Geo.
     * @param value Value to set for the preferredDataLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredDataLocation(@javax.annotation.Nullable final String value) {
        this._preferredDataLocation = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the user. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values)
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this._preferredLanguage = value;
    }
    /**
     * Sets the preferredName property value. The preferred name for the user. Not Supported. This attribute returns an empty string.Returned only on $select.
     * @param value Value to set for the preferredName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredName(@javax.annotation.Nullable final String value) {
        this._preferredName = value;
    }
    /**
     * Sets the presence property value. The presence property
     * @param value Value to set for the presence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresence(@javax.annotation.Nullable final Presence value) {
        this._presence = value;
    }
    /**
     * Sets the provisionedPlans property value. The plans that are provisioned for the user. Read-only. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the provisionedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionedPlans(@javax.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this._provisionedPlans = value;
    }
    /**
     * Sets the proxyAddresses property value. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. Changes to the mail property will also update this collection to include the value as an SMTP address. For more information, see mail and proxyAddresses properties. The proxy address prefixed with SMTP (capitalized) is the primary proxy address while those prefixed with smtp are the secondary proxy addresses. For Azure AD B2C accounts, this property has a limit of ten unique addresses. Read-only in Microsoft Graph; you can update this property only through the Microsoft 365 admin center. Not nullable. Returned only on $select. Supports $filter (eq, not, ge, le, startsWith, endsWith, /$count eq 0, /$count ne 0).
     * @param value Value to set for the proxyAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._proxyAddresses = value;
    }
    /**
     * Sets the registeredDevices property value. Devices that are registered for the user. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the registeredDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredDevices(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._registeredDevices = value;
    }
    /**
     * Sets the responsibilities property value. A list for the user to enumerate their responsibilities. Returned only on $select.
     * @param value Value to set for the responsibilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsibilities(@javax.annotation.Nullable final java.util.List<String> value) {
        this._responsibilities = value;
    }
    /**
     * Sets the schools property value. A list for the user to enumerate the schools they have attended. Returned only on $select.
     * @param value Value to set for the schools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchools(@javax.annotation.Nullable final java.util.List<String> value) {
        this._schools = value;
    }
    /**
     * Sets the scopedRoleMemberOf property value. The scopedRoleMemberOf property
     * @param value Value to set for the scopedRoleMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopedRoleMemberOf(@javax.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this._scopedRoleMemberOf = value;
    }
    /**
     * Sets the securityIdentifier property value. Security identifier (SID) of the user, used in Windows scenarios. Read-only. Returned by default. Supports $select and $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the securityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._securityIdentifier = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final UserSettings value) {
        this._settings = value;
    }
    /**
     * Sets the showInAddressList property value. Do not use in Microsoft Graph. Manage this property through the Microsoft 365 admin center instead. Represents whether the user should be included in the Outlook global address list. See Known issue.
     * @param value Value to set for the showInAddressList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowInAddressList(@javax.annotation.Nullable final Boolean value) {
        this._showInAddressList = value;
    }
    /**
     * Sets the signInSessionsValidFromDateTime property value. Any refresh tokens or sessions tokens (session cookies) issued before this time are invalid, and applications will get an error when using an invalid refresh or sessions token to acquire a delegated access token (to access APIs such as Microsoft Graph).  If this happens, the application will need to acquire a new refresh token by making a request to the authorize endpoint. Read-only. Use revokeSignInSessions to reset. Returned only on $select.
     * @param value Value to set for the signInSessionsValidFromDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInSessionsValidFromDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._signInSessionsValidFromDateTime = value;
    }
    /**
     * Sets the skills property value. A list for the user to enumerate their skills. Returned only on $select.
     * @param value Value to set for the skills property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkills(@javax.annotation.Nullable final java.util.List<String> value) {
        this._skills = value;
    }
    /**
     * Sets the state property value. The state or province in the user's address. Maximum length is 128 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the streetAddress property value. The street address of the user's place of business. Maximum length is 1024 characters. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the streetAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreetAddress(@javax.annotation.Nullable final String value) {
        this._streetAddress = value;
    }
    /**
     * Sets the surname property value. The user's surname (family name or last name). Maximum length is 64 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this._surname = value;
    }
    /**
     * Sets the teamwork property value. The teamwork property
     * @param value Value to set for the teamwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamwork(@javax.annotation.Nullable final UserTeamwork value) {
        this._teamwork = value;
    }
    /**
     * Sets the todo property value. Represents the To Do services available to a user.
     * @param value Value to set for the todo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTodo(@javax.annotation.Nullable final Todo value) {
        this._todo = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The groups, including nested groups, and directory roles that a user is a member of. Nullable.
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
    /**
     * Sets the usageLocation property value. A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: US, JP, and GB. Not nullable. Returned only on $select. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the usageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageLocation(@javax.annotation.Nullable final String value) {
        this._usageLocation = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization.NOTE: This property cannot contain accent characters. Only the following characters are allowed A - Z, a - z, 0 - 9, ' . - _ ! # ^ ~. For the complete list of allowed characters, see username policies. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, endsWith) and $orderBy.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userType property value. A string value that can be used to classify user types in your directory, such as Member and Guest. Returned only on $select. Supports $filter (eq, ne, not, in, and eq on null values). NOTE: For more information about the permissions for member and guest users, see What are the default user permissions in Azure Active Directory?
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final String value) {
        this._userType = value;
    }
}
