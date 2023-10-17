package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventPropagationResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the specific location in the workload associated with the event.
     */
    private String location;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The name of the workload associated with the event.
     */
    private String serviceName;
    /**
     * Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success, unknownFutureValue.
     */
    private EventPropagationStatus status;
    /**
     * Additional information about the status of the event creation request.
     */
    private String statusInformation;
    /**
     * Instantiates a new EventPropagationResult and sets the default values.
     */
    public EventPropagationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EventPropagationResult
     */
    @jakarta.annotation.Nonnull
    public static EventPropagationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventPropagationResult();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EventPropagationStatus.class)); });
        deserializerMap.put("statusInformation", (n) -> { this.setStatusInformation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. The name of the specific location in the workload associated with the event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serviceName property value. The name of the workload associated with the event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the status property value. Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success, unknownFutureValue.
     * @return a EventPropagationStatus
     */
    @jakarta.annotation.Nullable
    public EventPropagationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusInformation property value. Additional information about the status of the event creation request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatusInformation() {
        return this.statusInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("serviceName", this.getServiceName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusInformation", this.getStatusInformation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the location property value. The name of the specific location in the workload associated with the event.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serviceName property value. The name of the workload associated with the event.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the status property value. Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EventPropagationStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusInformation property value. Additional information about the status of the event creation request.
     * @param value Value to set for the statusInformation property.
     */
    public void setStatusInformation(@jakarta.annotation.Nullable final String value) {
        this.statusInformation = value;
    }
}
