package com.lombardi.customvalidatorapp.validate;

import com.lombardi.customvalidatorapp.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements
        ConstraintValidator<UniqueEmailConstraint, String> {

    CustomerServiceImpl customerServiceImpl;

    public UniqueEmailValidator() {
    }

    public CustomerServiceImpl getCustomerServiceImpl() {
        return customerServiceImpl;
    }

    @Autowired
    public void setCustomerServiceImpl(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return customerServiceImpl.isEmailAvailable(email);
    }

    @Override
    public void initialize(UniqueEmailConstraint constraintAnnotation) {

    }
}
