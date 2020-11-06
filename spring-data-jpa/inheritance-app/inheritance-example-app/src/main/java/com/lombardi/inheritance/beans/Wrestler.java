package com.lombardi.inheritance.beans;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Wrestler extends Fighter{

    private boolean isCauliflower;

    public Wrestler() {

    }

    public Wrestler(@NotNull String firstName, @NotNull String lastName, boolean isCauliflower) {
        super(firstName, lastName);
        this.isCauliflower = isCauliflower;
    }

    public boolean isCauliflower() {
        return isCauliflower;
    }

    public void setCauliflower(boolean isCauliflower) {
        this.isCauliflower = isCauliflower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cauliflower ears: " + isCauliflower() + "\n";
    }
}
