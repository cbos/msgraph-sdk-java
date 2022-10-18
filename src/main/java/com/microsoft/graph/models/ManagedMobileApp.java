package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The identifier for the deployment an app. */
public class ManagedMobileApp extends Entity implements Parsable {
    /** The identifier for an app with it's operating system type. */
    private MobileAppIdentifier _mobileAppIdentifier;
    /** Version of the entity. */
    private String _version;
    /**
     * Instantiates a new managedMobileApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedMobileApp() {
        super();
        this.setOdataType("#microsoft.graph.managedMobileApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedMobileApp
     */
    @javax.annotation.Nonnull
    public static ManagedMobileApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedMobileApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedMobileApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("mobileAppIdentifier", (n) -> { currentObject.setMobileAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the mobileAppIdentifier property value. The identifier for an app with it's operating system type.
     * @return a mobileAppIdentifier
     */
    @javax.annotation.Nullable
    public MobileAppIdentifier getMobileAppIdentifier() {
        return this._mobileAppIdentifier;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
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
        writer.writeObjectValue("mobileAppIdentifier", this.getMobileAppIdentifier());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the mobileAppIdentifier property value. The identifier for an app with it's operating system type.
     * @param value Value to set for the mobileAppIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppIdentifier(@javax.annotation.Nullable final MobileAppIdentifier value) {
        this._mobileAppIdentifier = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
