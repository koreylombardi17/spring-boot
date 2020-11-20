package com.lombardi.customvalidatorapp.bean;

import com.lombardi.customvalidatorapp.validate.UniqueEmailConstraint;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Customer {

    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    @NotBlank(message = "First name cannot be left blank")
    @Size(min=2, max=30)
    @Column(name = "FirstName")
    private String firstName;

    @NotBlank(message = "Last name cannot be left blank")
    @Size(min=2, max=30)
    @Column(name = "LastName")
    private String lastName;

    @UniqueEmailConstraint
    @NotBlank(message = "Email cannot be left blank")
    @Column(name = "Email", length=50)
    private String email;

    @Size(min = 5, max = 20, message = "Size must be between 5 and 20 characters")
    @Column(name = "Password")
    private String password;

    public Customer() {

    }

    public Customer(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}