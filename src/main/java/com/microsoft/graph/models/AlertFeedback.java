package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AlertFeedback implements ValuedEnum {
    Unknown("unknown"),
    TruePositive("truePositive"),
    FalsePositive("falsePositive"),
    BenignPositive("benignPositive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertFeedback(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertFeedback forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "truePositive": return TruePositive;
            case "falsePositive": return FalsePositive;
            case "benignPositive": return BenignPositive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
