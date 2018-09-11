package models;

import models.base.BaseModelWithDate;
import models.enums.AccountStatus;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

/**
 * @author Dheeraj Reddy
 */

@Entity(noClassnameStored = true, value = "customer")
public class Customer extends BaseModelWithDate {

    private String firstName;
    private String lastName;
    private String emailId;
    @Embedded
    private AccountDetails accountDetails;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
