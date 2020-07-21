package com.stayready.as03.problem05;

public class RedRobin extends Bird {
    private String migrationMonth;

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public String color() {
        // TODO Auto-generated method stub
        return "red";
    }

    public String getMigrationMonth(){
        return "August";
    }

    public void setMigrationMonth(String migrate){
        migrate = migrationMonth;
    }
}
