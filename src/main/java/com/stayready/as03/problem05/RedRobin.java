package com.stayready.as03.problem05;

public class RedRobin extends Bird {
    
    public String color(){
        return "red";
    }

    public int speed(){
        return 10;
    }

    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
