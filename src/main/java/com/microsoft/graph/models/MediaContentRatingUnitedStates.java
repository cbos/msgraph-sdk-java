package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaContentRatingUnitedStates implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Movies rating labels in United States
     */
    private RatingUnitedStatesMoviesType movieRating;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * TV content rating labels in United States
     */
    private RatingUnitedStatesTelevisionType tvRating;
    /**
     * Instantiates a new mediaContentRatingUnitedStates and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingUnitedStates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaContentRatingUnitedStates
     */
    @jakarta.annotation.Nonnull
    public static MediaContentRatingUnitedStates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaContentRatingUnitedStates();
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
        deserializerMap.put("movieRating", (n) -> { this.setMovieRating(n.getEnumValue(RatingUnitedStatesMoviesType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tvRating", (n) -> { this.setTvRating(n.getEnumValue(RatingUnitedStatesTelevisionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the movieRating property value. Movies rating labels in United States
     * @return a ratingUnitedStatesMoviesType
     */
    @jakarta.annotation.Nullable
    public RatingUnitedStatesMoviesType getMovieRating() {
        return this.movieRating;
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
     * Gets the tvRating property value. TV content rating labels in United States
     * @return a ratingUnitedStatesTelevisionType
     */
    @jakarta.annotation.Nullable
    public RatingUnitedStatesTelevisionType getTvRating() {
        return this.tvRating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("movieRating", this.getMovieRating());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("tvRating", this.getTvRating());
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
     * Sets the movieRating property value. Movies rating labels in United States
     * @param value Value to set for the movieRating property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMovieRating(@jakarta.annotation.Nullable final RatingUnitedStatesMoviesType value) {
        this.movieRating = value;
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
     * Sets the tvRating property value. TV content rating labels in United States
     * @param value Value to set for the tvRating property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTvRating(@jakarta.annotation.Nullable final RatingUnitedStatesTelevisionType value) {
        this.tvRating = value;
    }
}
