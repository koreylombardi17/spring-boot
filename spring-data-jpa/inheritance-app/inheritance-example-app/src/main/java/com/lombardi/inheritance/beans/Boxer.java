package com.lombardi.inheritance.beans;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Boxer extends Fighter{

    private boolean isAmbidextrous;

    public Boxer() {

    }

    public Boxer(@NotNull String firstName, @NotNull String lastName, boolean isAmbidextrous) {
        super(firstName, lastName);
        this.isAmbidextrous = isAmbidextrous;
    }

    public boolean isAmbidextrous() {
        return isAmbidextrous;
    }

    public void setAmbidextrous(boolean ambidextrous) {
        isAmbidextrous = ambidextrous;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ambidextrous: " + isAmbidextrous() + "\n";
    }
}
