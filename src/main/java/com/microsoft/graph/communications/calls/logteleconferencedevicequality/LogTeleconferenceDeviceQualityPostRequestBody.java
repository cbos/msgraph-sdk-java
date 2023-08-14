package com.microsoft.graph.communications.calls.logteleconferencedevicequality;

import com.microsoft.graph.models.TeleconferenceDeviceQuality;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogTeleconferenceDeviceQualityPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The quality property
     */
    private TeleconferenceDeviceQuality quality;
    /**
     * Instantiates a new logTeleconferenceDeviceQualityPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LogTeleconferenceDeviceQualityPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logTeleconferenceDeviceQualityPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LogTeleconferenceDeviceQualityPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogTeleconferenceDeviceQualityPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getObjectValue(TeleconferenceDeviceQuality::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a teleconferenceDeviceQuality
     */
    @jakarta.annotation.Nullable
    public TeleconferenceDeviceQuality getQuality() {
        return this.quality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("quality", this.getQuality());
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
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setQuality(@jakarta.annotation.Nullable final TeleconferenceDeviceQuality value) {
        this.quality = value;
    }
}
