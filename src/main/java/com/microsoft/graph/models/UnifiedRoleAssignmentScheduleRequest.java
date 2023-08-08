package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleAssignmentScheduleRequest extends Request implements Parsable {
    /**
     * Represents the type of the operation on the role assignment request. The possible values are: adminAssign, adminUpdate, adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew, selfExtend, selfRenew, unknownFutureValue. adminAssign: For administrators to assign roles to principals.adminRemove: For administrators to remove principals from roles. adminUpdate: For administrators to change existing role assignments.adminExtend: For administrators to extend expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to activate their assignments.selfDeactivate: For principals to deactivate their active assignments.selfExtend: For principals to request to extend their expiring assignments.selfRenew: For principals to request to renew their expired assignments.
     */
    private UnifiedRoleScheduleRequestActions action;
    /**
     * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it's null. Supports $expand.
     */
    private UnifiedRoleEligibilitySchedule activatedUsing;
    /**
     * Read-only property with details of the app-specific scope when the assignment is scoped to an app. Nullable. Supports $expand.
     */
    private AppScope appScope;
    /**
     * Identifier of the app-specific scope when the assignment is scoped to an app. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     */
    private String appScopeId;
    /**
     * The directory object that is the scope of the assignment. Read-only. Supports $expand.
     */
    private DirectoryObject directoryScope;
    /**
     * Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     */
    private String directoryScopeId;
    /**
     * Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     */
    private Boolean isValidationOnly;
    /**
     * A message provided by users and administrators when create they create the unifiedRoleAssignmentScheduleRequest object.
     */
    private String justification;
    /**
     * The principal that's getting a role assignment through the request. Supports $expand.
     */
    private DirectoryObject principal;
    /**
     * Identifier of the principal that has been granted the assignment. Can be a user, role-assignable group, or a service principal. Supports $filter (eq, ne).
     */
    private String principalId;
    /**
     * Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     */
    private UnifiedRoleDefinition roleDefinition;
    /**
     * Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     */
    private String roleDefinitionId;
    /**
     * The period of the role assignment. Recurring schedules are currently unsupported.
     */
    private RequestSchedule scheduleInfo;
    /**
     * The schedule for an eligible role assignment that is referenced through the targetScheduleId property. Supports $expand.
     */
    private UnifiedRoleAssignmentSchedule targetSchedule;
    /**
     * Identifier of the schedule object that's linked to the assignment request. Supports $filter (eq, ne).
     */
    private String targetScheduleId;
    /**
     * Ticket details linked to the role assignment request including details of the ticket number and ticket system.
     */
    private TicketInfo ticketInfo;
    /**
     * Instantiates a new unifiedRoleAssignmentScheduleRequest and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleAssignmentScheduleRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleAssignmentScheduleRequest
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleAssignmentScheduleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleAssignmentScheduleRequest();
    }
    /**
     * Gets the action property value. Represents the type of the operation on the role assignment request. The possible values are: adminAssign, adminUpdate, adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew, selfExtend, selfRenew, unknownFutureValue. adminAssign: For administrators to assign roles to principals.adminRemove: For administrators to remove principals from roles. adminUpdate: For administrators to change existing role assignments.adminExtend: For administrators to extend expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to activate their assignments.selfDeactivate: For principals to deactivate their active assignments.selfExtend: For principals to request to extend their expiring assignments.selfRenew: For principals to request to renew their expired assignments.
     * @return a unifiedRoleScheduleRequestActions
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleScheduleRequestActions getAction() {
        return this.action;
    }
    /**
     * Gets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it's null. Supports $expand.
     * @return a unifiedRoleEligibilitySchedule
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getActivatedUsing() {
        return this.activatedUsing;
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app-specific scope when the assignment is scoped to an app. Nullable. Supports $expand.
     * @return a appScope
     */
    @jakarta.annotation.Nullable
    public AppScope getAppScope() {
        return this.appScope;
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the assignment is scoped to an app. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppScopeId() {
        return this.appScopeId;
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the assignment. Read-only. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this.directoryScope;
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDirectoryScopeId() {
        return this.directoryScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(UnifiedRoleScheduleRequestActions.class)); });
        deserializerMap.put("activatedUsing", (n) -> { this.setActivatedUsing(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("appScope", (n) -> { this.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { this.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { this.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { this.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("targetSchedule", (n) -> { this.setTargetSchedule(n.getObjectValue(UnifiedRoleAssignmentSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("targetScheduleId", (n) -> { this.setTargetScheduleId(n.getStringValue()); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.isValidationOnly;
    }
    /**
     * Gets the justification property value. A message provided by users and administrators when create they create the unifiedRoleAssignmentScheduleRequest object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the principal property value. The principal that's getting a role assignment through the request. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.principal;
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the assignment. Can be a user, role-assignable group, or a service principal. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @return a unifiedRoleDefinition
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the scheduleInfo property value. The period of the role assignment. Recurring schedules are currently unsupported.
     * @return a requestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Gets the targetSchedule property value. The schedule for an eligible role assignment that is referenced through the targetScheduleId property. Supports $expand.
     * @return a unifiedRoleAssignmentSchedule
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleAssignmentSchedule getTargetSchedule() {
        return this.targetSchedule;
    }
    /**
     * Gets the targetScheduleId property value. Identifier of the schedule object that's linked to the assignment request. Supports $filter (eq, ne).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetScheduleId() {
        return this.targetScheduleId;
    }
    /**
     * Gets the ticketInfo property value. Ticket details linked to the role assignment request including details of the ticket number and ticket system.
     * @return a ticketInfo
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.ticketInfo;
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeObjectValue("activatedUsing", this.getActivatedUsing());
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeObjectValue("targetSchedule", this.getTargetSchedule());
        writer.writeStringValue("targetScheduleId", this.getTargetScheduleId());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. Represents the type of the operation on the role assignment request. The possible values are: adminAssign, adminUpdate, adminRemove, selfActivate, selfDeactivate, adminExtend, adminRenew, selfExtend, selfRenew, unknownFutureValue. adminAssign: For administrators to assign roles to principals.adminRemove: For administrators to remove principals from roles. adminUpdate: For administrators to change existing role assignments.adminExtend: For administrators to extend expiring assignments.adminRenew: For administrators to renew expired assignments.selfActivate: For principals to activate their assignments.selfDeactivate: For principals to deactivate their active assignments.selfExtend: For principals to request to extend their expiring assignments.selfRenew: For principals to request to renew their expired assignments.
     * @param value Value to set for the action property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAction(@jakarta.annotation.Nullable final UnifiedRoleScheduleRequestActions value) {
        this.action = value;
    }
    /**
     * Sets the activatedUsing property value. If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it's null. Supports $expand.
     * @param value Value to set for the activatedUsing property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActivatedUsing(@jakarta.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this.activatedUsing = value;
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app-specific scope when the assignment is scoped to an app. Nullable. Supports $expand.
     * @param value Value to set for the appScope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppScope(@jakarta.annotation.Nullable final AppScope value) {
        this.appScope = value;
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the assignment is scoped to an app. The scope of an assignment determines the set of resources for which the principal has been granted access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the appScopeId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppScopeId(@jakarta.annotation.Nullable final String value) {
        this.appScopeId = value;
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the assignment. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDirectoryScope(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.directoryScope = value;
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the directoryScopeId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDirectoryScopeId(@jakarta.annotation.Nullable final String value) {
        this.directoryScopeId = value;
    }
    /**
     * Sets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @param value Value to set for the isValidationOnly property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.isValidationOnly = value;
    }
    /**
     * Sets the justification property value. A message provided by users and administrators when create they create the unifiedRoleAssignmentScheduleRequest object.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the principal property value. The principal that's getting a role assignment through the request. Supports $expand.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.principal = value;
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the assignment. Can be a user, role-assignable group, or a service principal. Supports $filter (eq, ne).
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.principalId = value;
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleDefinition(@jakarta.annotation.Nullable final UnifiedRoleDefinition value) {
        this.roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the scheduleInfo property value. The period of the role assignment. Recurring schedules are currently unsupported.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
    /**
     * Sets the targetSchedule property value. The schedule for an eligible role assignment that is referenced through the targetScheduleId property. Supports $expand.
     * @param value Value to set for the targetSchedule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetSchedule(@jakarta.annotation.Nullable final UnifiedRoleAssignmentSchedule value) {
        this.targetSchedule = value;
    }
    /**
     * Sets the targetScheduleId property value. Identifier of the schedule object that's linked to the assignment request. Supports $filter (eq, ne).
     * @param value Value to set for the targetScheduleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetScheduleId(@jakarta.annotation.Nullable final String value) {
        this.targetScheduleId = value;
    }
    /**
     * Sets the ticketInfo property value. Ticket details linked to the role assignment request including details of the ticket number and ticket system.
     * @param value Value to set for the ticketInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.ticketInfo = value;
    }
}
