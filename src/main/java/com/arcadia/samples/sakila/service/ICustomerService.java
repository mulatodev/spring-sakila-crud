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
    
    public CustomerModel getCustomerById(Short id);
    
    public CustomerModel updateCustomer(CustomerModel customerModel);
    
    public void deleteCustomer(Short id);
}
