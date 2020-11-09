package com.lombardi.onetomanyexampleapp.beans;

import javax.persistence.*;

@Entity
@Table(name = "HighTop")
public class HighTop {

    @Id
    @GeneratedValue
    @Column
    private int highTopID;

    @Column
    private int numberGuest;

    @ManyToOne
    @JoinColumn
    private Server server;

    public HighTop() {

    }

    public HighTop(int numberGuest) {
        this.numberGuest = numberGuest;
    }

    public int gethighTopID() {
        return highTopID;
    }

    public int getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return "HighTop{" +
                "highTopID=" + highTopID +
                ", numberGuest=" + numberGuest +
                '}';
    }
}
