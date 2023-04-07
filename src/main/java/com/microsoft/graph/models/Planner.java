package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Planner extends Entity implements Parsable {
    /** Read-only. Nullable. Returns a collection of the specified buckets */
    private java.util.List<PlannerBucket> buckets;
    /** Read-only. Nullable. Returns a collection of the specified plans */
    private java.util.List<PlannerPlan> plans;
    /** Read-only. Nullable. Returns a collection of the specified tasks */
    private java.util.List<PlannerTask> tasks;
    /**
     * Instantiates a new planner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Planner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a planner
     */
    @javax.annotation.Nonnull
    public static Planner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Planner();
    }
    /**
     * Gets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @return a plannerBucket
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this.buckets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.plans;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.tasks;
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
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @param value Value to set for the buckets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this.buckets = value;
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @param value Value to set for the plans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.plans = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.tasks = value;
    }
}
