package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    public String color(){

        return "red";
    }

    public int speed(){

        return 10;
    }

    public int getSpeed(){

        return speed();
    }
        //getter
        String migrationMonth = "";
    public String getMigrationMonth( ){
        return migrationMonth;
    }
    //getters and setters for the migration test


       //setter
    public void setMigrationMonth (String month){
        
        migrationMonth = month;
    }
}

