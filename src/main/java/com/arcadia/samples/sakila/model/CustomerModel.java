package com.arcadia.samples.sakila.model;

import java.util.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 *
 * @author ganaranjo
 */

@Entity
@Table(name = "customer")
public class CustomerModel {
    
    public CustomerModel() {
    }
    
    public CustomerModel(Byte storeId, String firstName, String lastName, 
            String email, Short addressId, Byte active, Date createDate, 
            Timestamp lastUpdate) {
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Timestamp lastUpdate;

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
        
        // convert createDate al formato adecuado
        System.out.println(createDate.toString());
        this.createDate = createDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
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
                + ", lastDate=" + lastUpdate 
                + '}';
    }    
}
