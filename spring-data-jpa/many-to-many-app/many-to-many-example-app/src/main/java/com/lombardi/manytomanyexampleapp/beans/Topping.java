package com.lombardi.manytomanyexampleapp.beans;

import javax.persistence.*;

@Entity
@Table
public class Topping {

    @Id
    @Column(name = "ToppingID")
    @GeneratedValue
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Balance")
    private float balance;

    public Topping() {

    }

    public Topping(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
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

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
