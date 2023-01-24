package com.arcadia.samples.sakila.service;

import com.arcadia.samples.sakila.model.CustomerModel;
import com.arcadia.samples.sakila.model.ICustomerModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ganaranjo
 */

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerModel repository;
    
    @Override
    public List<CustomerModel> listAllCustomers() {
        return repository.findAll();
    }
    
}
