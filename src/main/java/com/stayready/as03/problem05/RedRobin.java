package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    private String migrationMonth;

    public String color(){
        return "red";
    }

    @Override
    public int getSpeed() {
        return 10;
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
