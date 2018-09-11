package models;

import models.base.BaseModelWithDate;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.mongodb.morphia.annotations.Entity;

/**
 * @author Dheeraj Reddy
 */

@Entity(noClassnameStored = true, value = "customer")
public class Customer extends BaseModelWithDate {
    private String firstName;
    private String lastName;
    private AccountStatus accountStatus;

//    private String emailId;
//    private boolean twoStepVerification;
//    private String msisdn;

    public enum AccountStatus {
        ACTIVE("ACTIVE"),
        INACTIVE("INACTIVE");

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
