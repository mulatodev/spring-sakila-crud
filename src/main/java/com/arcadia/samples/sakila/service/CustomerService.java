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
    public List<CustomerModel> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public CustomerModel saveCustomer(CustomerModel customerModel) {
        return repository.save(customerModel);
    }

    @Override
    public CustomerModel getCustomerById(Short id) {
        return repository.findById(id).get();
    }

    @Override
    public CustomerModel updateCustomer(CustomerModel customerModel) {
        return repository.save(customerModel);
    }

    @Override
    public void deleteCustomer(Short id) {
        repository.deleteById(id);
    }
}
