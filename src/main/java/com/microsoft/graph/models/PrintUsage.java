package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintUsage extends Entity implements Parsable {
    /**
     * The blackAndWhitePageCount property
     */
    private Long blackAndWhitePageCount;
    /**
     * The colorPageCount property
     */
    private Long colorPageCount;
    /**
     * The completedBlackAndWhiteJobCount property
     */
    private Long completedBlackAndWhiteJobCount;
    /**
     * The completedColorJobCount property
     */
    private Long completedColorJobCount;
    /**
     * The completedJobCount property
     */
    private Long completedJobCount;
    /**
     * The doubleSidedSheetCount property
     */
    private Long doubleSidedSheetCount;
    /**
     * The incompleteJobCount property
     */
    private Long incompleteJobCount;
    /**
     * The mediaSheetCount property
     */
    private Long mediaSheetCount;
    /**
     * The pageCount property
     */
    private Long pageCount;
    /**
     * The singleSidedSheetCount property
     */
    private Long singleSidedSheetCount;
    /**
     * The usageDate property
     */
    private LocalDate usageDate;
    /**
     * Instantiates a new printUsage and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PrintUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printUsage
     */
    @jakarta.annotation.Nonnull
    public static PrintUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.printUsageByPrinter": return new PrintUsageByPrinter();
                case "#microsoft.graph.printUsageByUser": return new PrintUsageByUser();
            }
        }
        return new PrintUsage();
    }
    /**
     * Gets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getBlackAndWhitePageCount() {
        return this.blackAndWhitePageCount;
    }
    /**
     * Gets the colorPageCount property value. The colorPageCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getColorPageCount() {
        return this.colorPageCount;
    }
    /**
     * Gets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCompletedBlackAndWhiteJobCount() {
        return this.completedBlackAndWhiteJobCount;
    }
    /**
     * Gets the completedColorJobCount property value. The completedColorJobCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCompletedColorJobCount() {
        return this.completedColorJobCount;
    }
    /**
     * Gets the completedJobCount property value. The completedJobCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCompletedJobCount() {
        return this.completedJobCount;
    }
    /**
     * Gets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDoubleSidedSheetCount() {
        return this.doubleSidedSheetCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blackAndWhitePageCount", (n) -> { this.setBlackAndWhitePageCount(n.getLongValue()); });
        deserializerMap.put("colorPageCount", (n) -> { this.setColorPageCount(n.getLongValue()); });
        deserializerMap.put("completedBlackAndWhiteJobCount", (n) -> { this.setCompletedBlackAndWhiteJobCount(n.getLongValue()); });
        deserializerMap.put("completedColorJobCount", (n) -> { this.setCompletedColorJobCount(n.getLongValue()); });
        deserializerMap.put("completedJobCount", (n) -> { this.setCompletedJobCount(n.getLongValue()); });
        deserializerMap.put("doubleSidedSheetCount", (n) -> { this.setDoubleSidedSheetCount(n.getLongValue()); });
        deserializerMap.put("incompleteJobCount", (n) -> { this.setIncompleteJobCount(n.getLongValue()); });
        deserializerMap.put("mediaSheetCount", (n) -> { this.setMediaSheetCount(n.getLongValue()); });
        deserializerMap.put("pageCount", (n) -> { this.setPageCount(n.getLongValue()); });
        deserializerMap.put("singleSidedSheetCount", (n) -> { this.setSingleSidedSheetCount(n.getLongValue()); });
        deserializerMap.put("usageDate", (n) -> { this.setUsageDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incompleteJobCount property value. The incompleteJobCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getIncompleteJobCount() {
        return this.incompleteJobCount;
    }
    /**
     * Gets the mediaSheetCount property value. The mediaSheetCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMediaSheetCount() {
        return this.mediaSheetCount;
    }
    /**
     * Gets the pageCount property value. The pageCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getPageCount() {
        return this.pageCount;
    }
    /**
     * Gets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSingleSidedSheetCount() {
        return this.singleSidedSheetCount;
    }
    /**
     * Gets the usageDate property value. The usageDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getUsageDate() {
        return this.usageDate;
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
        writer.writeLongValue("blackAndWhitePageCount", this.getBlackAndWhitePageCount());
        writer.writeLongValue("colorPageCount", this.getColorPageCount());
        writer.writeLongValue("completedBlackAndWhiteJobCount", this.getCompletedBlackAndWhiteJobCount());
        writer.writeLongValue("completedColorJobCount", this.getCompletedColorJobCount());
        writer.writeLongValue("completedJobCount", this.getCompletedJobCount());
        writer.writeLongValue("doubleSidedSheetCount", this.getDoubleSidedSheetCount());
        writer.writeLongValue("incompleteJobCount", this.getIncompleteJobCount());
        writer.writeLongValue("mediaSheetCount", this.getMediaSheetCount());
        writer.writeLongValue("pageCount", this.getPageCount());
        writer.writeLongValue("singleSidedSheetCount", this.getSingleSidedSheetCount());
        writer.writeLocalDateValue("usageDate", this.getUsageDate());
    }
    /**
     * Sets the blackAndWhitePageCount property value. The blackAndWhitePageCount property
     * @param value Value to set for the blackAndWhitePageCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBlackAndWhitePageCount(@jakarta.annotation.Nullable final Long value) {
        this.blackAndWhitePageCount = value;
    }
    /**
     * Sets the colorPageCount property value. The colorPageCount property
     * @param value Value to set for the colorPageCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setColorPageCount(@jakarta.annotation.Nullable final Long value) {
        this.colorPageCount = value;
    }
    /**
     * Sets the completedBlackAndWhiteJobCount property value. The completedBlackAndWhiteJobCount property
     * @param value Value to set for the completedBlackAndWhiteJobCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompletedBlackAndWhiteJobCount(@jakarta.annotation.Nullable final Long value) {
        this.completedBlackAndWhiteJobCount = value;
    }
    /**
     * Sets the completedColorJobCount property value. The completedColorJobCount property
     * @param value Value to set for the completedColorJobCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompletedColorJobCount(@jakarta.annotation.Nullable final Long value) {
        this.completedColorJobCount = value;
    }
    /**
     * Sets the completedJobCount property value. The completedJobCount property
     * @param value Value to set for the completedJobCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCompletedJobCount(@jakarta.annotation.Nullable final Long value) {
        this.completedJobCount = value;
    }
    /**
     * Sets the doubleSidedSheetCount property value. The doubleSidedSheetCount property
     * @param value Value to set for the doubleSidedSheetCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDoubleSidedSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.doubleSidedSheetCount = value;
    }
    /**
     * Sets the incompleteJobCount property value. The incompleteJobCount property
     * @param value Value to set for the incompleteJobCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncompleteJobCount(@jakarta.annotation.Nullable final Long value) {
        this.incompleteJobCount = value;
    }
    /**
     * Sets the mediaSheetCount property value. The mediaSheetCount property
     * @param value Value to set for the mediaSheetCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMediaSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.mediaSheetCount = value;
    }
    /**
     * Sets the pageCount property value. The pageCount property
     * @param value Value to set for the pageCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPageCount(@jakarta.annotation.Nullable final Long value) {
        this.pageCount = value;
    }
    /**
     * Sets the singleSidedSheetCount property value. The singleSidedSheetCount property
     * @param value Value to set for the singleSidedSheetCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSingleSidedSheetCount(@jakarta.annotation.Nullable final Long value) {
        this.singleSidedSheetCount = value;
    }
    /**
     * Sets the usageDate property value. The usageDate property
     * @param value Value to set for the usageDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUsageDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.usageDate = value;
    }
}
