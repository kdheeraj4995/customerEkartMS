package models;

import models.base.BaseModelWithDate;
import org.mongodb.morphia.annotations.Entity;

/**
 * @author Dheeraj Reddy
 */

@Entity(noClassnameStored = true, value = "customer")
public class Customer extends BaseModelWithDate {
    private String status;
    private String emailId;
    private boolean twoStepVerification;
    private String msisdn;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean isTwoStepVerification() {
        return twoStepVerification;
    }

    public void setTwoStepVerification(boolean twoStepVerification) {
        this.twoStepVerification = twoStepVerification;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
