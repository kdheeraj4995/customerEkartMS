package models.enums;

/**
 * @author Dheeraj
 */
public enum AccountType {
    BASIC("BASIC"),
    PREMIUM("PREMIUM");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
