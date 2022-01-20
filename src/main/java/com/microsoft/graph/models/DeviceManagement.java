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
import com.microsoft.graph.models.DeviceManagementSettings;
import com.microsoft.graph.models.IntuneBrand;
import com.microsoft.graph.models.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.TermsAndConditions;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.DeviceConfiguration;
import com.microsoft.graph.models.IosUpdateDeviceStatus;
import com.microsoft.graph.models.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.ComplianceManagementPartner;
import com.microsoft.graph.models.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.DeviceCategory;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.DeviceManagementPartner;
import com.microsoft.graph.models.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.MobileThreatDefenseConnector;
import com.microsoft.graph.models.ApplePushNotificationCertificate;
import com.microsoft.graph.models.DetectedApp;
import com.microsoft.graph.models.ManagedDeviceOverview;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ImportedWindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.NotificationMessageTemplate;
import com.microsoft.graph.models.ResourceOperation;
import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.RoleDefinition;
import com.microsoft.graph.models.RemoteAssistancePartner;
import com.microsoft.graph.models.DeviceManagementReports;
import com.microsoft.graph.models.TelecomExpenseManagementPartner;
import com.microsoft.graph.models.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.DetectedAppCollectionPage;
import com.microsoft.graph.requests.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management.
 */
public class DeviceManagement extends Entity implements IJsonBackedObject {


