package com.lombardi.onetomanyexampleapp.beans;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Server")
public class Server {

    @Id
    @GeneratedValue
    @Column
    private int serverID;

    @Column
    private String name;

    @OneToMany(mappedBy = "server", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<HighTop> highTops = new ArrayList<>();

    public Server() {

    }

    public Server(String name) {
        this.name = name;
    }

    public int getServerID() {
        return serverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHighTop(HighTop highTop) {
        highTops.add(highTop);
    }

    public List<HighTop> getHighTops() {
        return highTops;
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverID=" + serverID +
                ", name='" + name + '\'' +
                ", highTops=" + highTops +
                '}';
    }
}
