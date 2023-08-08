package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * A class containing the properties for iOS Vpp eBook.
 */
public class IosVppEBook extends ManagedEBook implements Parsable {
    /**
     * The Apple ID associated with Vpp token.
     */
    private String appleId;
    /**
     * Genres.
     */
    private java.util.List<String> genres;
    /**
     * Language.
     */
    private String language;
    /**
     * Seller.
     */
    private String seller;
    /**
     * Total license count.
     */
    private Integer totalLicenseCount;
    /**
     * Used license count.
     */
    private Integer usedLicenseCount;
    /**
     * The Vpp token's organization name.
     */
    private String vppOrganizationName;
    /**
     * The Vpp token ID.
     */
    private UUID vppTokenId;
    /**
     * Instantiates a new iosVppEBook and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IosVppEBook() {
        super();
        this.setOdataType("#microsoft.graph.iosVppEBook");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosVppEBook
     */
    @jakarta.annotation.Nonnull
    public static IosVppEBook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppEBook();
    }
    /**
     * Gets the appleId property value. The Apple ID associated with Vpp token.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppleId() {
        return this.appleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleId", (n) -> { this.setAppleId(n.getStringValue()); });
        deserializerMap.put("genres", (n) -> { this.setGenres(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("seller", (n) -> { this.setSeller(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("vppOrganizationName", (n) -> { this.setVppOrganizationName(n.getStringValue()); });
        deserializerMap.put("vppTokenId", (n) -> { this.setVppTokenId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the genres property value. Genres.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGenres() {
        return this.genres;
    }
    /**
     * Gets the language property value. Language.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Gets the seller property value. Seller.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSeller() {
        return this.seller;
    }
    /**
     * Gets the totalLicenseCount property value. Total license count.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. Used license count.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.usedLicenseCount;
    }
    /**
     * Gets the vppOrganizationName property value. The Vpp token's organization name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVppOrganizationName() {
        return this.vppOrganizationName;
    }
    /**
     * Gets the vppTokenId property value. The Vpp token ID.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getVppTokenId() {
        return this.vppTokenId;
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
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeCollectionOfPrimitiveValues("genres", this.getGenres());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("seller", this.getSeller());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeStringValue("vppOrganizationName", this.getVppOrganizationName());
        writer.writeUUIDValue("vppTokenId", this.getVppTokenId());
    }
    /**
     * Sets the appleId property value. The Apple ID associated with Vpp token.
     * @param value Value to set for the appleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppleId(@jakarta.annotation.Nullable final String value) {
        this.appleId = value;
    }
    /**
     * Sets the genres property value. Genres.
     * @param value Value to set for the genres property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGenres(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.genres = value;
    }
    /**
     * Sets the language property value. Language.
     * @param value Value to set for the language property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
    }
    /**
     * Sets the seller property value. Seller.
     * @param value Value to set for the seller property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSeller(@jakarta.annotation.Nullable final String value) {
        this.seller = value;
    }
    /**
     * Sets the totalLicenseCount property value. Total license count.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. Used license count.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.usedLicenseCount = value;
    }
    /**
     * Sets the vppOrganizationName property value. The Vpp token's organization name.
     * @param value Value to set for the vppOrganizationName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVppOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.vppOrganizationName = value;
    }
    /**
     * Sets the vppTokenId property value. The Vpp token ID.
     * @param value Value to set for the vppTokenId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVppTokenId(@jakarta.annotation.Nullable final UUID value) {
        this.vppTokenId = value;
    }
}
