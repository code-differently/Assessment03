package com.stayready.as03.problem05;

public class RedRobin extends Bird
{
    private String migrationMonth;
    @Override
    public int getSpeed() 
    {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public String color() 
    {
        // TODO Auto-generated method stub
        return "red";
    }

    public void setMigrationMonth(String month)
    {
        this.migrationMonth = month;
    }

    public String getMigrationMonth()
    {
        return migrationMonth;
    }
    
}
