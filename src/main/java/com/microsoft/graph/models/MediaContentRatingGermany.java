package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaContentRatingGermany implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Movies rating labels in Germany */
    private RatingGermanyMoviesType _movieRating;
    /** The OdataType property */
    private String _odataType;
    /** TV content rating labels in Germany */
    private RatingGermanyTelevisionType _tvRating;
    /**
     * Instantiates a new mediaContentRatingGermany and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MediaContentRatingGermany() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.mediaContentRatingGermany");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaContentRatingGermany
     */
    @javax.annotation.Nonnull
    public static MediaContentRatingGermany createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaContentRatingGermany();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaContentRatingGermany currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("movieRating", (n) -> { currentObject.setMovieRating(n.getEnumValue(RatingGermanyMoviesType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tvRating", (n) -> { currentObject.setTvRating(n.getEnumValue(RatingGermanyTelevisionType.class)); });
        }};
    }
    /**
     * Gets the movieRating property value. Movies rating labels in Germany
     * @return a ratingGermanyMoviesType
     */
    @javax.annotation.Nullable
    public RatingGermanyMoviesType getMovieRating() {
        return this._movieRating;
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
     * Gets the tvRating property value. TV content rating labels in Germany
     * @return a ratingGermanyTelevisionType
     */
    @javax.annotation.Nullable
    public RatingGermanyTelevisionType getTvRating() {
        return this._tvRating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("movieRating", this.getMovieRating());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("tvRating", this.getTvRating());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the movieRating property value. Movies rating labels in Germany
     * @param value Value to set for the movieRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMovieRating(@javax.annotation.Nullable final RatingGermanyMoviesType value) {
        this._movieRating = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tvRating property value. TV content rating labels in Germany
     * @param value Value to set for the tvRating property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTvRating(@javax.annotation.Nullable final RatingGermanyTelevisionType value) {
        this._tvRating = value;
    }
}
