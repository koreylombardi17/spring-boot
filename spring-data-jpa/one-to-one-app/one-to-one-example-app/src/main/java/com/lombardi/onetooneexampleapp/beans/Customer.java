package com.lombardi.onetooneexampleapp.beans;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustomerInfoID")
    private CustomerInfo customerInfo;

    public Customer(){

    }

    public Customer(String name){
        this.name = name;
    }

    public Customer(String name, CustomerInfo customerInfo){
        this.name = name;
        this.customerInfo = customerInfo;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerInfo=" + customerInfo +
                '}';
    }
}