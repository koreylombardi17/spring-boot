package com.lombardi.manytomanyexampleapp.beans;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Pizza {

    @Id
    @Column(name = "PizzaID")
    @GeneratedValue
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Balance")
    private float balance;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "PizzasToppings",
            joinColumns = @JoinColumn(name = "PizzaID",
                    referencedColumnName = "PizzaID"),
            inverseJoinColumns = @JoinColumn(name = "ToppingID",
                    referencedColumnName = "ToppingID"))
    private Set<Topping> toppings;

    public Pizza() {

    }

    public Pizza(String name, float balance) {
        this.name = name;
        this.balance = balance;
        this.toppings = new HashSet<>();
    }

    public int getPizzaID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(Set<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
