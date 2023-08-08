package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorFeatureSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Determines whether the user's Authenticator app will show them the client app they are signing into.
     */
    private AuthenticationMethodFeatureConfiguration displayAppInformationRequiredState;
    /**
     * Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from.
     */
    private AuthenticationMethodFeatureConfiguration displayLocationInformationRequiredState;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new microsoftAuthenticatorFeatureSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MicrosoftAuthenticatorFeatureSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftAuthenticatorFeatureSettings
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAuthenticatorFeatureSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorFeatureSettings();
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
     * Gets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app will show them the client app they are signing into.
     * @return a authenticationMethodFeatureConfiguration
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayAppInformationRequiredState() {
        return this.displayAppInformationRequiredState;
    }
    /**
     * Gets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from.
     * @return a authenticationMethodFeatureConfiguration
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodFeatureConfiguration getDisplayLocationInformationRequiredState() {
        return this.displayLocationInformationRequiredState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("displayAppInformationRequiredState", (n) -> { this.setDisplayAppInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("displayLocationInformationRequiredState", (n) -> { this.setDisplayLocationInformationRequiredState(n.getObjectValue(AuthenticationMethodFeatureConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("displayAppInformationRequiredState", this.getDisplayAppInformationRequiredState());
        writer.writeObjectValue("displayLocationInformationRequiredState", this.getDisplayLocationInformationRequiredState());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the displayAppInformationRequiredState property value. Determines whether the user's Authenticator app will show them the client app they are signing into.
     * @param value Value to set for the displayAppInformationRequiredState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayAppInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.displayAppInformationRequiredState = value;
    }
    /**
     * Sets the displayLocationInformationRequiredState property value. Determines whether the user's Authenticator app will show them the geographic location of where the authentication request originated from.
     * @param value Value to set for the displayLocationInformationRequiredState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayLocationInformationRequiredState(@jakarta.annotation.Nullable final AuthenticationMethodFeatureConfiguration value) {
        this.displayLocationInformationRequiredState = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
