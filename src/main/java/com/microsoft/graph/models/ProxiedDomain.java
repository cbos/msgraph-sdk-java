package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Proxied Domain
 */
public class ProxiedDomain implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The IP address or FQDN
     */
    private String ipAddressOrFQDN;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Proxy IP or FQDN
     */
    private String proxy;
    /**
     * Instantiates a new proxiedDomain and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ProxiedDomain() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a proxiedDomain
     */
    @jakarta.annotation.Nonnull
    public static ProxiedDomain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProxiedDomain();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("ipAddressOrFQDN", (n) -> { this.setIpAddressOrFQDN(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("proxy", (n) -> { this.setProxy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddressOrFQDN property value. The IP address or FQDN
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddressOrFQDN() {
        return this.ipAddressOrFQDN;
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
     * Gets the proxy property value. Proxy IP or FQDN
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProxy() {
        return this.proxy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ipAddressOrFQDN", this.getIpAddressOrFQDN());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("proxy", this.getProxy());
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
     * Sets the ipAddressOrFQDN property value. The IP address or FQDN
     * @param value Value to set for the ipAddressOrFQDN property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIpAddressOrFQDN(@jakarta.annotation.Nullable final String value) {
        this.ipAddressOrFQDN = value;
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
    /**
     * Sets the proxy property value. Proxy IP or FQDN
     * @param value Value to set for the proxy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxy(@jakarta.annotation.Nullable final String value) {
        this.proxy = value;
    }
}
