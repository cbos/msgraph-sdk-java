package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GenericError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The error code. */
    private String _code;
    /** The error message. */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new genericError and sets the default values.
     * @return a void
     */
    public GenericError() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.genericError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a genericError
     */
    @javax.annotation.Nonnull
    public static GenericError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenericError();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the code property value. The error code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GenericError currentObject = this;
        return new HashMap<>(3) {{
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the message property value. The error message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the code property value. The error code.
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the message property value. The error message.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
