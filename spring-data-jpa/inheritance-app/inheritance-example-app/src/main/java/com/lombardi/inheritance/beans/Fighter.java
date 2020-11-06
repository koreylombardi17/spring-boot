package com.lombardi.inheritance.beans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance
public abstract class Fighter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    public Fighter() {

    }

    public Fighter(@NotNull String firstName, @NotNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return  "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n";
    }
}
