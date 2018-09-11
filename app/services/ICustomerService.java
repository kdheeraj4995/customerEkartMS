package services;

import models.Customer;

/**
 * @author Dheeraj
 */

public interface ICustomerService {
    public Customer getCustomerById(String _id);
}
