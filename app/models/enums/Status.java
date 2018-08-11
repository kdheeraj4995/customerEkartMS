package models.enums;

/**
 * Created by IntelliJ IDEA.
 * User: Dheeraj Reddy
 * Date: 29/07/18
 */
public enum Status {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    Status(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

