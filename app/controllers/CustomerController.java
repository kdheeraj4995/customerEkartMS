package controllers;

import models.Customer;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.ICustomerService;

import javax.inject.Inject;

/**
 * @author Dheeraj
 */
public class CustomerController extends Controller {
    private ICustomerService customerService;

    @Inject
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    public Result getCustomer(String customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return ok(Json.toJson(customer));
    }

}
