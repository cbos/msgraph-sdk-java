package com.microsoft.graph.organization.getbyids;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetByIdsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ids property
     */
    private java.util.List<String> ids;
    /**
     * The types property
     */
    private java.util.List<String> types;
    /**
     * Instantiates a new getByIdsPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GetByIdsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getByIdsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetByIdsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetByIdsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ids", (n) -> { this.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("types", (n) -> { this.setTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ids property value. The ids property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIds() {
        return this.ids;
    }
    /**
     * Gets the types property value. The types property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTypes() {
        return this.types;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ids", this.getIds());
        writer.writeCollectionOfPrimitiveValues("types", this.getTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ids = value;
    }
    /**
     * Sets the types property value. The types property
     * @param value Value to set for the types property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.types = value;
    }
}
