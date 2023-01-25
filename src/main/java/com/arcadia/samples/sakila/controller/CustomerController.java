package com.arcadia.samples.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.arcadia.samples.sakila.service.ICustomerService;

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
}
