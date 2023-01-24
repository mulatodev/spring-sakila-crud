package com.arcadia.samples.sakila.model;

import java.util.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

/**
 *
 * @author ganaranjo
 */

@Entity
@Table(name = "customer")
public class CustomerModel {
    
    @Id
    @Column(name = "customer_id")
    private Short customerId;
    
    @Column(name = "store_id")
    private Byte storeId;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "address_id")
    private Short addressId;
    
    @Column(name = "active")
    private Byte active;
    
    @Column(name = "create_date")
    private Date createDate;
    
    @Column(name = "last_update")
    private Timestamp lastDate;

    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastDate() {
        return lastDate;
    }

    public void setLastDate(Timestamp lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId 
                + ", storeId=" + storeId 
                + ", firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", email=" + email 
                + ", addressId=" + addressId 
                + ", active=" + active 
                + ", createDate=" + createDate 
                + ", lastDate=" + lastDate 
                + '}';
    }
    
    
}
