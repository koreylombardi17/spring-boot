package com.lombardi.thymeleafexampleapp.controller;

import com.lombardi.thymeleafexampleapp.bean.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String displayCustomers(Model model) {
        Customer customer1 = new Customer("Synnöve",
                "Lugos", "Hartmann", "10/27/1989");
        Customer customer2 = new Customer("Nuadha",
                "Voula", "Pawlitzki", "03/07/2000");
        Customer customer3 = new Customer("Gladwin",
                "Ilham", "Herbert", "02/03/1998");
        Customer customer4 = new Customer("Walentyna",
                "Adva", "Meeuwessen", "12/30/1999");
        Customer customer5 = new Customer("Vera",
                "Esteri", "Holtman", "08/10/2002");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        model.addAttribute("customers", customers);
        return "index";
    }

}
