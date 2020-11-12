package com.lombardi.onetooneexampleapp.repositories;

import com.lombardi.onetooneexampleapp.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
