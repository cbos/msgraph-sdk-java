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
import com.microsoft.graph.models.AccessReviewApplyAction;
import com.microsoft.graph.models.AccessReviewRecommendationInsightSetting;
import com.microsoft.graph.models.PatternedRecurrence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Settings.
 */
public class AccessReviewScheduleSettings implements IJsonBackedObject {

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
     * The Apply Actions.
     * Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction.
     */
    @SerializedName(value = "applyActions", alternate = {"ApplyActions"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewApplyAction> applyActions;

    /**
     * The Auto Apply Decisions Enabled.
     * Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     */
    @SerializedName(value = "autoApplyDecisionsEnabled", alternate = {"AutoApplyDecisionsEnabled"})
    @Expose
	@Nullable
    public Boolean autoApplyDecisionsEnabled;

    /**
     * The Decision Histories For Reviewers Enabled.
     * Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false).
     */
    @SerializedName(value = "decisionHistoriesForReviewersEnabled", alternate = {"DecisionHistoriesForReviewersEnabled"})
    @Expose
	@Nullable
    public Boolean decisionHistoriesForReviewersEnabled;

    /**
     * The Default Decision.
     * Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
     */
    @SerializedName(value = "defaultDecision", alternate = {"DefaultDecision"})
    @Expose
	@Nullable
    public String defaultDecision;

    /**
     * The Default Decision Enabled.
     * Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     */
    @SerializedName(value = "defaultDecisionEnabled", alternate = {"DefaultDecisionEnabled"})
    @Expose
	@Nullable
    public Boolean defaultDecisionEnabled;

    /**
     * The Instance Duration In Days.
     * Duration of an access review instance in days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property.
     */
    @SerializedName(value = "instanceDurationInDays", alternate = {"InstanceDurationInDays"})
    @Expose
	@Nullable
    public Integer instanceDurationInDays;

    /**
     * The Justification Required On Approval.
     * Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     */
    @SerializedName(value = "justificationRequiredOnApproval", alternate = {"JustificationRequiredOnApproval"})
    @Expose
	@Nullable
    public Boolean justificationRequiredOnApproval;

    /**
     * The Mail Notifications Enabled.
     * Indicates whether emails are enabled or disabled. Default value is false.
     */
    @SerializedName(value = "mailNotificationsEnabled", alternate = {"MailNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean mailNotificationsEnabled;

    /**
     * The Recommendation Insight Settings.
     * Optional. Describes the types of insights that aid reviewers to make access review decisions. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationInsightSettings setting will be used instead of the value of this property.
     */
    @SerializedName(value = "recommendationInsightSettings", alternate = {"RecommendationInsightSettings"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewRecommendationInsightSetting> recommendationInsightSettings;

    /**
     * The Recommendation Look Back Duration.
     * Optional field. Indicates the period of inactivity (with respect to the start date of the review instance) that recommendations will be configured from. The recommendation will be to deny if the user is inactive during the look-back duration. For reviews of groups and Microsoft Entra roles, any duration is accepted. For reviews of applications, 30 days is the maximum duration. If not specified, the duration is 30 days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationLookBackDuration setting will be used instead of the value of this property.
     */
    @SerializedName(value = "recommendationLookBackDuration", alternate = {"RecommendationLookBackDuration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration recommendationLookBackDuration;

    /**
     * The Recommendations Enabled.
     * Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property.
     */
    @SerializedName(value = "recommendationsEnabled", alternate = {"RecommendationsEnabled"})
    @Expose
	@Nullable
    public Boolean recommendationsEnabled;

    /**
     * The Recurrence.
     * Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Notifications Enabled.
     * Indicates whether reminders are enabled or disabled. Default value is false.
     */
    @SerializedName(value = "reminderNotificationsEnabled", alternate = {"ReminderNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean reminderNotificationsEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
