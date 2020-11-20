package com.lombardi.customvalidatorapp.service;


import com.lombardi.customvalidatorapp.bean.Customer;

public interface CustomerService{
    boolean isEmailAvailable(String email);
    void saveCustomer(Customer customer);
}
