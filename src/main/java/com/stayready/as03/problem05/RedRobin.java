package com.stayready.as03.problem05;

public class RedRobin extends Bird{

    String migrationMonth;

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

    public void setMigrationMonth(String migrationMonth) { this.migrationMonth = migrationMonth; }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
