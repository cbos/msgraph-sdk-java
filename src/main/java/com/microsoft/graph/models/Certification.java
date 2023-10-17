package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Certification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * URL that shows certification details for the application.
     */
    private String certificationDetailsUrl;
    /**
     * The timestamp when the current certification for the application expires.
     */
    private OffsetDateTime certificationExpirationDateTime;
    /**
     * Indicates whether the application is certified by Microsoft.
     */
    private Boolean isCertifiedByMicrosoft;
    /**
     * Indicates whether the application has been self-attested by the application developer or the publisher.
     */
    private Boolean isPublisherAttested;
    /**
     * The timestamp when the certification for the application was most recently added or updated.
     */
    private OffsetDateTime lastCertificationDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new Certification and sets the default values.
     */
    public Certification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Certification
     */
    @jakarta.annotation.Nonnull
    public static Certification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Certification();
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
     * Gets the certificationDetailsUrl property value. URL that shows certification details for the application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificationDetailsUrl() {
        return this.certificationDetailsUrl;
    }
    /**
     * Gets the certificationExpirationDateTime property value. The timestamp when the current certification for the application expires.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertificationExpirationDateTime() {
        return this.certificationExpirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("certificationDetailsUrl", (n) -> { this.setCertificationDetailsUrl(n.getStringValue()); });
        deserializerMap.put("certificationExpirationDateTime", (n) -> { this.setCertificationExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isCertifiedByMicrosoft", (n) -> { this.setIsCertifiedByMicrosoft(n.getBooleanValue()); });
        deserializerMap.put("isPublisherAttested", (n) -> { this.setIsPublisherAttested(n.getBooleanValue()); });
        deserializerMap.put("lastCertificationDateTime", (n) -> { this.setLastCertificationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCertifiedByMicrosoft property value. Indicates whether the application is certified by Microsoft.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCertifiedByMicrosoft() {
        return this.isCertifiedByMicrosoft;
    }
    /**
     * Gets the isPublisherAttested property value. Indicates whether the application has been self-attested by the application developer or the publisher.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublisherAttested() {
        return this.isPublisherAttested;
    }
    /**
     * Gets the lastCertificationDateTime property value. The timestamp when the certification for the application was most recently added or updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCertificationDateTime() {
        return this.lastCertificationDateTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("certificationExpirationDateTime", this.getCertificationExpirationDateTime());
        writer.writeBooleanValue("isPublisherAttested", this.getIsPublisherAttested());
        writer.writeOffsetDateTimeValue("lastCertificationDateTime", this.getLastCertificationDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the certificationDetailsUrl property value. URL that shows certification details for the application.
     * @param value Value to set for the certificationDetailsUrl property.
     */
    public void setCertificationDetailsUrl(@jakarta.annotation.Nullable final String value) {
        this.certificationDetailsUrl = value;
    }
    /**
     * Sets the certificationExpirationDateTime property value. The timestamp when the current certification for the application expires.
     * @param value Value to set for the certificationExpirationDateTime property.
     */
    public void setCertificationExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certificationExpirationDateTime = value;
    }
    /**
     * Sets the isCertifiedByMicrosoft property value. Indicates whether the application is certified by Microsoft.
     * @param value Value to set for the isCertifiedByMicrosoft property.
     */
    public void setIsCertifiedByMicrosoft(@jakarta.annotation.Nullable final Boolean value) {
        this.isCertifiedByMicrosoft = value;
    }
    /**
     * Sets the isPublisherAttested property value. Indicates whether the application has been self-attested by the application developer or the publisher.
     * @param value Value to set for the isPublisherAttested property.
     */
    public void setIsPublisherAttested(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublisherAttested = value;
    }
    /**
     * Sets the lastCertificationDateTime property value. The timestamp when the certification for the application was most recently added or updated.
     * @param value Value to set for the lastCertificationDateTime property.
     */
    public void setLastCertificationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastCertificationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
