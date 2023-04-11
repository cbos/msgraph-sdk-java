package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SharingCapabilities implements ValuedEnum {
    Disabled("disabled"),
    ExternalUserSharingOnly("externalUserSharingOnly"),
    ExternalUserAndGuestSharing("externalUserAndGuestSharing"),
    ExistingExternalUserSharingOnly("existingExternalUserSharingOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharingCapabilities(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SharingCapabilities forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "externalUserSharingOnly": return ExternalUserSharingOnly;
            case "externalUserAndGuestSharing": return ExternalUserAndGuestSharing;
            case "existingExternalUserSharingOnly": return ExistingExternalUserSharingOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
