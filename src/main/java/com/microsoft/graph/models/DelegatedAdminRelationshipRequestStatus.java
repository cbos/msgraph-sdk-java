package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DelegatedAdminRelationshipRequestStatus implements ValuedEnum {
    Created("created"),
    Pending("pending"),
    Succeeded("succeeded"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DelegatedAdminRelationshipRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminRelationshipRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "pending": return Pending;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
