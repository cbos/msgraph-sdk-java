package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationFeedbackOutcome extends EducationOutcome implements Parsable {
    /** Teacher's written feedback to the student. */
    private EducationFeedback feedback;
    /** A copy of the feedback property that is made when the grade is released to the student. */
    private EducationFeedback publishedFeedback;
    /**
     * Instantiates a new EducationFeedbackOutcome and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationFeedbackOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationFeedbackOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationFeedbackOutcome
     */
    @javax.annotation.Nonnull
    public static EducationFeedbackOutcome createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFeedbackOutcome();
    }
    /**
     * Gets the feedback property value. Teacher's written feedback to the student.
     * @return a educationFeedback
     */
    @javax.annotation.Nullable
    public EducationFeedback getFeedback() {
        return this.feedback;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("feedback", (n) -> { this.setFeedback(n.getObjectValue(EducationFeedback::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedFeedback", (n) -> { this.setPublishedFeedback(n.getObjectValue(EducationFeedback::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the publishedFeedback property value. A copy of the feedback property that is made when the grade is released to the student.
     * @return a educationFeedback
     */
    @javax.annotation.Nullable
    public EducationFeedback getPublishedFeedback() {
        return this.publishedFeedback;
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
        writer.writeObjectValue("feedback", this.getFeedback());
        writer.writeObjectValue("publishedFeedback", this.getPublishedFeedback());
    }
    /**
     * Sets the feedback property value. Teacher's written feedback to the student.
     * @param value Value to set for the feedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedback(@javax.annotation.Nullable final EducationFeedback value) {
        this.feedback = value;
    }
    /**
     * Sets the publishedFeedback property value. A copy of the feedback property that is made when the grade is released to the student.
     * @param value Value to set for the publishedFeedback property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedFeedback(@javax.annotation.Nullable final EducationFeedback value) {
        this.publishedFeedback = value;
    }
}
