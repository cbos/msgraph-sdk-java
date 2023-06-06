package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilterOperatorSchema extends Entity implements Parsable {
    /** The arity property */
    private ScopeOperatorType arity;
    /** The multivaluedComparisonType property */
    private ScopeOperatorMultiValuedComparisonType multivaluedComparisonType;
    /** The supportedAttributeTypes property */
    private java.util.List<AttributeType> supportedAttributeTypes;
    /**
     * Instantiates a new filterOperatorSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FilterOperatorSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filterOperatorSchema
     */
    @javax.annotation.Nonnull
    public static FilterOperatorSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilterOperatorSchema();
    }
    /**
     * Gets the arity property value. The arity property
     * @return a scopeOperatorType
     */
    @javax.annotation.Nullable
    public ScopeOperatorType getArity() {
        return this.arity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("arity", (n) -> { this.setArity(n.getEnumValue(ScopeOperatorType.class)); });
        deserializerMap.put("multivaluedComparisonType", (n) -> { this.setMultivaluedComparisonType(n.getEnumValue(ScopeOperatorMultiValuedComparisonType.class)); });
        deserializerMap.put("supportedAttributeTypes", (n) -> { this.setSupportedAttributeTypes(n.getCollectionOfEnumValues(AttributeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the multivaluedComparisonType property value. The multivaluedComparisonType property
     * @return a scopeOperatorMultiValuedComparisonType
     */
    @javax.annotation.Nullable
    public ScopeOperatorMultiValuedComparisonType getMultivaluedComparisonType() {
        return this.multivaluedComparisonType;
    }
    /**
     * Gets the supportedAttributeTypes property value. The supportedAttributeTypes property
     * @return a attributeType
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeType> getSupportedAttributeTypes() {
        return this.supportedAttributeTypes;
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
        writer.writeEnumValue("arity", this.getArity());
        writer.writeEnumValue("multivaluedComparisonType", this.getMultivaluedComparisonType());
        writer.writeCollectionOfEnumValues("supportedAttributeTypes", this.getSupportedAttributeTypes());
    }
    /**
     * Sets the arity property value. The arity property
     * @param value Value to set for the arity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArity(@javax.annotation.Nullable final ScopeOperatorType value) {
        this.arity = value;
    }
    /**
     * Sets the multivaluedComparisonType property value. The multivaluedComparisonType property
     * @param value Value to set for the multivaluedComparisonType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultivaluedComparisonType(@javax.annotation.Nullable final ScopeOperatorMultiValuedComparisonType value) {
        this.multivaluedComparisonType = value;
    }
    /**
     * Sets the supportedAttributeTypes property value. The supportedAttributeTypes property
     * @param value Value to set for the supportedAttributeTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedAttributeTypes(@javax.annotation.Nullable final java.util.List<AttributeType> value) {
        this.supportedAttributeTypes = value;
    }
}
