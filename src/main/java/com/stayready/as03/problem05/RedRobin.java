package com.stayready.as03.problem05;

public class RedRobin extends Bird{

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        String string = "";
        string = "red";
        return string;
    }

    public String migrationMonth() {
        return null;
    }

    @Override
    public void setMigrationMonth(String expected) {
        super.setMigrationMonth(expected);
    }

    @Override
    public String getMigrationMonth() {
        return super.getMigrationMonth();
    }
}
