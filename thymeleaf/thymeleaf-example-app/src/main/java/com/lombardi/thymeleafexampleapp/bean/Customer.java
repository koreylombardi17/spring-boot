package com.lombardi.thymeleafexampleapp.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer {

    private String firstName;
    private String middleName;
    private String lastName;
    private Boolean ableToRent;
    private LocalDate dob;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private LocalDate dateToday = LocalDate.now();
    private int age;

    public Customer(String firstName, String middleName, String lastName, String dob) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = LocalDate.parse(dob, formatter);
        this.age = (int) ChronoUnit.YEARS.between(this.dob, dateToday);
        if (this.age < 21) {
            ableToRent = false;
        } else {
            ableToRent = true;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAbleToRent() {
        return ableToRent;
    }

    public void setAbleToRent(Boolean ableToRent) {
        this.ableToRent = ableToRent;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