    /**
     * The Intune Account Id.
     * Intune Account ID for given tenant
     */
    @SerializedName(value = "intuneAccountId", alternate = {"IntuneAccountId"})
    @Expose
	@Nullable
    public java.util.UUID intuneAccountId;

    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public DeviceManagementSettings settings;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName(value = "intuneBrand", alternate = {"IntuneBrand"})
    @Expose
	@Nullable
    public IntuneBrand intuneBrand;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. Possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName(value = "subscriptionState", alternate = {"SubscriptionState"})
    @Expose
	@Nullable
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    @SerializedName(value = "termsAndConditions", alternate = {"TermsAndConditions"})
    @Expose
	@Nullable
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    @SerializedName(value = "deviceCompliancePolicies", alternate = {"DeviceCompliancePolicies"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName(value = "deviceCompliancePolicyDeviceStateSummary", alternate = {"DeviceCompliancePolicyDeviceStateSummary"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    @SerializedName(value = "deviceCompliancePolicySettingStateSummaries", alternate = {"DeviceCompliancePolicySettingStateSummaries"})
    @Expose
	@Nullable
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName(value = "deviceConfigurationDeviceStateSummaries", alternate = {"DeviceConfigurationDeviceStateSummaries"})
    @Expose
	@Nullable
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    @SerializedName(value = "deviceConfigurations", alternate = {"DeviceConfigurations"})
    @Expose
	@Nullable
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    @SerializedName(value = "iosUpdateStatuses", alternate = {"IosUpdateStatuses"})
    @Expose
	@Nullable
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName(value = "softwareUpdateStatusSummary", alternate = {"SoftwareUpdateStatusSummary"})
    @Expose
	@Nullable
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    @SerializedName(value = "complianceManagementPartners", alternate = {"ComplianceManagementPartners"})
    @Expose
	@Nullable
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
	@Nullable
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    @SerializedName(value = "deviceCategories", alternate = {"DeviceCategories"})
    @Expose
	@Nullable
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    @SerializedName(value = "deviceEnrollmentConfigurations", alternate = {"DeviceEnrollmentConfigurations"})
    @Expose
	@Nullable
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    @SerializedName(value = "deviceManagementPartners", alternate = {"DeviceManagementPartners"})
    @Expose
	@Nullable
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    @SerializedName(value = "exchangeConnectors", alternate = {"ExchangeConnectors"})
    @Expose
	@Nullable
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    @SerializedName(value = "mobileThreatDefenseConnectors", alternate = {"MobileThreatDefenseConnectors"})
    @Expose
	@Nullable
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName(value = "applePushNotificationCertificate", alternate = {"ApplePushNotificationCertificate"})
    @Expose
	@Nullable
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    @SerializedName(value = "detectedApps", alternate = {"DetectedApps"})
    @Expose
	@Nullable
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName(value = "managedDeviceOverview", alternate = {"ManagedDeviceOverview"})
    @Expose
	@Nullable
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
	@Nullable
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Imported Windows Autopilot Device Identities.
     * Collection of imported Windows autopilot devices.
     */
    @SerializedName(value = "importedWindowsAutopilotDeviceIdentities", alternate = {"ImportedWindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage importedWindowsAutopilotDeviceIdentities;

    /**
     * The Windows Autopilot Device Identities.
     * The Windows autopilot device identities contained collection.
     */
    @SerializedName(value = "windowsAutopilotDeviceIdentities", alternate = {"WindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public WindowsAutopilotDeviceIdentityCollectionPage windowsAutopilotDeviceIdentities;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    @SerializedName(value = "notificationMessageTemplates", alternate = {"NotificationMessageTemplates"})
    @Expose
	@Nullable
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    @SerializedName(value = "resourceOperations", alternate = {"ResourceOperations"})
    @Expose
	@Nullable
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    @SerializedName(value = "remoteAssistancePartners", alternate = {"RemoteAssistancePartners"})
    @Expose
	@Nullable
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Reports.
     * Reports singleton
     */
    @SerializedName(value = "reports", alternate = {"Reports"})
    @Expose
	@Nullable
    public DeviceManagementReports reports;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    @SerializedName(value = "telecomExpenseManagementPartners", alternate = {"TelecomExpenseManagementPartners"})
    @Expose
	@Nullable
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    @SerializedName(value = "troubleshootingEvents", alternate = {"TroubleshootingEvents"})
    @Expose
	@Nullable
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionAppLearningSummaries", alternate = {"WindowsInformationProtectionAppLearningSummaries"})
    @Expose
	@Nullable
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    @SerializedName(value = "windowsInformationProtectionNetworkLearningSummaries", alternate = {"WindowsInformationProtectionNetworkLearningSummaries"})
    @Expose
	@Nullable
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("termsAndConditions")) {
            termsAndConditions = serializer.deserializeObject(json.get("termsAndConditions"), TermsAndConditionsCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicies")) {
            deviceCompliancePolicies = serializer.deserializeObject(json.get("deviceCompliancePolicies"), DeviceCompliancePolicyCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            deviceCompliancePolicySettingStateSummaries = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries"), DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceConfigurations")) {
            deviceConfigurations = serializer.deserializeObject(json.get("deviceConfigurations"), DeviceConfigurationCollectionPage.class);
        }

        if (json.has("iosUpdateStatuses")) {
            iosUpdateStatuses = serializer.deserializeObject(json.get("iosUpdateStatuses"), IosUpdateDeviceStatusCollectionPage.class);
        }

        if (json.has("complianceManagementPartners")) {
            complianceManagementPartners = serializer.deserializeObject(json.get("complianceManagementPartners"), ComplianceManagementPartnerCollectionPage.class);
        }

        if (json.has("deviceCategories")) {
            deviceCategories = serializer.deserializeObject(json.get("deviceCategories"), DeviceCategoryCollectionPage.class);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            deviceEnrollmentConfigurations = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations"), DeviceEnrollmentConfigurationCollectionPage.class);
        }

        if (json.has("deviceManagementPartners")) {
            deviceManagementPartners = serializer.deserializeObject(json.get("deviceManagementPartners"), DeviceManagementPartnerCollectionPage.class);
        }

        if (json.has("exchangeConnectors")) {
            exchangeConnectors = serializer.deserializeObject(json.get("exchangeConnectors"), DeviceManagementExchangeConnectorCollectionPage.class);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            mobileThreatDefenseConnectors = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors"), MobileThreatDefenseConnectorCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps"), DetectedAppCollectionPage.class);
        }

        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices"), ManagedDeviceCollectionPage.class);
        }

        if (json.has("importedWindowsAutopilotDeviceIdentities")) {
            importedWindowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("importedWindowsAutopilotDeviceIdentities"), ImportedWindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("windowsAutopilotDeviceIdentities")) {
            windowsAutopilotDeviceIdentities = serializer.deserializeObject(json.get("windowsAutopilotDeviceIdentities"), WindowsAutopilotDeviceIdentityCollectionPage.class);
        }

        if (json.has("notificationMessageTemplates")) {
            notificationMessageTemplates = serializer.deserializeObject(json.get("notificationMessageTemplates"), NotificationMessageTemplateCollectionPage.class);
        }

        if (json.has("resourceOperations")) {
            resourceOperations = serializer.deserializeObject(json.get("resourceOperations"), ResourceOperationCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), DeviceAndAppManagementRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), RoleDefinitionCollectionPage.class);
        }

        if (json.has("remoteAssistancePartners")) {
            remoteAssistancePartners = serializer.deserializeObject(json.get("remoteAssistancePartners"), RemoteAssistancePartnerCollectionPage.class);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            telecomExpenseManagementPartners = serializer.deserializeObject(json.get("telecomExpenseManagementPartners"), TelecomExpenseManagementPartnerCollectionPage.class);
        }

        if (json.has("troubleshootingEvents")) {
            troubleshootingEvents = serializer.deserializeObject(json.get("troubleshootingEvents"), DeviceManagementTroubleshootingEventCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            windowsInformationProtectionAppLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries"), WindowsInformationProtectionAppLearningSummaryCollectionPage.class);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            windowsInformationProtectionNetworkLearningSummaries = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries"), WindowsInformationProtectionNetworkLearningSummaryCollectionPage.class);
        }
    }
}
