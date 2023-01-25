package com.arcadia.samples.sakila.controller;

import com.arcadia.samples.sakila.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.arcadia.samples.sakila.service.ICustomerService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ganaranjo
 */

@Controller
public class CustomerController {
    
    @Autowired
    private ICustomerService service;
    
    @GetMapping({"/customers", "/"})
    public String listCustomers(Model model){
        model.addAttribute("customers", service.getAllCustomers());
        return "customers";  
    }
    
    @GetMapping("/customers/new")
    public String showCustomerEntryForm(Model model){
        CustomerModel customerModel = new CustomerModel();
        
        model.addAttribute("customer", customerModel);
        return "customers_add";
    }
    
    @PostMapping("/customers")
    public String saveCustomer(@ModelAttribute("customer") CustomerModel customerModel){
        
        service.saveCustomer(customerModel);
        return "redirect:customers";
    }
}
