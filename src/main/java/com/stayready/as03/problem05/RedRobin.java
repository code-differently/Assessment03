package com.stayready.as03.problem05;

public class RedRobin extends Bird{

    private String month;

    public String color() {
        return "red";
    }

    public int getSpeed() {
        return 10;
    }

    public String getMigrationMonth() {
        return month;
    }

    public void setMigrationMonth(String Mmonth) {
        month = Mmonth;
    }
}
