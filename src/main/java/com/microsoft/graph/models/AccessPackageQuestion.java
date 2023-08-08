package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageQuestion extends Entity implements Parsable {
    /**
     * Specifies whether the requestor is allowed to edit answers to questions for an assignment by posting an update to accessPackageAssignmentRequest.
     */
    private Boolean isAnswerEditable;
    /**
     * Whether the requestor is required to supply an answer or not.
     */
    private Boolean isRequired;
    /**
     * The text of the question represented in a format for a specific locale.
     */
    private java.util.List<AccessPackageLocalizedText> localizations;
    /**
     * Relative position of this question when displaying a list of questions to the requestor.
     */
    private Integer sequence;
    /**
     * The text of the question to show to the requestor.
     */
    private String text;
    /**
     * Instantiates a new accessPackageQuestion and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageQuestion
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageMultipleChoiceQuestion": return new AccessPackageMultipleChoiceQuestion();
                case "#microsoft.graph.accessPackageTextInputQuestion": return new AccessPackageTextInputQuestion();
            }
        }
        return new AccessPackageQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isAnswerEditable", (n) -> { this.setIsAnswerEditable(n.getBooleanValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(AccessPackageLocalizedText::createFromDiscriminatorValue)); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions for an assignment by posting an update to accessPackageAssignmentRequest.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAnswerEditable() {
        return this.isAnswerEditable;
    }
    /**
     * Gets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Gets the localizations property value. The text of the question represented in a format for a specific locale.
     * @return a accessPackageLocalizedText
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageLocalizedText> getLocalizations() {
        return this.localizations;
    }
    /**
     * Gets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
    }
    /**
     * Gets the text property value. The text of the question to show to the requestor.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
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
        writer.writeBooleanValue("isAnswerEditable", this.getIsAnswerEditable());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeStringValue("text", this.getText());
    }
    /**
     * Sets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions for an assignment by posting an update to accessPackageAssignmentRequest.
     * @param value Value to set for the isAnswerEditable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsAnswerEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.isAnswerEditable = value;
    }
    /**
     * Sets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
    /**
     * Sets the localizations property value. The text of the question represented in a format for a specific locale.
     * @param value Value to set for the localizations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<AccessPackageLocalizedText> value) {
        this.localizations = value;
    }
    /**
     * Sets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @param value Value to set for the sequence property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.sequence = value;
    }
    /**
     * Sets the text property value. The text of the question to show to the requestor.
     * @param value Value to set for the text property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
}
