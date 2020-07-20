package com.stayready.as03.problem05;

public abstract class Bird implements Animal{
    public String move() {
        return "Fly";
    }

    public void setMigrationMonth(String expected) {
    }

    public String getMigrationMonth() {
        return null;
    }
}
