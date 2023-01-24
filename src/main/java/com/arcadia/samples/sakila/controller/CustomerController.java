package com.arcadia.samples.sakila.controller;

import com.arcadia.samples.sakila.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ganaranjo
 */

@RestController
public class CustomerController {
    
    @Autowired
    private ICustomerService service;
    
    @GetMapping({"/customer","/"})
    public String ListCustomers(Model model){
        model.addAttribute("customers", service.listAllCustomers());
        return "customers";  
    }
}
