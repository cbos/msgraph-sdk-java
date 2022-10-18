package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TokenMeetingInfo extends MeetingInfo implements Parsable {
    /** The token used to join the call. */
    private String _token;
    /**
     * Instantiates a new TokenMeetingInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TokenMeetingInfo() {
        super();
        this.setOdataType("#microsoft.graph.tokenMeetingInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TokenMeetingInfo
     */
    @javax.annotation.Nonnull
    public static TokenMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TokenMeetingInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TokenMeetingInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("token", (n) -> { currentObject.setToken(n.getStringValue()); });
        }};
    }
    /**
     * Gets the token property value. The token used to join the call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToken() {
        return this._token;
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
        writer.writeStringValue("token", this.getToken());
    }
    /**
     * Sets the token property value. The token used to join the call.
     * @param value Value to set for the token property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToken(@javax.annotation.Nullable final String value) {
        this._token = value;
    }
}
