package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum PhoneType implements ValuedEnum {
    Home("home"),
    Business("business"),
    Mobile("mobile"),
    Other("other"),
    Assistant("assistant"),
    HomeFax("homeFax"),
    BusinessFax("businessFax"),
    OtherFax("otherFax"),
    Pager("pager"),
    Radio("radio");
    public final String value;
    PhoneType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PhoneType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "home": return Home;
            case "business": return Business;
            case "mobile": return Mobile;
            case "other": return Other;
            case "assistant": return Assistant;
            case "homeFax": return HomeFax;
            case "businessFax": return BusinessFax;
            case "otherFax": return OtherFax;
            case "pager": return Pager;
            case "radio": return Radio;
            default: return null;
        }
    }
}
