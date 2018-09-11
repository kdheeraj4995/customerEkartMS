package models.enums;

/**
 * Created by IntelliJ IDEA.
 * User: Dheeraj Reddy
 * Date: 29/07/18
 */

public enum AccountStatus {
    INACTIVE("INACTIVE"),
    ACTIVE("ACTIVE"),
    BLOCKED("BLOCKED"),
    CLOSED("CLOSED");

    private String value;

    AccountStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

