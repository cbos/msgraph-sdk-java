package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterCreateOperation extends PrintOperation implements Parsable {
    /**
     * The signed certificate created during the registration process. Read-only.
     */
    private String certificate;
    /**
     * The created printer entity. Read-only.
     */
    private Printer printer;
    /**
     * Instantiates a new printerCreateOperation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrinterCreateOperation() {
        super();
        this.setOdataType("#microsoft.graph.printerCreateOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerCreateOperation
     */
    @jakarta.annotation.Nonnull
    public static PrinterCreateOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterCreateOperation();
    }
    /**
     * Gets the certificate property value. The signed certificate created during the registration process. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("printer", (n) -> { this.setPrinter(n.getObjectValue(Printer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the printer property value. The created printer entity. Read-only.
     * @return a printer
     */
    @jakarta.annotation.Nullable
    public Printer getPrinter() {
        return this.printer;
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
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeObjectValue("printer", this.getPrinter());
    }
    /**
     * Sets the certificate property value. The signed certificate created during the registration process. Read-only.
     * @param value Value to set for the certificate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the printer property value. The created printer entity. Read-only.
     * @param value Value to set for the printer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrinter(@jakarta.annotation.Nullable final Printer value) {
        this.printer = value;
    }
}
