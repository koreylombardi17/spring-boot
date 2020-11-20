package com.lombardi.customvalidatorapp.service;

import com.lombardi.customvalidatorapp.bean.Customer;
import com.lombardi.customvalidatorapp.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public boolean isEmailAvailable(String email) {
        Optional<Customer> user = customerRepository.findByEmail(email);
        if (user.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
