package services.implementations;

import models.Customer;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import services.ICustomerService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dheeraj
 */

@Singleton
public class CustomerService implements ICustomerService {

    private Datastore datastore;

    @Inject
    public CustomerService(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public Customer getCustomerById(String _id) {
//        Customer customer = new Customer();
//        customer.setAccountStatus(Customer.AccountStatus.ACTIVE);
//        Key<Customer> customerKey = datastore.save(customer);

        return this.datastore.createQuery(Customer.class)
                .field("_id").equal(new ObjectId(_id))
                .get();
    }
}
