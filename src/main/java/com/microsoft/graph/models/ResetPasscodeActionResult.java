package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Reset passcode action result
 */
public class ResetPasscodeActionResult extends DeviceActionResult implements Parsable {
    /**
     * Newly generated passcode for the device
     */
    private String passcode;
    /**
     * Instantiates a new resetPasscodeActionResult and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ResetPasscodeActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resetPasscodeActionResult
     */
    @jakarta.annotation.Nonnull
    public static ResetPasscodeActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResetPasscodeActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passcode property value. Newly generated passcode for the device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.passcode;
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
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the passcode property value. Newly generated passcode for the device
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.passcode = value;
    }
}
