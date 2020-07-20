package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    private String migrationMonth;
    public String move() {
        return super.move();
    }

    public int getSpeed() {
        return 10;
    }

    public String color() {
        return "red";
    }

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }
}
