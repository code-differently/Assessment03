package com.stayready.as03.problem05;

public abstract class Bird {
    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }

    public abstract int getSpeed();

    public abstract String color();
}
