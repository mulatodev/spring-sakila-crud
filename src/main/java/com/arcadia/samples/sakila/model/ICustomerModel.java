package com.arcadia.samples.sakila.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ganaranjo
 */

@Repository
public interface ICustomerModel extends JpaRepository<CustomerModel, Short>{
    
}
