package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    String migrationMonth = "";
    public String color(){
        return "red";
    }
    public int speed(){
        return 10;
    }
    public void setMigrationMonth(String m){
        migrationMonth = m;
    }
    public String getMigrationMonth(){
        return migrationMonth;
    }

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return speed();
    }
}
