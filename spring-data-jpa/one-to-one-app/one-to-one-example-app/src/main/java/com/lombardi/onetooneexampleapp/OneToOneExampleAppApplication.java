package com.lombardi.onetooneexampleapp;

import com.lombardi.onetooneexampleapp.beans.Customer;
import com.lombardi.onetooneexampleapp.beans.CustomerInfo;
import com.lombardi.onetooneexampleapp.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OneToOneExampleAppApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneExampleAppApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Korey", new CustomerInfo("Lasagna")));
		customers.add(new Customer("Kyle", new CustomerInfo("Fettucine Alfredo")));
		customers.add(new Customer("Connor", new CustomerInfo("Chicken Parmesean")));
		customerRepository.saveAll(customers);

		for (Customer customer : customerRepository.findAll()) {
			System.out.println((customer.toString()));
		}
	}

}
