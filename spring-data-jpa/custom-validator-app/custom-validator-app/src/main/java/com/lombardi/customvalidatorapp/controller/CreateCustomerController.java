package com.lombardi.customvalidatorapp.controller;

import com.lombardi.customvalidatorapp.bean.Customer;
import com.lombardi.customvalidatorapp.error.CreateCustomerErrorMsg;
import com.lombardi.customvalidatorapp.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CreateCustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @GetMapping("/") // Mapping for the home page
    public String home(Model model){
        // Get customer attribute from model
        Object customerAttribute = model.asMap().get("customer");

        // On initial entry to the home page, customerAttribute does not exist.
        // If customerAttribute is null, create new beans and add to the model.
        // HTML code depends on customerAttribute to exist.
        if (customerAttribute == null) {
            model.addAttribute("customer", new Customer());
            model.addAttribute("errorMsg", new CreateCustomerErrorMsg());
        }
        return "index";
    }

    @PostMapping("/createCustomer")
    public String createCustomer(@ModelAttribute("customer") @Valid Customer customer,
                                 BindingResult binding, RedirectAttributes attributes, Model model) {
        // Create Object to store error message details
        CreateCustomerErrorMsg errorMsg = new CreateCustomerErrorMsg();

        // Check for errors
        if (binding.hasErrors()) {
            // Update errorMsg object
            for (FieldError fieldError : binding.getFieldErrors()){
                if (fieldError.getField().equals("firstName")){
                    errorMsg.setFirstNameErr(fieldError.getDefaultMessage());
                }else if (fieldError.getField().equals("lastName")){
                    errorMsg.setLastNameErr(fieldError.getDefaultMessage());
                }else if (fieldError.getField().equals("email")){
                    errorMsg.setEmailErr(fieldError.getDefaultMessage());
                }else if (fieldError.getField().equals("password")){
                    errorMsg.setPasswordErr(fieldError.getDefaultMessage());
                }
            }
            // Add Flash attributes to handle the errors by binding the data and repopulating
            // the form once the page gets redirected
            attributes.addFlashAttribute("customer", customer);
            attributes.addFlashAttribute("errorMsg", errorMsg);
            return "redirect:/";
        }else{
            // Successful account creation, add customer attribute to the model and navigate to success page
            attributes.addFlashAttribute("customer", customer);
            customerServiceImpl.saveCustomer(customer);
            return "redirect:/success";
        }
    }

    @GetMapping("/success")
    public String success()
    {
        return "success";
    }
}
