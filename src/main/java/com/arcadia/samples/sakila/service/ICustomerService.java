package com.arcadia.samples.sakila.service;

import com.arcadia.samples.sakila.model.CustomerModel;
import java.util.List;

/**
 *
 * @author ganaranjo
 */
public interface ICustomerService {

    public List<CustomerModel> getAllCustomers();
    
    public CustomerModel saveCustomer(CustomerModel customerModel);
}
