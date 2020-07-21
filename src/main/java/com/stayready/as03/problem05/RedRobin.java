package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    String migrationMonth;

    public void setMigrationMonth(String m) {
        migrationMonth=m;
    }

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

}
