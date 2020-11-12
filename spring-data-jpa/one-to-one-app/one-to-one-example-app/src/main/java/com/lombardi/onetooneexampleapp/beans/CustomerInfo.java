package com.lombardi.onetooneexampleapp.beans;

import javax.persistence.*;

@Entity
@Table(name = "CustomersInfo")
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerInfoID")
    private Integer id;

    @Column(name = "FavoriteDish")
    private String favoriteDish;

    @OneToOne(mappedBy = "customerInfo")
    private Customer customer;

    public CustomerInfo(){

    }

    public CustomerInfo(String favoriteDish){
        this.favoriteDish = favoriteDish;
    }

    public Integer getId() {
        return id;
    }

    public String getFavoriteDish() {
        return favoriteDish;
    }

    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "favoriteDish='" + favoriteDish + '\'' +
                '}';
    }
}